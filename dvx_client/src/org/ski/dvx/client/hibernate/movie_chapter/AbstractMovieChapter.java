package org.ski.dvx.client.hibernate.movie_chapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovieChapter complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovieChapter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieChapterDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieChapterEndTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieChapterId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieChapterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieChapterStartTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovieChapter", propOrder = { "created", "modified",
		"movieChapterDescription", "movieChapterEndTime", "movieChapterId",
		"movieChapterName", "movieChapterStartTime", "movieFk" })
public abstract class AbstractMovieChapter {

	protected Long created;
	protected Long modified;
	protected String movieChapterDescription;
	protected Long movieChapterEndTime;
	protected Integer movieChapterId;
	protected String movieChapterName;
	protected Long movieChapterStartTime;
	protected Integer movieFk;

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
	 * Gets the value of the movieChapterDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieChapterDescription() {
		return movieChapterDescription;
	}

	/**
	 * Sets the value of the movieChapterDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieChapterDescription(String value) {
		this.movieChapterDescription = value;
	}

	/**
	 * Gets the value of the movieChapterEndTime property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getMovieChapterEndTime() {
		return movieChapterEndTime;
	}

	/**
	 * Sets the value of the movieChapterEndTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setMovieChapterEndTime(Long value) {
		this.movieChapterEndTime = value;
	}

	/**
	 * Gets the value of the movieChapterId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieChapterId() {
		return movieChapterId;
	}

	/**
	 * Sets the value of the movieChapterId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieChapterId(Integer value) {
		this.movieChapterId = value;
	}

	/**
	 * Gets the value of the movieChapterName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieChapterName() {
		return movieChapterName;
	}

	/**
	 * Sets the value of the movieChapterName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieChapterName(String value) {
		this.movieChapterName = value;
	}

	/**
	 * Gets the value of the movieChapterStartTime property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getMovieChapterStartTime() {
		return movieChapterStartTime;
	}

	/**
	 * Sets the value of the movieChapterStartTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setMovieChapterStartTime(Long value) {
		this.movieChapterStartTime = value;
	}

	/**
	 * Gets the value of the movieFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieFk() {
		return movieFk;
	}

	/**
	 * Sets the value of the movieFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieFk(Integer value) {
		this.movieFk = value;
	}

}
