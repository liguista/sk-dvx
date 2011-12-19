package org.ski.dvx.server.hibernate.country;

/**
 * Country entity. @author MyEclipse Persistence Tools
 */
public class Country extends AbstractCountry implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Country() {
	}

	/** full constructor */
	public Country(String countryName, String countryNameShort,
			Integer continentIdFk, Long modified, Long created) {
		super(countryName, countryNameShort, continentIdFk, modified, created);
	}

}
