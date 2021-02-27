package com.careerit.cj.basics.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraySplitMethod {

		public static void main(String[] args) throws FileNotFoundException {
			
				Scanner sc = new Scanner(new File("data/names.txt"));
				String data = sc.nextLine();
				String[] names = data.split(",");
//				for(int i=0;i<names.length;i++) {
//					System.out.println(names[i]);
//				}
				
				for(String ele:names) {
					System.out.println(ele);
				}
				
				
				int[][] arr = {{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,0,0,0,1}};
				
				for(int i=0;i<arr.length;i++) {
					
					for(int j=0;j<arr[i].length;j++) {
						if(arr[i][j] == 1) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
						
					}
					System.out.println();
					
				}
		}
}
