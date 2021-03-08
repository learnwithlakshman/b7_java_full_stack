package com.careerit.cj.inheritance;

import static com.careerit.cj.inheritance.MaskUtil.mask;

public class CurrentAccount extends Account {
	private double overDraft;

	public CurrentAccount(long accNumber, String name, double balance) {
		super(accNumber, name, balance);
		this.overDraft = 10000;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance + overDraft)) {
			this.balance -= amount;
			System.out.println(
					"After withdraw of " + amount + " the balance in account " + mask(accNumber) + " is " + balance);
		} else {
			System.out.println(
					"You don't have sufficient fund in account :" + mask(accNumber) + " your balance is :" + balance);
		}
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Overdraft balance :" + overDraft);
	}

}
