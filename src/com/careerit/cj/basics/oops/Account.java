package com.careerit.cj.basics.oops;

public class Account {

	private long accNumber;
	private String name;
	private double balance;
	private String mobile;

	public Account(long accNumber, String name) {
		this(accNumber, name, 500);

	}

	public Account(long accNumber, String name, double balance) {
		this(accNumber, name, "N/A", balance);
	}

	public Account(long accNumber, String name, String mobile, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.mobile = mobile;
		this.balance = balance;
	}

//	public void setValues(long accNumber,String name,double balance) {
//		this.accNumber = accNumber;
//		this.name = name;
//		this.balance = balance;
//	}
	public void withDraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("You have withdrawn :" + amount + " and Balance :" + balance);
		} else {
			System.out.println("You don't have sufficient funds and your balance is : " + balance);
		}
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("You have deposited amount " + amount + " and balance is :" + balance);
	}

	public void showInfo() {
		System.out.println("Acc Number :" + accNumber);
		System.out.println("Name       :" + name);
		System.out.println("Balance    :" + balance);
		System.out.println("Mobile     :" + mobile);
	}

	public double getBalance() {
		return this.balance;
	}

}
