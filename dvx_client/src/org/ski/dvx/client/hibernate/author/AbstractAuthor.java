package org.ski.dvx.client.hibernate.author;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractAuthor complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractAuthor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractAuthor", propOrder = { "authorId", "created",
		"modified", "userFk" })
public abstract class AbstractAuthor {

	protected Integer authorId;
	protected Long created;
	protected Long modified;
	protected Integer userFk;

	/**
	 * Gets the value of the authorId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * Sets the value of the authorId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAuthorId(Integer value) {
		this.authorId = value;
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

	/**
	 * Gets the value of the userFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserFk() {
		return userFk;
	}

	/**
	 * Sets the value of the userFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserFk(Integer value) {
		this.userFk = value;
	}

}
