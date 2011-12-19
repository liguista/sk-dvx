package org.ski.dvx.server.hibernate.city;

/**
 * City entity. @author MyEclipse Persistence Tools
 */
public class City extends AbstractCity implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public City() {
	}

	/** full constructor */
	public City(String cityName, Integer cityZipCodeFk, Integer cityStateFk,
			Integer cityCountryFk, Integer cityGeoCodeFk,
			Integer cityPopulation, Long modified, Long created) {
		super(cityName, cityZipCodeFk, cityStateFk, cityCountryFk,
				cityGeoCodeFk, cityPopulation, modified, created);
	}

}
