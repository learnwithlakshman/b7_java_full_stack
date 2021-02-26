package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateNPrimesAndDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for (int i = 2;; i++) {

			if (isPrime(i)) {
				arr[count++] = i;
			}
			if (count == N) {
				break;
			}
		}
		System.out.println("Prime numbers :" + Arrays.toString(arr));
		sc.close();

	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}
}
