package solid.s;

public class SingleResponsibility {

	// SOLID- used to write maintainable, flexible and understandable code
	// S - SingleResponsibility
	// O - Open/Closed
	// L - Liskov Substitution
	// I - Interface Seggregation
	// D - Dependancy Inversion

	public static void main(String[] args) {

		// Objects
		Book solidDesignPrinciples = new Book(1, "Solid Design Principles", "Mark");
		Book cloudComputing = new Book(2, "Cloud Computing", "Raj");

		// addingBooks
		FilteringBook filteringBook = new FilteringBook();
		filteringBook.saveBook(cloudComputing);
		System.out.println(filteringBook.getAllBooks());

		filteringBook.saveBook(solidDesignPrinciples);
		System.out.println(filteringBook.getAllBooks());

		// Printing boooks
		PrintingBooks printingBooks = new PrintingBooks();
		printingBooks.printingBook(1);

	}

}
