package com.careerit.cj.inheritance;


class One{
	int a = 10;
	One(int a){
		this.a = a;
		System.out.println("Constructor of 1");
	}
	public void show() {
		System.out.println(a);
	}
}
class Two extends One{
	int a = 100;
	Two(int a){
		super(a);
		System.out.println("Constructor of 2");
	}
	public void display() {
		System.out.println(super.a);
		System.out.println(a);
	}
}


public class ProductManager {

		public static void main(String[] args) {
//			Product product = new Product(1001, "Dell Studio15", 85000);
//			System.out.println(product.toString());
//			System.out.println(product);
			
			Two obj = new Two(10);
			obj.show();
			
			
		}
}
