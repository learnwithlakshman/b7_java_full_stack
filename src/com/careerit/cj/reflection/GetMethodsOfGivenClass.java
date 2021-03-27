package com.careerit.cj.reflection;

import java.lang.reflect.Method;
class One{
	
	private void m1() {
		
	}
	public void m2() {
		
	}
}
public class GetMethodsOfGivenClass {

		public static void main(String[] args) {
				String clsName = "com.careerit.cj.reflection.One";
				
				try {
					Class<?> cls = Class.forName(clsName);
					Method[] methods = cls.getDeclaredMethods();
					for(Method m :methods) {
						System.out.println("Name :"+m.getName() );
						
					}
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		}
}
