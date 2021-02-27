package com.careerit.cj.basics.arrays;

public class MatrixOperation {

		public static void main(String[] args) {
			
				int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{1,2,10}};
				
				for(int i=0;i<arr.length;i++) {
					
					for(int j=0;j<arr[i].length;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				// Element sum
				
				int sum = 0;
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						int ele = arr[i][j];
						sum += ele;
					}
				}
				System.out.println("The sum is :"+sum);
				// Find each row sum   
				// 0 - 6
				//1 - 15
				//2 - 24
				//3 - 13
				for(int i=0;i<arr.length;i++) {
					int s = 0;
					for(int j=0;j<arr[i].length;j++) {
						s+=arr[i][j];
					}
					System.out.println("The sum of "+i+" row is :"+s);
				}
				
				// Column sum 
				// 0 - 13
				// 1 - 17
				// 2 - 28
				
				for(int i=0;i<arr[i].length;i++) {
					int s = 0;
					for(int j=0;j<arr.length;j++) {
						s += arr[j][i];
					}
					System.out.println("The sum of column "+i+" is "+s);
				}
				
				// Find biggest number
				
				int big = arr[0][0];
				
				for(int[] earr:arr) {
					for(int ele:earr) {
						if(big < ele) {
							big = ele;
						}
					}
				}
				System.out.println("Biggest element is :"+big);
				
				
				int[] ids = {1,2,3,4,5,6};
				
				for(int id: ids) {
					System.out.println(id);
				}
		}
}
