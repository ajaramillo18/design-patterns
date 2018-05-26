/**
 * 
 */

/**
 * @author ajara
 *
 */
public class WashingMachine {

	private State currentState;

	/*
	 * states washing donewashing empty
	 */

	public WashingMachine(State currentState) {
		super();
		this.currentState = currentState;
	}

	public void wetClothes() {

		currentState.wetClothes(this);

	}

	public void startWashing() {

		currentState.startWashing(this);

	}

	public void takeoutClothes() {

		currentState.takeoutClothes(this);

	}

	/**
	 * @return the currentState
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState
	 *            the currentState to set
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

}
