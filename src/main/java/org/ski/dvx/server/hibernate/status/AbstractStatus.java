package org.ski.dvx.server.hibernate.status;

/**
 * AbstractStatus entity provides the base persistence definition of the Status
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStatus implements java.io.Serializable {

	// Fields

	private Integer statusId;
	private String statusDescription;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractStatus() {
	}

	/** full constructor */
	public AbstractStatus(String statusDescription, Long modified, Long created) {
		this.statusDescription = statusDescription;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
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