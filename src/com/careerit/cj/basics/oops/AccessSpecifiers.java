package com.careerit.cj.basics.oops;

class Calc{
	
		public int sum(int a,int b) {
			return a + b;
		}
		public int sub(int a,int b) {
			return a - b;
		}
		public int mul(int a,int b) {
			return a * b;
		}
		public int div(int a,int b) {
			return a / b;
		}
		public int mod(int a,int b) {
			return a % b;
		}
		public int factorial(int a) {
			//Write logic
			return 0;
		}
		public int gcd(int a,int b) {
			//Write logic
			return 0;
		}
}

class ScientificCalc extends Calc{
	
	public double cos(int value) {
		return Math.cos(value);
	}
	
	public double gcd(int a,int b,int c) {
		return gcd(gcd(a,b),c);
	}
}

public class AccessSpecifiers {

		public static void main(String[] args) {
			
				int num1 = 68;
				int num2 = 153;
				Calc obj = new Calc();    // HAS-A relation
				int res = obj.gcd(num1, num2);
				System.out.println("GCD of "+num1+" and "+num2 + " is "+res);
		}
}
