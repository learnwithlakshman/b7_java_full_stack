package com.careerit.cj.basics.fungame;

import java.util.Scanner;

public class FibonacciSeries {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N value :");
			int N = sc.nextInt();
			
			int a = 0;
			int b = 1;
			
			for(int i=1;i<=N;i++) {
				System.out.print(a +" ");
				int c = a + b;
				a = b;
				b = c;
			}
			sc.close();
			
		}
}
