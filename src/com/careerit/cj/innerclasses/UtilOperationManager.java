package com.careerit.cj.innerclasses;

// Wrapper class
// Typecasting
// Parsing 

class One {

}

class Two extends One {

}

class Three extends One {

}

class Four {

}

public class UtilOperationManager {

	public static void main(String[] args) {

		int a = 10;
		Integer obj = a; // Auto boxing
		a = obj; // unboxing

		String str = "1234";

		Integer num = Integer.parseInt(str);
		System.out.println(num);

		int num1 = 10;
		float num2 = num1; // Implicit type casting

		float num3 = 34.56f;
		int num4 = (int) num3; // Explicit typecasting

		/*
		 * boolean flag = true; int int_flag = (int)flag;
		 */

		One ref = new Two();
		if (ref instanceof Three) {
			Three ref1 = (Three) ref;
		}
	}
}
