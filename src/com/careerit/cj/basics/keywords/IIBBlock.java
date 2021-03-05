package com.careerit.cj.basics.keywords;

class Product {

	private int pid;
	private String pname;
	private double price;
	private String description;
	private static int count =0;

	{
		System.out.println("Object created successfully");
		count++;
	}

	public Product(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;

	}

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public Product(int pid, String pname, double price, String description) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.description = description;

	}
	public static int count() {
		return count;
	}

}
// Object created successfully 

public class IIBBlock {

	public static void main(String[] args) {
		System.out.println(Product.count());
		Product p1 = new Product(1001, "Lenovo Thinkpad");
		Product p2 = new Product(1002, "HP",13000);
		Product p3 = new Product(1003, "Dell",12000);
		System.out.println(Product.count());
	}
}
