package org.ski.dvx.server.hibernate.zip_code;

/**
 * ZipCode entity. @author MyEclipse Persistence Tools
 */
public class ZipCode extends AbstractZipCode implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ZipCode() {
	}

	/** minimal constructor */
	public ZipCode(Integer zipCode) {
		super(zipCode);
	}

	/** full constructor */
	public ZipCode(Integer zipCode, Integer zipCodeExtended,
			Integer zipCodeGeocodeFk, Integer zipCodeCityFk,
			Integer zipCodeStateFk, Long modified, Long created) {
		super(zipCode, zipCodeExtended, zipCodeGeocodeFk, zipCodeCityFk,
				zipCodeStateFk, modified, created);
	}

}
