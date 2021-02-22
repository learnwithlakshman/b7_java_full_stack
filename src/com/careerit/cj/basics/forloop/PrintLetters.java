package com.careerit.cj.basics.forloop;

public class PrintLetters {

		public static void main(String[] args) {
			int ch = 65;
			
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=10;j++) {
					System.out.print((char)ch++ + " ");
				}
				System.out.println();
			}
		}
}
