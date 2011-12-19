package org.ski.dvx.server.hibernate.user_profile;

/**
 * UserProfile entity. @author MyEclipse Persistence Tools
 */
public class UserProfile extends AbstractUserProfile implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserProfile() {
	}

	/** full constructor */
	public UserProfile(Integer userFk, Integer userDetailFk,
			Integer userProfileVisionImpared, Integer userProfileMotionImpared,
			Long modified, Long created) {
		super(userFk, userDetailFk, userProfileVisionImpared,
				userProfileMotionImpared, modified, created);
	}

}
