package com.oops.book;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Book {

	// Instance variable
	private int id;
	private String author;
	private String bookName;
	private ArrayList<Review> review = new ArrayList<Review>();

	public Book(int id, String author, String bookName) {
		this.id = id;
		this.author = author;
		this.bookName = bookName;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Review> getReview() {
		return review;
	}

	public void addReview(Review revie) {
		this.review.add(revie);
	}

	@Override
	public String toString() {
		return String.format("author -%s , id -%d  ,bookName-%s ,review-%s ", author, id, bookName, review);
=======
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
>>>>>>> branch 'main' of https://github.com/sathyapriya-t/java-basics.git
	}

}
