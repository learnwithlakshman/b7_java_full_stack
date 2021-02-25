package com.careerit.cj.basics.whileloops;

public class AmstrongNumber {

	public static void main(String[] args) {

//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the num value :");
//			int num = sc.nextInt();

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			int num = i;
			int tnum = num;
			int sum = 0;
			while (tnum != 0) {
				int r = tnum % 10;
				sum = sum + r * r * r;
				tnum = tnum / 10;
			}
			if(sum == num) {
				System.out.print(num+" ");
			}
//			if (sum == num) {
//				System.out.println(num + " is a amstrong");
//
//			} else {
//				System.out.println(num + " is not a amstrong");
//
//			}
		}
//		sc.close();
	}
}
