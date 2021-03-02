package com.careerit.cj.basics.str;

class Employee{
	int empno;
	String name;
	String email;
	double salary;
	
	public Employee(int empno, String name, String email, double salary) {
		this.empno = empno;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
}

public class StringBuilderExample {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1001, "Krish", "krish.t@gmail.com", 65432);
			Employee emp2 = new Employee(1002, "Sai", "sai.avula@gmail.com", 65433);
			Employee emp3 = new Employee(1003, "Manoj", "manoj.pvn@gmail.com", 65445);
			
			Employee[] arr = new Employee[] {emp1,emp2,emp3};
			
			for(Employee emp:arr) {
				StringBuilder sb = new StringBuilder();
				sb.append("Empno :").append(emp.empno).append("\nEname :").append(emp.name).append("\nEmail :").append(emp.email).append("\nSalary :").append(emp.salary);
				
				String data = sb.toString();
				System.out.println(data);
				System.out.println("-----------------------");
			}
			
			// Empno :
			// Ename :
			// Email :
			// Salary:
			
			String name = "123321";
			StringBuilder sb = new StringBuilder(name);
			String rname = sb.reverse().toString();
			if(rname.equals(name)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
			
	
			StringBuilder sb1 = new StringBuilder("Core Java");
			StringBuilder sb2 = new StringBuilder("Core Java");
			System.out.println(sb1 == sb2); // false
			System.out.println(sb1.equals(sb2)); // false
		
			
			StringBuffer sbb1 = new StringBuffer("Core Java");
			StringBuffer sbb2 = new StringBuffer("Core Java");
			System.out.println(sbb1 == sbb2); 
			System.out.println(sbb1.equals(sbb2));
		}
}
