
public abstract class MoneySender {

	private String name;

	protected boolean hasSpecialMessage;

	final void sendMoney() {

		checkClient();
		receiveMoney();
		depositMoney();
		if (hasSpecialMessage)
			sendSpecialMessage();

	}

	abstract void checkClient();

	abstract void depositMoney();

	abstract void sendSpecialMessage();

	private void receiveMoney() {
		System.out.println("Dolares recibidos");
	}

}
