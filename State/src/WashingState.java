/**
 * 
 */

/**
 * @author ajara
 *
 */
public class WashingState implements State {
	
	

	/* (non-Javadoc)
	 * @see State#wetClothes()
	 */
	@Override
	public void wetClothes(WashingMachine context) {
		System.out.println("You can´t wet clothes while the machine is washing");

	}

	/* (non-Javadoc)
	 * @see State#startWashing()
	 */
	@Override
	public void startWashing(WashingMachine context) {
		System.out.println("The machine is already washing");
	}

	/* (non-Javadoc)
	 * @see State#takeoutClothes()
	 */
	@Override
	public void takeoutClothes(WashingMachine context) {
		System.out.println("You Can´t take clothes out while the machine is washing");

	}

}
