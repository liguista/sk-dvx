package org.ski.dvx.client.hibernate.path;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractPath complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pathPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractPath", propOrder = { "authorFk", "created", "idKey",
		"modified", "pathPrefix" })
public abstract class AbstractPath {

	protected Integer authorFk;
	protected Long created;
	protected Integer idKey;
	protected Long modified;
	protected String pathPrefix;

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
	 * Gets the value of the idKey property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdKey() {
		return idKey;
	}

	/**
	 * Sets the value of the idKey property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIdKey(Integer value) {
		this.idKey = value;
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
	 * Gets the value of the pathPrefix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPathPrefix() {
		return pathPrefix;
	}

	/**
	 * Sets the value of the pathPrefix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPathPrefix(String value) {
		this.pathPrefix = value;
	}

}
