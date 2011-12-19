package org.ski.dvx.client.hibernate.attribute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractAttribute complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attibuteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "abstractAttribute", propOrder = { "attibuteName",
		"attributeId", "attributeValue", "created", "modified" })
public abstract class AbstractAttribute {

	protected String attibuteName;
	protected Integer attributeId;
	protected String attributeValue;
	protected Integer created;
	protected Long modified;

	/**
	 * Gets the value of the attibuteName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttibuteName() {
		return attibuteName;
	}

	/**
	 * Sets the value of the attibuteName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttibuteName(String value) {
		this.attibuteName = value;
	}

	/**
	 * Gets the value of the attributeId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAttributeId() {
		return attributeId;
	}

	/**
	 * Sets the value of the attributeId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAttributeId(Integer value) {
		this.attributeId = value;
	}

	/**
	 * Gets the value of the attributeValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttributeValue() {
		return attributeValue;
	}

	/**
	 * Sets the value of the attributeValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttributeValue(String value) {
		this.attributeValue = value;
	}

	/**
	 * Gets the value of the created property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCreated() {
		return created;
	}

	/**
	 * Sets the value of the created property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCreated(Integer value) {
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
