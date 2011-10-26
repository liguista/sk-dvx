package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

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
			Timestamp userLastLogin, Boolean userActive, Integer userType,
			Timestamp created, Timestamp modified, Set userProfiles,
			Set transactionLogs, Set authors, Set userDetails, Set reviews,
			Set ratings) {
		super(userEmail, userPassword, userHandle, userLastLogin, userActive,
				userType, created, modified, userProfiles, transactionLogs,
				authors, userDetails, reviews, ratings);
	}

}
