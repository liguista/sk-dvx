package org.ski.dvx.server.hibernate.crew_cast;

/**
 * AbstractCrewCast entity provides the base persistence definition of the
 * CrewCast entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrewCast implements java.io.Serializable {

	// Fields

	private Integer crewCastId;
	private String crewCastFullName;
	private String crewCastFirstName;
	private String crewCastMiddleName;
	private String crewCastLastName;
	private Long crewCastBirthday;
	private String crewCastDescription;
	private String crewCastBiography;
	private Integer crewCastAuthorFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractCrewCast() {
	}

	/** full constructor */
	public AbstractCrewCast(String crewCastFullName, String crewCastFirstName,
			String crewCastMiddleName, String crewCastLastName,
			Long crewCastBirthday, String crewCastDescription,
			String crewCastBiography, Integer crewCastAuthorFk, Long modified,
			Long created) {
		this.crewCastFullName = crewCastFullName;
		this.crewCastFirstName = crewCastFirstName;
		this.crewCastMiddleName = crewCastMiddleName;
		this.crewCastLastName = crewCastLastName;
		this.crewCastBirthday = crewCastBirthday;
		this.crewCastDescription = crewCastDescription;
		this.crewCastBiography = crewCastBiography;
		this.crewCastAuthorFk = crewCastAuthorFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getCrewCastId() {
		return this.crewCastId;
	}

	public void setCrewCastId(Integer crewCastId) {
		this.crewCastId = crewCastId;
	}

	public String getCrewCastFullName() {
		return this.crewCastFullName;
	}

	public void setCrewCastFullName(String crewCastFullName) {
		this.crewCastFullName = crewCastFullName;
	}

	public String getCrewCastFirstName() {
		return this.crewCastFirstName;
	}

	public void setCrewCastFirstName(String crewCastFirstName) {
		this.crewCastFirstName = crewCastFirstName;
	}

	public String getCrewCastMiddleName() {
		return this.crewCastMiddleName;
	}

	public void setCrewCastMiddleName(String crewCastMiddleName) {
		this.crewCastMiddleName = crewCastMiddleName;
	}

	public String getCrewCastLastName() {
		return this.crewCastLastName;
	}

	public void setCrewCastLastName(String crewCastLastName) {
		this.crewCastLastName = crewCastLastName;
	}

	public Long getCrewCastBirthday() {
		return this.crewCastBirthday;
	}

	public void setCrewCastBirthday(Long crewCastBirthday) {
		this.crewCastBirthday = crewCastBirthday;
	}

	public String getCrewCastDescription() {
		return this.crewCastDescription;
	}

	public void setCrewCastDescription(String crewCastDescription) {
		this.crewCastDescription = crewCastDescription;
	}

	public String getCrewCastBiography() {
		return this.crewCastBiography;
	}

	public void setCrewCastBiography(String crewCastBiography) {
		this.crewCastBiography = crewCastBiography;
	}

	public Integer getCrewCastAuthorFk() {
		return this.crewCastAuthorFk;
	}

	public void setCrewCastAuthorFk(Integer crewCastAuthorFk) {
		this.crewCastAuthorFk = crewCastAuthorFk;
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