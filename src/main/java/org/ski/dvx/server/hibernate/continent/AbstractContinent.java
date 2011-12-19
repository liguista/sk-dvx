package org.ski.dvx.server.hibernate.continent;

/**
 * AbstractContinent entity provides the base persistence definition of the
 * Continent entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractContinent implements java.io.Serializable {

	// Fields

	private Integer continentId;
	private String continentName;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractContinent() {
	}

	/** full constructor */
	public AbstractContinent(String continentName, Long modified, Long created) {
		this.continentName = continentName;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getContinentId() {
		return this.continentId;
	}

	public void setContinentId(Integer continentId) {
		this.continentId = continentId;
	}

	public String getContinentName() {
		return this.continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
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