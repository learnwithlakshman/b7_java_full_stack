package com.careerit.cj.exceptions;

import java.util.Scanner;

public class ExcpeptionExample3 {

	public static void main(String[] args) {

//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter the class name:");
//			String clsName = sc.next();
//			try {
//				Class<?> cls = Class.forName(clsName);
//				cls.newInstance();
//			}catch (IllegalAccessException e) {
//				// 
//				try {
//					//-----
//				}catch (Exception er) {
//					er.printStackTrace();
//				}
//			} catch (InstantiationException e) {
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
//
//		hello();
		hello(15);
	}

	public static void hello(int num) throws NumberFormatException {

		
			//Insufficient funds  ( SMS)
		    // Max limit          ( SMS email)
		    // Invalid password   ( Block account 24)
		
		if(true) {
			System.out.println("Hello");
			return ;
		}
		
		System.out.println("Hi");
	}
}
