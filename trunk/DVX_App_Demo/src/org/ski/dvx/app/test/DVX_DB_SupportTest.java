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
	
	String authorID1 = "CoolKat";
	String authorID2 = "CoolBeans";
	String authorID3 = "CoolWeather";
	
	String languageID1 = "English";
	String languageID2 = "Japanese";
	String languageID3 = "Spanish";
	
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
	public void testCheckTimeEvent() {
		fail("Not yet implemented");
//		User user = dvx_dv_support.getInsertUser(authorID);
		
		Author author1 	= dvx_dv_support.getInsertAuthor(authorID1);
		Author author2 	= dvx_dv_support.getInsertAuthor(authorID2);
		Author author3 	= dvx_dv_support.getInsertAuthor(authorID3);
		
		Movie movie 	= dvx_dv_support.getInsertMovieHash(moviePath, movieID);
		
		Language language1 = dvx_dv_support.getLanguage(languageID1);
		Language language2 = dvx_dv_support.getLanguage(languageID1);
		Language language3 = dvx_dv_support.getLanguage(languageID1);
		
	}

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
		User user = dvx_dv_support.getInsertUser(authorID1);
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
		User user = dvx_dv_support.getInsertUser(authorID1);
		Author author 	= dvx_dv_support.getInsertAuthor(user);
		Movie movie = dvx_dv_support.getInsertMovieHash( movieID, moviePath);
		Language language = dvx_dv_support.getLanguage(languageID1);
		Path path = new Path();
		path.setPathPrefix(moviePath);
		
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0, path, "filename 1");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0, path, "filename 2");
		dvx_dv_support.insertUpdateTimeClip(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0, path, "filename 3");

		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_1, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_2, FRAME_OFFSET_0);
		dvx_dv_support.deleteDescription(author, language, movie, CHAPTER_1, EVENT_3, FRAME_OFFSET_0);
		
		dvx_dv_support.deleteMovie(movie);
		dvx_dv_support.deleteAuthor(author);
		dvx_dv_support.deleteUser(user);
		assertEquals("Goody...",1,1);
		
	}

}
