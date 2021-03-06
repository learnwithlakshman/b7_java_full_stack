package com.careerit.cj.inheritance;

public class AccountService {

	private Account[] accounts;

	public AccountService() {
		Account acc1 = new Account(36394277, "Krish", 50000);
		Account acc2 = new Account(36394271, "Manoj", 50000);
		Account acc3 = new Account(36394272, "Charan", 50000);
		Account acc4 = new Account(36394273, "John", 50000);
		Account acc5 = new Account(36394274, "Venu", 50000);
		Account acc6 = new Account(36394275, "Tanvi", 50000);
		Account acc7 = new Account(36394276, "Manish", 50000);
		Account acc8 = new Account(36394223, "Swathi", 50000);
		Account acc9 = new Account(36394224, "Swarana", 50000);
		Account acc10 = new Account(36394225, "John", 50000);
		accounts = new Account[] { acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10 };
	}

	//TODO
	// Adding new account
	// Making array dynamic
	// Deleting account
	
	public void showAccounts() {
		
		for (Account acc : accounts) {
			acc.showInfo();
			System.out.println("---------------------------------------");
		}
	}

	public void depositAmount(long accNumber, double amount) {
		int pos = index(accNumber);
		if (pos != -1) {
			Account acc = accounts[pos];
			acc.deposit(amount);
		} else {
			System.out.println("Invalid account number : " + accNumber);
		}
	}

	

	public void withdrawAmount(long accNumber, double amount) {
		//TODO Logic
	}
	private int index(long accNumber) {
		for (int i = 0; i < accounts.length; i++) {
			Account acc = accounts[i];
			if (acc.accNumber == accNumber) {
				return i;
			}
		}
		return -1;
	}
}
