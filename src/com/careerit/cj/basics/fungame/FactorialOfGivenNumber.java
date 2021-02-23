package com.careerit.cj.basics.fungame;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= N; i++) {
			if(i == N) {
				System.out.print(i);
			}else {
				System.out.print(i+" * ");		
			}
			res *= i;
		}
		System.out.println(" = "+res);
		sc.close();

	}
}
