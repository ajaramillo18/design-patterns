
public class Testing {

	public static void main(String[] args) {

		/*Library
		books 
		magazines
		newspaper
		
		for(books)
			
		for(magazines)
			
		for(newspaper)
		*/
		Book libro1 = new Book();
		libro1.setAuthor("H. G. Wells");
		libro1.setPageNumber(255);
		libro1.setTitle("La maquina del tiempo");
		Book libro2 = new Book();
		libro2.setAuthor("Unknown");
		libro2.setPageNumber(850);
		libro2.setTitle("las mil y una noches");
		Book libro3 = new Book();
		libro3.setAuthor("Esopo");
		libro3.setPageNumber(5);
		libro3.setTitle("La liebre y la tortuga");
		
		BookCatalog bookCat =  new BookCatalog();
		

		bookCat.AddBook(libro1);
		bookCat.AddBook(libro2);
		bookCat.AddBook(libro3);
		
		Iterator iter = bookCat.getIterator();
		
		Book book;
		
		while(iter.hasNext()) {
			
			System.out.println();
			book = (Book)iter.next();
			System.out.println("Title: "+book.getTitle());
			System.out.println("Author: "+book.getAuthor());
			System.out.println("Number of pages: "+book.getPageNumber());
			
		}
		
		
		
		
		//use java iterator class too

	}

}

