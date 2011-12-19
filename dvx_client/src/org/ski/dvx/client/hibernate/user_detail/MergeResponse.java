package org.ski.dvx.client.hibernate.user_detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for mergeResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="mergeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://user_detail.hibernate.server.dvx.ski.org/}userDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeResponse", propOrder = { "_return" })
public class MergeResponse {

	@XmlElement(name = "return")
	protected UserDetail _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link UserDetail }
	 * 
	 */
	public UserDetail getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link UserDetail }
	 * 
	 */
	public void setReturn(UserDetail value) {
		this._return = value;
	}

}
