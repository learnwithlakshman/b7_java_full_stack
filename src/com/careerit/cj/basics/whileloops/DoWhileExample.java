package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int ch = 0;
		int choice = 0;
		do {
			System.out.println("1. Palindrome 2. Sum of digits 3. Reverse 4. exit");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (isPalindrome(num)) {
					System.out.println(num + " is a palindrome");
				} else {
					System.out.println(num + " is not a palindrome");
				}
				break;
			case 2:
				int sum = sumOfDigits(num);
				System.out.println("The digits sum of : " + num + " is " + sum);
				break;
			case 3:
				int rev = reverse(num);
				System.out.println("The reverse of :" + num + " is " + rev);
				break;
			case 4:
				System.out.println("Bye....");
				System.exit(0);
			default:
				System.out.println("Please enter valid option (1-4 only)");
			}
			System.out.println("Do you want to continue (1-continue 0-exit)");
			choice = sc.nextInt();
		} while (choice == 1);
		sc.close();
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static boolean isPalindrome(int num) {
		int rev = reverse(num);
		return rev == num;
	}

}
