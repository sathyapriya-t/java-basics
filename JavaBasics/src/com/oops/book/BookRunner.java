package com.oops.book;

public class BookRunner {

	public static void main(String[] args) {

		// Instances
		Book artOfComputing = new Book(100, "SATHYA");
		Book effectiveJava = new Book(100, "SATHYA");
		Book cleanCode = new Book(100, "SATHYA");

		artOfComputing.write("art of computing");
		effectiveJava.write("Effective java");
		cleanCode.write("Clean code");
		artOfComputing.read("art of computing");
		effectiveJava.read("Effective java");
		cleanCode.read("Clean code");

		// Encapsulation
		artOfComputing.setAuthor("Sathya");
		artOfComputing.setPrice(1000);

		effectiveJava.setAuthor("Sathya");
		effectiveJava.setPrice(1000);
		System.out.println(artOfComputing.getAuthor());
		System.out.println(effectiveJava.getAuthor());

		artOfComputing.decreasePrice(100);
		effectiveJava.decreasePrice(50);
		System.out.println(artOfComputing.getPrice());
		System.out.println(effectiveJava.getPrice());

	}

}
