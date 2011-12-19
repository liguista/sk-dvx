package org.ski.dvx.server.hibernate.movie_cast;

/**
 * MovieCast entity. @author MyEclipse Persistence Tools
 */
public class MovieCast extends AbstractMovieCast implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MovieCast() {
	}

	/** full constructor */
	public MovieCast(Integer movieCastMovieIdFk, Integer movieCastCrewCastIdFk,
			Integer movieCastRoleOrder, String movieCastRoleName,
			String movieCastRoleDescription, Long modified, Long created) {
		super(movieCastMovieIdFk, movieCastCrewCastIdFk, movieCastRoleOrder,
				movieCastRoleName, movieCastRoleDescription, modified, created);
	}

}
