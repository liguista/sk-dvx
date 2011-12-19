package org.ski.dvx.client.hibernate.review;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractReview complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reviewActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reviewId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reviewLanguageFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reviewLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewUserFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reviewVersionFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractReview", propOrder = { "created", "modified",
		"movieFk", "reviewActive", "reviewId", "reviewLanguageFk",
		"reviewLong", "reviewSummary", "reviewUserFk", "reviewVersionFk" })
public abstract class AbstractReview {

	protected Long created;
	protected Long modified;
	protected Integer movieFk;
	protected Boolean reviewActive;
	protected Integer reviewId;
	protected Integer reviewLanguageFk;
	protected String reviewLong;
	protected String reviewSummary;
	protected Integer reviewUserFk;
	protected Integer reviewVersionFk;

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
	 * Gets the value of the movieFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieFk() {
		return movieFk;
	}

	/**
	 * Sets the value of the movieFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieFk(Integer value) {
		this.movieFk = value;
	}

	/**
	 * Gets the value of the reviewActive property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isReviewActive() {
		return reviewActive;
	}

	/**
	 * Sets the value of the reviewActive property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setReviewActive(Boolean value) {
		this.reviewActive = value;
	}

	/**
	 * Gets the value of the reviewId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getReviewId() {
		return reviewId;
	}

	/**
	 * Sets the value of the reviewId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setReviewId(Integer value) {
		this.reviewId = value;
	}

	/**
	 * Gets the value of the reviewLanguageFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getReviewLanguageFk() {
		return reviewLanguageFk;
	}

	/**
	 * Sets the value of the reviewLanguageFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setReviewLanguageFk(Integer value) {
		this.reviewLanguageFk = value;
	}

	/**
	 * Gets the value of the reviewLong property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReviewLong() {
		return reviewLong;
	}

	/**
	 * Sets the value of the reviewLong property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReviewLong(String value) {
		this.reviewLong = value;
	}

	/**
	 * Gets the value of the reviewSummary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReviewSummary() {
		return reviewSummary;
	}

	/**
	 * Sets the value of the reviewSummary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReviewSummary(String value) {
		this.reviewSummary = value;
	}

	/**
	 * Gets the value of the reviewUserFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getReviewUserFk() {
		return reviewUserFk;
	}

	/**
	 * Sets the value of the reviewUserFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setReviewUserFk(Integer value) {
		this.reviewUserFk = value;
	}

	/**
	 * Gets the value of the reviewVersionFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getReviewVersionFk() {
		return reviewVersionFk;
	}

	/**
	 * Sets the value of the reviewVersionFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setReviewVersionFk(Integer value) {
		this.reviewVersionFk = value;
	}

}
