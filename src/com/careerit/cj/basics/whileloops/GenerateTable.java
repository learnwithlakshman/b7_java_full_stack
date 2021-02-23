package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class GenerateTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();

		int i = 1;
    	while (i <= 10) {
			System.out.println(N + " * " +i+ " = " + (N * i));
			i++;
		}
		sc.close();

	}
}
