package com.careerit.cj.basics.keywords;

// Code should execute only once
// This should happen when class get loaded
// User shouldn't call manually 

public class StaticBlock {

		static {
			System.out.println("Static Block-1");
		}
		static {
			System.out.println("Static Block-3");
		}
		public static void main(String[] args) {
			System.out.println("....Main...");
		}
		static {
			System.out.println("Static Block-2");
		}
}
