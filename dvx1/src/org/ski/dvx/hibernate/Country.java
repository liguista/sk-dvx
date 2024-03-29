package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Country entity. @author MyEclipse Persistence Tools
 */
public class Country extends AbstractCountry implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Country() {
	}

	/** full constructor */
	public Country(Continent continent, String countryName,
			String countryNameShort, Timestamp created, Timestamp modified,
			Set states, Set cities, Set movies, Set userDetails) {
		super(continent, countryName, countryNameShort, created, modified,
				states, cities, movies, userDetails);
	}

}
