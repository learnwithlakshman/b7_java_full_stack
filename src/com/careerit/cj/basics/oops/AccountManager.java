package com.careerit.cj.basics.oops;

public class AccountManager {

	public static void main(String[] args) {
		Account[] arr = getAllAccounts();
		double t_balance = 0.0;
		for (Account acc : arr) {
			acc.showInfo();
			t_balance += acc.getBalance();
			System.out.println("-----------------------");
		}
		// Total balance
		System.out.println("Total account count :" + arr.length + " total amount :" + t_balance + " avg amount :"
				+ t_balance / arr.length);
		
		// Get the max balance account holder(s)
		
		double max_amount = getMaxBalance(arr);
		System.out.println("\n---------------------Max Balance("+max_amount+") Account holder(s)----------------");
		for(Account acc : arr) {
			if(acc.getBalance() == max_amount) {
				acc.showInfo();
				System.out.println("..........................");
			}
		}
		
	}
	
		
	private static double getMaxBalance(Account[] arr) {
		double max = arr[0].getBalance();
		for(Account acc:arr) {
			if(acc.getBalance() > max) {
				max = acc.getBalance();
			}
		}
		return max;
	}

	private static Account[] getAllAccounts() {
		Account acc1 = new Account(1001, "Krish", 500);
		Account acc2 = new Account(1002, "Manoj", "9876543219", 2000);
		Account acc3 = new Account(1003, "Charan");
		Account acc4 = new Account(1004, "Balakrishna", "9876543218", 50000);
		Account acc5 = new Account(1005, "Kishore", "9876543212", 50000);
		return new Account[] { acc1, acc2, acc3, acc4,acc5 };
	}
}
