/**
 * 
 */

/**
 * @author ajara
 *
 */
public class WesternUnion extends MoneySender{

	
	
	
	public WesternUnion() {
		super();
		super.hasSpecialMessage = true;
	}

	@Override
	void checkClient() {
		System.out.println("revisa historial del cliente");
		
	}

	@Override
	void depositMoney() {
		System.out.println("depositar dinero a banorte");
		
	}

	@Override
	void sendSpecialMessage() {
		System.out.println("dinero depositado via WeternUnion, gracias.");
		
	}

}
