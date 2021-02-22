package com.careerit.cj.basics.forloop;

import java.util.Scanner;

public class GeneratePrimeInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb value : ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub value : ");
		int ub = sc.nextInt();
		int count = 0;

		for (int l = lb; l <= ub; l++) {
			int num = l;
			boolean isPrime = l != 1 ? true : false;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println("\nNo of primes in range " + lb + " and " + ub + " is " + count);
		sc.close();
	}
}
