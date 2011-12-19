package org.ski.dvx.server.hibernate.author;

/**
 * AbstractAuthor entity provides the base persistence definition of the Author
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAuthor implements java.io.Serializable {

	// Fields

	private Integer authorId;
	private Integer userFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractAuthor() {
	}

	/** full constructor */
	public AbstractAuthor(Integer userFk, Long modified, Long created) {
		this.userFk = userFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getUserFk() {
		return this.userFk;
	}

	public void setUserFk(Integer userFk) {
		this.userFk = userFk;
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