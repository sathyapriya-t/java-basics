package com.oops.book;

public class Book {
	// Instance variable
	private int price;
	private String author;

	// getter and setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// behaviours
	void read(String name) {
		System.out.println("Reading " + name);
	}

	void write(String name) {
		System.out.println("Writing " + name);
	}

}
