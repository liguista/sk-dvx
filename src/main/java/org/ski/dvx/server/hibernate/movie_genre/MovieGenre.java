package org.ski.dvx.server.hibernate.movie_genre;

/**
 * MovieGenre entity. @author MyEclipse Persistence Tools
 */
public class MovieGenre extends AbstractMovieGenre implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MovieGenre() {
	}

	/** full constructor */
	public MovieGenre(String movieGenreDescription,
			String movieGenreDescriptionLong, Long modified, Long created) {
		super(movieGenreDescription, movieGenreDescriptionLong, modified,
				created);
	}

}
