package com.careerit.cj.basics.str;

import java.util.Arrays;

public class AngramExample {

		public static void main(String[] args) {
			String name1 = "Stressed";
			String name2 = "Desserts";

			boolean flag = true;
			if(name1.length() != name2.length()) {
				flag = false;
			}else {
				char[] arr1 = name1.toLowerCase().toCharArray();
				char[] arr2 = name2.toLowerCase().toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				flag = Arrays.equals(arr1,arr2);
			}
			if(flag) {
				System.out.println(name1+" and "+name2+" is an anagrams");
			}else {
				System.out.println(name1+" and "+name2+" is not an anagrams");
			}
		}
}
