package com.careerit.cj.basics.fungame;

import java.util.Scanner;

public class GenerateFirstNPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int count = 0;

		for (int i = 2;; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			if (count == N) {
				break;
			}
		}
		sc.close();

	}

	public static boolean isPrime(int num) {

		boolean flag = num <= 1 ? false : true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

}
