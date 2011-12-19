package org.ski.dvx.client.hibernate.crew_cast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractCrewCast complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCrewCast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crewCastAuthorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crewCastBiography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewCastBirthday" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crewCastDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewCastFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewCastFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewCastId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crewCastLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewCastMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "abstractCrewCast", propOrder = { "created",
		"crewCastAuthorFk", "crewCastBiography", "crewCastBirthday",
		"crewCastDescription", "crewCastFirstName", "crewCastFullName",
		"crewCastId", "crewCastLastName", "crewCastMiddleName", "modified" })
public abstract class AbstractCrewCast {

	protected Long created;
	protected Integer crewCastAuthorFk;
	protected String crewCastBiography;
	protected Long crewCastBirthday;
	protected String crewCastDescription;
	protected String crewCastFirstName;
	protected String crewCastFullName;
	protected Integer crewCastId;
	protected String crewCastLastName;
	protected String crewCastMiddleName;
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
	 * Gets the value of the crewCastAuthorFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCrewCastAuthorFk() {
		return crewCastAuthorFk;
	}

	/**
	 * Sets the value of the crewCastAuthorFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCrewCastAuthorFk(Integer value) {
		this.crewCastAuthorFk = value;
	}

	/**
	 * Gets the value of the crewCastBiography property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastBiography() {
		return crewCastBiography;
	}

	/**
	 * Sets the value of the crewCastBiography property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastBiography(String value) {
		this.crewCastBiography = value;
	}

	/**
	 * Gets the value of the crewCastBirthday property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCrewCastBirthday() {
		return crewCastBirthday;
	}

	/**
	 * Sets the value of the crewCastBirthday property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCrewCastBirthday(Long value) {
		this.crewCastBirthday = value;
	}

	/**
	 * Gets the value of the crewCastDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastDescription() {
		return crewCastDescription;
	}

	/**
	 * Sets the value of the crewCastDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastDescription(String value) {
		this.crewCastDescription = value;
	}

	/**
	 * Gets the value of the crewCastFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastFirstName() {
		return crewCastFirstName;
	}

	/**
	 * Sets the value of the crewCastFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastFirstName(String value) {
		this.crewCastFirstName = value;
	}

	/**
	 * Gets the value of the crewCastFullName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastFullName() {
		return crewCastFullName;
	}

	/**
	 * Sets the value of the crewCastFullName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastFullName(String value) {
		this.crewCastFullName = value;
	}

	/**
	 * Gets the value of the crewCastId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCrewCastId() {
		return crewCastId;
	}

	/**
	 * Sets the value of the crewCastId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCrewCastId(Integer value) {
		this.crewCastId = value;
	}

	/**
	 * Gets the value of the crewCastLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastLastName() {
		return crewCastLastName;
	}

	/**
	 * Sets the value of the crewCastLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastLastName(String value) {
		this.crewCastLastName = value;
	}

	/**
	 * Gets the value of the crewCastMiddleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrewCastMiddleName() {
		return crewCastMiddleName;
	}

	/**
	 * Sets the value of the crewCastMiddleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrewCastMiddleName(String value) {
		this.crewCastMiddleName = value;
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
