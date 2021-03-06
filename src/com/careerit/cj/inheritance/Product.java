package com.careerit.cj.inheritance;

public class Product{

	private int pid;
	private String pname;
	private double price;

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public void applyDiscount(int percentage) {
		this.price -= ((this.price * percentage) / 100);
	}

	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return String.format("[Product(%s,%s,%s)]", pid, pname, price);
	}
}

