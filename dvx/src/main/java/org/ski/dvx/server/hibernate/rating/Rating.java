package org.ski.dvx.server.hibernate.rating;

/**
 * Rating entity. @author MyEclipse Persistence Tools
 */
public class Rating extends AbstractRating implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rating() {
	}

	/** full constructor */
	public Rating(Integer ratingUserFk, Integer ratingLanguageFk,
			Integer ratingMovieFk, Integer descriptionFk,
			Integer ratingVersionFk, String ratingNameShort, Integer rating,
			Long modified, Long created) {
		super(ratingUserFk, ratingLanguageFk, ratingMovieFk, descriptionFk,
				ratingVersionFk, ratingNameShort, rating, modified, created);
	}

}
