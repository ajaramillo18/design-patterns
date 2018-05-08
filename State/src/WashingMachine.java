/**
 * 
 */

/**
 * @author ajara
 *
 */
public class WashingMachine {

	
	State currentState;
	
	/*states
	 * washing
	 * donewashing
	 * empty
	 */
	
	 
	public void wetClothes() {
		
		currentState.wetClothes();
		
	}
	
	public void startWashing() {
		
		currentState.startWashing();
		
	}
	
	public void takeoutClothes() {
		
		currentState.takeoutClothes();
		
	}

	public WashingMachine(State currentState) {
		super();
		this.currentState = currentState;
	}

	/**
	 * @return the currentState
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	
	
	
}
