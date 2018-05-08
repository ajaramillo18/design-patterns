import java.util.ArrayList;

/**
 * 
 */

/**
 * @author ajara
 *
 */
public class BookIterator implements Iterator {

	/**
	 * @param catalog
	 */
	
	ArrayList<Book> catalog;
	int position = 0;
	
	public BookIterator(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}

	/* (non-Javadoc)
	 * @see Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if(position >= catalog.size() || catalog.get(position) == null)
			return false;
		else
			return true;
	}

	/* (non-Javadoc)
	 * @see Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		position++;
		return catalog.get(position-1);
	}

}
