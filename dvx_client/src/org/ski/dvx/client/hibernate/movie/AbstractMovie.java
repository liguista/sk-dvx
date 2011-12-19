package org.ski.dvx.client.hibernate.movie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovie complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieAuthorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieBudget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieCountryOfOriginFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieExtraFeatures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieLanguageMainFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moviePathFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieQuote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieRatedFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieRatingTemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieReleased" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieRevenue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieRuntime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieSbnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieStatusFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movieWebpage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovie", propOrder = { "created", "modified",
		"movieActive", "movieAuthorFk", "movieBudget",
		"movieCountryOfOriginFk", "movieDescription", "movieExtraFeatures",
		"movieId", "movieLanguageMainFk", "movieName", "moviePathFk",
		"movieQuote", "movieRatedFk", "movieRating", "movieRatingTemp",
		"movieReleased", "movieRevenue", "movieRuntime", "movieSbnNumber",
		"movieStatusFk", "movieWebpage" })
public abstract class AbstractMovie {

	protected Long created;
	protected Long modified;
	protected Integer movieActive;
	protected Integer movieAuthorFk;
	protected Integer movieBudget;
	protected Integer movieCountryOfOriginFk;
	protected String movieDescription;
	protected String movieExtraFeatures;
	protected Integer movieId;
	protected Integer movieLanguageMainFk;
	protected String movieName;
	protected Integer moviePathFk;
	protected String movieQuote;
	protected Integer movieRatedFk;
	protected Integer movieRating;
	protected String movieRatingTemp;
	protected Integer movieReleased;
	protected Integer movieRevenue;
	protected Integer movieRuntime;
	protected String movieSbnNumber;
	protected Integer movieStatusFk;
	protected String movieWebpage;

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
	 * Gets the value of the movieActive property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieActive() {
		return movieActive;
	}

	/**
	 * Sets the value of the movieActive property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieActive(Integer value) {
		this.movieActive = value;
	}

	/**
	 * Gets the value of the movieAuthorFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieAuthorFk() {
		return movieAuthorFk;
	}

	/**
	 * Sets the value of the movieAuthorFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieAuthorFk(Integer value) {
		this.movieAuthorFk = value;
	}

	/**
	 * Gets the value of the movieBudget property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieBudget() {
		return movieBudget;
	}

	/**
	 * Sets the value of the movieBudget property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieBudget(Integer value) {
		this.movieBudget = value;
	}

	/**
	 * Gets the value of the movieCountryOfOriginFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieCountryOfOriginFk() {
		return movieCountryOfOriginFk;
	}

	/**
	 * Sets the value of the movieCountryOfOriginFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieCountryOfOriginFk(Integer value) {
		this.movieCountryOfOriginFk = value;
	}

	/**
	 * Gets the value of the movieDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieDescription() {
		return movieDescription;
	}

	/**
	 * Sets the value of the movieDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieDescription(String value) {
		this.movieDescription = value;
	}

	/**
	 * Gets the value of the movieExtraFeatures property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieExtraFeatures() {
		return movieExtraFeatures;
	}

	/**
	 * Sets the value of the movieExtraFeatures property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieExtraFeatures(String value) {
		this.movieExtraFeatures = value;
	}

	/**
	 * Gets the value of the movieId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieId() {
		return movieId;
	}

	/**
	 * Sets the value of the movieId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieId(Integer value) {
		this.movieId = value;
	}

	/**
	 * Gets the value of the movieLanguageMainFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieLanguageMainFk() {
		return movieLanguageMainFk;
	}

	/**
	 * Sets the value of the movieLanguageMainFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieLanguageMainFk(Integer value) {
		this.movieLanguageMainFk = value;
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
	 * Gets the value of the moviePathFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMoviePathFk() {
		return moviePathFk;
	}

	/**
	 * Sets the value of the moviePathFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMoviePathFk(Integer value) {
		this.moviePathFk = value;
	}

	/**
	 * Gets the value of the movieQuote property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieQuote() {
		return movieQuote;
	}

	/**
	 * Sets the value of the movieQuote property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieQuote(String value) {
		this.movieQuote = value;
	}

	/**
	 * Gets the value of the movieRatedFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieRatedFk() {
		return movieRatedFk;
	}

	/**
	 * Sets the value of the movieRatedFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieRatedFk(Integer value) {
		this.movieRatedFk = value;
	}

	/**
	 * Gets the value of the movieRating property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieRating() {
		return movieRating;
	}

	/**
	 * Sets the value of the movieRating property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieRating(Integer value) {
		this.movieRating = value;
	}

	/**
	 * Gets the value of the movieRatingTemp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieRatingTemp() {
		return movieRatingTemp;
	}

	/**
	 * Sets the value of the movieRatingTemp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieRatingTemp(String value) {
		this.movieRatingTemp = value;
	}

	/**
	 * Gets the value of the movieReleased property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieReleased() {
		return movieReleased;
	}

	/**
	 * Sets the value of the movieReleased property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieReleased(Integer value) {
		this.movieReleased = value;
	}

	/**
	 * Gets the value of the movieRevenue property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieRevenue() {
		return movieRevenue;
	}

	/**
	 * Sets the value of the movieRevenue property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieRevenue(Integer value) {
		this.movieRevenue = value;
	}

	/**
	 * Gets the value of the movieRuntime property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieRuntime() {
		return movieRuntime;
	}

	/**
	 * Sets the value of the movieRuntime property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieRuntime(Integer value) {
		this.movieRuntime = value;
	}

	/**
	 * Gets the value of the movieSbnNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieSbnNumber() {
		return movieSbnNumber;
	}

	/**
	 * Sets the value of the movieSbnNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieSbnNumber(String value) {
		this.movieSbnNumber = value;
	}

	/**
	 * Gets the value of the movieStatusFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMovieStatusFk() {
		return movieStatusFk;
	}

	/**
	 * Sets the value of the movieStatusFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMovieStatusFk(Integer value) {
		this.movieStatusFk = value;
	}

	/**
	 * Gets the value of the movieWebpage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovieWebpage() {
		return movieWebpage;
	}

	/**
	 * Sets the value of the movieWebpage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovieWebpage(String value) {
		this.movieWebpage = value;
	}

}
