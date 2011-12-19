package org.ski.dvx.server.hibernate.path;

/**
 * AbstractPath entity provides the base persistence definition of the Path
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPath implements java.io.Serializable {

	// Fields

	private Integer idKey;
	private Integer authorFk;
	private String pathPrefix;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractPath() {
	}

	/** full constructor */
	public AbstractPath(Integer authorFk, String pathPrefix, Long modified,
			Long created) {
		this.authorFk = authorFk;
		this.pathPrefix = pathPrefix;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getIdKey() {
		return this.idKey;
	}

	public void setIdKey(Integer idKey) {
		this.idKey = idKey;
	}

	public Integer getAuthorFk() {
		return this.authorFk;
	}

	public void setAuthorFk(Integer authorFk) {
		this.authorFk = authorFk;
	}

	public String getPathPrefix() {
		return this.pathPrefix;
	}

	public void setPathPrefix(String pathPrefix) {
		this.pathPrefix = pathPrefix;
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