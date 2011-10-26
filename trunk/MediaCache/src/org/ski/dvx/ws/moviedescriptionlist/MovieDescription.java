package org.ski.dvx.ws.moviedescriptionlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for movieDescription complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="movieDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startFrame" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movieDescription", propOrder = { "author", "index",
		"language", "movieName", "sbn", "startFrame", "startTime", "uri",
		"version" })
public class MovieDescription {

	protected String author;
	protected int index;
	protected String language;
	protected String movieName;
	protected String sbn;
	protected int startFrame;
	protected int startTime;
	protected String uri;
	protected int version;

	/**
	 * Gets the value of the author property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the value of the author property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuthor(String value) {
		this.author = value;
	}

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
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
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
	 * Gets the value of the sbn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSbn() {
		return sbn;
	}

	/**
	 * Sets the value of the sbn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSbn(String value) {
		this.sbn = value;
	}

	/**
	 * Gets the value of the startFrame property.
	 * 
	 */
	public int getStartFrame() {
		return startFrame;
	}

	/**
	 * Sets the value of the startFrame property.
	 * 
	 */
	public void setStartFrame(int value) {
		this.startFrame = value;
	}

	/**
	 * Gets the value of the startTime property.
	 * 
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 */
	public void setStartTime(int value) {
		this.startTime = value;
	}

	/**
	 * Gets the value of the uri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the value of the uri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUri(String value) {
		this.uri = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 */
	public void setVersion(int value) {
		this.version = value;
	}

}
