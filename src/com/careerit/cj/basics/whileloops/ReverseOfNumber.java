package com.careerit.cj.basics.whileloops;

import java.util.Scanner;

public class ReverseOfNumber {

		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);	
				System.out.println("Enter the number :");
				int num = sc.nextInt();
				int tnum = num;
				
				int rev = 0;
				while(tnum != 0) {
					int r = tnum % 10;
					rev = rev * 10 + r;
					tnum = tnum / 10;
				}
				System.out.println("The reverse of :"+num +" is "+rev);
				if(rev == num) {
					System.out.println("The number :"+num+" is a palindrome");
				}else {
					System.out.println("The number :"+num+" is not a palindrome");
				}
				sc.close();
		}
}
