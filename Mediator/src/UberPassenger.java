/**
 * 
 */

/**
 * @author ajara
 *
 */
public class UberPassenger extends UberUser {

	public UberPassenger(Mediator m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	private String payment;

	@Override
	public void receive(String message, UberUser user) {
		if(user.getClass()!= this.getClass()) {
			System.out.println("soy el pasajero " + name+ " Me mandaron mensaje: " + message);
		}
		


	}

	/**
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 *            the payment to set
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}

}
