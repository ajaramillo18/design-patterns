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

		UberServer server = new UberServer();

		UberUser pasajero1 = new UberPassenger(server);

		pasajero1.setName("lolita");
		pasajero1.setUbication(450);

		UberUser pasajero2 = new UberPassenger(server);

		server.addUser(pasajero1);

		server.addUser(pasajero2);

		pasajero2.setName("pepito");
		pasajero2.setUbication(10);

		UberUser taxista = new UberDriver(server);

		taxista.setName("vitor");
		taxista.setUbication(69);

		server.addUser(taxista);

		taxista.send();
		pasajero1.send();

	}

}
