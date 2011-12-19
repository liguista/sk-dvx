package org.ski.dvx.server.hibernate.crew_cast;

/**
 * CrewCast entity. @author MyEclipse Persistence Tools
 */
public class CrewCast extends AbstractCrewCast implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrewCast() {
	}

	/** full constructor */
	public CrewCast(String crewCastFullName, String crewCastFirstName,
			String crewCastMiddleName, String crewCastLastName,
			Long crewCastBirthday, String crewCastDescription,
			String crewCastBiography, Integer crewCastAuthorFk, Long modified,
			Long created) {
		super(crewCastFullName, crewCastFirstName, crewCastMiddleName,
				crewCastLastName, crewCastBirthday, crewCastDescription,
				crewCastBiography, crewCastAuthorFk, modified, created);
	}

}
