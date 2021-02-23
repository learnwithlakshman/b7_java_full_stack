package com.careerit.cj.basics.fungame;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

	public static void main(String[] args) {
		// Random integer (1 - 6)

		Scanner sc = new Scanner(System.in);
		int rnum = ThreadLocalRandom.current().nextInt(1, 7);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Guess number (1-6), enter your number: ");
			int gnum = sc.nextInt();
			if (rnum == gnum) {
				System.out.println("Good! you guessed number in "+i+" attempts");
				break;
			} else {
				if(i==3) {
					System.out.println("Sorry! you have reached max number attempts, the number is :"+rnum);
				}else {
					System.out.println("Sorry! try again");
				}
			}
		}

		sc.close();
	}
}
