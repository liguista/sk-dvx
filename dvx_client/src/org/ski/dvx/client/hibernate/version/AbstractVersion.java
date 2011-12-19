package org.ski.dvx.client.hibernate.version;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractVersion complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="languageFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="versionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractVersion", propOrder = { "authorFk", "created",
		"languageFk", "modified", "movieFk", "versionDescription", "versionId" })
public abstract class AbstractVersion {

	protected Integer authorFk;
	protected Long created;
	protected Integer languageFk;
	protected Long modified;
	protected Integer movieFk;
	protected String versionDescription;
	protected Integer versionId;

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
	 * Gets the value of the languageFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLanguageFk() {
		return languageFk;
	}

	/**
	 * Sets the value of the languageFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLanguageFk(Integer value) {
		this.languageFk = value;
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
	 * Gets the value of the versionDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersionDescription() {
		return versionDescription;
	}

	/**
	 * Sets the value of the versionDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersionDescription(String value) {
		this.versionDescription = value;
	}

	/**
	 * Gets the value of the versionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getVersionId() {
		return versionId;
	}

	/**
	 * Sets the value of the versionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setVersionId(Integer value) {
		this.versionId = value;
	}

}
