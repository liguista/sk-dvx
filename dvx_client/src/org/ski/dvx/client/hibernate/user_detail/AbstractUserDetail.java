package org.ski.dvx.client.hibernate.user_detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractUserDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractUserDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userDetailActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailCellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailCityFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailCountryFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailHomePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailStateFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailSubscriptionEndDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userDetailSubscriptionStart" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userDetailUserFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailVisionAbility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailWorkPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDetailYearOfBirth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userDetailZipCodeFk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractUserDetail", propOrder = { "created", "modified",
		"userDetailActive", "userDetailAddress1", "userDetailAddress2",
		"userDetailCellPhoneNumber", "userDetailCityFk", "userDetailCountryFk",
		"userDetailEmail", "userDetailFirstName", "userDetailGender",
		"userDetailHomePhoneNumber", "userDetailId", "userDetailLastName",
		"userDetailStateFk", "userDetailSubscriptionEndDate",
		"userDetailSubscriptionStart", "userDetailUserFk",
		"userDetailVisionAbility", "userDetailWorkPhoneNumber",
		"userDetailYearOfBirth", "userDetailZipCodeFk" })
public abstract class AbstractUserDetail {

	protected Long created;
	protected Long modified;
	protected String userDetailActive;
	protected String userDetailAddress1;
	protected String userDetailAddress2;
	protected String userDetailCellPhoneNumber;
	protected Integer userDetailCityFk;
	protected Integer userDetailCountryFk;
	protected String userDetailEmail;
	protected String userDetailFirstName;
	protected String userDetailGender;
	protected String userDetailHomePhoneNumber;
	protected Integer userDetailId;
	protected String userDetailLastName;
	protected Integer userDetailStateFk;
	protected Long userDetailSubscriptionEndDate;
	protected Long userDetailSubscriptionStart;
	protected Integer userDetailUserFk;
	protected String userDetailVisionAbility;
	protected String userDetailWorkPhoneNumber;
	protected Integer userDetailYearOfBirth;
	protected Integer userDetailZipCodeFk;

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
	 * Gets the value of the userDetailActive property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailActive() {
		return userDetailActive;
	}

	/**
	 * Sets the value of the userDetailActive property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailActive(String value) {
		this.userDetailActive = value;
	}

	/**
	 * Gets the value of the userDetailAddress1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailAddress1() {
		return userDetailAddress1;
	}

	/**
	 * Sets the value of the userDetailAddress1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailAddress1(String value) {
		this.userDetailAddress1 = value;
	}

	/**
	 * Gets the value of the userDetailAddress2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailAddress2() {
		return userDetailAddress2;
	}

	/**
	 * Sets the value of the userDetailAddress2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailAddress2(String value) {
		this.userDetailAddress2 = value;
	}

	/**
	 * Gets the value of the userDetailCellPhoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailCellPhoneNumber() {
		return userDetailCellPhoneNumber;
	}

	/**
	 * Sets the value of the userDetailCellPhoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailCellPhoneNumber(String value) {
		this.userDetailCellPhoneNumber = value;
	}

	/**
	 * Gets the value of the userDetailCityFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailCityFk() {
		return userDetailCityFk;
	}

	/**
	 * Sets the value of the userDetailCityFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailCityFk(Integer value) {
		this.userDetailCityFk = value;
	}

	/**
	 * Gets the value of the userDetailCountryFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailCountryFk() {
		return userDetailCountryFk;
	}

	/**
	 * Sets the value of the userDetailCountryFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailCountryFk(Integer value) {
		this.userDetailCountryFk = value;
	}

	/**
	 * Gets the value of the userDetailEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailEmail() {
		return userDetailEmail;
	}

	/**
	 * Sets the value of the userDetailEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailEmail(String value) {
		this.userDetailEmail = value;
	}

	/**
	 * Gets the value of the userDetailFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailFirstName() {
		return userDetailFirstName;
	}

	/**
	 * Sets the value of the userDetailFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailFirstName(String value) {
		this.userDetailFirstName = value;
	}

	/**
	 * Gets the value of the userDetailGender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailGender() {
		return userDetailGender;
	}

	/**
	 * Sets the value of the userDetailGender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailGender(String value) {
		this.userDetailGender = value;
	}

	/**
	 * Gets the value of the userDetailHomePhoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailHomePhoneNumber() {
		return userDetailHomePhoneNumber;
	}

	/**
	 * Sets the value of the userDetailHomePhoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailHomePhoneNumber(String value) {
		this.userDetailHomePhoneNumber = value;
	}

	/**
	 * Gets the value of the userDetailId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailId() {
		return userDetailId;
	}

	/**
	 * Sets the value of the userDetailId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailId(Integer value) {
		this.userDetailId = value;
	}

	/**
	 * Gets the value of the userDetailLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailLastName() {
		return userDetailLastName;
	}

	/**
	 * Sets the value of the userDetailLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailLastName(String value) {
		this.userDetailLastName = value;
	}

	/**
	 * Gets the value of the userDetailStateFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailStateFk() {
		return userDetailStateFk;
	}

	/**
	 * Sets the value of the userDetailStateFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailStateFk(Integer value) {
		this.userDetailStateFk = value;
	}

	/**
	 * Gets the value of the userDetailSubscriptionEndDate property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUserDetailSubscriptionEndDate() {
		return userDetailSubscriptionEndDate;
	}

	/**
	 * Sets the value of the userDetailSubscriptionEndDate property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUserDetailSubscriptionEndDate(Long value) {
		this.userDetailSubscriptionEndDate = value;
	}

	/**
	 * Gets the value of the userDetailSubscriptionStart property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUserDetailSubscriptionStart() {
		return userDetailSubscriptionStart;
	}

	/**
	 * Sets the value of the userDetailSubscriptionStart property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUserDetailSubscriptionStart(Long value) {
		this.userDetailSubscriptionStart = value;
	}

	/**
	 * Gets the value of the userDetailUserFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailUserFk() {
		return userDetailUserFk;
	}

	/**
	 * Sets the value of the userDetailUserFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailUserFk(Integer value) {
		this.userDetailUserFk = value;
	}

	/**
	 * Gets the value of the userDetailVisionAbility property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailVisionAbility() {
		return userDetailVisionAbility;
	}

	/**
	 * Sets the value of the userDetailVisionAbility property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailVisionAbility(String value) {
		this.userDetailVisionAbility = value;
	}

	/**
	 * Gets the value of the userDetailWorkPhoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserDetailWorkPhoneNumber() {
		return userDetailWorkPhoneNumber;
	}

	/**
	 * Sets the value of the userDetailWorkPhoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserDetailWorkPhoneNumber(String value) {
		this.userDetailWorkPhoneNumber = value;
	}

	/**
	 * Gets the value of the userDetailYearOfBirth property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailYearOfBirth() {
		return userDetailYearOfBirth;
	}

	/**
	 * Sets the value of the userDetailYearOfBirth property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailYearOfBirth(Integer value) {
		this.userDetailYearOfBirth = value;
	}

	/**
	 * Gets the value of the userDetailZipCodeFk property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getUserDetailZipCodeFk() {
		return userDetailZipCodeFk;
	}

	/**
	 * Sets the value of the userDetailZipCodeFk property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setUserDetailZipCodeFk(Integer value) {
		this.userDetailZipCodeFk = value;
	}

}
