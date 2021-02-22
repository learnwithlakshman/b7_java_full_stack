package com.careerit.cj.basics.forloop;

public class PatternExamples {

		public static void main(String[] args) {
			int count = 0;
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					count++;
					System.out.print(count+" ");
				}
				System.out.println();
			}
		}
}
