package com.careerit.cj.basics.keywords;

class Employee {

	private int empno;
	private String name;
	private double salary;
	public static final String C_NAME = "CAREERIT";
	private static int count = 0;

	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		count++;
	}
	
	public void showDetails() {
		System.out.println("Empno        :"+empno);
		System.out.println("Name         :"+name);
		System.out.println("Salary       :"+salary);
		System.out.println("Compnay name :"+C_NAME);
	}
	public static int getCount() {
		return count;
	}

}

public class StaticVsInstance {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1001, "Krish", 5000);
			Employee emp2 = new Employee(1002, "Manoj", 3000);
			
			emp1.showDetails();
			emp2.showDetails();
			
			System.out.println(Employee.getCount());
		}
}
