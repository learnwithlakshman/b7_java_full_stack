package com.careerit.cj.basics.str;

public class CollectNames {

		public static void main(String[] args) {
			
				String data = "Lakshman,Krish, Manoj,   charan, John  , mahesh, sUresh, JayesH , ChaRan";
				// 1.Lakshman
				// 2.Krish
				// 3.Manoj
				// 4.Charan
				
				// 1. Split  2.trim  3.toUpperCase 4. toLowerCase 5. concat 6. Substring
				
				String[] arr = data.split(",");
				
				for(String name:arr) {
					name = name.trim();
					name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
					System.out.println(name);
				}
				
				
				
		}
}
