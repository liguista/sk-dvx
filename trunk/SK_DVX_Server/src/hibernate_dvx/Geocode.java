package hibernate_dvx;

import java.sql.Timestamp;
import java.util.Set;

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
			Float geocodeRadius, Timestamp created, Timestamp modified,
			Set zipCodes) {
		super(geocodeLatitude, geocodeLongitude, geocodeRadius, created,
				modified, zipCodes);
	}

}
