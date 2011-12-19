package org.ski.dvx.server.hibernate.geocode;

/**
 * Geocode entity. @author MyEclipse Persistence Tools
 */
public class Geocode extends AbstractGeocode implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Geocode() {
	}

	/** full constructor */
	public Geocode(Float geocodeLatitude, Float geocodeLongitude,
			Float geocodeRadius, Long modified, Long created) {
		super(geocodeLatitude, geocodeLongitude, geocodeRadius, modified,
				created);
	}

}
