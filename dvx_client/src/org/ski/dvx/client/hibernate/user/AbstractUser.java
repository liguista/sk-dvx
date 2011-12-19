package org.ski.dvx.client.hibernate.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractUser complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userLastLogin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractUser", propOrder = { "created", "modified",
		"userActive", "userEmail", "userHandle", "userId", "userLastLogin",
		"userPassword", "userType" })
public abstract class AbstractUser {

	protected Long created;
	protected Long modified;
	protected Boolean userActive;
	protected String userEmail;
	protected String userHandle;
	protected Integer userId;
	protected Long userLastLogin;
	protected String userPassword;
	protected Integer userType;

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
	 * Gets the value of the userActive property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isUserActive() {
		return userActive;
	}

	/**
	 * Sets the value of the userActive property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setUserActive(Boolean value) {
		this.userActive = value;
	}

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
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserId(Integer value) {
		this.userId = value;
	}

	/**
	 * Gets the value of the userLastLogin property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUserLastLogin() {
		return userLastLogin;
	}

	/**
	 * Sets the value of the userLastLogin property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUserLastLogin(Long value) {
		this.userLastLogin = value;
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

	/**
	 * Gets the value of the userType property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserType() {
		return userType;
	}

	/**
	 * Sets the value of the userType property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserType(Integer value) {
		this.userType = value;
	}

}
