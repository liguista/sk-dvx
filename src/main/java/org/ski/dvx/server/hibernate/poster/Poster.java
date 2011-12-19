package org.ski.dvx.server.hibernate.poster;

/**
 * Poster entity. @author MyEclipse Persistence Tools
 */
public class Poster extends AbstractPoster implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Poster() {
	}

	/** full constructor */
	public Poster(Integer posterMovieIdFk, String posterName, String posterUrl,
			Long modified, Long created) {
		super(posterMovieIdFk, posterName, posterUrl, modified, created);
	}

}
