package solid.o;

import solid.s.Book;
import solid.s.FilteringBook;
import solid.s.PrintingBooks;

public class OpenClosed {

	// SOLID- used to write maintainable, flexible and understandable code
	// S - SingleResponsibility
	// O - Open/Closed
	// L - Liskov Substitution
	// I - Interface Seggregation
	// D - Dependancy Inversion

	public static void main(String[] args) {

		// O - Open/Closed - a class should be Open for Extension and Closed for
		// Modification
		Book cloudComputing = new Book(2, "Cloud Computing", "Raj");

		// addingBooks
		FilteringBook filteringBook = new FilteringBook();
		filteringBook.saveBook(cloudComputing);
		System.out.println(filteringBook.getAllBooks());

		// AddingNovel
		Novel novel = new Novel(3, "Good Girl Guide To Murder", "Anna Bell", 6);
		filteringBook.saveBook(novel);
		System.out.println(filteringBook.getAllBooks());

		// printing Book - novel
		PrintingBooks printingBooks = new PrintingBooks();
		printingBooks.printingBook(3);
	}
}
