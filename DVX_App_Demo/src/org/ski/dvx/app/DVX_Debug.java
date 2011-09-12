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

/**
 * 
 */
package org.ski.dvx.app;

import org.apache.log4j.Logger;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Description;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.Path;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_Debug.
 *
 * @author Greg
 */
public class DVX_Debug extends DVX_Player{

	/** The dvx player logger. */
	static Logger dvxPlayerLogger;	
	
	
	
	/**
	 * Instantiates a new dV x_ debug.
	 */
	DVX_Debug()
	{
		super();
	}

	/** The Constant THE_TIME. */
	static final int THE_TIME = 5 * 1000;
	
	/** The Constant THE_FRAME. */
	static final int THE_FRAME = 0;
	
	/** The Constant THE_CHAPTER. */
	static final int THE_CHAPTER = 2;
	
	/**
	 * Test it.
	 */
	void testIt()
	{
		
		dvxSpeak = new DVX_Speak();
		dvxDBSupport = new DVX_DB_Support(this, "Greg");
		language = dvxDBSupport.getLanguage("English");
//		dvxDBSupport.setDvx_speak(dvxSpeak);	
		
		
		dvxPlayerLogger = Logger.getLogger(this.getClass());
		getDvxSpeak().speak("Welcome to debug");
		
//		String result = DVX_DVD_Identification.getDVD_ID();
		String result = "12345678";
		
		movie = dvxDBSupport.getInsertMovieHash(	DVX_Constants.MOVIE_PATH + 
													result + 
													DVX_Constants.MOVIE_MENUS_PATH +
													DVX_Constants.MOVIE_NAME_MP3, result);

		String filePrefix = DVX_Constants.MOVIE_PATH + 
							getMovie().getMovieSbnNumber() + 
							DVX_Constants.MOVIE_DESCRIPTIONS_PATH;
		Path path = getDvxDBSupport().getInsertPath(getAuthor(), filePrefix);

		String filePath = 	
							filePrefix + 
							getMovie().getMovieSbnNumber() + 
							DVX_Constants.HYPHEN +
							getAuthor().getAuthorId() + 
							DVX_Constants.HYPHEN  + 
							getLanguage().getLanguageId() + 
							DVX_Constants.HYPHEN  + 
							THE_CHAPTER + 
							DVX_Constants.HYPHEN  + 
							THE_TIME + 
							DVX_Constants.HYPHEN  + 
							THE_FRAME + 
							DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV  
							;
//		setChapter(THE_CHAPTER);
//		dvxDBSupport.checkTimeEvent( movie,  author,  language, THE_CHAPTER, THE_TIME, THE_FRAME);

//		dvxDBSupport.insertUpdateTimeClip(author, language, movie, chapter, timeOffset, descriptionStartFrame, path, fileName)
		dvxDBSupport.insertUpdateTimeClip(author, language, movie, THE_CHAPTER,  THE_TIME, THE_FRAME, path,  "");
//		dvxDBSupport.insertUpdateMovieMenu(movie,  author,  language, chapter,  5 * 1000, path,  "");		
//		dvxDBSupport.checkTimeEvent( movie,  author,  language, THE_CHAPTER, THE_TIME, THE_FRAME);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DVX_Debug dvx_debug = new DVX_Debug();
		
		System.out.println("Starting test...");
		dvx_debug.testIt();
		System.out.println("Ending test...");

	}

}
