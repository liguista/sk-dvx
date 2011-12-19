package org.ski.dvx.client.hibernate.geocode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractGeocode complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractGeocode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="geocodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="geocodeLatitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="geocodeLongitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="geocodeRadius" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractGeocode", propOrder = { "created", "geocodeId",
		"geocodeLatitude", "geocodeLongitude", "geocodeRadius", "modified" })
public abstract class AbstractGeocode {

	protected Long created;
	protected Integer geocodeId;
	protected Float geocodeLatitude;
	protected Float geocodeLongitude;
	protected Float geocodeRadius;
	protected Long modified;

	/**
	 * Gets the value of the created property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCreated() {
		return created;
	}

	/**
	 * Sets the value of the created property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCreated(Long value) {
		this.created = value;
	}

	/**
	 * Gets the value of the geocodeId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getGeocodeId() {
		return geocodeId;
	}

	/**
	 * Sets the value of the geocodeId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setGeocodeId(Integer value) {
		this.geocodeId = value;
	}

	/**
	 * Gets the value of the geocodeLatitude property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getGeocodeLatitude() {
		return geocodeLatitude;
	}

	/**
	 * Sets the value of the geocodeLatitude property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setGeocodeLatitude(Float value) {
		this.geocodeLatitude = value;
	}

	/**
	 * Gets the value of the geocodeLongitude property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getGeocodeLongitude() {
		return geocodeLongitude;
	}

	/**
	 * Sets the value of the geocodeLongitude property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setGeocodeLongitude(Float value) {
		this.geocodeLongitude = value;
	}

	/**
	 * Gets the value of the geocodeRadius property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getGeocodeRadius() {
		return geocodeRadius;
	}

	/**
	 * Sets the value of the geocodeRadius property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setGeocodeRadius(Float value) {
		this.geocodeRadius = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setModified(Long value) {
		this.modified = value;
	}

}
