package org.ski.dvx.server.hibernate.user;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Boolean userActive, Integer userType) {
		super(userActive, userType);
	}

	/** full constructor */
	public User(String userEmail, String userPassword, String userHandle,
			Long userLastLogin, Boolean userActive, Integer userType,
			Long modified, Long created) {
		super(userEmail, userPassword, userHandle, userLastLogin, userActive,
				userType, modified, created);
	}

}
