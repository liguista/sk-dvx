package org.ski.dvx.client.db;


import java.util.Iterator;
import java.util.List;

import org.ski.dvx.client.hibernate.author.Author;
import org.ski.dvx.client.hibernate.author.AuthorDAODelegate;
import org.ski.dvx.client.hibernate.author.AuthorDAOService;
import org.ski.dvx.client.hibernate.description.Description;
import org.ski.dvx.client.hibernate.description.DescriptionDAODelegate;
import org.ski.dvx.client.hibernate.description.DescriptionDAOService;
import org.ski.dvx.client.hibernate.language.Language;
import org.ski.dvx.client.hibernate.language.LanguageDAODelegate;
import org.ski.dvx.client.hibernate.language.LanguageDAOService;
import org.ski.dvx.client.hibernate.movie.Movie;
import org.ski.dvx.client.hibernate.movie.MovieDAODelegate;
import org.ski.dvx.client.hibernate.movie.MovieDAOService;
import org.ski.dvx.client.hibernate.path.Path;
import org.ski.dvx.client.hibernate.path.PathDAODelegate;
import org.ski.dvx.client.hibernate.path.PathDAOService;
import org.ski.dvx.client.hibernate.rating.Rating;
import org.ski.dvx.client.hibernate.rating.RatingDAODelegate;
import org.ski.dvx.client.hibernate.rating.RatingDAOService;
import org.ski.dvx.client.hibernate.user.User;
import org.ski.dvx.client.hibernate.user.UserDAODelegate;
import org.ski.dvx.client.hibernate.user.UserDAOService;

public class DatabaseUtils {
	
	
	private String DEFAULT_LANGUAGE 		= "English";
	private String DEFAULT_USER 			= "Greg";
	private String DEFAULT_MOVIE_SBN 		= "e7cf6917";
	private int    DEFAULT_DESCRIPTION_ID 	= 1229;
	private int    DEFAULT_RATING_ID_5	= 5;
	private int    DEFAULT_RATING_ID_6	= 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatabaseUtils ct = new DatabaseUtils();
		ct.doIt();

	}

	private void doIt() {
		// TODO Auto-generated method stub
		
		TestUser(); 
		TestAuthor(); 
		TestMovie(); 
		TestLanguage();
		TestDescriptions();
		TestDescription();
		TestPath();
		TestRating();
		
	}

	void TestUser()
	{
		User user = GetUser(DEFAULT_USER);
		System.out.println("User " + user.getUserId() + " " + user.getUserHandle());
	}
	
	public User GetUser(String userName) {
		// TODO Auto-generated method stub
		UserDAOService uds = new UserDAOService();
		
		UserDAODelegate udd = uds.getUserDAOPort();
				
		User user = new User();
		user.setUserHandle(userName);
		
		List list = udd.findByExample(user);
		System.out.println("User List Size = " + list.size());

		if (list.size()>0)
		{
			user = (User)list.get(0);
		}

		return user;

	}
	
	public Author GetAuthor(String userName)
	{
		AuthorDAOService ads = new AuthorDAOService();
		
		AuthorDAODelegate add = ads.getAuthorDAOPort();
		
		User user = GetUser(userName);
		
		Author author = new Author();
		author.setUserFk(user.getUserId());

		List list = add.findByExample(author);
		System.out.println("Author List Size = " + list.size());
		
		if (list.size()>0)
		{
			author = (Author) list.get(0);
		}
		else 
			return null;
		
		return author;
	}
	
	private void TestAuthor() {
		
		Author author = GetAuthor("CoolBeans");
		
		System.out.println(" Author = " + author.getUserFk());
	
	}

	public Movie GetMovie(String movieSBN)
	{
		MovieDAOService mds = new MovieDAOService();
		
		MovieDAODelegate mdd = mds.getMovieDAOPort();
		
		Movie movie = new Movie();
		movie.setMovieSbnNumber(movieSBN);
		
		List list = mdd.findByExample(movie);
		System.out.println("Movie List Size = " + list.size());
		
		if (list.size()>0)
		{
			movie = (Movie)list.get(0);
		}
		else 
			return null;
		
		return movie;
	}
	
	private void TestMovie() {
	
		Movie movie = GetMovie(DEFAULT_MOVIE_SBN);
		System.out.println("Movie = " + movie.getMovieId() + " - "+ movie.getMovieName() );

	}
	
	public Language GetLanguage(String languageName)
	{
		LanguageDAOService lds = new LanguageDAOService();
		
		LanguageDAODelegate ldd = lds.getLanguageDAOPort();
		
		Language language = new Language();
		language.setLanguageName(languageName);

		List list = ldd.findByExample(language);
		System.out.println("Language List Size = " + list.size());
		
		if (list.size()>0)
		{
			language = (Language)list.get(0);
		}
		else 
			return null;

		return language;
	}

	private void TestLanguage() {
		Language language = GetLanguage(DEFAULT_LANGUAGE);
		System.out.println("Language = " + language.getLanguageId() + " - "+ language.getLanguageName());
		
	}

	List GetDescriptions(int movieID, int languageID, int authorID)
	{

		DescriptionDAOService dds = new DescriptionDAOService();
		
		DescriptionDAODelegate ddd = dds.getDescriptionDAOPort();
		
		Description description = new Description();
		description.setMovieFk(movieID);
		if (languageID!=0)
		{
			description.setDescriptionLanguageFk(languageID);
		}
		
		if (authorID!=0)
		{
			description.setAuthorFk(authorID);
		}
				
		List list = ddd.findByExample(description);
		
		System.out.println("Description List Size = " + list.size());

		return list;

	}
	
	private void TestDescriptions() {
		
		List list =  GetDescriptions(GetMovie(DEFAULT_MOVIE_SBN).getMovieId(), GetLanguage(DEFAULT_LANGUAGE).getLanguageId(), GetAuthor(DEFAULT_USER).getAuthorId());
		System.out.println("Description List = " + list.size());
	
	}
	
	public Path GetPath(int pathID)
	{
		PathDAOService pds = new PathDAOService();
		
		PathDAODelegate pdd = pds.getPathDAOPort();
		Path path = new Path();
		
		path = pdd.findById(pathID);
		
		return path;
		
	}
	
	private void TestPath()
	{
		Path path = GetPath(12);
		System.out.println("Path  " + path.getIdKey() + " = " + path.getPathPrefix());
	}
	
	Description GetDescription(int descriptionID)
	{
		DescriptionDAOService dds = new DescriptionDAOService();
		
		DescriptionDAODelegate ddd = dds.getDescriptionDAOPort();
		
		return ddd.findById(descriptionID);
	}
	
	private void TestDescription()
	{
		Description description = GetDescription(DEFAULT_DESCRIPTION_ID);
		System.out.println("Description  " + description.getDescriptionId() + " = " + description.getDescriptionStartTimeInt() + ":" + description.getDescriptionStartFrame());
	}
	
	Rating GetRating(int ratingID)
	{
		RatingDAOService rds = new RatingDAOService();
		
		RatingDAODelegate rdd = rds.getRatingDAOPort();
		
		return rdd.findById(ratingID);
	}
	
	public Rating AddRating(int movieID, int userID, int languageID, int descriptionID, int ratingValue)
	{
		Rating rating = new Rating();
		rating.setRatingMovieFk(movieID);
		rating.setRatingUserFk(userID);
		rating.setDescriptionFk(descriptionID);
		rating.setRating(ratingValue);
		rating.setRatingLanguageFk(languageID);

		RatingDAOService rds = new RatingDAOService();
		
		RatingDAODelegate rdd = rds.getRatingDAOPort();
		
		rdd.save(rating);
		
		List list = rdd.findByExample(rating);
		if (list.size()>0)
		{
			System.out.println("Rating list size = " + list.size());
			rating = (Rating)list.get(list.size()-1);
		}
		else
			return null;
		return rating;
		
	}

	private void TestRating()
	{
		Rating rating = GetRating(DEFAULT_RATING_ID_5);
		System.out.println("Rating  " + rating.getRatingId() + " = " + rating.getRatingMovieFk() + ":" + rating.getRatingUserFk() +":" + rating.getRatingLanguageFk() + " : " + rating.getRating());
		rating = GetRating(DEFAULT_RATING_ID_6);
		System.out.println("Rating  " + rating.getRatingId() + " = " + rating.getRatingMovieFk() + ":" + rating.getRatingUserFk() +":" + rating.getRatingLanguageFk() + " : " + rating.getRating());
		
		rating = AddRating(GetMovie(DEFAULT_MOVIE_SBN).getMovieId(), GetUser(DEFAULT_USER).getUserId(), GetLanguage(DEFAULT_LANGUAGE).getLanguageId(), GetDescription(DEFAULT_DESCRIPTION_ID).getDescriptionId(), 4);
		System.out.println("Rating  " + rating.getRatingId() + " = " + rating.getRatingMovieFk() + ":" + rating.getRatingUserFk() +":" + rating.getRatingLanguageFk()  + " : " + rating.getRating());
		
	}

}
