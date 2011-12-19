package org.ski.dvx.client.hibernate.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractRating complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descriptionFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingLanguageFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingMovieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratingUserFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingVersionFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractRating", propOrder = { "created", "descriptionFk",
		"modified", "rating", "ratingId", "ratingLanguageFk", "ratingMovieFk",
		"ratingNameShort", "ratingUserFk", "ratingVersionFk" })
public abstract class AbstractRating {

	protected Long created;
	protected Integer descriptionFk;
	protected Long modified;
	protected Integer rating;
	protected Integer ratingId;
	protected Integer ratingLanguageFk;
	protected Integer ratingMovieFk;
	protected String ratingNameShort;
	protected Integer ratingUserFk;
	protected Integer ratingVersionFk;

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
	 * Gets the value of the descriptionFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionFk() {
		return descriptionFk;
	}

	/**
	 * Sets the value of the descriptionFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionFk(Integer value) {
		this.descriptionFk = value;
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
	 * Gets the value of the rating property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * Sets the value of the rating property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRating(Integer value) {
		this.rating = value;
	}

	/**
	 * Gets the value of the ratingId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRatingId() {
		return ratingId;
	}

	/**
	 * Sets the value of the ratingId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRatingId(Integer value) {
		this.ratingId = value;
	}

	/**
	 * Gets the value of the ratingLanguageFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRatingLanguageFk() {
		return ratingLanguageFk;
	}

	/**
	 * Sets the value of the ratingLanguageFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRatingLanguageFk(Integer value) {
		this.ratingLanguageFk = value;
	}

	/**
	 * Gets the value of the ratingMovieFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRatingMovieFk() {
		return ratingMovieFk;
	}

	/**
	 * Sets the value of the ratingMovieFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRatingMovieFk(Integer value) {
		this.ratingMovieFk = value;
	}

	/**
	 * Gets the value of the ratingNameShort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRatingNameShort() {
		return ratingNameShort;
	}

	/**
	 * Sets the value of the ratingNameShort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRatingNameShort(String value) {
		this.ratingNameShort = value;
	}

	/**
	 * Gets the value of the ratingUserFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRatingUserFk() {
		return ratingUserFk;
	}

	/**
	 * Sets the value of the ratingUserFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRatingUserFk(Integer value) {
		this.ratingUserFk = value;
	}

	/**
	 * Gets the value of the ratingVersionFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRatingVersionFk() {
		return ratingVersionFk;
	}

	/**
	 * Sets the value of the ratingVersionFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRatingVersionFk(Integer value) {
		this.ratingVersionFk = value;
	}

}
