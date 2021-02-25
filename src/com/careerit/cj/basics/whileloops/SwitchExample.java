package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number (1-7):");
		int num = sc.nextInt();
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekdays.... busy days...");
			break;
		case 6:
		case 7:
			System.out.println("Weekend.... have fun!");

		default:
			System.out.println("Wrong day number you have entered!");
		}
		sc.close();
	}
}
