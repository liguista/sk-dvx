package org.ski.dvx.client.hibernate.description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractDescription complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descriptionActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionChapter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionCompression" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="descriptionDurationInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionDurationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionEndTimeInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionEndTimeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionLanguageFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionMetaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionMetaXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionPathFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionRatingTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionStartFrame" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionStartTimeInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionStartTimeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionTimeOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionTitleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descriptionTypeEnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractDescription", propOrder = { "authorFk", "created",
		"descriptionActive", "descriptionChapter", "descriptionCompression",
		"descriptionDurationInt", "descriptionDurationText",
		"descriptionEndTimeInt", "descriptionEndTimeText", "descriptionId",
		"descriptionLanguageFk", "descriptionLong", "descriptionMetaData",
		"descriptionMetaXml", "descriptionOrder", "descriptionPathFk",
		"descriptionRatingTotal", "descriptionShort", "descriptionStartFrame",
		"descriptionStartTimeInt", "descriptionStartTimeText",
		"descriptionTimeOffset", "descriptionTitleId", "descriptionTypeEnum",
		"descriptionUri", "descriptionVersion", "modified", "movieFk" })
public abstract class AbstractDescription {

	protected Integer authorFk;
	protected Long created;
	protected Integer descriptionActive;
	protected Integer descriptionChapter;
	protected Float descriptionCompression;
	protected Integer descriptionDurationInt;
	protected String descriptionDurationText;
	protected Integer descriptionEndTimeInt;
	protected String descriptionEndTimeText;
	protected Integer descriptionId;
	protected Integer descriptionLanguageFk;
	protected String descriptionLong;
	protected String descriptionMetaData;
	protected String descriptionMetaXml;
	protected Integer descriptionOrder;
	protected Integer descriptionPathFk;
	protected Integer descriptionRatingTotal;
	protected String descriptionShort;
	protected Integer descriptionStartFrame;
	protected Integer descriptionStartTimeInt;
	protected String descriptionStartTimeText;
	protected Integer descriptionTimeOffset;
	protected Integer descriptionTitleId;
	protected String descriptionTypeEnum;
	protected String descriptionUri;
	protected Integer descriptionVersion;
	protected Long modified;
	protected Integer movieFk;

	/**
	 * Gets the value of the authorFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAuthorFk() {
		return authorFk;
	}

	/**
	 * Sets the value of the authorFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAuthorFk(Integer value) {
		this.authorFk = value;
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
	 * Gets the value of the descriptionActive property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionActive() {
		return descriptionActive;
	}

	/**
	 * Sets the value of the descriptionActive property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionActive(Integer value) {
		this.descriptionActive = value;
	}

	/**
	 * Gets the value of the descriptionChapter property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionChapter() {
		return descriptionChapter;
	}

	/**
	 * Sets the value of the descriptionChapter property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionChapter(Integer value) {
		this.descriptionChapter = value;
	}

	/**
	 * Gets the value of the descriptionCompression property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getDescriptionCompression() {
		return descriptionCompression;
	}

	/**
	 * Sets the value of the descriptionCompression property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setDescriptionCompression(Float value) {
		this.descriptionCompression = value;
	}

	/**
	 * Gets the value of the descriptionDurationInt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionDurationInt() {
		return descriptionDurationInt;
	}

	/**
	 * Sets the value of the descriptionDurationInt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionDurationInt(Integer value) {
		this.descriptionDurationInt = value;
	}

	/**
	 * Gets the value of the descriptionDurationText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionDurationText() {
		return descriptionDurationText;
	}

	/**
	 * Sets the value of the descriptionDurationText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionDurationText(String value) {
		this.descriptionDurationText = value;
	}

	/**
	 * Gets the value of the descriptionEndTimeInt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionEndTimeInt() {
		return descriptionEndTimeInt;
	}

	/**
	 * Sets the value of the descriptionEndTimeInt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionEndTimeInt(Integer value) {
		this.descriptionEndTimeInt = value;
	}

	/**
	 * Gets the value of the descriptionEndTimeText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionEndTimeText() {
		return descriptionEndTimeText;
	}

	/**
	 * Sets the value of the descriptionEndTimeText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionEndTimeText(String value) {
		this.descriptionEndTimeText = value;
	}

	/**
	 * Gets the value of the descriptionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionId() {
		return descriptionId;
	}

	/**
	 * Sets the value of the descriptionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionId(Integer value) {
		this.descriptionId = value;
	}

	/**
	 * Gets the value of the descriptionLanguageFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionLanguageFk() {
		return descriptionLanguageFk;
	}

	/**
	 * Sets the value of the descriptionLanguageFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionLanguageFk(Integer value) {
		this.descriptionLanguageFk = value;
	}

	/**
	 * Gets the value of the descriptionLong property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionLong() {
		return descriptionLong;
	}

	/**
	 * Sets the value of the descriptionLong property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionLong(String value) {
		this.descriptionLong = value;
	}

	/**
	 * Gets the value of the descriptionMetaData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionMetaData() {
		return descriptionMetaData;
	}

	/**
	 * Sets the value of the descriptionMetaData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionMetaData(String value) {
		this.descriptionMetaData = value;
	}

	/**
	 * Gets the value of the descriptionMetaXml property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionMetaXml() {
		return descriptionMetaXml;
	}

	/**
	 * Sets the value of the descriptionMetaXml property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionMetaXml(String value) {
		this.descriptionMetaXml = value;
	}

	/**
	 * Gets the value of the descriptionOrder property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionOrder() {
		return descriptionOrder;
	}

	/**
	 * Sets the value of the descriptionOrder property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionOrder(Integer value) {
		this.descriptionOrder = value;
	}

	/**
	 * Gets the value of the descriptionPathFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionPathFk() {
		return descriptionPathFk;
	}

	/**
	 * Sets the value of the descriptionPathFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionPathFk(Integer value) {
		this.descriptionPathFk = value;
	}

	/**
	 * Gets the value of the descriptionRatingTotal property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionRatingTotal() {
		return descriptionRatingTotal;
	}

	/**
	 * Sets the value of the descriptionRatingTotal property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionRatingTotal(Integer value) {
		this.descriptionRatingTotal = value;
	}

	/**
	 * Gets the value of the descriptionShort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionShort() {
		return descriptionShort;
	}

	/**
	 * Sets the value of the descriptionShort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionShort(String value) {
		this.descriptionShort = value;
	}

	/**
	 * Gets the value of the descriptionStartFrame property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionStartFrame() {
		return descriptionStartFrame;
	}

	/**
	 * Sets the value of the descriptionStartFrame property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionStartFrame(Integer value) {
		this.descriptionStartFrame = value;
	}

	/**
	 * Gets the value of the descriptionStartTimeInt property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionStartTimeInt() {
		return descriptionStartTimeInt;
	}

	/**
	 * Sets the value of the descriptionStartTimeInt property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionStartTimeInt(Integer value) {
		this.descriptionStartTimeInt = value;
	}

	/**
	 * Gets the value of the descriptionStartTimeText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionStartTimeText() {
		return descriptionStartTimeText;
	}

	/**
	 * Sets the value of the descriptionStartTimeText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionStartTimeText(String value) {
		this.descriptionStartTimeText = value;
	}

	/**
	 * Gets the value of the descriptionTimeOffset property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionTimeOffset() {
		return descriptionTimeOffset;
	}

	/**
	 * Sets the value of the descriptionTimeOffset property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionTimeOffset(Integer value) {
		this.descriptionTimeOffset = value;
	}

	/**
	 * Gets the value of the descriptionTitleId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionTitleId() {
		return descriptionTitleId;
	}

	/**
	 * Sets the value of the descriptionTitleId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionTitleId(Integer value) {
		this.descriptionTitleId = value;
	}

	/**
	 * Gets the value of the descriptionTypeEnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionTypeEnum() {
		return descriptionTypeEnum;
	}

	/**
	 * Sets the value of the descriptionTypeEnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionTypeEnum(String value) {
		this.descriptionTypeEnum = value;
	}

	/**
	 * Gets the value of the descriptionUri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionUri() {
		return descriptionUri;
	}

	/**
	 * Sets the value of the descriptionUri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionUri(String value) {
		this.descriptionUri = value;
	}

	/**
	 * Gets the value of the descriptionVersion property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDescriptionVersion() {
		return descriptionVersion;
	}

	/**
	 * Sets the value of the descriptionVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDescriptionVersion(Integer value) {
		this.descriptionVersion = value;
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

}
