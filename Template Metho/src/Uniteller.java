/**
 * 
 */

/**
 * @author ajara
 *
 */
public class Uniteller extends MoneySender {
	
	

	public Uniteller() {
		super();
		super.hasSpecialMessage = false;
	}

	/* (non-Javadoc)
	 * @see MoneySender#checkClient()
	 */
	@Override
	void checkClient() {
		System.out.println("revisa datos del cliente con el FBI");

	}

	/* (non-Javadoc)
	 * @see MoneySender#depositMoney()
	 */
	@Override
	void depositMoney() {
		System.out.println("depositar dinero a elektra");

	}

	/* (non-Javadoc)
	 * @see MoneySender#sendSpecialMessage()
	 */
	@Override
	void sendSpecialMessage() {
		// TODO Auto-generated method stub

	}

}
