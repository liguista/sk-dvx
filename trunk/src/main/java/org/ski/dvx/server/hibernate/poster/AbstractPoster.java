package org.ski.dvx.server.hibernate.poster;

/**
 * AbstractPoster entity provides the base persistence definition of the Poster
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoster implements java.io.Serializable {

	// Fields

	private Integer posterId;
	private Integer posterMovieIdFk;
	private String posterName;
	private String posterUrl;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractPoster() {
	}

	/** full constructor */
	public AbstractPoster(Integer posterMovieIdFk, String posterName,
			String posterUrl, Long modified, Long created) {
		this.posterMovieIdFk = posterMovieIdFk;
		this.posterName = posterName;
		this.posterUrl = posterUrl;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getPosterId() {
		return this.posterId;
	}

	public void setPosterId(Integer posterId) {
		this.posterId = posterId;
	}

	public Integer getPosterMovieIdFk() {
		return this.posterMovieIdFk;
	}

	public void setPosterMovieIdFk(Integer posterMovieIdFk) {
		this.posterMovieIdFk = posterMovieIdFk;
	}

	public String getPosterName() {
		return this.posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getPosterUrl() {
		return this.posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
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