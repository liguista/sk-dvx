package org.ski.dvx.server.hibernate.state;

/**
 * State entity. @author MyEclipse Persistence Tools
 */
public class State extends AbstractState implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public State() {
	}

	/** full constructor */
	public State(String stateName, String stateNameShort,
			Integer stateCountryFk, Long modified, Long created) {
		super(stateName, stateNameShort, stateCountryFk, modified, created);
	}

}
