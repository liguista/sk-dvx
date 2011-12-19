package org.ski.dvx.client.hibernate.geocode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for attachClean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="attachClean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://geocode.hibernate.server.dvx.ski.org/}geocode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachClean", propOrder = { "arg0" })
public class AttachClean {

	protected Geocode arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link Geocode }
	 * 
	 */
	public Geocode getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Geocode }
	 * 
	 */
	public void setArg0(Geocode value) {
		this.arg0 = value;
	}

}
