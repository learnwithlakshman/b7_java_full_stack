package com.careerit.cj.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
	public String fullName(String fname, String lname) {
		return fname.concat(" ").concat(lname);
	}
	
	public String toProperCase(String name) {
		return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
	}
	public String numToBinaryString(int num) {
		return Integer.toBinaryString(num);
	}
	public String fullDetails(Long empno,String name,Double salary) {
		return String.format("Empno  : %s\nEname  : %s\nSalary : %s", empno,name,salary);
	}
}

public class ReflectionApiInvokeMethod {

		public static void main(String[] args) {
			try {
				
				Class<?> cls = Class.forName("com.careerit.cj.reflection.Person");
				Method method = cls.getMethod("fullDetails", new Class[] {Long.class,String.class,Double.class});
				String binaryStr = (String) method.invoke(cls.newInstance(), new Object[] {new Long(2501),"Krish",new Double(34556)});
				System.out.println(binaryStr);
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
				e.printStackTrace();
			}
		}
}
