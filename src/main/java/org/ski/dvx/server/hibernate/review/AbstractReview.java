package org.ski.dvx.server.hibernate.review;

/**
 * AbstractReview entity provides the base persistence definition of the Review
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractReview implements java.io.Serializable {

	// Fields

	private Integer reviewId;
	private Integer reviewUserFk;
	private Integer reviewLanguageFk;
	private Integer reviewVersionFk;
	private Integer movieFk;
	private String reviewSummary;
	private String reviewLong;
	private Boolean reviewActive;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractReview() {
	}

	/** full constructor */
	public AbstractReview(Integer reviewUserFk, Integer reviewLanguageFk,
			Integer reviewVersionFk, Integer movieFk, String reviewSummary,
			String reviewLong, Boolean reviewActive, Long modified, Long created) {
		this.reviewUserFk = reviewUserFk;
		this.reviewLanguageFk = reviewLanguageFk;
		this.reviewVersionFk = reviewVersionFk;
		this.movieFk = movieFk;
		this.reviewSummary = reviewSummary;
		this.reviewLong = reviewLong;
		this.reviewActive = reviewActive;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getReviewUserFk() {
		return this.reviewUserFk;
	}

	public void setReviewUserFk(Integer reviewUserFk) {
		this.reviewUserFk = reviewUserFk;
	}

	public Integer getReviewLanguageFk() {
		return this.reviewLanguageFk;
	}

	public void setReviewLanguageFk(Integer reviewLanguageFk) {
		this.reviewLanguageFk = reviewLanguageFk;
	}

	public Integer getReviewVersionFk() {
		return this.reviewVersionFk;
	}

	public void setReviewVersionFk(Integer reviewVersionFk) {
		this.reviewVersionFk = reviewVersionFk;
	}

	public Integer getMovieFk() {
		return this.movieFk;
	}

	public void setMovieFk(Integer movieFk) {
		this.movieFk = movieFk;
	}

	public String getReviewSummary() {
		return this.reviewSummary;
	}

	public void setReviewSummary(String reviewSummary) {
		this.reviewSummary = reviewSummary;
	}

	public String getReviewLong() {
		return this.reviewLong;
	}

	public void setReviewLong(String reviewLong) {
		this.reviewLong = reviewLong;
	}

	public Boolean getReviewActive() {
		return this.reviewActive;
	}

	public void setReviewActive(Boolean reviewActive) {
		this.reviewActive = reviewActive;
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