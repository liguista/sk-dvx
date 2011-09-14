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

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.ski.dvx.app.dialogs.DVDStates;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.User;

import de.humatic.dsj.DSDvd;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_Base_Class.
 *
 * @author Greg
 */
public class DVX_Base_Class implements java.beans.PropertyChangeListener {

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */

	/** The dvd. */
	DSDvd dvd;

	/** The base time. */
	int baseTime = 0;
	
	/** The chapter. */
	int chapter = 0;
	
	/** The verbose. */
	boolean verbose = false;
	
	/** The last dv d_ id. */
	String lastDVD_ID = ""; 

	/** The dvx record button. */
	DVX_RecordButton dvxRecordButton = null;
	
	/** The dvx file support. */
	DVX_File_Support dvxFileSupport = null;
	
	/** The dvx db support. */
	DVX_DB_Support dvxDBSupport = null;
	
	/** The dvx speak. */
	DVX_Speak dvxSpeak = null;
	
	/** The language. */
	Language language = null;
	
	/** The movie. */
	Movie movie = null;
	
	/** The splash. */
	DVX_Splash splash = null;

	/** The user. */
	User user = null;
	
	/** The author. */
	Author author = null;
//	private Language language = null;
	
	/** The movie info. */
String movieInfo;

	/** The main dvx frame. */
	javax.swing.JFrame mainDVXFrame = null;
	
	/** The dvd states. */
	DVDStates dvdStates;


	/**
	 * Gets the main dvx frame.
	 *
	 * @return the main dvx frame
	 */
	public javax.swing.JFrame getMainDVXFrame() {
		return mainDVXFrame;
	}

	/**
	 * Sets the main dvx frame.
	 *
	 * @param mainDVXFrame the new main dvx frame
	 */
	public void setMainDVXFrame(javax.swing.JFrame mainDVXFrame) {
		this.mainDVXFrame = mainDVXFrame;
	}

	/**
	 * Gets the dvx record button.
	 *
	 * @return the dvx record button
	 */
	public DVX_RecordButton getDvxRecordButton() {
		return dvxRecordButton;
	}

	/**
	 * Sets the dvx record button.
	 *
	 * @param dvxRecordButton the new dvx record button
	 */
	public void setDvxRecordButton(DVX_RecordButton dvxRecordButton) {
		this.dvxRecordButton = dvxRecordButton;
	}

	/**
	 * Gets the dvx file support.
	 *
	 * @return the dvx file support
	 */
	public DVX_File_Support getDvxFileSupport() {
		return dvxFileSupport;
	}

	/**
	 * Sets the dvx file support.
	 *
	 * @param dvxFileSupport the new dvx file support
	 */
	public void setDvxFileSupport(DVX_File_Support dvxFileSupport) {
		this.dvxFileSupport = dvxFileSupport;
	}

	/**
	 * Gets the dvx db support.
	 *
	 * @return the dvx db support
	 */
	public DVX_DB_Support getDvxDBSupport() {
		return dvxDBSupport;
	}

	/**
	 * Sets the dvx db support.
	 *
	 * @param dvxDBSupport the new dvx db support
	 */
	public void setDvxDBSupport(DVX_DB_Support dvxDBSupport) {
		this.dvxDBSupport = dvxDBSupport;
	}

	/**
	 * Gets the dvx speak.
	 *
	 * @return the dvx speak
	 */
	public DVX_Speak getDvxSpeak() {
		return dvxSpeak;
	}

	/**
	 * Sets the dvx speak.
	 *
	 * @param dvxSpeak the new dvx speak
	 */
	public void setDvxSpeak(DVX_Speak dvxSpeak) {
		this.dvxSpeak = dvxSpeak;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the new language
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}

	/**
	 * Gets the movie.
	 *
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * Sets the movie.
	 *
	 * @param movie the new movie
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * Gets the splash.
	 *
	 * @return the splash
	 */
	public DVX_Splash getSplash() {
		return splash;
	}

	/**
	 * Sets the splash.
	 *
	 * @param splash the new splash
	 */
	public void setSplash(DVX_Splash splash) {
		this.splash = splash;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * Gets the dvd.
	 *
	 * @return the dvd
	 */
	public DSDvd getDvd() {
		return dvd;
	}

	/**
	 * Sets the dvd.
	 *
	 * @param dvd the new dvd
	 */
	public void setDvd(DSDvd dvd) {
		this.dvd = dvd;
	}

	/**
	 * Gets the base time.
	 *
	 * @return the base time
	 */
	public int getBaseTime() {
		return baseTime;
	}

	/**
	 * Sets the base time.
	 *
	 * @param baseTime the new base time
	 */
	public void setBaseTime(int baseTime) {
		this.baseTime = baseTime;
	}

	/**
	 * Gets the chapter.
	 *
	 * @return the chapter
	 */
	public int getChapter() {
		return chapter;
	}

	/**
	 * Sets the chapter.
	 *
	 * @param chapter the new chapter
	 */
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	/**
	 * Checks if is verbose.
	 *
	 * @return true, if is verbose
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * Sets the verbose.
	 *
	 * @param verbose the new verbose
	 */
	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	/**
	 * Gets the last dv d_ id.
	 *
	 * @return the last dv d_ id
	 */
	public String getLastDVD_ID() {
		return lastDVD_ID;
	}

	/**
	 * Sets the last dv d_ id.
	 *
	 * @param lastDVD_ID the new last dv d_ id
	 */
	public void setLastDVD_ID(String lastDVD_ID) {
		this.lastDVD_ID = lastDVD_ID;
	}

	/**
	 * Gets the movie info.
	 *
	 * @return the movie info
	 */
	public String getMovieInfo() {
		return movieInfo;
	}

	/**
	 * Sets the movie info.
	 *
	 * @param movieInfo the new movie info
	 */
	public void setMovieInfo(String movieInfo) {
		this.movieInfo = movieInfo;
	}

	/** The log4 j logger. */
	Logger  log4JLogger;
	
	/**
	 * Gets the log4 jlogger.
	 *
	 * @return the log4 jlogger
	 */
	public Logger getLog4Jlogger() {
		return log4JLogger;
	}

	/**
	 * Sets the log4 jlogger.
	 *
	 * @param log4JLogger the new log4 jlogger
	 */
	public void setLog4Jlogger(Logger log4JLogger) {
		this.log4JLogger = log4JLogger;
	}


	/**
	 * Instantiates a new dV x_ base_ class.
	 */
	DVX_Base_Class()
	{
		super();
		try
		{
			File file = new File ("greg.log");
			if(file.exists())
			{
				file.delete();
			}
		}
		catch (Exception ex){
			
		}
		
		PropertyConfigurator.configure("log4j.properties"); //it likes it here
		log4JLogger = Logger.getLogger(this.getClass());
	}
	
	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Num2 string fmt.
	 *
	 * @param number the number
	 * @return the string
	 */
	String num2StringFmt(int number)
	{
		if (number<10)
			return "0" + Integer.toString(number);
		return Integer.toString(number);
		
	}
	
	/**
	 * Num to bool.
	 *
	 * @param num the num
	 * @return the string
	 */
	String numToBool(int num)
	{
		String result = "";
		
		int mask = 0x1000000;
		
		while (mask>0)
		{
			int temp = num & mask;
			
			if (temp!=0)
				result += "1\t";
			else
				result += "0\t";
			mask = mask>>1;
		}
		return result;
	}
	
	/**
	 * Gets the ops headers.
	 *
	 * @return the ops headers
	 */
	static String getOpsHeaders()
	{
/*		String result = "";
		
		result += "UOP_Play_Backwards" +   "\t"  +     DSDvd.UOP_Play_Backwards + "\t"+ "\r";

		result += "UOP_Play_Chapter" +   "\t"  +     DSDvd.UOP_Play_Chapter + "\t"+ "\r";
		          
		result += "UOP_Play_Chapter_Or_AtTime" +   "\t"  +     DSDvd.UOP_Play_Chapter_Or_AtTime + "\t"+ "\r";
		          
		result += "UOP_Play_Forwards" +   "\t"  +     DSDvd.UOP_Play_Forwards + "\t"+ "\r";
		          
		result += "UOP_Play_Title" +   "\t"  +     DSDvd.UOP_Play_Title + "\t"+ "\r";
		          
		result += "UOP_Play_Title_Or_AtTime" +   "\t"  +     DSDvd.UOP_Play_Title_Or_AtTime + "\t"+ "\r";
		          
		result += "UOP_PlayNext_Chapter" +   "\t"  +     DSDvd.UOP_PlayNext_Chapter + "\t"+ "\r";
		          
		result += "UOP_PlayPrev_Or_Replay_Chapter" +   "\t"  +     DSDvd.UOP_PlayPrev_Or_Replay_Chapter + "\t"+ "\r";
		          
		result += "UOP_Resume" +   "\t"  +     DSDvd.UOP_Resume + "\t"+ "\r";
		          
		result += "UOP_ReturnFromSubMenu" +   "\t"  +     DSDvd.UOP_ReturnFromSubMenu + "\t"+ "\r";
		          
		result += "UOP_Select_Angle" +   "\t"  +     DSDvd.UOP_Select_Angle + "\t"+ "\r";
		          
		result += "UOP_Select_Audio_Stream" +   "\t"  +     DSDvd.UOP_Select_Audio_Stream + "\t"+ "\r";
		          
		result += "UOP_Select_Karaoke_Audio_Presentation_Mode" +   "\t"  +     DSDvd.UOP_Select_Karaoke_Audio_Presentation_Mode + "\t"+ "\r";
		          
		result += "UOP_Select_Or_Activate_Button" +   "\t"  +     DSDvd.UOP_Select_Or_Activate_Button + "\t"+ "\r";
		          
		result += "UOP_Select_SubPic_Stream" +   "\t"  +     DSDvd.UOP_Select_SubPic_Stream + "\t"+ "\r";
		          
		result += "UOP_Select_Video_Mode_Preference" +   "\t"  +     DSDvd.UOP_Select_Video_Mode_Preference + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Angle" +   "\t"  +     DSDvd.UOP_ShowMenu_Angle + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Audio" +   "\t"  +     DSDvd.UOP_ShowMenu_Audio + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Chapter" +   "\t"  +     DSDvd.UOP_ShowMenu_Chapter + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Root" +   "\t"  +     DSDvd.UOP_ShowMenu_Root + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_SubPic" +   "\t"  +     DSDvd.UOP_ShowMenu_SubPic + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Title" +   "\t"  +     DSDvd.UOP_ShowMenu_Title + "\t"+ "\r";
		          
		result += "UOP_Still_Off" +   "\t"  +     DSDvd.UOP_Still_Off + "\t"+ "\r";
		          
		result += "UOP_Stop" +   "\t"  +     DSDvd.UOP_Stop + "\t"+ "\r";		
		return result; */
		
		return "\t\t\t\tSelect_Video_Mode_Preference	" + 
		"Select_Karaoke_Audio_Presentation_Mode	Select_Angle	" + 
		"Select_SubPic_Stream	" + 
		"Select_Audio_Stream	" + 
		"Still_Off	" + 
		"Select_Or_Activate_Button	" + 
		"Resume	" + 
		"ShowMenu_Chapter	" + 
		"ShowMenu_Angle	" + 
		"ShowMenu_Audio	" + 
		"ShowMenu_SubPic	" + 
		"ShowMenu_Root	" + 
		"ShowMenu_Title	" + 
		"Play_Backwards	" + 
		"Play_Forwards	" + 
		"PlayNext_Chapter	" + 
		"PlayPrev_Or_Replay_Chapter	" + 
		"Play_Chapter_Or_AtTime	" + 
		"ReturnFromSubMenu	" + 
		"Stop	" + 
		"Play_Title	" + 
		"Play_Chapter	" + 
		"Play_Title_Or_AtTime";
	}

    /**
     * Internet connection exists.
     *
     * @param URLName the uRL name
     * @return true, if successful
     */
	boolean menuTitleSeen = false;
	public boolean isMenuTitleSeen() {
		return menuTitleSeen;
	}

	public void setMenuTitleSeen(boolean menuTitleSeen) {
		this.menuTitleSeen = menuTitleSeen;
	}

	boolean isPlaying()
	{
		boolean result = true;
		if (!menuTitleSeen)
			if (bitIsSet(dvd.getUOPs(), (1<<20)))	//  i don't think this is correct
				menuTitleSeen = true;
			else
				result =false;	// can't be playing if not past initial menus.
		
		result = !bitIsSet(dvd.getUOPs(), (1<<7));
//		System.out.println("isPlaying " + result);
		return result;
	}
	
	boolean bitIsSet(int target, int mask)
	{
		int temp = target & mask;
//		System.out.println("Target = " + target + " mask " + mask + " " + temp);
		if (temp!=0)
			return true;
		return false;
	}
 }
