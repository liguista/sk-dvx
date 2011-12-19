package org.ski.dvx.server.hibernate.zip_code;

/**
 * AbstractZipCode entity provides the base persistence definition of the
 * ZipCode entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractZipCode implements java.io.Serializable {

	// Fields

	private Integer zipCodeId;
	private Integer zipCode;
	private Integer zipCodeExtended;
	private Integer zipCodeGeocodeFk;
	private Integer zipCodeCityFk;
	private Integer zipCodeStateFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractZipCode() {
	}

	/** minimal constructor */
	public AbstractZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	/** full constructor */
	public AbstractZipCode(Integer zipCode, Integer zipCodeExtended,
			Integer zipCodeGeocodeFk, Integer zipCodeCityFk,
			Integer zipCodeStateFk, Long modified, Long created) {
		this.zipCode = zipCode;
		this.zipCodeExtended = zipCodeExtended;
		this.zipCodeGeocodeFk = zipCodeGeocodeFk;
		this.zipCodeCityFk = zipCodeCityFk;
		this.zipCodeStateFk = zipCodeStateFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getZipCodeId() {
		return this.zipCodeId;
	}

	public void setZipCodeId(Integer zipCodeId) {
		this.zipCodeId = zipCodeId;
	}

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getZipCodeExtended() {
		return this.zipCodeExtended;
	}

	public void setZipCodeExtended(Integer zipCodeExtended) {
		this.zipCodeExtended = zipCodeExtended;
	}

	public Integer getZipCodeGeocodeFk() {
		return this.zipCodeGeocodeFk;
	}

	public void setZipCodeGeocodeFk(Integer zipCodeGeocodeFk) {
		this.zipCodeGeocodeFk = zipCodeGeocodeFk;
	}

	public Integer getZipCodeCityFk() {
		return this.zipCodeCityFk;
	}

	public void setZipCodeCityFk(Integer zipCodeCityFk) {
		this.zipCodeCityFk = zipCodeCityFk;
	}

	public Integer getZipCodeStateFk() {
		return this.zipCodeStateFk;
	}

	public void setZipCodeStateFk(Integer zipCodeStateFk) {
		this.zipCodeStateFk = zipCodeStateFk;
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