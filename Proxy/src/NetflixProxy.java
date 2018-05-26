/**
 * 
 */

/**
 * @author ajara
 *
 */
public class NetflixProxy implements NetflixMovie {

	private ServerMovie movie;

	public NetflixProxy(String movieTitle) {
		super();
		this.movie = new ServerMovie();
		this.movie.setTitle(movieTitle);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NetflixMovie#play()
	 */
	@Override
	public void play() {
		movie.play();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NetflixMovie#stop()
	 */
	@Override
	public void stop() {
		movie.stop();

	}

}
