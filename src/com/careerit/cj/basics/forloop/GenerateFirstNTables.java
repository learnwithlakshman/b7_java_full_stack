package com.careerit.cj.basics.forloop;

import java.util.Scanner;

public class GenerateFirstNTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb value : ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub value : ");
		int ub = sc.nextInt();

		for (int j = lb; j <= ub; j++) {
			int num = j;
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
			System.out.println(".....................");
		}
		sc.close();
	}
}
