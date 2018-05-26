/**
 * 
 */

/**
 * @author ajara
 *
 */
public class finishedWashingState implements State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see State#wetClothes()
	 */
	@Override
	public void wetClothes(WashingMachine context) {

		System.out.println("the clothes are already washed");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see State#startWashing()
	 */
	@Override
	public void startWashing(WashingMachine context) {

		System.out.println("the clothes are already washed");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see State#takeoutClothes()
	 */
	@Override
	public void takeoutClothes(WashingMachine context) {

		System.out.println("taking clothes out");
		context.setCurrentState(new EmptyState());

	}

}
