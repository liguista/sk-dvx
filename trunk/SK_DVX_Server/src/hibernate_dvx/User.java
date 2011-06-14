package hibernate_dvx;

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
	public User(String userName, String userPassword, Timestamp userLastLogin,
			Boolean userActive, Integer userType, Timestamp created,
			Timestamp modified, Set userProfiles, Set authors, Set userDetails,
			Set reviews) {
		super(userName, userPassword, userLastLogin, userActive, userType,
				created, modified, userProfiles, authors, userDetails, reviews);
	}

}
