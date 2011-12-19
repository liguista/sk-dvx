package org.ski.dvx.server.hibernate.user_detail;

/**
 * UserDetail entity. @author MyEclipse Persistence Tools
 */
public class UserDetail extends AbstractUserDetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserDetail() {
	}

	/** minimal constructor */
	public UserDetail(Integer userDetailUserFk) {
		super(userDetailUserFk);
	}

	/** full constructor */
	public UserDetail(Integer userDetailUserFk, String userDetailFirstName,
			String userDetailLastName, String userDetailEmail,
			String userDetailAddress1, String userDetailAddress2,
			Integer userDetailCityFk, Integer userDetailStateFk,
			Integer userDetailZipCodeFk, Integer userDetailCountryFk,
			String userDetailWorkPhoneNumber, String userDetailHomePhoneNumber,
			String userDetailCellPhoneNumber, Long userDetailSubscriptionStart,
			Long userDetailSubscriptionEndDate, String userDetailActive,
			Integer userDetailYearOfBirth, String userDetailGender,
			String userDetailVisionAbility, Long created, Long modified) {
		super(userDetailUserFk, userDetailFirstName, userDetailLastName,
				userDetailEmail, userDetailAddress1, userDetailAddress2,
				userDetailCityFk, userDetailStateFk, userDetailZipCodeFk,
				userDetailCountryFk, userDetailWorkPhoneNumber,
				userDetailHomePhoneNumber, userDetailCellPhoneNumber,
				userDetailSubscriptionStart, userDetailSubscriptionEndDate,
				userDetailActive, userDetailYearOfBirth, userDetailGender,
				userDetailVisionAbility, created, modified);
	}

}
