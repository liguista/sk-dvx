package org.ski.dvx.client.hibernate.country;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractCountry complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="continentIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "abstractCountry", propOrder = { "continentIdFk", "countryId",
		"countryName", "countryNameShort", "created", "modified" })
public abstract class AbstractCountry {

	protected Integer continentIdFk;
	protected Integer countryId;
	protected String countryName;
	protected String countryNameShort;
	protected Long created;
	protected Long modified;

	/**
	 * Gets the value of the continentIdFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getContinentIdFk() {
		return continentIdFk;
	}

	/**
	 * Sets the value of the continentIdFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setContinentIdFk(Integer value) {
		this.continentIdFk = value;
	}

	/**
	 * Gets the value of the countryId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCountryId() {
		return countryId;
	}

	/**
	 * Sets the value of the countryId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCountryId(Integer value) {
		this.countryId = value;
	}

	/**
	 * Gets the value of the countryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the value of the countryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryName(String value) {
		this.countryName = value;
	}

	/**
	 * Gets the value of the countryNameShort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryNameShort() {
		return countryNameShort;
	}

	/**
	 * Sets the value of the countryNameShort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryNameShort(String value) {
		this.countryNameShort = value;
	}

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

}
