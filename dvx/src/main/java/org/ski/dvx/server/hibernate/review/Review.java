package org.ski.dvx.server.hibernate.review;

/**
 * Review entity. @author MyEclipse Persistence Tools
 */
public class Review extends AbstractReview implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Review() {
	}

	/** full constructor */
	public Review(Integer reviewUserFk, Integer reviewLanguageFk,
			Integer reviewVersionFk, Integer movieFk, String reviewSummary,
			String reviewLong, Boolean reviewActive, Long modified, Long created) {
		super(reviewUserFk, reviewLanguageFk, reviewVersionFk, movieFk,
				reviewSummary, reviewLong, reviewActive, modified, created);
	}

}
