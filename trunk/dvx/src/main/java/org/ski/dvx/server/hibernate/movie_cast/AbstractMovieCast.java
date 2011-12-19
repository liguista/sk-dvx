package org.ski.dvx.server.hibernate.movie_cast;

/**
 * AbstractMovieCast entity provides the base persistence definition of the
 * MovieCast entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieCast implements java.io.Serializable {

	// Fields

	private Integer movieCastId;
	private Integer movieCastMovieIdFk;
	private Integer movieCastCrewCastIdFk;
	private Integer movieCastRoleOrder;
	private String movieCastRoleName;
	private String movieCastRoleDescription;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractMovieCast() {
	}

	/** full constructor */
	public AbstractMovieCast(Integer movieCastMovieIdFk,
			Integer movieCastCrewCastIdFk, Integer movieCastRoleOrder,
			String movieCastRoleName, String movieCastRoleDescription,
			Long modified, Long created) {
		this.movieCastMovieIdFk = movieCastMovieIdFk;
		this.movieCastCrewCastIdFk = movieCastCrewCastIdFk;
		this.movieCastRoleOrder = movieCastRoleOrder;
		this.movieCastRoleName = movieCastRoleName;
		this.movieCastRoleDescription = movieCastRoleDescription;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getMovieCastId() {
		return this.movieCastId;
	}

	public void setMovieCastId(Integer movieCastId) {
		this.movieCastId = movieCastId;
	}

	public Integer getMovieCastMovieIdFk() {
		return this.movieCastMovieIdFk;
	}

	public void setMovieCastMovieIdFk(Integer movieCastMovieIdFk) {
		this.movieCastMovieIdFk = movieCastMovieIdFk;
	}

	public Integer getMovieCastCrewCastIdFk() {
		return this.movieCastCrewCastIdFk;
	}

	public void setMovieCastCrewCastIdFk(Integer movieCastCrewCastIdFk) {
		this.movieCastCrewCastIdFk = movieCastCrewCastIdFk;
	}

	public Integer getMovieCastRoleOrder() {
		return this.movieCastRoleOrder;
	}

	public void setMovieCastRoleOrder(Integer movieCastRoleOrder) {
		this.movieCastRoleOrder = movieCastRoleOrder;
	}

	public String getMovieCastRoleName() {
		return this.movieCastRoleName;
	}

	public void setMovieCastRoleName(String movieCastRoleName) {
		this.movieCastRoleName = movieCastRoleName;
	}

	public String getMovieCastRoleDescription() {
		return this.movieCastRoleDescription;
	}

	public void setMovieCastRoleDescription(String movieCastRoleDescription) {
		this.movieCastRoleDescription = movieCastRoleDescription;
	}

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

}