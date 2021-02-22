package com.careerit.cj.basics.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i <= N/2; i++) {
			if(N % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("\n"+N+" is a prime");
		}else {
			System.out.println("\n"+N+" is not a prime");
		}
		
		sc.close();
	}
}
