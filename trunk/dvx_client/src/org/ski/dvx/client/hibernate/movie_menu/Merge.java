package org.ski.dvx.client.hibernate.movie_menu;

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
 *         &lt;element name="arg0" type="{http://movie_menu.hibernate.server.dvx.ski.org/}movieMenu" minOccurs="0"/>
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

	protected MovieMenu arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link MovieMenu }
	 * 
	 */
	public MovieMenu getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link MovieMenu }
	 * 
	 */
	public void setArg0(MovieMenu value) {
		this.arg0 = value;
	}

}
