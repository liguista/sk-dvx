package org.ski.dvx.server.hibernate.movie;

/**
 * AbstractMovie entity provides the base persistence definition of the Movie
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovie implements java.io.Serializable {

	// Fields

	private Integer movieId;
	private String movieName;
	private String movieSbnNumber;
	private Integer movieAuthorFk;
	private Integer movieActive;
	private Integer movieReleased;
	private String movieRatingTemp;
	private Integer movieRatedFk;
	private Integer movieLanguageMainFk;
	private Integer movieRating;
	private String movieQuote;
	private String movieDescription;
	private String movieExtraFeatures;
	private Integer movieStatusFk;
	private Integer movieRuntime;
	private Integer movieBudget;
	private Integer movieRevenue;
	private String movieWebpage;
	private Integer moviePathFk;
	private Integer movieCountryOfOriginFk;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractMovie() {
	}

	/** full constructor */
	public AbstractMovie(String movieName, String movieSbnNumber,
			Integer movieAuthorFk, Integer movieActive, Integer movieReleased,
			String movieRatingTemp, Integer movieRatedFk,
			Integer movieLanguageMainFk, Integer movieRating,
			String movieQuote, String movieDescription,
			String movieExtraFeatures, Integer movieStatusFk,
			Integer movieRuntime, Integer movieBudget, Integer movieRevenue,
			String movieWebpage, Integer moviePathFk,
			Integer movieCountryOfOriginFk, Long modified, Long created) {
		this.movieName = movieName;
		this.movieSbnNumber = movieSbnNumber;
		this.movieAuthorFk = movieAuthorFk;
		this.movieActive = movieActive;
		this.movieReleased = movieReleased;
		this.movieRatingTemp = movieRatingTemp;
		this.movieRatedFk = movieRatedFk;
		this.movieLanguageMainFk = movieLanguageMainFk;
		this.movieRating = movieRating;
		this.movieQuote = movieQuote;
		this.movieDescription = movieDescription;
		this.movieExtraFeatures = movieExtraFeatures;
		this.movieStatusFk = movieStatusFk;
		this.movieRuntime = movieRuntime;
		this.movieBudget = movieBudget;
		this.movieRevenue = movieRevenue;
		this.movieWebpage = movieWebpage;
		this.moviePathFk = moviePathFk;
		this.movieCountryOfOriginFk = movieCountryOfOriginFk;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getMovieId() {
		return this.movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
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

	public Integer getMovieAuthorFk() {
		return this.movieAuthorFk;
	}

	public void setMovieAuthorFk(Integer movieAuthorFk) {
		this.movieAuthorFk = movieAuthorFk;
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

	public Integer getMovieRatedFk() {
		return this.movieRatedFk;
	}

	public void setMovieRatedFk(Integer movieRatedFk) {
		this.movieRatedFk = movieRatedFk;
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

	public Integer getMovieStatusFk() {
		return this.movieStatusFk;
	}

	public void setMovieStatusFk(Integer movieStatusFk) {
		this.movieStatusFk = movieStatusFk;
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

	public Integer getMoviePathFk() {
		return this.moviePathFk;
	}

	public void setMoviePathFk(Integer moviePathFk) {
		this.moviePathFk = moviePathFk;
	}

	public Integer getMovieCountryOfOriginFk() {
		return this.movieCountryOfOriginFk;
	}

	public void setMovieCountryOfOriginFk(Integer movieCountryOfOriginFk) {
		this.movieCountryOfOriginFk = movieCountryOfOriginFk;
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