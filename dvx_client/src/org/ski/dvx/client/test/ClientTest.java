package org.ski.dvx.client.test;

import java.util.Iterator;
import java.util.List;

import org.ski.dvx.client.hibernate.author.Author;
import org.ski.dvx.client.hibernate.author.AuthorDAODelegate;
import org.ski.dvx.client.hibernate.author.AuthorDAOService;
import org.ski.dvx.client.hibernate.language.Language;
import org.ski.dvx.client.hibernate.language.LanguageDAODelegate;
import org.ski.dvx.client.hibernate.language.LanguageDAOService;
import org.ski.dvx.client.hibernate.movie.Movie;
import org.ski.dvx.client.hibernate.movie.MovieDAODelegate;
import org.ski.dvx.client.hibernate.movie.MovieDAOService;
import org.ski.dvx.client.hibernate.user.User;
import org.ski.dvx.client.hibernate.user.UserDAODelegate;
import org.ski.dvx.client.hibernate.user.UserDAOService;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientTest ct = new ClientTest();
		ct.doIt();

	}

	private void doIt() {
		// TODO Auto-generated method stub
		
		TestUser();
		TestAuthor();
		TestMovie();
		TestLanguage();
	}

	private void TestUser() {
		// TODO Auto-generated method stub
		UserDAOService uds = new UserDAOService();
		
		UserDAODelegate udd = uds.getUserDAOPort();
		
		List list = udd.findAll();
		
		System.out.println("User List Size = " + list.size());
		
		Iterator it = list.iterator();
		int count = 0;
		while(it.hasNext())
		{
			count++;
			User user = (User)it.next();
			System.out.println(count + " = " + user.getUserHandle() + " - " + user.getUserEmail());
		}
		
		User user = new User();
		user.setUserHandle("Greg");
		
		list = udd.findByExample(user);

		 it = list.iterator();
		count = 0;
		while(it.hasNext())
		{
			count++;
			User user1 = (User)it.next();
			System.out.println(count + " = " + user1.getUserHandle() + " - " + user1.getUserEmail());
		}

	}
	
	private void TestAuthor() {
		
		AuthorDAOService ads = new AuthorDAOService();
		
		AuthorDAODelegate add = ads.getAuthorDAOPort();
		
		UserDAOService uds = new UserDAOService();
		
		UserDAODelegate udd = uds.getUserDAOPort();	
		
		User user = new User();
		user.setUserHandle("CoolBeans");
		List list = udd.findByExample(user);
		if (list.size()>0)
		{
			user = (User)list.get(0);
		}
		
		Author author = new Author();
		author.setUserFk(user.getUserId());

		list = add.findByExample(author);
		
		if (list.size()>0)
		{
			author = (Author) list.get(0);
		}
		
		System.out.println("Greg Author Key = " + author.getUserFk());
	
	}

	private void TestMovie() {
	
		MovieDAOService mds = new MovieDAOService();
		
		MovieDAODelegate mdd = mds.getMovieDAOPort();
		
		Movie movie = new Movie();
		movie.setMovieSbnNumber("e7cf6917");
		
		List list = mdd.findByExample(movie);
		
		if (list.size()>0)
		{
			movie = (Movie)list.get(0);
		}
		
		System.out.println("Movie = " + movie.getMovieId() + " - "+ movie.getMovieName() );
		
		

	}

	private void TestLanguage() {
		LanguageDAOService lds = new LanguageDAOService();
		
		LanguageDAODelegate ldd = lds.getLanguageDAOPort();
		
		Language language = new Language();
		language.setLanguageName("English");

		List list = ldd.findByExample(language);
		if (list.size()>0)
		{
			language = (Language)list.get(0);
		}

		System.out.println("Language = " + language.getLanguageId() + " - "+ language.getLanguageName());
		
	}

}
