package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverageOfArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count :");
		int count = sc.nextInt();
		int[] arr_age = new int[count];
		
		// accept and store ages into arr_age
		for (int i = 0; i < arr_age.length; i++) {
			System.out.println("Enter the student "+(i+1)+" age :");
			arr_age[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0;i<arr_age.length;i++) {
			sum += arr_age[i];
			
		}
	
		float avg = sum / (float)arr_age.length;
		
		System.out.println(Arrays.toString(arr_age));

		System.out.println("The sum of ages is :"+sum);
		System.out.println("The average age is :"+avg);
		sc.close();
		
		
	}
	
}
