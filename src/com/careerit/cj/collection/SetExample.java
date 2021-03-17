package com.careerit.cj.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Employee{
	
		int age;
		String name;
		public Employee(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(age, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return age == other.age && Objects.equals(name, other.name);
		}

}

public class SetExample {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1001, "Krish");
		Employee emp2 = new Employee(1001, "Krish");
		Employee emp3 = new Employee(1001, "Krish");
		Employee emp4 = new Employee(1001, "Krish");
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.remove(emp1);
		
		System.out.println(empSet.size());
		
		Set<Integer> numSet = new HashSet<Integer>();
		numSet.add(new Integer(1001));
		numSet.add(new Integer(1003));
		numSet.add(new Integer(1009));
		numSet.add(new Integer(1006));
		numSet.add(null);
		numSet.add(null);
		numSet.add(null);
		numSet.add(null);
		numSet.add(new Integer(1009));
		numSet.add(new Integer(1006));
		System.out.println(numSet);
		System.out.println(numSet.size());

		String[] data = "Lakshman,Lakshman,Swathi,Balu,Srinu,Swathi".split(",");
		
		Set<String> set = new HashSet<String>();
		
		for(String name:data) {
			set.add(new String(name));
		}
		System.out.println(set.size());
		// For each loop
		
		for(String name:set) {
			System.out.println(name);
		}
		
		// Iterator
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.equals("Srinu")) {
				itr.remove();
			}
		}
		
		set.stream().forEach(System.out::println);
	}
}
