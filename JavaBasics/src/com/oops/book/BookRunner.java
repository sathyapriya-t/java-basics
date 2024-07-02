package com.oops.book;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(101, "Sathya", "Object oriented programming");
		book.addReview(new Review(101, "great Book", 5));
		book.addReview(new Review(102, "Awesome", 5));
		System.out.println(book);

	}

}
