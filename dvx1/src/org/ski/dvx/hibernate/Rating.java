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

	/** full constructor */
	public Rating(User user, Movie movie, Description description,
			Language language, Version version, String ratingNameShort,
			Integer rating, Timestamp created, Timestamp modified, Set movies) {
		super(user, movie, description, language, version, ratingNameShort,
				rating, created, modified, movies);
	}

}
