package com.careerit.cj.basics;

import java.util.Scanner;

// Accept integer value as input from user and if number -ve convert to +ve and display the same
public class CheckNumber {
	
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number :");
				int num = sc.nextInt();
				if(num < 0) {
					num = -num;
				}
				System.out.println(num);
				sc.close();
		}

}
