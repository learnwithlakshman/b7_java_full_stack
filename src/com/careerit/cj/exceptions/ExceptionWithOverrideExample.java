package com.careerit.cj.exceptions;

import java.io.IOException;

class OneException extends Exception{
	
}
class TwoException extends OneException{
	
}

class ThreeException extends TwoException{
	
}

class One{
	
		void m1()throws TwoException{
			System.out.println("M1 of One");
		}
}
class Two extends One{
		void m1(){
			System.out.println("M1 of Two");
		}
}
public class ExceptionWithOverrideExample {

}
