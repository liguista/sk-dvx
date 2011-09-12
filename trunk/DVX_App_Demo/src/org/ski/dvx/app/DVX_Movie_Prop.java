/*
	Project:		Windows DVX Player/Editor
	
	File Name:		

	Designer:		Josh Miele

	Author:			Greg Ames

	Contributors:	Owen Edwards
					
	Created:		September 10, 2011
	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					© 2011
					All Rights Reserved
					
					http://www.ski.org/
					
					The Smith-Kettlewell Eye Research Institute
					2318 Fillmore Street 
					San Francisco, CA  94115 
					415-345-2000  
				 
	Notice:			Parts of this project are based on Open Source 
					and/or Public Domain Code. Please use good judgment 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

package org.ski.dvx.app;

// TODO: Auto-generated Javadoc
// import java.sql.Timestamp;
// import java.util.HashSet;
// import java.util.Set;


/**
 * The Class DVX_Movie_Prop.
 */
public class DVX_Movie_Prop {
	
	/**
	 * Gets the movie id.
	 *
	 * @return the movie id
	 */
	public Integer getMovieId() {
		return movieId;
	}
	
	/**
	 * Sets the movie id.
	 *
	 * @param movieId the new movie id
	 */
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	/**
	 * Gets the movie name.
	 *
	 * @return the movie name
	 */
	public String getMovieName() {
		return movieName;
	}
	
	/**
	 * Sets the movie name.
	 *
	 * @param movieName the new movie name
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	/**
	 * Gets the movie sbn number.
	 *
	 * @return the movie sbn number
	 */
	public String getMovieSbnNumber() {
		return movieSbnNumber;
	}
	
	/**
	 * Sets the movie sbn number.
	 *
	 * @param movieSbnNumber the new movie sbn number
	 */
	public void setMovieSbnNumber(String movieSbnNumber) {
		this.movieSbnNumber = movieSbnNumber;
	}
	
	/** The movie id. */
	private Integer movieId;
	
	/** The movie name. */
	private String movieName;
	
	/** The movie sbn number. */
	private String movieSbnNumber;

}
