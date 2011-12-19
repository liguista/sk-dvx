package org.ski.dvx.server.hibernate.state;

/**
 * AbstractState entity provides the base persistence definition of the State
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractState implements java.io.Serializable {

	// Fields

	private Integer stateId;
	private String stateName;
	private String stateNameShort;
	private Integer stateCountryFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractState() {
	}

	/** full constructor */
	public AbstractState(String stateName, String stateNameShort,
			Integer stateCountryFk, Long modified, Long created) {
		this.stateName = stateName;
		this.stateNameShort = stateNameShort;
		this.stateCountryFk = stateCountryFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
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

	public Integer getStateCountryFk() {
		return this.stateCountryFk;
	}

	public void setStateCountryFk(Integer stateCountryFk) {
		this.stateCountryFk = stateCountryFk;
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