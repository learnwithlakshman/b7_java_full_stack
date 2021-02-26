package com.careerit.cj.basics.arrays;

public class BasicArrayOperations {

	public static void main(String[] args) {

		String[] names = { "Java", ".Net", "Python", "PHP", "Angular", "ReactJS" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// Print elements from last to first

		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}

	}
}
