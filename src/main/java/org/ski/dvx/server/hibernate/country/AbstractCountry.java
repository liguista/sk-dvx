package org.ski.dvx.server.hibernate.country;

/**
 * AbstractCountry entity provides the base persistence definition of the
 * Country entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCountry implements java.io.Serializable {

	// Fields

	private Integer countryId;
	private String countryName;
	private String countryNameShort;
	private Integer continentIdFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractCountry() {
	}

	/** full constructor */
	public AbstractCountry(String countryName, String countryNameShort,
			Integer continentIdFk, Long modified, Long created) {
		this.countryName = countryName;
		this.countryNameShort = countryNameShort;
		this.continentIdFk = continentIdFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryNameShort() {
		return this.countryNameShort;
	}

	public void setCountryNameShort(String countryNameShort) {
		this.countryNameShort = countryNameShort;
	}

	public Integer getContinentIdFk() {
		return this.continentIdFk;
	}

	public void setContinentIdFk(Integer continentIdFk) {
		this.continentIdFk = continentIdFk;
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