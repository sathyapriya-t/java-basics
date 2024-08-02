package solid.s;

public class PrintingBooks {

	// here using single functionality of printing books
	public void printingBook(int id) {
		System.out.println("printing.... ");
		FilteringBook.bookList.forEach(System.out::println);

	}

}