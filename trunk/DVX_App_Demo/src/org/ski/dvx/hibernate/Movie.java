package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Movie entity. @author MyEclipse Persistence Tools
 */
public class Movie extends AbstractMovie implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Movie() {
	}

	/** full constructor */
	public Movie(Country country, Status status, Rating rating,
			String movieName, String movieSbnNumber, Integer movieActive,
			Integer movieReleased, String movieRatingTemp,
			Integer movieLanguageMainFk, Integer movieRating,
			String movieQuote, String movieDescription,
			String movieExtraFeatures, Integer movieRuntime,
			Integer movieBudget, Integer movieRevenue, String movieWebpage,
			Timestamp created, Timestamp modified, Set movieChapters,
			Set transactionLogs, Set posters, Set reviews, Set movieTrailers,
			Set movieMenus, Set movieCasts, Set descriptions) {
		super(country, status, rating, movieName, movieSbnNumber, movieActive,
				movieReleased, movieRatingTemp, movieLanguageMainFk,
				movieRating, movieQuote, movieDescription, movieExtraFeatures,
				movieRuntime, movieBudget, movieRevenue, movieWebpage, created,
				modified, movieChapters, transactionLogs, posters, reviews,
				movieTrailers, movieMenus, movieCasts, descriptions);
	}

}
