package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Rating entity. @author MyEclipse Persistence Tools
 */
public class Rating extends AbstractRating implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rating() {
	}

	/** minimal constructor */
	public Rating(Integer rating) {
		super(rating);
	}

	/** full constructor */
	public Rating(String ratingName, String ratingNameShort, Integer rating,
			Integer descriptionFk, Integer userFk, Timestamp created,
			Timestamp modified, Set movies) {
		super(ratingName, ratingNameShort, rating, descriptionFk, userFk,
				created, modified, movies);
	}

}
