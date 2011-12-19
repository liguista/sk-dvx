package org.ski.dvx.client.hibernate.user_profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for attachDirty complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="attachDirty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://user_profile.hibernate.server.dvx.ski.org/}userProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachDirty", propOrder = { "arg0" })
public class AttachDirty {

	protected UserProfile arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link UserProfile }
	 * 
	 */
	public UserProfile getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link UserProfile }
	 * 
	 */
	public void setArg0(UserProfile value) {
		this.arg0 = value;
	}

}
