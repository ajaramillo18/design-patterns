/**
 * 
 */

/**
 * @author ajara
 *
 */
public class UberDriver extends UberUser {

	public UberDriver(Mediator m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	private String Type;

	@Override
	public void receive(String message, UberUser user) {

		if (user.getClass() != this.getClass()) {
			System.out.println("soy el taxista " + name + " Me mandaron mensaje: " + message);
		}

	}

	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		Type = type;
	}

}
