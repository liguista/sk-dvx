package org.ski.dvx.server.hibernate.version;

/**
 * AbstractVersion entity provides the base persistence definition of the
 * Version entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVersion implements java.io.Serializable {

	// Fields

	private Integer versionId;
	private String versionDescription;
	private Integer authorFk;
	private Integer movieFk;
	private Integer languageFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractVersion() {
	}

	/** full constructor */
	public AbstractVersion(String versionDescription, Integer authorFk,
			Integer movieFk, Integer languageFk, Long modified, Long created) {
		this.versionDescription = versionDescription;
		this.authorFk = authorFk;
		this.movieFk = movieFk;
		this.languageFk = languageFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public String getVersionDescription() {
		return this.versionDescription;
	}

	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}

	public Integer getAuthorFk() {
		return this.authorFk;
	}

	public void setAuthorFk(Integer authorFk) {
		this.authorFk = authorFk;
	}

	public Integer getMovieFk() {
		return this.movieFk;
	}

	public void setMovieFk(Integer movieFk) {
		this.movieFk = movieFk;
	}

	public Integer getLanguageFk() {
		return this.languageFk;
	}

	public void setLanguageFk(Integer languageFk) {
		this.languageFk = languageFk;
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