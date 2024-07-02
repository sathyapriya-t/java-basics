package com.oops.book;

public class Book {
	public Book(int price, String author) {
		this.price = price;
		this.author = author;
	}

	// Instance variable
	private int price;
	private String author;

	// getter and setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void increasePrice(int increasePrice) {
		System.out.println("increased price " + increasePrice);
		setPrice(this.price + increasePrice);
	}

	public void decreasePrice(int decreasePrice) {
		System.out.println("decreased price " + decreasePrice);
		setPrice(this.price - decreasePrice);
	}

	// behaviours
	void read(String name) {
		System.out.println("Reading " + name);
	}

	void write(String name) {
		System.out.println("Writing " + name);
	}

}
