package org.ski.dvx.client.hibernate.geocode;

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
 *         &lt;element name="return" type="{http://geocode.hibernate.server.dvx.ski.org/}geocode" minOccurs="0"/>
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
	protected Geocode _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link Geocode }
	 * 
	 */
	public Geocode getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link Geocode }
	 * 
	 */
	public void setReturn(Geocode value) {
		this._return = value;
	}

}
