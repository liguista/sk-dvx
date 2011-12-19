package org.ski.dvx.client.hibernate.movie_trailer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for merge complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="merge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://movie_trailer.hibernate.server.dvx.ski.org/}movieTrailer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merge", propOrder = { "arg0" })
public class Merge {

	protected MovieTrailer arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link MovieTrailer }
	 * 
	 */
	public MovieTrailer getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link MovieTrailer }
	 * 
	 */
	public void setArg0(MovieTrailer value) {
		this.arg0 = value;
	}

}
