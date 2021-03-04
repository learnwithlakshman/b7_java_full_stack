package com.careerit.cj.basics.keywords;

import java.util.Arrays;

// final (keyword)
// class definitions 
// variables
// Methods and method arguments 



class One {
	final void m1() {
		System.out.println("Hello Everyone");
	}

	void greet() {
		System.out.println("Greeting from.... ");
	}
}

class Two extends One {

	void greet() {
		System.out.println("Greeting from LWL, learning java is fun!...");
	}
}

public class FinalExample {

	public final static void main(final String[] args) {
		final int NO_OF_DAYS_IN_A_WEEK = 7;
		System.out.println(Arrays.toString(args));
		args[0] = "Python";
		System.out.println(Arrays.toString(args));
		One obj = new Two();
		obj.m1();

	}
}
