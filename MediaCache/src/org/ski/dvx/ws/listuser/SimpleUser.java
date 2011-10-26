package org.ski.dvx.ws.listuser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for simpleUser complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="simpleUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleUser", propOrder = { "userEmail", "userHandle",
		"userPassword" })
public class SimpleUser {

	protected String userEmail;
	protected String userHandle;
	protected String userPassword;

	/**
	 * Gets the value of the userEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * Sets the value of the userEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserEmail(String value) {
		this.userEmail = value;
	}

	/**
	 * Gets the value of the userHandle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserHandle() {
		return userHandle;
	}

	/**
	 * Sets the value of the userHandle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserHandle(String value) {
		this.userHandle = value;
	}

	/**
	 * Gets the value of the userPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Sets the value of the userPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserPassword(String value) {
		this.userPassword = value;
	}

}
