package com.careerit.cj.basics.arrays;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 3, 2, 1 };
		int[] arr2 = { 2, 3, 4, 4, 3 };
		int[] arr3 = { 1, 2, 1 };
		System.out.println(Arrays.toString(arr1)+" is palindrome :"+isArrayPalindrome(arr1));
		System.out.println(Arrays.toString(arr2)+" is palindrome :"+isArrayPalindrome(arr2));
		System.out.println(Arrays.toString(arr3)+" is palindrome :"+isArrayPalindrome(arr3));

	}

	public static boolean isArrayPalindrome(int[] arr) {

		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}

		return true;

	}
}
