package tddBookShopTutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatalogueTest {
	
	
	Catalogue catalogue;
	
	@BeforeEach
	void setUp() throws Exception {
		catalogue = new Catalogue();
	}

	
	@Test
	public void test_GetAllBooks_ReturnsAListOfLengthZero_WhenTheCatalogueHasHadNoBooksAdded(){
		//Arrange
		Catalogue catalogue = new Catalogue();
		//Act
		List<Book> booksInCatalogue = catalogue.getAllBooks();
		//Assert
		assertEquals(0, booksInCatalogue.size());
	}
	
	@Test
	public void test_GetAllBooks_returnsAListOfLengthOne_WhenTheCatalogueHasHadOneBookAdded() {
			// Arrange
			Catalogue catalogue = new Catalogue();
			Book book = new Book();
			
			// Act
			catalogue.addBook(book);
			List<Book> booksInCatalogue = catalogue.getAllBooks();

			// Assert
			assertEquals(1, booksInCatalogue.size());
	}





}
