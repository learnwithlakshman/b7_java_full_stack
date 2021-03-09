package com.careerit.cj.questions;

import java.util.Objects;

class Employee extends Object {
	private int empno;
	private String name;
	private double salary;

	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		if (this.hashCode() != obj.hashCode()) {
			return false;
		}
		Employee other = (Employee) obj;
		return empno == other.empno && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empno=").append(empno).append(", name=").append(name).append(", salary=")
				.append(salary).append("]");
		return builder.toString();
	}

}

class Product {

	String pname;
	double price;

	public Product(String pname, double price) {
		this.pname = pname;
		this.price = price;
	}

	public String toString() {
		return null;
	}
//		public int toString() {
//			return 10;
//		}

}

abstract class Person {
	String name;
	float height;

	public Person(String name, float height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void showInfo() {
		System.out.println("Name   :" + name);
		System.out.println("Height :" + height);
	}
}

class Emp extends Person {

	private float salary;

	public Emp(String name, float height, float salary) {
		super(name, height);
		this.salary = salary;
	}

	public void incrementSalary(float amount) {
		this.salary = this.salary + amount;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Salary :" + salary);
	}
}

class Student extends Person {
	private float fee;

	public Student(String name, float height, float fee) {
		super(name, height);
		this.fee = fee;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Fee   :" + fee);
	}
}

public class Manager {

	public static void main(String[] args) {

		Person[] persons = getPersonDetailsFromServer();
		int scount = 0;
		int ecount = 0;
		for (Person person : persons) {

			if (person instanceof Emp) {
				Emp emp = (Emp) person;
				emp.incrementSalary(2500);
				emp.showInfo();
				ecount++;
			} else if (person instanceof Student) {
				scount++;
			}
		}
		System.out.println("Student count  :" + scount);
		System.out.println("Employee count :" + ecount);

		Employee emp1 = new Employee(1001, "Krish", 87654);
		Employee emp2 = new Employee(1001, "Krish", 87654);
		Employee emp3 = new Employee(1003, "Maonoj", 57654);
		Employee emp4 = emp1;

		System.out.println(emp1 == emp4);
		System.out.println(emp1.equals(emp4));

		System.out.println(emp1);
		System.out.println(emp1.equals(emp3));
		System.out.println(emp2.equals(emp3));
		System.out.println((int) ('A'));

	}

	private static Person[] getPersonDetailsFromServer() {
		return new Person[] { new Student("Krish", 5.6f, 25000), new Emp("Manoj", 5.7f, 120000),
				new Student("Tanvi", 3.5f, 12000), new Student("Charan", 5.6f, 25000), new Emp("Kiran", 5.7f, 120000),
				new Student("Dhatri", 3.5f, 12000)

		};
	}
}
