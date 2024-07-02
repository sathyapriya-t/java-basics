package com.oops.book;

public class BookRunner {

	public static void main(String[] args) {

<<<<<<< HEAD
		Book book = new Book(101, "Sathya", "Object oriented programming");
		book.addReview(new Review(101, "great Book", 5));
		book.addReview(new Review(102, "Awesome", 5));
		System.out.println(book);
=======
		// Instances
		Book artOfComputing = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		artOfComputing.write("art of computing");
		effectiveJava.write("Effective java");
		cleanCode.write("Clean code");
		artOfComputing.read("art of computing");
		effectiveJava.read("Effective java");
		cleanCode.read("Clean code");

		// Encapsulation
		artOfComputing.setAuthor("Sathya");
		artOfComputing.setPrice(1000);
		System.out.println(artOfComputing.getAuthor());
		System.out.println(artOfComputing.getPrice());

		effectiveJava.setAuthor("Sathya");
		effectiveJava.setPrice(1000);
		System.out.println(effectiveJava.getAuthor());
		System.out.println(effectiveJava.getPrice());
>>>>>>> branch 'main' of https://github.com/sathyapriya-t/java-basics.git

	}

}
