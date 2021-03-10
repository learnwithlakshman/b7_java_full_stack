package com.careerit.cj.interfaceexamples;

public class Manager {

		public static void main(String[] args) {
			ArrayService arrService = new ArrayServiceImpl();//new ArrayServiceImpl();
			int[] sortedArr = arrService.sort(new int[] {1,2,3,4,5,9,8,7,6});
			int index = arrService.search(sortedArr, 5);
			
			// SOLID 
		}
}
