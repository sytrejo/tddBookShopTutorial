package tddBookShopTutorial;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	
	List<Book> books = new ArrayList<Book>();
	
	public List<Book> getAllBooks() {
		return books;
	}

	public void addBook(Book book) {
		books.add(book);
	}




}
