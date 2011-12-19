package org.ski.dvx.server.hibernate.user_profile;

/**
 * AbstractUserProfile entity provides the base persistence definition of the
 * UserProfile entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserProfile implements java.io.Serializable {

	// Fields

	private Integer userProfileId;
	private Integer userFk;
	private Integer userDetailFk;
	private Integer userProfileVisionImpared;
	private Integer userProfileMotionImpared;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractUserProfile() {
	}

	/** full constructor */
	public AbstractUserProfile(Integer userFk, Integer userDetailFk,
			Integer userProfileVisionImpared, Integer userProfileMotionImpared,
			Long modified, Long created) {
		this.userFk = userFk;
		this.userDetailFk = userDetailFk;
		this.userProfileVisionImpared = userProfileVisionImpared;
		this.userProfileMotionImpared = userProfileMotionImpared;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getUserProfileId() {
		return this.userProfileId;
	}

	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
	}

	public Integer getUserFk() {
		return this.userFk;
	}

	public void setUserFk(Integer userFk) {
		this.userFk = userFk;
	}

	public Integer getUserDetailFk() {
		return this.userDetailFk;
	}

	public void setUserDetailFk(Integer userDetailFk) {
		this.userDetailFk = userDetailFk;
	}

	public Integer getUserProfileVisionImpared() {
		return this.userProfileVisionImpared;
	}

	public void setUserProfileVisionImpared(Integer userProfileVisionImpared) {
		this.userProfileVisionImpared = userProfileVisionImpared;
	}

	public Integer getUserProfileMotionImpared() {
		return this.userProfileMotionImpared;
	}

	public void setUserProfileMotionImpared(Integer userProfileMotionImpared) {
		this.userProfileMotionImpared = userProfileMotionImpared;
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