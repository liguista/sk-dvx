/**
 * 
 */
package org.ski.dvx.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.ski.dvx.app.DVX_DB_Support;
import org.ski.dvx.app.DVX_Player;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.Path;
import org.ski.dvx.hibernate.User;

/**
 * @author Greg
 *
 */
public class DVX_DB_SupportTest {

	DVX_DB_Support dvx_dv_support ;
	
	DVX_Player dvx_Player = null;
	
	String movieID = "12341234";
	String moviePath = "abc123";
	
	String AUTHOR_ID_1 = "CoolKat";
	String AUTHOR_ID_2 = "CoolBeans";
	String AUTHOR_ID_3 = "CoolWeather";
	String AUTHOR_ID_4 = "CoolWeather";
	String AUTHOR_ID_ALL = "All";
	
	String LANGUAGE_ENGLISH = "English";
	String LANGUAGE_JAPANESE = "Japanese";
	String LANGUAGE_SPANISH = "Spanish";
	String LANGUAGE_ALL = "All";
	
	int EVENT_1 = 1000;
	int EVENT_2 = 2000;
	int EVENT_3 = 3000;
	
	int CHAPTER_1 = 1;
	int CHAPTER_2 = 2;
	int CHAPTER_3 = 3;
	
	int FRAME_OFFSET_0 = 0;
	int FRAME_OFFSET_8 = 8;
	int FRAME_OFFSET_12 = 12;
		
	/**
	 * @throws java.lang.Exception
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
	 * @throws java.lang.Exception
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
	public void testAddDeleteUserAuthor()
	{
		User user = dvx_dv_support.getInsertUser(AUTHOR_ID_1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user);
		assertEquals("Goody...",1,1);
		
	}
	// @Test
	public void testAddDeletePathMovie()
	{
//		User user = dvx_dv_support.getInsertUser(authorID1);
//		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( movieID, moviePath);
		dvx_dv_support.deleteMovie(movie);
		assertEquals("Goody...",1,1);
		
	}
	
	@Test
	public void testAddDeleteEvents()
	{
		System.out.println("testAddDeleteEvents() creating authors" );
		User user = dvx_dv_support.getInsertUser(AUTHOR_ID_1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( movieID, moviePath);
		Language language = dvx_dv_support.getLanguage(LANGUAGE_ENGLISH);
//		Path path = new Path();
//		path.setPathPrefix(moviePath);
		Path path = dvx_dv_support.getInsertPath(author, moviePath);

		System.out.println("testAddDeleteEvents() creating descriptions");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0, path, "filename 1");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0, path, "filename 2");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0, path, "filename 3");
		
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
				
		result = dvx_dv_support.checkTimeEvent(authorAll, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		result = dvx_dv_support.checkTimeEvent(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);

		

		System.out.println("testAddDeleteEvents() deleting descriptions");
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);
		
		System.out.println("testAddDeleteEvents() deleting Authors");
//		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deletePath(path);
		
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user); 
		System.out.println("testAddDeleteEvents() Completed");
		assertEquals("Goody...",1,1);
		
	}
	
	/**
	 * @param movie 
	 * @param language 
	 * @param author 
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

	void doIt()
	{
		testAddDeleteEvents();
	}

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
