package org.ski.dvx.server.hibernate.geocode;

/**
 * AbstractGeocode entity provides the base persistence definition of the
 * Geocode entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGeocode implements java.io.Serializable {

	// Fields

	private Integer geocodeId;
	private Float geocodeLatitude;
	private Float geocodeLongitude;
	private Float geocodeRadius;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractGeocode() {
	}

	/** full constructor */
	public AbstractGeocode(Float geocodeLatitude, Float geocodeLongitude,
			Float geocodeRadius, Long modified, Long created) {
		this.geocodeLatitude = geocodeLatitude;
		this.geocodeLongitude = geocodeLongitude;
		this.geocodeRadius = geocodeRadius;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getGeocodeId() {
		return this.geocodeId;
	}

	public void setGeocodeId(Integer geocodeId) {
		this.geocodeId = geocodeId;
	}

	public Float getGeocodeLatitude() {
		return this.geocodeLatitude;
	}

	public void setGeocodeLatitude(Float geocodeLatitude) {
		this.geocodeLatitude = geocodeLatitude;
	}

	public Float getGeocodeLongitude() {
		return this.geocodeLongitude;
	}

	public void setGeocodeLongitude(Float geocodeLongitude) {
		this.geocodeLongitude = geocodeLongitude;
	}

	public Float getGeocodeRadius() {
		return this.geocodeRadius;
	}

	public void setGeocodeRadius(Float geocodeRadius) {
		this.geocodeRadius = geocodeRadius;
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