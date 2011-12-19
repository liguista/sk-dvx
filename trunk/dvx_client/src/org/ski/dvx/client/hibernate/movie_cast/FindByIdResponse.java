package org.ski.dvx.client.hibernate.movie_cast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findByIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://movie_cast.hibernate.server.dvx.ski.org/}movieCast" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByIdResponse", propOrder = { "_return" })
public class FindByIdResponse {

	@XmlElement(name = "return")
	protected MovieCast _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link MovieCast }
	 * 
	 */
	public MovieCast getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link MovieCast }
	 * 
	 */
	public void setReturn(MovieCast value) {
		this._return = value;
	}

}
