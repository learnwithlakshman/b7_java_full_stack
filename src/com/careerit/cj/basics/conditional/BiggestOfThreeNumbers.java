package com.careerit.cj.basics.conditional;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int big = a > b && a > c ? a : b > c ? b : c;
		System.out.println("Biggest is :"+big);
	}
}
