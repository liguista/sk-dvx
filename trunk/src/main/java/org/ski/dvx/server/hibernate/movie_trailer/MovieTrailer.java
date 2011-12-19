package org.ski.dvx.server.hibernate.movie_trailer;

/**
 * MovieTrailer entity. @author MyEclipse Persistence Tools
 */
public class MovieTrailer extends AbstractMovieTrailer implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MovieTrailer() {
	}

	/** full constructor */
	public MovieTrailer(Integer movieIdFk, String movieTrailerUri,
			Integer movieTrailerIndex, Long modified, Long created) {
		super(movieIdFk, movieTrailerUri, movieTrailerIndex, modified, created);
	}

}
