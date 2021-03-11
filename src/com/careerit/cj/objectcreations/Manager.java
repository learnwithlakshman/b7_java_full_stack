package com.careerit.cj.objectcreations;

interface Shape {
	public String draw();
	public static void show() {
		
	}
	default void hello() {
		
	}
}

class Paint {

	public void renderShape(Shape shape) {
		System.out.println(shape.draw());
	}
}

//Anonymous  object

public class Manager {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Clone

		Book book = new Book("9876543210", "OCA Java SE8", "Kathy Sierra", 480);
		System.out.println(book);
		book.discount(10);
		Book book1 = book.clone();
		book.discount(15);
		System.out.println(book);
		System.out.println(book1);

		Paint paint = new Paint();
		paint.renderShape(() -> "CIRCLE"); // Lambda 
	}
}

// Functional Interface
// Which has only one abstract method
// Default method