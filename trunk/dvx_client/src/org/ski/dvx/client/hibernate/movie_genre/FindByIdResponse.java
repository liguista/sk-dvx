package org.ski.dvx.client.hibernate.movie_genre;

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
 *         &lt;element name="return" type="{http://movie_genre.hibernate.server.dvx.ski.org/}movieGenre" minOccurs="0"/>
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
	protected MovieGenre _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link MovieGenre }
	 * 
	 */
	public MovieGenre getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link MovieGenre }
	 * 
	 */
	public void setReturn(MovieGenre value) {
		this._return = value;
	}

}
