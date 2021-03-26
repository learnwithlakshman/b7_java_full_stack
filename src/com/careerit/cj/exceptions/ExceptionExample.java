package com.careerit.cj.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		try {
			int res = divide(num1, num2);
			System.out.println(String.format("%s %s %s = %s", num1, "%", num2, res));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Value of num2 can't be zero");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing resources");
			sc.close();
		}
		System.out.println("End of main method");
	}

	public static int divide(int num1, int num2) {

		if(num1 > num2) {
			return num1 - num2;
		}else {
			return num2 - num1;
		}
	
	}

}
