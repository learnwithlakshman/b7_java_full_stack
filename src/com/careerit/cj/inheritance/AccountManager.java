package com.careerit.cj.inheritance;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {

		AccountService accService = new AccountService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. Deposit 2. Withdraw 3. Show Account 4.Exit ");
			System.out.println("----------------------------------------------------");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter the account number to deposit :");
				long accNumber = sc.nextLong();
				System.out.println("Enter the amount to deposit : ");
				double amount = sc.nextDouble();
				accService.depositAmount(accNumber, amount);
			} else if (ch == 2) {
				System.out.println("Enter the account number to withdraw :");
				long accNumber = sc.nextLong();
				System.out.println("Enter the amount to withdraw : ");
				double amount = sc.nextDouble();
				accService.withdrawAmount(accNumber, amount);
			} else if (ch == 3) {
				accService.showAccounts();
			} else if (ch == 4) {
				sc.close();
				System.out.println(".........................See you...........");
				System.exit(0);
			} else {
				System.out.println("Enter the options only 1-4");
			}

		}
	}
}
