package org.ski.dvx.ws.moviePort;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for simpleMovie complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="simpleMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleMovie", propOrder = { "index", "movieName", "sbnNumber" })
public class SimpleMovie {

	protected int index;
	protected String movieName;
	protected String sbnNumber;

	/**
	 * Gets the value of the index property.
	 * 
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 */
	public void setIndex(int value) {
		this.index = value;
	}

	/**
	 * Gets the value of the movieName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * Sets the value of the movieName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieName(String value) {
		this.movieName = value;
	}

	/**
	 * Gets the value of the sbnNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSbnNumber() {
		return sbnNumber;
	}

	/**
	 * Sets the value of the sbnNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSbnNumber(String value) {
		this.sbnNumber = value;
	}

}
