package com.careerit.cj.basics.conditional;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num_1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num_2 = sc.nextInt();

		int big = num_1 > num_2 ? num_1 : num_2; 

//		if (num_1 > num_2) {
//			big = num_1;
//		} else {
//			big = num_2;
//		}
		
		
		System.out.printf("Biggest of (%d, %d) : %d", num_1, num_2, big);
		sc.close();

	}
}
