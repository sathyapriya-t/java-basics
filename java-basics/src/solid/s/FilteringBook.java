package solid.s;

import java.util.ArrayList;
import java.util.List;

public class FilteringBook {

	/*
	 * this is the example of single responsibility here one class should contain
	 * only one responsibilty But this has two - filtering and printing so this in
	 * violation of s
	 */
	public static List<Book> bookList = new ArrayList<Book>();

	public List<Book> saveBook(Book book) {
		bookList.add(book);
		return bookList;
	}

	public String filterBookByID(int id) {
		Book bookObject = bookList.stream().filter(val -> val.getId() == id).findFirst().orElse(null);
		return bookObject.getName();
	}

	public List<Book> getAllBooks() {
		return bookList;
	}

	// this method should not be here
	public void printingBook(int id) {
		System.out.println("printing ");
	}

}
