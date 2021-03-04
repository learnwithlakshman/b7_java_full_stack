package com.careerit.cj.basics.accessspecifiers.Two;

import com.careerit.cj.basics.accessspecifiers.one.One;

public class Four {

	private One obj = new One();

	public void show() {
		//System.out.println(obj.pri_a);
		System.out.println(obj.pub_a);
		//System.out.println(obj.def_a);
	    //System.out.println(obj.pro_a);
	}
}
