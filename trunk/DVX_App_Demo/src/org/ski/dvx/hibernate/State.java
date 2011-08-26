package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * State entity. @author MyEclipse Persistence Tools
 */
public class State extends AbstractState implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public State() {
	}

	/** full constructor */
	public State(Country country, String stateName, String stateNameShort,
			Timestamp created, Timestamp modified, Set zipCodes, Set cities,
			Set userDetails) {
		super(country, stateName, stateNameShort, created, modified, zipCodes,
				cities, userDetails);
	}

}
