package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class GCDofTwoNumbers {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2:");
			int num2 = sc.nextInt();
			
			int a = num1;
			int b = num2;
			while(a != b) {
				if(a > b) {
					a -= b;
				}else {
					b -= a;
				}
			}
			System.out.println("Gcd of "+num1+" and "+num2+" is "+a);
			sc.close();
		}
}
