package com.careerit.cj.basics.accessspecifiers.one;

public class One {

	private int pri_a = 10;
	public int pub_a = 20;
	int def_a = 30;
	protected int pro_a = 40;

	public void show() {
		System.out.println(pri_a);
		System.out.println(pub_a);
		System.out.println(def_a);
		System.out.println(pro_a);
	}
}
