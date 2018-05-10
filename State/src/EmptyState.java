/**
 * 
 */

/**
 * @author ajara
 *
 */
public class EmptyState implements State {

	/* (non-Javadoc)
	 * @see State#wetClothes()
	 */
	@Override
	public void wetClothes(WashingMachine context) {
		
		
		
	}

	/* (non-Javadoc)
	 * @see State#startWashing()
	 */
	@Override
	public void startWashing(WashingMachine context) {
		
		System.out.println("Mchine is washing now");
		context.setCurrentState(new WashingState());

	}

	/* (non-Javadoc)
	 * @see State#takeoutClothes()
	 */
	@Override
	public void takeoutClothes(WashingMachine context) {
		System.out.println("There are no clothes to take out");

	}

}
