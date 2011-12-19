package org.ski.dvx.server.hibernate.movie_trailer;

/**
 * AbstractMovieTrailer entity provides the base persistence definition of the
 * MovieTrailer entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieTrailer implements java.io.Serializable {

	// Fields

	private Integer movieTrailerId;
	private Integer movieIdFk;
	private String movieTrailerUri;
	private Integer movieTrailerIndex;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractMovieTrailer() {
	}

	/** full constructor */
	public AbstractMovieTrailer(Integer movieIdFk, String movieTrailerUri,
			Integer movieTrailerIndex, Long modified, Long created) {
		this.movieIdFk = movieIdFk;
		this.movieTrailerUri = movieTrailerUri;
		this.movieTrailerIndex = movieTrailerIndex;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getMovieTrailerId() {
		return this.movieTrailerId;
	}

	public void setMovieTrailerId(Integer movieTrailerId) {
		this.movieTrailerId = movieTrailerId;
	}

	public Integer getMovieIdFk() {
		return this.movieIdFk;
	}

	public void setMovieIdFk(Integer movieIdFk) {
		this.movieIdFk = movieIdFk;
	}

	public String getMovieTrailerUri() {
		return this.movieTrailerUri;
	}

	public void setMovieTrailerUri(String movieTrailerUri) {
		this.movieTrailerUri = movieTrailerUri;
	}

	public Integer getMovieTrailerIndex() {
		return this.movieTrailerIndex;
	}

	public void setMovieTrailerIndex(Integer movieTrailerIndex) {
		this.movieTrailerIndex = movieTrailerIndex;
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