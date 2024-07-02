package com.oops.book;

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
	}

}
