package org.ski.dvx.client.hibernate.user_profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractUserProfile complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractUserProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userDetailFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userProfileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userProfileMotionImpared" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userProfileVisionImpared" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractUserProfile", propOrder = { "created", "modified",
		"userDetailFk", "userFk", "userProfileId", "userProfileMotionImpared",
		"userProfileVisionImpared" })
public abstract class AbstractUserProfile {

	protected Long created;
	protected Long modified;
	protected Integer userDetailFk;
	protected Integer userFk;
	protected Integer userProfileId;
	protected Integer userProfileMotionImpared;
	protected Integer userProfileVisionImpared;

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
	 * Gets the value of the userDetailFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailFk() {
		return userDetailFk;
	}

	/**
	 * Sets the value of the userDetailFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailFk(Integer value) {
		this.userDetailFk = value;
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

	/**
	 * Gets the value of the userProfileId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserProfileId() {
		return userProfileId;
	}

	/**
	 * Sets the value of the userProfileId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserProfileId(Integer value) {
		this.userProfileId = value;
	}

	/**
	 * Gets the value of the userProfileMotionImpared property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserProfileMotionImpared() {
		return userProfileMotionImpared;
	}

	/**
	 * Sets the value of the userProfileMotionImpared property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserProfileMotionImpared(Integer value) {
		this.userProfileMotionImpared = value;
	}

	/**
	 * Gets the value of the userProfileVisionImpared property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserProfileVisionImpared() {
		return userProfileVisionImpared;
	}

	/**
	 * Sets the value of the userProfileVisionImpared property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserProfileVisionImpared(Integer value) {
		this.userProfileVisionImpared = value;
	}

}
