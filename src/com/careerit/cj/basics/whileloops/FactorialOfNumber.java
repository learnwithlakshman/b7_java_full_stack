package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class FactorialOfNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N value :");
			int N = sc.nextInt();
			
			int i = 1;
			int res = 1;
			while(i <= N) {
				res *= i;
				i++;
			}
			System.out.println("Factorial of "+N+" is "+res);
			sc.close();
		}
}
