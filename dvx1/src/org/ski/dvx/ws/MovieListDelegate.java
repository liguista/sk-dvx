package org.ski.dvx.ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.MovieDAO;

@javax.jws.WebService(targetNamespace = "http://ws.dvx.ski.org/", serviceName = "MovieListService", portName = "MovieListPort")
public class MovieListDelegate {

	org.ski.dvx.ws.MovieList movieList = new org.ski.dvx.ws.MovieList();

	public void main(String[] args) {
		movieList.main(args);
	}

	public SimpleMovie getMovie(String movieSbnNumber) {
		return movieList.getMovie(movieSbnNumber);
	}

	public List<SimpleMovie> getMovieList() {
		return movieList.getMovieList();
	}

}