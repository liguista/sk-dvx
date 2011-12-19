package org.ski.dvx.client.hibernate.zip_code;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractZipCode complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractZipCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCodeCityFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCodeExtended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCodeGeocodeFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCodeStateFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractZipCode", propOrder = { "created", "modified",
		"zipCode", "zipCodeCityFk", "zipCodeExtended", "zipCodeGeocodeFk",
		"zipCodeId", "zipCodeStateFk" })
public abstract class AbstractZipCode {

	protected Long created;
	protected Long modified;
	protected Integer zipCode;
	protected Integer zipCodeCityFk;
	protected Integer zipCodeExtended;
	protected Integer zipCodeGeocodeFk;
	protected Integer zipCodeId;
	protected Integer zipCodeStateFk;

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

	/**
	 * Gets the value of the zipCode property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the value of the zipCode property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCode(Integer value) {
		this.zipCode = value;
	}

	/**
	 * Gets the value of the zipCodeCityFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCodeCityFk() {
		return zipCodeCityFk;
	}

	/**
	 * Sets the value of the zipCodeCityFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCodeCityFk(Integer value) {
		this.zipCodeCityFk = value;
	}

	/**
	 * Gets the value of the zipCodeExtended property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCodeExtended() {
		return zipCodeExtended;
	}

	/**
	 * Sets the value of the zipCodeExtended property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCodeExtended(Integer value) {
		this.zipCodeExtended = value;
	}

	/**
	 * Gets the value of the zipCodeGeocodeFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCodeGeocodeFk() {
		return zipCodeGeocodeFk;
	}

	/**
	 * Sets the value of the zipCodeGeocodeFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCodeGeocodeFk(Integer value) {
		this.zipCodeGeocodeFk = value;
	}

	/**
	 * Gets the value of the zipCodeId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCodeId() {
		return zipCodeId;
	}

	/**
	 * Sets the value of the zipCodeId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCodeId(Integer value) {
		this.zipCodeId = value;
	}

	/**
	 * Gets the value of the zipCodeStateFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getZipCodeStateFk() {
		return zipCodeStateFk;
	}

	/**
	 * Sets the value of the zipCodeStateFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setZipCodeStateFk(Integer value) {
		this.zipCodeStateFk = value;
	}

}
