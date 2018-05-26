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

		Voter amalia = new Voter();
		amalia.setAge(25);
		amalia.setName("Amalia Solorzano");
		Voter tonia = null;
		try {
			tonia = (Voter) amalia.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tonia.setAge(30);

		System.out.println("Amalia edad: " + amalia.getAge());
		System.out.println("Amalia nombre: " + amalia.getName());
		System.out.println("Tonia edad: " + tonia.getAge());
		System.out.println("Tonia nombre : " + tonia.getName());

	}

}
