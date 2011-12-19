package org.ski.dvx.client.hibernate.language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractLanguage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractLanguage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "abstractLanguage", propOrder = { "created", "languageId",
		"languageName", "languageNameShort", "modified" })
public abstract class AbstractLanguage {

	protected Long created;
	protected Integer languageId;
	protected String languageName;
	protected String languageNameShort;
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
	 * Gets the value of the languageId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLanguageId() {
		return languageId;
	}

	/**
	 * Sets the value of the languageId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLanguageId(Integer value) {
		this.languageId = value;
	}

	/**
	 * Gets the value of the languageName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * Sets the value of the languageName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguageName(String value) {
		this.languageName = value;
	}

	/**
	 * Gets the value of the languageNameShort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguageNameShort() {
		return languageNameShort;
	}

	/**
	 * Sets the value of the languageNameShort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguageNameShort(String value) {
		this.languageNameShort = value;
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
