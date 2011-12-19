package org.ski.dvx.client.hibernate.poster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractPoster complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractPoster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="posterId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posterMovieIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posterUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractPoster", propOrder = { "created", "modified",
		"posterId", "posterMovieIdFk", "posterName", "posterUrl" })
public abstract class AbstractPoster {

	protected Long created;
	protected Long modified;
	protected Integer posterId;
	protected Integer posterMovieIdFk;
	protected String posterName;
	protected String posterUrl;

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
	 * Gets the value of the posterId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPosterId() {
		return posterId;
	}

	/**
	 * Sets the value of the posterId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPosterId(Integer value) {
		this.posterId = value;
	}

	/**
	 * Gets the value of the posterMovieIdFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPosterMovieIdFk() {
		return posterMovieIdFk;
	}

	/**
	 * Sets the value of the posterMovieIdFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPosterMovieIdFk(Integer value) {
		this.posterMovieIdFk = value;
	}

	/**
	 * Gets the value of the posterName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPosterName() {
		return posterName;
	}

	/**
	 * Sets the value of the posterName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPosterName(String value) {
		this.posterName = value;
	}

	/**
	 * Gets the value of the posterUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPosterUrl() {
		return posterUrl;
	}

	/**
	 * Sets the value of the posterUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPosterUrl(String value) {
		this.posterUrl = value;
	}

}
