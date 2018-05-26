
/**
 * @author ajara
 *
 */
public abstract class UberUser {

	protected String name;
	protected int ubication;

	private Mediator mediator;
	protected String message;

	public UberUser(Mediator m) {
		mediator = m;
	}

	public Mediator getMediator() {
		return mediator;
	}

	// send a message via the mediator
	public void send() {

		message = "Soy " + getName() + " estoy ubicado en " + getUbication();

		mediator.send(message, this);
	}

	public abstract void receive(String message, UberUser user);

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ubication
	 */
	public int getUbication() {
		return ubication;
	}

	/**
	 * @param ubication
	 *            the ubication to set
	 */
	public void setUbication(int ubication) {
		this.ubication = ubication;
	}

}
