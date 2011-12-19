package org.ski.dvx.server.hibernate.rating;

/**
 * AbstractRating entity provides the base persistence definition of the Rating
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRating implements java.io.Serializable {

	// Fields

	private Integer ratingId;
	private Integer ratingUserFk;
	private Integer ratingLanguageFk;
	private Integer ratingMovieFk;
	private Integer descriptionFk;
	private Integer ratingVersionFk;
	private String ratingNameShort;
	private Integer rating;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractRating() {
	}

	/** full constructor */
	public AbstractRating(Integer ratingUserFk, Integer ratingLanguageFk,
			Integer ratingMovieFk, Integer descriptionFk,
			Integer ratingVersionFk, String ratingNameShort, Integer rating,
			Long modified, Long created) {
		this.ratingUserFk = ratingUserFk;
		this.ratingLanguageFk = ratingLanguageFk;
		this.ratingMovieFk = ratingMovieFk;
		this.descriptionFk = descriptionFk;
		this.ratingVersionFk = ratingVersionFk;
		this.ratingNameShort = ratingNameShort;
		this.rating = rating;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public Integer getRatingUserFk() {
		return this.ratingUserFk;
	}

	public void setRatingUserFk(Integer ratingUserFk) {
		this.ratingUserFk = ratingUserFk;
	}

	public Integer getRatingLanguageFk() {
		return this.ratingLanguageFk;
	}

	public void setRatingLanguageFk(Integer ratingLanguageFk) {
		this.ratingLanguageFk = ratingLanguageFk;
	}

	public Integer getRatingMovieFk() {
		return this.ratingMovieFk;
	}

	public void setRatingMovieFk(Integer ratingMovieFk) {
		this.ratingMovieFk = ratingMovieFk;
	}

	public Integer getDescriptionFk() {
		return this.descriptionFk;
	}

	public void setDescriptionFk(Integer descriptionFk) {
		this.descriptionFk = descriptionFk;
	}

	public Integer getRatingVersionFk() {
		return this.ratingVersionFk;
	}

	public void setRatingVersionFk(Integer ratingVersionFk) {
		this.ratingVersionFk = ratingVersionFk;
	}

	public String getRatingNameShort() {
		return this.ratingNameShort;
	}

	public void setRatingNameShort(String ratingNameShort) {
		this.ratingNameShort = ratingNameShort;
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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