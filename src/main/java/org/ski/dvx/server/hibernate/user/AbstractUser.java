package org.ski.dvx.server.hibernate.user;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userEmail;
	private String userPassword;
	private String userHandle;
	private Long userLastLogin;
	private Boolean userActive;
	private Integer userType;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(Boolean userActive, Integer userType) {
		this.userActive = userActive;
		this.userType = userType;
	}

	/** full constructor */
	public AbstractUser(String userEmail, String userPassword,
			String userHandle, Long userLastLogin, Boolean userActive,
			Integer userType, Long modified, Long created) {
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userHandle = userHandle;
		this.userLastLogin = userLastLogin;
		this.userActive = userActive;
		this.userType = userType;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserHandle() {
		return this.userHandle;
	}

	public void setUserHandle(String userHandle) {
		this.userHandle = userHandle;
	}

	public Long getUserLastLogin() {
		return this.userLastLogin;
	}

	public void setUserLastLogin(Long userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	public Boolean getUserActive() {
		return this.userActive;
	}

	public void setUserActive(Boolean userActive) {
		this.userActive = userActive;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

}