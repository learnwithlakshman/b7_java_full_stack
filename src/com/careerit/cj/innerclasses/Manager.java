package com.careerit.cj.innerclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class Outer {
	private static int a = 100;

	static class Inner {
		public void show() {
			System.out.println("Value of A = " + a);
		}
	}
}

interface Itr {

	public boolean hasNext();

	public int next();
}

class ArrayElements {

	private int[] arr = { 3, 4, 5, 1, 2, 3, 7, 8, 9 };

	public Itr itr() {
		class ItrImpl implements Itr {
			int i = 0;
			int size = arr.length;

			@Override
			public boolean hasNext() {
				if (i < size) {
					return true;
				}
				return false;
			}

			@Override
			public int next() {
				return arr[i++];
			}

		}
		return new ItrImpl();
	}

}

interface MathOperations {
	
	int a = 10;
	public boolean isPrime(int num);

	public int factorial(int num);

	public boolean isPalindrome(String str);

	public default int primeCount(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
}

class MathOperationsImpl implements MathOperations {

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int factorial(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		return false;
	}
	

}

public class Manager {

	private static String[] names = "Rajesh,Krish,Manoj,Jayesh,Suresh,Mahesh,Charan,Ram,Pavan,John,Amith".split(",");

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOpe = (a, b) -> a + b;
		System.out.println(binaryOpe.apply(10, 20));
		System.out.println(search(t -> t.startsWith("R")));
		System.out.println(search(t -> t.length() == 6));
		System.out.println(search(t -> t.toLowerCase().contains("sh")));
		Predicate<String> p = t -> t.startsWith("A");

	}

	public static List<String> search(Predicate<String> filter) {
		List<String> list = new ArrayList<String>();
		for (String name : names) {
			if (filter.test(name)) {
				list.add(name);
			}
		}
		return list;
	}

}
