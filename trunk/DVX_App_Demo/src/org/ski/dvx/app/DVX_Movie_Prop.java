package org.ski.dvx.app;

// import java.sql.Timestamp;
// import java.util.HashSet;
// import java.util.Set;


public class DVX_Movie_Prop {
	
	public Integer getMovieId() {
		return movieId;
	}
	
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieSbnNumber() {
		return movieSbnNumber;
	}
	
	public void setMovieSbnNumber(String movieSbnNumber) {
		this.movieSbnNumber = movieSbnNumber;
	}
	
	private Integer movieId;
	private String movieName;
	private String movieSbnNumber;

}
