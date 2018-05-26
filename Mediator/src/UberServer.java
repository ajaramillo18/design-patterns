import java.util.ArrayList;

/**
 * @author ajara
 *
 */
public class UberServer implements Mediator {

	private ArrayList<UberUser> users = new ArrayList<>();

	public void addUser(UberUser user) {
		users.add(user);
	}

	@Override
	public void send(String message, UberUser sender) {

		for (UberUser user : users) {
			// don't tell ourselves
			if (user != sender) {
				user.receive(message, sender);
			}
		}

	}

}
