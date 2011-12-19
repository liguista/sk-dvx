package org.ski.dvx.client.hibernate.state;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractState complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stateCountryFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractState", propOrder = { "created", "modified",
		"stateCountryFk", "stateId", "stateName", "stateNameShort" })
public abstract class AbstractState {

	protected Long created;
	protected Long modified;
	protected Integer stateCountryFk;
	protected Integer stateId;
	protected String stateName;
	protected String stateNameShort;

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
	 * Gets the value of the stateCountryFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStateCountryFk() {
		return stateCountryFk;
	}

	/**
	 * Sets the value of the stateCountryFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStateCountryFk(Integer value) {
		this.stateCountryFk = value;
	}

	/**
	 * Gets the value of the stateId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStateId() {
		return stateId;
	}

	/**
	 * Sets the value of the stateId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStateId(Integer value) {
		this.stateId = value;
	}

	/**
	 * Gets the value of the stateName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * Sets the value of the stateName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStateName(String value) {
		this.stateName = value;
	}

	/**
	 * Gets the value of the stateNameShort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStateNameShort() {
		return stateNameShort;
	}

	/**
	 * Sets the value of the stateNameShort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStateNameShort(String value) {
		this.stateNameShort = value;
	}

}
