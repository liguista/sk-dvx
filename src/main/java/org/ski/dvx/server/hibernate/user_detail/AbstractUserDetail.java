package org.ski.dvx.server.hibernate.user_detail;

/**
 * AbstractUserDetail entity provides the base persistence definition of the
 * UserDetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserDetail implements java.io.Serializable {

	// Fields

	private Integer userDetailId;
	private Integer userDetailUserFk;
	private String userDetailFirstName;
	private String userDetailLastName;
	private String userDetailEmail;
	private String userDetailAddress1;
	private String userDetailAddress2;
	private Integer userDetailCityFk;
	private Integer userDetailStateFk;
	private Integer userDetailZipCodeFk;
	private Integer userDetailCountryFk;
	private String userDetailWorkPhoneNumber;
	private String userDetailHomePhoneNumber;
	private String userDetailCellPhoneNumber;
	private Long userDetailSubscriptionStart;
	private Long userDetailSubscriptionEndDate;
	private String userDetailActive;
	private Integer userDetailYearOfBirth;
	private String userDetailGender;
	private String userDetailVisionAbility;
	private Long created;
	private Long modified;

	// Constructors

	/** default constructor */
	public AbstractUserDetail() {
	}

	/** minimal constructor */
	public AbstractUserDetail(Integer userDetailUserFk) {
		this.userDetailUserFk = userDetailUserFk;
	}

	/** full constructor */
	public AbstractUserDetail(Integer userDetailUserFk,
			String userDetailFirstName, String userDetailLastName,
			String userDetailEmail, String userDetailAddress1,
			String userDetailAddress2, Integer userDetailCityFk,
			Integer userDetailStateFk, Integer userDetailZipCodeFk,
			Integer userDetailCountryFk, String userDetailWorkPhoneNumber,
			String userDetailHomePhoneNumber, String userDetailCellPhoneNumber,
			Long userDetailSubscriptionStart,
			Long userDetailSubscriptionEndDate, String userDetailActive,
			Integer userDetailYearOfBirth, String userDetailGender,
			String userDetailVisionAbility, Long created, Long modified) {
		this.userDetailUserFk = userDetailUserFk;
		this.userDetailFirstName = userDetailFirstName;
		this.userDetailLastName = userDetailLastName;
		this.userDetailEmail = userDetailEmail;
		this.userDetailAddress1 = userDetailAddress1;
		this.userDetailAddress2 = userDetailAddress2;
		this.userDetailCityFk = userDetailCityFk;
		this.userDetailStateFk = userDetailStateFk;
		this.userDetailZipCodeFk = userDetailZipCodeFk;
		this.userDetailCountryFk = userDetailCountryFk;
		this.userDetailWorkPhoneNumber = userDetailWorkPhoneNumber;
		this.userDetailHomePhoneNumber = userDetailHomePhoneNumber;
		this.userDetailCellPhoneNumber = userDetailCellPhoneNumber;
		this.userDetailSubscriptionStart = userDetailSubscriptionStart;
		this.userDetailSubscriptionEndDate = userDetailSubscriptionEndDate;
		this.userDetailActive = userDetailActive;
		this.userDetailYearOfBirth = userDetailYearOfBirth;
		this.userDetailGender = userDetailGender;
		this.userDetailVisionAbility = userDetailVisionAbility;
		this.created = created;
		this.modified = modified;
	}

	// Property accessors

	public Integer getUserDetailId() {
		return this.userDetailId;
	}

	public void setUserDetailId(Integer userDetailId) {
		this.userDetailId = userDetailId;
	}

	public Integer getUserDetailUserFk() {
		return this.userDetailUserFk;
	}

	public void setUserDetailUserFk(Integer userDetailUserFk) {
		this.userDetailUserFk = userDetailUserFk;
	}

	public String getUserDetailFirstName() {
		return this.userDetailFirstName;
	}

	public void setUserDetailFirstName(String userDetailFirstName) {
		this.userDetailFirstName = userDetailFirstName;
	}

	public String getUserDetailLastName() {
		return this.userDetailLastName;
	}

	public void setUserDetailLastName(String userDetailLastName) {
		this.userDetailLastName = userDetailLastName;
	}

	public String getUserDetailEmail() {
		return this.userDetailEmail;
	}

	public void setUserDetailEmail(String userDetailEmail) {
		this.userDetailEmail = userDetailEmail;
	}

	public String getUserDetailAddress1() {
		return this.userDetailAddress1;
	}

	public void setUserDetailAddress1(String userDetailAddress1) {
		this.userDetailAddress1 = userDetailAddress1;
	}

	public String getUserDetailAddress2() {
		return this.userDetailAddress2;
	}

	public void setUserDetailAddress2(String userDetailAddress2) {
		this.userDetailAddress2 = userDetailAddress2;
	}

	public Integer getUserDetailCityFk() {
		return this.userDetailCityFk;
	}

	public void setUserDetailCityFk(Integer userDetailCityFk) {
		this.userDetailCityFk = userDetailCityFk;
	}

	public Integer getUserDetailStateFk() {
		return this.userDetailStateFk;
	}

	public void setUserDetailStateFk(Integer userDetailStateFk) {
		this.userDetailStateFk = userDetailStateFk;
	}

	public Integer getUserDetailZipCodeFk() {
		return this.userDetailZipCodeFk;
	}

	public void setUserDetailZipCodeFk(Integer userDetailZipCodeFk) {
		this.userDetailZipCodeFk = userDetailZipCodeFk;
	}

	public Integer getUserDetailCountryFk() {
		return this.userDetailCountryFk;
	}

	public void setUserDetailCountryFk(Integer userDetailCountryFk) {
		this.userDetailCountryFk = userDetailCountryFk;
	}

	public String getUserDetailWorkPhoneNumber() {
		return this.userDetailWorkPhoneNumber;
	}

	public void setUserDetailWorkPhoneNumber(String userDetailWorkPhoneNumber) {
		this.userDetailWorkPhoneNumber = userDetailWorkPhoneNumber;
	}

	public String getUserDetailHomePhoneNumber() {
		return this.userDetailHomePhoneNumber;
	}

	public void setUserDetailHomePhoneNumber(String userDetailHomePhoneNumber) {
		this.userDetailHomePhoneNumber = userDetailHomePhoneNumber;
	}

	public String getUserDetailCellPhoneNumber() {
		return this.userDetailCellPhoneNumber;
	}

	public void setUserDetailCellPhoneNumber(String userDetailCellPhoneNumber) {
		this.userDetailCellPhoneNumber = userDetailCellPhoneNumber;
	}

	public Long getUserDetailSubscriptionStart() {
		return this.userDetailSubscriptionStart;
	}

	public void setUserDetailSubscriptionStart(Long userDetailSubscriptionStart) {
		this.userDetailSubscriptionStart = userDetailSubscriptionStart;
	}

	public Long getUserDetailSubscriptionEndDate() {
		return this.userDetailSubscriptionEndDate;
	}

	public void setUserDetailSubscriptionEndDate(
			Long userDetailSubscriptionEndDate) {
		this.userDetailSubscriptionEndDate = userDetailSubscriptionEndDate;
	}

	public String getUserDetailActive() {
		return this.userDetailActive;
	}

	public void setUserDetailActive(String userDetailActive) {
		this.userDetailActive = userDetailActive;
	}

	public Integer getUserDetailYearOfBirth() {
		return this.userDetailYearOfBirth;
	}

	public void setUserDetailYearOfBirth(Integer userDetailYearOfBirth) {
		this.userDetailYearOfBirth = userDetailYearOfBirth;
	}

	public String getUserDetailGender() {
		return this.userDetailGender;
	}

	public void setUserDetailGender(String userDetailGender) {
		this.userDetailGender = userDetailGender;
	}

	public String getUserDetailVisionAbility() {
		return this.userDetailVisionAbility;
	}

	public void setUserDetailVisionAbility(String userDetailVisionAbility) {
		this.userDetailVisionAbility = userDetailVisionAbility;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

}