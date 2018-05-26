/**
 * 
 */

/**
 * @author ajara
 *
 */
public class ServerMovie implements NetflixMovie {

	private String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NetflixMovie#play()
	 */
	@Override
	public void play() {
		System.out.println(this.title + " is now playing");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NetflixMovie#stop()
	 */
	@Override
	public void stop() {
		System.out.println(this.title + " is paused");

	}

}
