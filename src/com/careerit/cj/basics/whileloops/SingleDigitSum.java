package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class SingleDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		int temp = num;
//		int sum = 0;
//		while (temp > 9) {
//			sum = 0;
//			while (temp != 0) {
//				int r = temp % 10;
//				sum += r;
//				temp /= 10;
//			}
//			temp = sum;
//		}
		
		int sum = 0;
		while(temp > 9) {
			sum = temp % 10 + temp / 10;
			temp = sum;
		}

		System.out.println("The digits sum of " + num + " is " + sum);
		sc.close();
	}
}
