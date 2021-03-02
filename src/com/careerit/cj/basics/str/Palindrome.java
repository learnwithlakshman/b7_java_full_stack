package com.careerit.cj.basics.str;

public class Palindrome {

	public static void main(String[] args) {
		String name = "1221";

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		// Check name is palindrome or not
		boolean flag = true;
		for (int i = 0, j = name.length() - 1; i <= j; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(name + " is a palindrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}
		// using char array

		char[] arr = new char[name.length()];
		for (int i = name.length() - 1, j = 0; i >= 0; i--, j++) {
			arr[j] = name.charAt(i);
		}
		String rname = new String(arr);
		if (rname.equals(name)) {
			System.out.println(name + " is a palindrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}
		
		String revname = "";
		for(int i=name.length()-1;i>=0;i--) {
			revname += name.charAt(i);
		}
		if (revname.equals(name)) {
			System.out.println(name + " is a palindrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}
		
		if (new StringBuffer(name).reverse().toString().equals(name)) {
			System.out.println(name + " is a palindrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}

	}
}
