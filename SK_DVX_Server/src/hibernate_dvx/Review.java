package hibernate_dvx;

import java.sql.Timestamp;

/**
 * Review entity. @author MyEclipse Persistence Tools
 */
public class Review extends AbstractReview implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Review() {
	}

	/** full constructor */
	public Review(Movie movie, User user, String reviewSummary,
			String reviewLong, Boolean reviewActive, Timestamp created,
			Timestamp modified) {
		super(movie, user, reviewSummary, reviewLong, reviewActive, created,
				modified);
	}

}
