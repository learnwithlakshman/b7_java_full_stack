package com.careerit.cj.basics.keywords;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

import java.util.Arrays;
import java.util.Date;


public class Manager {

	public static void main(String[] args) {
		
		Date date = new Date();
		java.sql.Date sqldate = new java.sql.Date(198765432);

		int[] arr = { 3, 2, 4, 5, 6, 7, 8, 9, 20, 15, 22 };
		int res = MyMathOperations.maxElement(arr);
		System.out.println("Max is :"+res);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 9));
		sort(arr);
		
		System.out.println(sqrt(9));
		System.out.println(ceil(5.5));
		System.out.println(floor(6.7));
		System.out.println(Math.pow(3, 5));
		
	}
	public  double pow(double a,double b) {
		return 0;
	}
}
