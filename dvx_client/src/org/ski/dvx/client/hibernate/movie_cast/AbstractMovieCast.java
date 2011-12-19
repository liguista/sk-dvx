package org.ski.dvx.client.hibernate.movie_cast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovieCast complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovieCast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieCastCrewCastIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieCastId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieCastMovieIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieCastRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieCastRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieCastRoleOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovieCast", propOrder = { "created", "modified",
		"movieCastCrewCastIdFk", "movieCastId", "movieCastMovieIdFk",
		"movieCastRoleDescription", "movieCastRoleName", "movieCastRoleOrder" })
public abstract class AbstractMovieCast {

	protected Long created;
	protected Long modified;
	protected Integer movieCastCrewCastIdFk;
	protected Integer movieCastId;
	protected Integer movieCastMovieIdFk;
	protected String movieCastRoleDescription;
	protected String movieCastRoleName;
	protected Integer movieCastRoleOrder;

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
	 * Gets the value of the movieCastCrewCastIdFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieCastCrewCastIdFk() {
		return movieCastCrewCastIdFk;
	}

	/**
	 * Sets the value of the movieCastCrewCastIdFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieCastCrewCastIdFk(Integer value) {
		this.movieCastCrewCastIdFk = value;
	}

	/**
	 * Gets the value of the movieCastId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieCastId() {
		return movieCastId;
	}

	/**
	 * Sets the value of the movieCastId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieCastId(Integer value) {
		this.movieCastId = value;
	}

	/**
	 * Gets the value of the movieCastMovieIdFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieCastMovieIdFk() {
		return movieCastMovieIdFk;
	}

	/**
	 * Sets the value of the movieCastMovieIdFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieCastMovieIdFk(Integer value) {
		this.movieCastMovieIdFk = value;
	}

	/**
	 * Gets the value of the movieCastRoleDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieCastRoleDescription() {
		return movieCastRoleDescription;
	}

	/**
	 * Sets the value of the movieCastRoleDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieCastRoleDescription(String value) {
		this.movieCastRoleDescription = value;
	}

	/**
	 * Gets the value of the movieCastRoleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieCastRoleName() {
		return movieCastRoleName;
	}

	/**
	 * Sets the value of the movieCastRoleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieCastRoleName(String value) {
		this.movieCastRoleName = value;
	}

	/**
	 * Gets the value of the movieCastRoleOrder property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieCastRoleOrder() {
		return movieCastRoleOrder;
	}

	/**
	 * Sets the value of the movieCastRoleOrder property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieCastRoleOrder(Integer value) {
		this.movieCastRoleOrder = value;
	}

}
