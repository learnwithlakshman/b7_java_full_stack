package com.careerit.cj.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {

	void m1() {
		System.out.println("M1 of One");
	}
}

class B extends A {
	void m1() {
		System.out.println("M1 of Two");
	}

	void m2() {
		System.out.println("M2 of Two");
	}
}

class C extends A {
	void m1() {
		System.out.println("M1 of Three");
	}

	void m2() {
		System.out.println("M2 of Three");
	}

	void m3() {
		System.out.println("M3 of Three");
	}
}

// Overloading 

class MathOperations {

	public int add(int a, int b) {
		System.out.println("Int and Int");
		return a + b;
	}

	public int add(char a, char b) {
		System.out.println("Char and Int");
		return a + b;
	}

	public float add(float a, float b) {
		System.out.println("float and float");
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

}

class T1 {
	protected int methodOne(int a, int b) {
		System.out.println("M1");
		return a + b;
	}

	
}

// Private > Default > Protected > public

class T2 extends T1 {
	
	@Override
	protected int methodOne(int a, int b) {
		System.out.println("************");
		return a - b;
	}

	
	
}


class C1{
	int a = 10;
	void m1() {
		System.out.println("M1 of C1");
	}
	 void m1(int a) {
		System.out.println("M1 of c1 with args int");
	}
}
class C2 extends C1{
	int a = 20;
	
	void m1() {
		System.out.println("M1 of C2");
	}
	void m1(int a) {
		System.out.println("M1 with int args");
	}
}
public class Manager {

	public static void main(String[] args) {

		C1 c = new C2();
		System.out.println(c.a);
		c.m1();
		
		T1 objT1 = new T2();
		objT1.methodOne(10, 20);
		
		float a = 15.5f;
		int b = (int) a;
		System.out.println(b);

		MathOperations mathOpe = new MathOperations();
		mathOpe.add('a', 45.50f);
//			A obj = new A();
//			obj.m1();

		A obj = new B();
		if (obj instanceof B) {
			B objB = (B) obj;
			objB.m1();
			objB.m2();
		} else if (obj instanceof C) {
			C objC = (C) obj;
			objC.m1();
			objC.m2();
			objC.m3();
		}

//				Account acc1 = new Account(1001, "Krish", 5000);
//				Account acc2 = new CurrentAccount(2001, "ABC Info Edge", 50000);
//				Account acc3 = new SavingAccount(3001, "Manoj", 3000);

	}

	private static A getObject() {

		return new B();
	}
}
