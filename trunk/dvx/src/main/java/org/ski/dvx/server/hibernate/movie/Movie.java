package org.ski.dvx.server.hibernate.movie;

/**
 * Movie entity. @author MyEclipse Persistence Tools
 */
public class Movie extends AbstractMovie implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Movie() {
	}

	/** full constructor */
	public Movie(String movieName, String movieSbnNumber,
			Integer movieAuthorFk, Integer movieActive, Integer movieReleased,
			String movieRatingTemp, Integer movieRatedFk,
			Integer movieLanguageMainFk, Integer movieRating,
			String movieQuote, String movieDescription,
			String movieExtraFeatures, Integer movieStatusFk,
			Integer movieRuntime, Integer movieBudget, Integer movieRevenue,
			String movieWebpage, Integer moviePathFk,
			Integer movieCountryOfOriginFk, Long modified, Long created) {
		super(movieName, movieSbnNumber, movieAuthorFk, movieActive,
				movieReleased, movieRatingTemp, movieRatedFk,
				movieLanguageMainFk, movieRating, movieQuote, movieDescription,
				movieExtraFeatures, movieStatusFk, movieRuntime, movieBudget,
				movieRevenue, movieWebpage, moviePathFk,
				movieCountryOfOriginFk, modified, created);
	}

}
