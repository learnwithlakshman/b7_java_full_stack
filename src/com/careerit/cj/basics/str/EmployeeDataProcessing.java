package com.careerit.cj.basics.str;

public class EmployeeDataProcessing {

		public static void main(String[] args) {
			
				String data = "PKM-Dev-Bangalore-9876543211,ALN-Prod-Bombay-9876543212,GLN-Dev-Bangalore-9876543214,GVR-Dev-Bombay-9876543215";
				// PKM -  9876543211
				// ALN -  9876543212
				String[] arr = data.split(",");
				
				for(int i=0;i<arr.length;i++) {
					String empData = arr[i];
					String[] empArr = empData.split("-");
					String namewithmobile = empArr[0]+" - "+empArr[3];
					System.out.println(namewithmobile);
				}
		}
}
