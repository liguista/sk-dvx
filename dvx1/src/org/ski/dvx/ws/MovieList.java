package org.ski.dvx.ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.MovieDAO;

public class MovieList implements java.io.Serializable {

	/**
	 * @param args
	 */
	
	public MovieList()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieList movieList = new MovieList();
		
		movieList.doIt();
	}

	private void doIt() {
		// TODO Auto-generated method stub
		
		List<SimpleMovie> movieList = getMovieList();
		
		Iterator itr = movieList.iterator();
		while (itr.hasNext())
		{
			SimpleMovie simpleMovie = (SimpleMovie)itr.next();
			
			System.out.println(simpleMovie.getIndex() + " - " + simpleMovie.getSbnNumber() + " - " + simpleMovie.getMovieName());
		}
		SimpleMovie simpleMovie = getMovie("92a0c58f");
		System.out.println();
		System.out.println(simpleMovie.getIndex() + " - " + simpleMovie.getSbnNumber() + " - " + simpleMovie.getMovieName());
		
	}
	public SimpleMovie getMovie(String movieSbnNumber)
	{
		MovieDAO movieDao = new MovieDAO();
		
		SimpleMovie simpleMovie = new SimpleMovie();
		
		Movie movie = new Movie();
		
		movie.setMovieSbnNumber(movieSbnNumber);
		
		List<Movie>movieList = movieDao.findByExample(movie);
		
		if (movieList.size()>0)
		{
			movie = movieList.get(0);
    		simpleMovie.setSbnNumber(movie.getMovieSbnNumber());
    		simpleMovie.setMovieName(movie.getMovieName());
    		simpleMovie.setIndex(movie.getMovieId());
			return simpleMovie;
		}
		
		return null;
	}
	
	public List<SimpleMovie> getMovieList()
	{
		 List<SimpleMovie> theList = new ArrayList<SimpleMovie>();
		 MovieDAO movieDao = new MovieDAO();
	    	
	    	List <Movie> movieList = movieDao.findAll();
	    	
	    	for (int i = 0 ;i<movieList.size();i++)
	    	{
	    		Movie movie = movieList.get(i);
	    		SimpleMovie  simpleMovie= new SimpleMovie();

	    		simpleMovie.setSbnNumber(movie.getMovieSbnNumber());
	    		simpleMovie.setMovieName(movie.getMovieName());
	    		simpleMovie.setIndex(movie.getMovieId());
	    		theList.add(simpleMovie);
	    	}
		 return theList;

	}

}
