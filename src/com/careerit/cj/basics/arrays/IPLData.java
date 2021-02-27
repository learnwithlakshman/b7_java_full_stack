package com.careerit.cj.basics.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class IPLData {

		public static void main(String[] args) throws FileNotFoundException {
			
				Scanner sc = new Scanner(new File("data/ipl_2021.csv"));
				sc.nextLine();
				int N = 189;
				String[] names = new String[N];
				double[] price = new double[N];
				int i =0;
				while(sc.hasNextLine()) {
					String data = sc.nextLine();
					String[] dataarr = data.split(",");
					names[i]=dataarr[0];
					price[i]=Double.parseDouble(dataarr[4]);
					i++;
				}
				System.out.println(Arrays.toString(names));
				System.out.println(Arrays.toString(price));
		
				double max = price[0], min= price[0];
				for(double p:price) {
					if(max < p) {
						max = p;
					}
					if(min > p) {
						min = p;
					}
				}
				// Can you find max paid player(s) and display name(s)
				System.out.println("Max amount is :"+max+" and player(s)");
				for(int l=0;l<price.length;l++) {
					if(max == price[l]) {
						System.out.println(names[l]);
					}
				}
				
				// Can you find min paid playr(s) and dislay name(s)
				int count = 0;
				System.out.println("Min amount is :"+min+" and player(s)");
				for(int l=0;l<price.length;l++) {
					if(min == price[l]) {
						System.out.println(names[l]);
						count++;
					}
				}
				System.out.println("Base priced player count :"+count);
		}
}
