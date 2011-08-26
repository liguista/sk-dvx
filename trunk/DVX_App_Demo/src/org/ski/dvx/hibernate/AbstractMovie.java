package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMovie entity provides the base persistence definition of the Movie
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovie implements java.io.Serializable {

	// Fields

	private Integer movieId;
	private Country country;
	private Status status;
	private Rating rating;
	private String movieName;
	private String movieSbnNumber;
	private Integer movieActive;
	private Integer movieReleased;
	private String movieRatingTemp;
	private Integer movieLanguageMainFk;
	private Integer movieRating;
	private String movieQuote;
	private String movieDescription;
	private String movieExtraFeatures;
	private Integer movieRuntime;
	private Integer movieBudget;
	private Integer movieRevenue;
	private String movieWebpage;
	private Timestamp created;
	private Timestamp modified;
	private Set movieChapters = new HashSet(0);
	private Set transactionLogs = new HashSet(0);
	private Set posters = new HashSet(0);
	private Set reviews = new HashSet(0);
	private Set movieTrailers = new HashSet(0);
	private Set movieMenus = new HashSet(0);
	private Set movieCasts = new HashSet(0);
	private Set descriptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMovie() {
	}

	/** full constructor */
	public AbstractMovie(Country country, Status status, Rating rating,
			String movieName, String movieSbnNumber, Integer movieActive,
			Integer movieReleased, String movieRatingTemp,
			Integer movieLanguageMainFk, Integer movieRating,
			String movieQuote, String movieDescription,
			String movieExtraFeatures, Integer movieRuntime,
			Integer movieBudget, Integer movieRevenue, String movieWebpage,
			Timestamp created, Timestamp modified, Set movieChapters,
			Set transactionLogs, Set posters, Set reviews, Set movieTrailers,
			Set movieMenus, Set movieCasts, Set descriptions) {
		this.country = country;
		this.status = status;
		this.rating = rating;
		this.movieName = movieName;
		this.movieSbnNumber = movieSbnNumber;
		this.movieActive = movieActive;
		this.movieReleased = movieReleased;
		this.movieRatingTemp = movieRatingTemp;
		this.movieLanguageMainFk = movieLanguageMainFk;
		this.movieRating = movieRating;
		this.movieQuote = movieQuote;
		this.movieDescription = movieDescription;
		this.movieExtraFeatures = movieExtraFeatures;
		this.movieRuntime = movieRuntime;
		this.movieBudget = movieBudget;
		this.movieRevenue = movieRevenue;
		this.movieWebpage = movieWebpage;
		this.created = created;
		this.modified = modified;
		this.movieChapters = movieChapters;
		this.transactionLogs = transactionLogs;
		this.posters = posters;
		this.reviews = reviews;
		this.movieTrailers = movieTrailers;
		this.movieMenus = movieMenus;
		this.movieCasts = movieCasts;
		this.descriptions = descriptions;
	}

	// Property accessors

	public Integer getMovieId() {
		return this.movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Rating getRating() {
		return this.rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public String getMovieName() {
		return this.movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieSbnNumber() {
		return this.movieSbnNumber;
	}

	public void setMovieSbnNumber(String movieSbnNumber) {
		this.movieSbnNumber = movieSbnNumber;
	}

	public Integer getMovieActive() {
		return this.movieActive;
	}

	public void setMovieActive(Integer movieActive) {
		this.movieActive = movieActive;
	}

	public Integer getMovieReleased() {
		return this.movieReleased;
	}

	public void setMovieReleased(Integer movieReleased) {
		this.movieReleased = movieReleased;
	}

	public String getMovieRatingTemp() {
		return this.movieRatingTemp;
	}

	public void setMovieRatingTemp(String movieRatingTemp) {
		this.movieRatingTemp = movieRatingTemp;
	}

	public Integer getMovieLanguageMainFk() {
		return this.movieLanguageMainFk;
	}

	public void setMovieLanguageMainFk(Integer movieLanguageMainFk) {
		this.movieLanguageMainFk = movieLanguageMainFk;
	}

	public Integer getMovieRating() {
		return this.movieRating;
	}

	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieQuote() {
		return this.movieQuote;
	}

	public void setMovieQuote(String movieQuote) {
		this.movieQuote = movieQuote;
	}

	public String getMovieDescription() {
		return this.movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieExtraFeatures() {
		return this.movieExtraFeatures;
	}

	public void setMovieExtraFeatures(String movieExtraFeatures) {
		this.movieExtraFeatures = movieExtraFeatures;
	}

	public Integer getMovieRuntime() {
		return this.movieRuntime;
	}

	public void setMovieRuntime(Integer movieRuntime) {
		this.movieRuntime = movieRuntime;
	}

	public Integer getMovieBudget() {
		return this.movieBudget;
	}

	public void setMovieBudget(Integer movieBudget) {
		this.movieBudget = movieBudget;
	}

	public Integer getMovieRevenue() {
		return this.movieRevenue;
	}

	public void setMovieRevenue(Integer movieRevenue) {
		this.movieRevenue = movieRevenue;
	}

	public String getMovieWebpage() {
		return this.movieWebpage;
	}

	public void setMovieWebpage(String movieWebpage) {
		this.movieWebpage = movieWebpage;
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

	public Set getMovieChapters() {
		return this.movieChapters;
	}

	public void setMovieChapters(Set movieChapters) {
		this.movieChapters = movieChapters;
	}

	public Set getTransactionLogs() {
		return this.transactionLogs;
	}

	public void setTransactionLogs(Set transactionLogs) {
		this.transactionLogs = transactionLogs;
	}

	public Set getPosters() {
		return this.posters;
	}

	public void setPosters(Set posters) {
		this.posters = posters;
	}

	public Set getReviews() {
		return this.reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

	public Set getMovieTrailers() {
		return this.movieTrailers;
	}

	public void setMovieTrailers(Set movieTrailers) {
		this.movieTrailers = movieTrailers;
	}

	public Set getMovieMenus() {
		return this.movieMenus;
	}

	public void setMovieMenus(Set movieMenus) {
		this.movieMenus = movieMenus;
	}

	public Set getMovieCasts() {
		return this.movieCasts;
	}

	public void setMovieCasts(Set movieCasts) {
		this.movieCasts = movieCasts;
	}

	public Set getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(Set descriptions) {
		this.descriptions = descriptions;
	}

}