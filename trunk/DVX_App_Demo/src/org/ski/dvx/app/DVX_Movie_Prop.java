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
					and/or Public Domain Code. Please use good judgement 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

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
