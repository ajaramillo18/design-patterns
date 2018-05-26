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
		// TODO Auto-generated method stub

		try {

			Siniestro sin = new Siniestro.SiniestroBuilder().delincuente("EPN").aseguradora("Sup0er").build();

		} catch (IllegalStateException e) {

			System.out.println("ERROR:" + e.getMessage());
			e.printStackTrace();
		}

		// siniestro en oxxo

	}

}
