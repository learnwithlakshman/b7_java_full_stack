package com.careerit.cj.objectcreations;

public class Book implements Cloneable {
	private String isbn;
	private String title;
	private String author;
	private double price;

	
	public Book() {
	}

	public Book(String isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void discount(int percentage) {
		this.price -= (price * percentage)/100;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Book [isbn=%s, title=%s, author=%s, price=%s]", isbn, title, author, price);
	}
	
	@Override
	protected Book clone() throws CloneNotSupportedException {
		return (Book)super.clone();
	}
}