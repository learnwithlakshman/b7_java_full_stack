package com.careerit.cj.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(3, 5, 7, 9, 10, 12, 15, 16, 18, 1, 19, 35, 56, 76, 78, 89, 34, 54, 11));
		// Get all the number which are divisible by 3

		List<Integer> divisibleBy3 = new ArrayList<Integer>();

		for (Integer ele : list) {
			if (ele % 3 == 0) {
				divisibleBy3.add(ele);
			}
		}

		System.out.println(divisibleBy3);

		List<Integer> divisibleBy3UsingStreams = list.stream().filter((ele) -> ele % 3 == 0)
				.collect(Collectors.toList());

		list.stream().forEach(System.out::println);

		List<String> dataList = Stream.of("1001", "1002", "1003", "1004", "1005").collect(Collectors.toList());
//		List<Integer> empList = new ArrayList<Integer>();
//		for(String str:dataList) {
//			empList.add(Integer.parseInt(str));
//		}
//		System.out.println(empList);

		List<Integer> empList = dataList.stream().map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());

		List<Employee> employeeList = getEmployeeData();

//		List<String> empNames = new ArrayList<String>();
//		for (Employee emp : employeeList) {
//			if (emp.getYearsOfExp() >= 5) {
//				empNames.add(emp.getName());
//			}
//		}
		List<String> empNames = employeeList.stream()
				.filter(e -> e.getYearsOfExp() >= 5 && e.getName().startsWith("A") && e.getDept().equals("EC"))
				.map(e -> e.getName().toUpperCase()).collect(Collectors.toList());

		// EC department employee

		List<Employee> ecList = employeeList.stream().filter(e -> e.getDept().equalsIgnoreCase("ec"))
				.collect(Collectors.toList());
		System.out.println(ecList);

		// Display ech dept employee count

		Map<Object, Optional<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDept(),
				Collectors.maxBy(Comparator.comparing(Employee::getYearsOfExp))));
		map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().get()));

		 Optional<Employee> empOpt = getEmployeeByEmpno(employeeList,1001);
		 if(empOpt.isPresent()) {
			 Employee emp = empOpt.get();
			 System.out.println(emp.getName());
		 }
	}

	private static Optional<Employee> getEmployeeByEmpno(List<Employee> empList, int empno) {
		Employee employee = null;
		for (Employee emp : empList) {
			if (emp.getEmpno() == empno) {
				employee = emp;
				break;
			}
		}
		return Optional.ofNullable(employee);
	}

	public static List<Employee> getEmployeeData() {
		Employee emp1 = new Employee(1001, "Krish", 8, "CS");
		Employee emp2 = new Employee(1008, "Manoj", 2, "CS");
		Employee emp3 = new Employee(1002, "Suresh", 10, "IS");
		Employee emp4 = new Employee(1004, "Jayesh", 6, "IS");
		Employee emp5 = new Employee(1009, "Kiran", 5, "EC");
		Employee emp6 = new Employee(1003, "Kamesh", 4, "EC");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		return empList;

	}

}
