package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractState entity provides the base persistence definition of the State
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractState implements java.io.Serializable {

	// Fields

	private Integer stateId;
	private Country country;
	private String stateName;
	private String stateNameShort;
	private Timestamp created;
	private Timestamp modified;
	private Set zipCodes = new HashSet(0);
	private Set cities = new HashSet(0);
	private Set userDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractState() {
	}

	/** full constructor */
	public AbstractState(Country country, String stateName,
			String stateNameShort, Timestamp created, Timestamp modified,
			Set zipCodes, Set cities, Set userDetails) {
		this.country = country;
		this.stateName = stateName;
		this.stateNameShort = stateNameShort;
		this.created = created;
		this.modified = modified;
		this.zipCodes = zipCodes;
		this.cities = cities;
		this.userDetails = userDetails;
	}

	// Property accessors

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateNameShort() {
		return this.stateNameShort;
	}

	public void setStateNameShort(String stateNameShort) {
		this.stateNameShort = stateNameShort;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public Set getZipCodes() {
		return this.zipCodes;
	}

	public void setZipCodes(Set zipCodes) {
		this.zipCodes = zipCodes;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

	public Set getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(Set userDetails) {
		this.userDetails = userDetails;
	}

}