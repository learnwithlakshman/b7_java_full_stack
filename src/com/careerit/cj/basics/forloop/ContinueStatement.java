package com.careerit.cj.basics.forloop;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j)
					continue;
				System.out.println(i + " " + j);
			}

		}
	}
}
