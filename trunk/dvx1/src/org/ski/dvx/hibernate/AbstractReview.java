package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * AbstractReview entity provides the base persistence definition of the Review
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractReview implements java.io.Serializable {

	// Fields

	private Integer reviewId;
	private Movie movie;
	private User user;
	private Integer reviewLanguageFk;
	private Integer reviewVersionFk;
	private String reviewSummary;
	private String reviewLong;
	private Boolean reviewActive;
	private Timestamp created;
	private Timestamp modified;

	// Constructors

	/** default constructor */
	public AbstractReview() {
	}

	/** full constructor */
	public AbstractReview(Movie movie, User user, Integer reviewLanguageFk,
			Integer reviewVersionFk, String reviewSummary, String reviewLong,
			Boolean reviewActive, Timestamp created, Timestamp modified) {
		this.movie = movie;
		this.user = user;
		this.reviewLanguageFk = reviewLanguageFk;
		this.reviewVersionFk = reviewVersionFk;
		this.reviewSummary = reviewSummary;
		this.reviewLong = reviewLong;
		this.reviewActive = reviewActive;
		this.created = created;
		this.modified = modified;
	}

	// Property accessors

	public Integer getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

}