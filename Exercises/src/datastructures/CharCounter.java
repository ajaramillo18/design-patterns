package datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author ajara
 *
 */
public class CharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Armando is working in mexico city";

		//HashMap hash = firstMethod(name);
		HashMap hash = secondMethod(name);
		System.out.println(hash.toString());

	}

	static HashMap secondMethod(String sentence) {

		sentence = sentence.toUpperCase();

		char[] cname = sentence.toCharArray();

		HashMap hash = new HashMap();

		for (char c : cname) {

			System.out.println(c);

			if (hash.containsKey(c)) {

				Integer i = (Integer) hash.get(c);
				// see here difference between i++ and ++i
				hash.put(c, ++i);
				
			} else {

				hash.put(c, 1);

			}

		}

		return hash;
	}

	static HashMap firstMethod(String sentence) {

		sentence = sentence.toUpperCase();

		char[] cname = sentence.toCharArray();

		Arrays.sort(cname);
		HashMap hash = new HashMap();

		char x = 'a';

		int counter = 0;
		char c2 = ' ';
		for (char c : cname) {

			System.out.println(c);
			c2 = c;
			if (x == c) {

				counter++;
			} else {
				hash.put(x, counter + 1);
				x = c;

				counter = 0;

			}

		}
		hash.put(c2, counter + 1);
		return hash;

	}

}
