package com.careerit.cj.questions;

abstract class Abc {
	Abc() {
		super();
		System.out.println("ABC");
	}

	abstract void m2();

	public void m1() {
		m2();
	}
}

class Xyz extends Abc {
	Xyz() {
		super();
		System.out.println("XYZ");
	}

	@Override
	void m2() {
		System.out.println("Method M2");
	}
}

abstract class One {
	public abstract void m1();

	public abstract void m2();

	public abstract void m3();
}

abstract class Two extends One {
	@Override
	public void m1() {
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}
}

class Three extends Two {

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}
}
class Four extends Two{
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractClassQuestions {

	public static void main(String[] args) {
		Abc obj = new Xyz();
		obj.m1();
	}
}
