package org.ski.dvx.client.hibernate.movie_menu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractMovieMenu complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMovieMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="languageFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuPathFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="menuUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movieIdFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMovieMenu", propOrder = { "authorFk", "created",
		"description", "idKey", "languageFk", "menuActive", "menuItem",
		"menuNumber", "menuPathFk", "menuUri", "menuVersion", "modified",
		"movieIdFk" })
public abstract class AbstractMovieMenu {

	protected Integer authorFk;
	protected Long created;
	protected String description;
	protected Integer idKey;
	protected Integer languageFk;
	protected Integer menuActive;
	protected Integer menuItem;
	protected Integer menuNumber;
	protected Integer menuPathFk;
	protected String menuUri;
	protected Integer menuVersion;
	protected Long modified;
	protected Integer movieIdFk;

	/**
	 * Gets the value of the authorFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAuthorFk() {
		return authorFk;
	}

	/**
	 * Sets the value of the authorFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAuthorFk(Integer value) {
		this.authorFk = value;
	}

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
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the idKey property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIdKey() {
		return idKey;
	}

	/**
	 * Sets the value of the idKey property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIdKey(Integer value) {
		this.idKey = value;
	}

	/**
	 * Gets the value of the languageFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLanguageFk() {
		return languageFk;
	}

	/**
	 * Sets the value of the languageFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLanguageFk(Integer value) {
		this.languageFk = value;
	}

	/**
	 * Gets the value of the menuActive property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMenuActive() {
		return menuActive;
	}

	/**
	 * Sets the value of the menuActive property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMenuActive(Integer value) {
		this.menuActive = value;
	}

	/**
	 * Gets the value of the menuItem property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMenuItem() {
		return menuItem;
	}

	/**
	 * Sets the value of the menuItem property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMenuItem(Integer value) {
		this.menuItem = value;
	}

	/**
	 * Gets the value of the menuNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMenuNumber() {
		return menuNumber;
	}

	/**
	 * Sets the value of the menuNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMenuNumber(Integer value) {
		this.menuNumber = value;
	}

	/**
	 * Gets the value of the menuPathFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMenuPathFk() {
		return menuPathFk;
	}

	/**
	 * Sets the value of the menuPathFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMenuPathFk(Integer value) {
		this.menuPathFk = value;
	}

	/**
	 * Gets the value of the menuUri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMenuUri() {
		return menuUri;
	}

	/**
	 * Sets the value of the menuUri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMenuUri(String value) {
		this.menuUri = value;
	}

	/**
	 * Gets the value of the menuVersion property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMenuVersion() {
		return menuVersion;
	}

	/**
	 * Sets the value of the menuVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMenuVersion(Integer value) {
		this.menuVersion = value;
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

}
