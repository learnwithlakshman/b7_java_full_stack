package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortingArray {

		public static void main(String[] args) {
			
				int[] arr = new int[10];
				for(int i=0;i<arr.length;i++) {
					arr[i] = ThreadLocalRandom.current().nextInt(1,21);
				}
				System.out.println(Arrays.toString(arr));
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length-i-1;j++) {
						if(arr[j] > arr[j+1]) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				int key = 16;
				int isFound = Arrays.binarySearch(arr, key);
				if(isFound != -1) {
					System.out.println(key+ " Element is found at "+isFound);
				}else {
					System.out.println(key +" Element is not found");
				}
		}

		private static int binarySearch(int[] arr, int key) {
			int low = 0;
			int high = arr.length-1;
			int index = -1;
			while(low <= high) {
				int mid = (low + high)/2;
				if(arr[mid] == key) {
					index = mid;
					break;
				}else if(key > arr[mid]) {
					low = mid + 1;
				}else {
					high = mid -1;
				}
			}
			return index;
		}
}
