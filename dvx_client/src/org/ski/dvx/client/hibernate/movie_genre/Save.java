package org.ski.dvx.client.hibernate.movie_genre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://movie_genre.hibernate.server.dvx.ski.org/}movieGenre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "arg0" })
public class Save {

	protected MovieGenre arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link MovieGenre }
	 * 
	 */
	public MovieGenre getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link MovieGenre }
	 * 
	 */
	public void setArg0(MovieGenre value) {
		this.arg0 = value;
	}

}
