package org.ski.dvx.server.hibernate.continent;

/**
 * Continent entity. @author MyEclipse Persistence Tools
 */
public class Continent extends AbstractContinent implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Continent() {
	}

	/** full constructor */
	public Continent(String continentName, Long modified, Long created) {
		super(continentName, modified, created);
	}

}
