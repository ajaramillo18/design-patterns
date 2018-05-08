import java.util.ArrayList;

/**
 * 
 */

/**
 * @author ajara
 *
 */
public class BookCatalog {
	
	ArrayList<Book> catalog =  new ArrayList<>();
	
	public void AddBook(String title, int pageNumber, String author) {
		
		Book newBook =  new Book();
		newBook.setAuthor(author);
		newBook.setPageNumber(pageNumber);
		newBook.setTitle(title);
		catalog.add(newBook );
		
	}
	
	
	public void AddBook(Book newBook) {
		

		catalog.add(newBook );
		
	}
	public Iterator getIterator() {
		
		Iterator iter = new BookIterator(catalog);  
		return iter;
		
		
	}
	
	
	

}
