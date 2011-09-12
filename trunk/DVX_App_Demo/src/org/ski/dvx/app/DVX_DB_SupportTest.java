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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.MovieMenu;
import org.ski.dvx.hibernate.Path;
import org.ski.dvx.hibernate.User;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_DB_SupportTest.
 *
 * @author Greg
 */
public class DVX_DB_SupportTest {

	/** The dvx_dv_support. */
	DVX_DB_Support dvx_dv_support ;
	
	/** The dvx_ player. */
	DVX_Player dvx_Player = null;
	
	/** The movie id. */
	String MOVIE_ID = "12341234";
	
	/** The movie path. */
	String MOVIE_PATH = "abc123";
	
	/** The AUTHO r_ i d_1. */
	String AUTHOR_ID_1 = "CoolKat";
	
	/** The AUTHO r_ i d_2. */
	String AUTHOR_ID_2 = "CoolBeans";
	
	/** The AUTHO r_ i d_3. */
	String AUTHOR_ID_3 = "CoolWeather";
	
	/** The AUTHO r_ i d_4. */
	String AUTHOR_ID_4 = "CoolWeather";
	
	/** The AUTHO r_ i d_ all. */
	String AUTHOR_ID_ALL = "All";
	
	/** The LANGUAG e_ english. */
	String LANGUAGE_ENGLISH = "English";
	
	/** The LANGUAG e_ japanese. */
	String LANGUAGE_JAPANESE = "Japanese";
	
	/** The LANGUAG e_ spanish. */
	String LANGUAGE_SPANISH = "Spanish";
	
	/** The LANGUAG e_ all. */
	String LANGUAGE_ALL = "All";
	
	/** The EVEN t_1. */
	int EVENT_1 = 1000;
	
	/** The EVEN t_2. */
	int EVENT_2 = 2000;
	
	/** The EVEN t_3. */
	int EVENT_3 = 3000;
	
	/** The CHAPTE r_1. */
	int CHAPTER_1 = 1;
	
	/** The CHAPTE r_2. */
	int CHAPTER_2 = 2;
	
	/** The CHAPTE r_3. */
	int CHAPTER_3 = 3;
	
	/** The FRAM e_ offse t_0. */
	int FRAME_OFFSET_0 = 0;
	
	/** The FRAM e_ offse t_8. */
	int FRAME_OFFSET_8 = 8;
	
	/** The FRAM e_ offse t_12. */
	int FRAME_OFFSET_12 = 12;
		
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp...");
//		if (dvx_Player==null)
		{
			dvx_Player = new DVX_Player();
			dvx_dv_support = new DVX_DB_Support(dvx_Player, "Greg");
		}
		
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown...");
	}

	/**
	 * Test method for {@link org.ski.dvx.app.DVX_DB_Support#checkTimeEvent(org.ski.dvx.hibernate.Movie, org.ski.dvx.hibernate.Author, org.ski.dvx.hibernate.Language, int, int, int)}.
	 */
	//@Test
	
	/*
	public void testCheckTimeEvent() {
		fail("Not yet implemented");
//		User user = dvx_dv_support.getInsertUser(authorID);
		
		Author author1 	= dvx_dv_support.getInsertAuthor(AUTHOR_ID_1);
		Author author2 	= dvx_dv_support.getInsertAuthor(AUTHOR_ID_2);
		Author author3 	= dvx_dv_support.getInsertAuthor(AUTHOR_ID_3);
		
		Movie movie 	= dvx_dv_support.getInsertMovieHash(moviePath, movieID);
		
		Language language1 = dvx_dv_support.getLanguage(languageID1);
		Language language2 = dvx_dv_support.getLanguage(languageID1);
		Language language3 = dvx_dv_support.getLanguage(languageID1);
		
	} */

	/**
	 * Test method for {@link org.ski.dvx.app.DVX_DB_Support#insertUpdateTimeClip(org.ski.dvx.hibernate.Author, org.ski.dvx.hibernate.Language, org.ski.dvx.hibernate.Movie, int, int, int, org.ski.dvx.hibernate.Path, java.lang.String)}.
	 */
	//@Test
	public void testInsertUpdateTimeClip() {
		fail("Not yet implemented");
	}
	
	// @Test
	/**
	 * Test add delete user author.
	 */
	public void testAddDeleteUserAuthor()
	{
		User user = dvx_dv_support.getInsertUser(AUTHOR_ID_1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user);
		assertEquals("Goody...",1,1);
		
	}
	// @Test
	/**
	 * Test add delete path movie.
	 */
	public void testAddDeletePathMovie()
	{
//		User user = dvx_dv_support.getInsertUser(authorID1);
//		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( MOVIE_ID, MOVIE_PATH);
		dvx_dv_support.deleteMovie(movie);
		assertEquals("Goody...",1,1);
		
	}
	
	/**
	 * Test add delete events.
	 */
	@Test
	public void testAddDeleteDescriptions()
	{
		System.out.println("testAddDeleteEvents() creating Movie, Path, Authors & User" );
		User user = dvx_dv_support.getInsertUser(AUTHOR_ID_1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( MOVIE_ID, MOVIE_PATH);
		Language language = dvx_dv_support.getLanguage(LANGUAGE_ENGLISH);
//		Path path = new Path();
//		path.setPathPrefix(moviePath);
		Path path = dvx_dv_support.getInsertPath(author, MOVIE_PATH);

		System.out.println("testAddDeleteEvents() creating descriptions");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0, path, "filename 1");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0, path, "filename 2");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0, path, "filename 3");

		// validate replacement works...
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0, path, "filename 1");
//		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0, path, "filename 1");

//		lookForEvents(author, language, movie);
		
		// existant events
		boolean result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);
		
		// non-existant events
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 100, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 200, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 300, FRAME_OFFSET_0);

		// 
		// validate authors...
		Author authorAll = dvx_dv_support.getInsertAuthor(AUTHOR_ID_ALL);
		Author author2 = dvx_dv_support.getInsertAuthor(AUTHOR_ID_2);
		
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(authorAll, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author2, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		
		// Validate languages
		Language languageAll = dvx_dv_support.getLanguage(LANGUAGE_ALL);
		Language languageSpanish = dvx_dv_support.getLanguage(LANGUAGE_SPANISH);
		
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, languageAll, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, languageSpanish, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
				
//		result = dvx_dv_support.checkTimeEvent(authorAll, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
//		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);

		System.out.println("testAddDeleteEvents() deleting descriptions");
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);
		
		System.out.println("testAddDeleteEvents() deleting Movie, Path, Authors & User");
//		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deletePath(path);
		
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user); 
		System.out.println("testAddDeleteEvents() Completed");
		assertEquals("Goody...",1,1);
		
	}
	
	/**
	 * Do it.
	 *
	 */
/*
 * private void lookForEvents(Author author, Language language, Movie movie) {
 
		// TODO Auto-generated method stub
		
		boolean result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);
		
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 100, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 200, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, 300, FRAME_OFFSET_0);
		
		
	}*/
	
	@Test
	public void testAddDeleteMenus()
	{

		System.out.println("testAddDeleteEvents() creating Movie, Path, Authors & User" );
		User user = dvx_dv_support.getInsertUser(AUTHOR_ID_1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( MOVIE_ID, MOVIE_PATH);
		Language language = dvx_dv_support.getLanguage(LANGUAGE_ENGLISH);
		Path path = dvx_dv_support.getInsertPath(author, MOVIE_PATH);
// make one...		
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 1, path, "filename 1");
// update one...
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 1, path, "filename 1");
// update it again
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 1, path, "filename 1");
// create some more
		
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 2, path, "filename 2");
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 3, path, "filename 3");
		dvx_dv_support.insertUpdateMovieMenu(author, language, movie, 1, 4, path, "filename 4");
		
// try an get the normal ones...
		
		MovieMenu 	movieMenu = dvx_dv_support.getMovieMenu(author, language, movie, 1, 1);
		movieMenu = dvx_dv_support.getMovieMenu(author, language, movie, 1, 2);
		movieMenu = dvx_dv_support.getMovieMenu(author, language, movie, 1, 3);
		movieMenu= dvx_dv_support.getMovieMenu(author, language, movie, 1, 4);

		Author authorAll = dvx_dv_support.getInsertAuthor(AUTHOR_ID_ALL);
		Author author2 = dvx_dv_support.getInsertAuthor(AUTHOR_ID_2);
		
		// good		
		
		movieMenu= dvx_dv_support.getMovieMenu(authorAll, language, movie, 1, 1);
		System.out.println(movieMenu.getMenuUri());
		
		// bad
		
		movieMenu= dvx_dv_support.getMovieMenu(author2, language, movie, 1, 1);
		
		Language languageAll = dvx_dv_support.getLanguage(LANGUAGE_ALL);
		Language languageSpanish = dvx_dv_support.getLanguage(LANGUAGE_SPANISH);

		
		// good		
		
		movieMenu= dvx_dv_support.getMovieMenu(author, languageAll, movie, 1, 1);
		
		// bad
		
		movieMenu= dvx_dv_support.getMovieMenu(author, languageSpanish, movie, 1, 1);
		
// unwind movies added for test....
		System.out.println("testAddDeleteEvents() deleting menu items...");
		
		dvx_dv_support.deleteMovieMenus(dvx_dv_support.getMovieMenu(author, language, movie, 1, 1));
		dvx_dv_support.deleteMovieMenus(dvx_dv_support.getMovieMenu(author, language, movie, 1, 2));
		dvx_dv_support.deleteMovieMenus(dvx_dv_support.getMovieMenu(author, language, movie, 1, 3));
		dvx_dv_support.deleteMovieMenus(dvx_dv_support.getMovieMenu(author, language, movie, 1, 4));
		
		System.out.println("testAddDeleteEvents() deleting Movie, Path, Authors & User");
//		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deletePath(path);
		
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user); 
		System.out.println("testAddDeleteEvents() Completed");
		assertEquals("Goody...",1,1);

	}


	void doIt()
	{
		// testAddDeleteDescriptions();
		testAddDeleteMenus();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DVX_DB_SupportTest test = new DVX_DB_SupportTest();
		try {
			test.setUp();
			test.doIt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
