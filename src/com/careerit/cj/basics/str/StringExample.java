package com.careerit.cj.basics.str;

public class StringExample {

		public static void main(String[] args) {
			
			
			String name1 = "Core Java";
			String name2 = "Core Java";
			String name3 = new String("Core Java");
			String name4 = new String("Core Java");
			String name5 = new String(new char[] {'C','o','r','e'});
			System.out.println(name5);
			System.out.println(name1);
			System.out.println(name2);
			
			System.out.println(name1 == name2); // true
			System.out.println(name3 == name4); // false
			System.out.println(name1 == name3); // false
			
			System.out.println(name1.equals(name2));
			System.out.println(name3.equals(name4));
			System.out.println(name1.equals(name4));
			
			// == operator 
			// equals method
			
			String data1 = "Learning Java";
			String data2 = "Learning Java is fun";
			data1.concat(" is fun");
			System.out.println(data1 == data2);
			System.out.println(data1.equals(data2));
		}
}
