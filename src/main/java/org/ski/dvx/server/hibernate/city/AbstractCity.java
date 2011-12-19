package org.ski.dvx.server.hibernate.city;

/**
 * AbstractCity entity provides the base persistence definition of the City
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCity implements java.io.Serializable {

	// Fields

	private Integer cityId;
	private String cityName;
	private Integer cityZipCodeFk;
	private Integer cityStateFk;
	private Integer cityCountryFk;
	private Integer cityGeoCodeFk;
	private Integer cityPopulation;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractCity() {
	}

	/** full constructor */
	public AbstractCity(String cityName, Integer cityZipCodeFk,
			Integer cityStateFk, Integer cityCountryFk, Integer cityGeoCodeFk,
			Integer cityPopulation, Long modified, Long created) {
		this.cityName = cityName;
		this.cityZipCodeFk = cityZipCodeFk;
		this.cityStateFk = cityStateFk;
		this.cityCountryFk = cityCountryFk;
		this.cityGeoCodeFk = cityGeoCodeFk;
		this.cityPopulation = cityPopulation;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getCityZipCodeFk() {
		return this.cityZipCodeFk;
	}

	public void setCityZipCodeFk(Integer cityZipCodeFk) {
		this.cityZipCodeFk = cityZipCodeFk;
	}

	public Integer getCityStateFk() {
		return this.cityStateFk;
	}

	public void setCityStateFk(Integer cityStateFk) {
		this.cityStateFk = cityStateFk;
	}

	public Integer getCityCountryFk() {
		return this.cityCountryFk;
	}

	public void setCityCountryFk(Integer cityCountryFk) {
		this.cityCountryFk = cityCountryFk;
	}

	public Integer getCityGeoCodeFk() {
		return this.cityGeoCodeFk;
	}

	public void setCityGeoCodeFk(Integer cityGeoCodeFk) {
		this.cityGeoCodeFk = cityGeoCodeFk;
	}

	public Integer getCityPopulation() {
		return this.cityPopulation;
	}

	public void setCityPopulation(Integer cityPopulation) {
		this.cityPopulation = cityPopulation;
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