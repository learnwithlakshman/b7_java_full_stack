package com.careerit.cj.basics;

import java.util.Scanner;

public class CalProfitOrLoss {

	public static void main(String[] args) {

		float sp, bp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the buying price : ");
		bp = sc.nextFloat();
		System.out.println("Enter the selling price : ");
		sp = sc.nextFloat();

		float amount = sp - bp;
		
		if (amount < 0) {
			System.out.println("You made loss of :(Rs) " + amount);
		} else if (amount > 0) {
			System.out.println("You made profit of :(Rs) " + amount);
		} else {
			System.out.println("No Profit No Loss");
		}
		sc.close();
	}
}
