import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

/**
 * 
 */

/**
 * @author ajara
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Armando is working in mexico city";
		
		name = name.toUpperCase();
		
		char[] cname = name.toCharArray();
		
		Arrays.sort(cname);
		Hashtable hash = new Hashtable<>();
		
		char x = 'a';
		
		int counter = 0;
		for (char c: cname) {
			
			System.out.println(c);
			if(x == c) {
				
				counter++;
			}else {
				hash.put(x, counter+1);
				x = c;
				
				counter = 0;
				
			}
		}
			
		System.out.println(hash.toString());

	}

}
