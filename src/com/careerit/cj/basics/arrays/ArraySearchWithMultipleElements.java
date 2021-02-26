package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySearchWithMultipleElements {

	public static void main(String[] args) {

		int arr[] = getStudentIdsFromServer();

		int num1 = 2;
		int num2 = 11;
		int num3 = 21;
		System.out.println(Arrays.toString(arr));
		if (search(arr, num1) && search(arr, num2) && search(arr, num3)) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

	private static boolean search(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return true;
			}
		}
		return false;

	}

	private static int[] getStudentIdsFromServer() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 26);
		}
		return arr;
	}
}
