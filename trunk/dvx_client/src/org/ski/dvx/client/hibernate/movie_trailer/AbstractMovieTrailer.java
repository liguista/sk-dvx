package org.ski.dvx.client.hibernate.movie_trailer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovieTrailer complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovieTrailer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieTrailerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieTrailerIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieTrailerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovieTrailer", propOrder = { "created", "modified",
		"movieIdFk", "movieTrailerId", "movieTrailerIndex", "movieTrailerUri" })
public abstract class AbstractMovieTrailer {

	protected Long created;
	protected Long modified;
	protected Integer movieIdFk;
	protected Integer movieTrailerId;
	protected Integer movieTrailerIndex;
	protected String movieTrailerUri;

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
	 * Gets the value of the movieIdFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieIdFk() {
		return movieIdFk;
	}

	/**
	 * Sets the value of the movieIdFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieIdFk(Integer value) {
		this.movieIdFk = value;
	}

	/**
	 * Gets the value of the movieTrailerId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieTrailerId() {
		return movieTrailerId;
	}

	/**
	 * Sets the value of the movieTrailerId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieTrailerId(Integer value) {
		this.movieTrailerId = value;
	}

	/**
	 * Gets the value of the movieTrailerIndex property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieTrailerIndex() {
		return movieTrailerIndex;
	}

	/**
	 * Sets the value of the movieTrailerIndex property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieTrailerIndex(Integer value) {
		this.movieTrailerIndex = value;
	}

	/**
	 * Gets the value of the movieTrailerUri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieTrailerUri() {
		return movieTrailerUri;
	}

	/**
	 * Sets the value of the movieTrailerUri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieTrailerUri(String value) {
		this.movieTrailerUri = value;
	}

}
