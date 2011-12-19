package org.ski.dvx.server.hibernate.movie_genre;

/**
 * AbstractMovieGenre entity provides the base persistence definition of the
 * MovieGenre entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieGenre implements java.io.Serializable {

	// Fields

	private Integer movieGenreId;
	private String movieGenreDescription;
	private String movieGenreDescriptionLong;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractMovieGenre() {
	}

	/** full constructor */
	public AbstractMovieGenre(String movieGenreDescription,
			String movieGenreDescriptionLong, Long modified, Long created) {
		this.movieGenreDescription = movieGenreDescription;
		this.movieGenreDescriptionLong = movieGenreDescriptionLong;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getMovieGenreId() {
		return this.movieGenreId;
	}

	public void setMovieGenreId(Integer movieGenreId) {
		this.movieGenreId = movieGenreId;
	}

	public String getMovieGenreDescription() {
		return this.movieGenreDescription;
	}

	public void setMovieGenreDescription(String movieGenreDescription) {
		this.movieGenreDescription = movieGenreDescription;
	}

	public String getMovieGenreDescriptionLong() {
		return this.movieGenreDescriptionLong;
	}

	public void setMovieGenreDescriptionLong(String movieGenreDescriptionLong) {
		this.movieGenreDescriptionLong = movieGenreDescriptionLong;
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