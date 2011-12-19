package org.ski.dvx.client.hibernate.transaction_log;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractTransactionLog complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractTransactionLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transactionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "abstractTransactionLog", propOrder = { "created", "idKey",
		"modified", "movieFk", "transactionDetails", "transactionLevel",
		"transactionType", "userFk" })
public abstract class AbstractTransactionLog {

	protected Long created;
	protected Integer idKey;
	protected Long modified;
	protected Integer movieFk;
	protected String transactionDetails;
	protected String transactionLevel;
	protected String transactionType;
	protected Integer userFk;

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
	 * Gets the value of the transactionDetails property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionDetails() {
		return transactionDetails;
	}

	/**
	 * Sets the value of the transactionDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionDetails(String value) {
		this.transactionDetails = value;
	}

	/**
	 * Gets the value of the transactionLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionLevel() {
		return transactionLevel;
	}

	/**
	 * Sets the value of the transactionLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionLevel(String value) {
		this.transactionLevel = value;
	}

	/**
	 * Gets the value of the transactionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the value of the transactionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionType(String value) {
		this.transactionType = value;
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
