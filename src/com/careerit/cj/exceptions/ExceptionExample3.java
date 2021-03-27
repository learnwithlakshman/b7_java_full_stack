package com.careerit.cj.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample3 {

	public static void main(String[] args) {

		Throwable[] arr = getAllExcpetions();
		for(Throwable t:arr) {
			if(t instanceof RuntimeException) {
				System.out.println(t +" "+"Unchecked");
			}else if(t instanceof Exception) {
				System.out.println(t +" "+"Checked");
			}
		}
		
	}

	private static Throwable[] getAllExcpetions() {
		return new Throwable[] { 
				new IOException(), 
				new NumberFormatException(),
				new IllegalArgumentException(),
				new FileNotFoundException(), 
				new CloneNotSupportedException(),
				new InstantiationException() };
	}
}
