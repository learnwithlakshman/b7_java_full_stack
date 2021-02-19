package com.careerit.cj.basics.conditional;

import java.util.Scanner;

public class IterativeStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Welcome to java world!");

		}

		sc.close();

	}
}
