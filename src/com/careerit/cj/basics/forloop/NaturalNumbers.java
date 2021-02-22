package com.careerit.cj.basics.forloop;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			System.out.print(i+" ");
			sum += i;
		}
		//int sum = (N * (N + 1))/2;
		System.out.println("\nEven numbers:");
		for(int i=2;i<=N;i=i+2) {
				System.out.print(i+" ");
		}
		System.out.println("\nOdd numbers");
		for(int i=1;i<=N;i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nThe sum of first :"+N+" natural numbers is : "+sum);
		sc.close();
	}
}
