package org.ski.dvx.client.hibernate.movie_genre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovieGenre complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovieGenre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieGenreDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieGenreDescriptionLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieGenreId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovieGenre", propOrder = { "created", "modified",
		"movieGenreDescription", "movieGenreDescriptionLong", "movieGenreId" })
public abstract class AbstractMovieGenre {

	protected Long created;
	protected Long modified;
	protected String movieGenreDescription;
	protected String movieGenreDescriptionLong;
	protected Integer movieGenreId;

	/**
	 * Gets the value of the created property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCreated() {
		return created;
	}

	/**
	 * Sets the value of the created property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCreated(Long value) {
		this.created = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setModified(Long value) {
		this.modified = value;
	}

	/**
	 * Gets the value of the movieGenreDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieGenreDescription() {
		return movieGenreDescription;
	}

	/**
	 * Sets the value of the movieGenreDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieGenreDescription(String value) {
		this.movieGenreDescription = value;
	}

	/**
	 * Gets the value of the movieGenreDescriptionLong property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieGenreDescriptionLong() {
		return movieGenreDescriptionLong;
	}

	/**
	 * Sets the value of the movieGenreDescriptionLong property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieGenreDescriptionLong(String value) {
		this.movieGenreDescriptionLong = value;
	}

	/**
	 * Gets the value of the movieGenreId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieGenreId() {
		return movieGenreId;
	}

	/**
	 * Sets the value of the movieGenreId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieGenreId(Integer value) {
		this.movieGenreId = value;
	}

}
