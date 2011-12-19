package org.ski.dvx.client.hibernate.city;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractCity complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityCountryFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cityGeoCodeFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityPopulation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cityStateFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cityZipCodeFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "abstractCity", propOrder = { "cityCountryFk", "cityGeoCodeFk",
		"cityId", "cityName", "cityPopulation", "cityStateFk", "cityZipCodeFk",
		"created", "modified" })
public abstract class AbstractCity {

	protected Integer cityCountryFk;
	protected Integer cityGeoCodeFk;
	protected Integer cityId;
	protected String cityName;
	protected Integer cityPopulation;
	protected Integer cityStateFk;
	protected Integer cityZipCodeFk;
	protected Long created;
	protected Long modified;

	/**
	 * Gets the value of the cityCountryFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityCountryFk() {
		return cityCountryFk;
	}

	/**
	 * Sets the value of the cityCountryFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityCountryFk(Integer value) {
		this.cityCountryFk = value;
	}

	/**
	 * Gets the value of the cityGeoCodeFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityGeoCodeFk() {
		return cityGeoCodeFk;
	}

	/**
	 * Sets the value of the cityGeoCodeFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityGeoCodeFk(Integer value) {
		this.cityGeoCodeFk = value;
	}

	/**
	 * Gets the value of the cityId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityId() {
		return cityId;
	}

	/**
	 * Sets the value of the cityId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityId(Integer value) {
		this.cityId = value;
	}

	/**
	 * Gets the value of the cityName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Sets the value of the cityName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCityName(String value) {
		this.cityName = value;
	}

	/**
	 * Gets the value of the cityPopulation property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityPopulation() {
		return cityPopulation;
	}

	/**
	 * Sets the value of the cityPopulation property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityPopulation(Integer value) {
		this.cityPopulation = value;
	}

	/**
	 * Gets the value of the cityStateFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityStateFk() {
		return cityStateFk;
	}

	/**
	 * Sets the value of the cityStateFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityStateFk(Integer value) {
		this.cityStateFk = value;
	}

	/**
	 * Gets the value of the cityZipCodeFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCityZipCodeFk() {
		return cityZipCodeFk;
	}

	/**
	 * Sets the value of the cityZipCodeFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCityZipCodeFk(Integer value) {
		this.cityZipCodeFk = value;
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
