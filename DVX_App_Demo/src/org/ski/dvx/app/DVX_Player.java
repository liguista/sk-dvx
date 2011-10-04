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


import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Timestamp;
// import java.io.StringWriter;

//import org.ski.dvx.hibernate.Movie;

import de.humatic.dsj.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Appender;
import org.apache.log4j.AsyncAppender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.ski.dvx.app.dialogs.DVDStates;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.MovieMenu;
import org.ski.dvx.hibernate.User;


/**
 * The Class DVX_Player.
 */
public class DVX_Player extends DVX_Player_Init {
	int lastChapter = -1;

	public DVX_Player() {
		// movie = dvdSupport.getMovie("A Beautiful Mind");
		super();
		dvxDBSupport = new DVX_DB_Support(this );
		setLanguage(dvxDBSupport.getLanguage(DVX_Constants.DVX_DEFAULT_LANGUAGE));
		
		setUser		(dvxDBSupport.getUser	( DVX_Constants.DVX_DEFAULT_AUTHOR ));
		setAuthor	(dvxDBSupport.getAuthor	( DVX_Constants.DVX_DEFAULT_USER ));
		
		setDvx_player(this);	// context for the menus... login ...
		

	}
	// *************************************************************************************************************************************
	// 
	// createGraph - This creates the magic !!!
	//
	// *************************************************************************************************************************************			

	// String movieIDString = "";

	// *************************************************************************************************************************************
	// 
	// propertyChange - This is the main dispatcher !!!
	//
	// *************************************************************************************************************************************			
	/* (non-Javadoc)
	 * @see org.ski.dvx.app.DVX_Menus#propertyChange(java.beans.PropertyChangeEvent)
	 */
	public void propertyChange(java.beans.PropertyChangeEvent pe) {
		
		try
		{

		switch (DSJUtils.getEventType(pe)) {

		case DSFiltergraph.GRAPH_EVENT:
		{
			/**
			 * With DVDs you will get a lot of EC_DVD_... type events. Please
			 * refer to MSDN documentation for their parameters' meaning. You
			 * should especially look for EC_DVD_ERROR events, as the dreaded
			 * "Copy protection error resulting from the combination of
			 * DVDNavigator, video decoder and graphics hardware occurred.
			 * Updating your graphics driver may help" (or the like), that you
			 * might know from WMP is signaled here.
			 **/

			if (verbose)
				System.out
						.print("Graph Event : " + DSJUtils.getEventValue_int(pe) + " - " + DSConstants.eventToString(DSJUtils.getEventValue_int(pe)));  //$NON-NLS-2$

			int[] ge = (int[]) (pe.getOldValue());

			for (int i = 1; i < ge.length; i++) {
				long v = ge[i];
				if (verbose)
					System.out
							.print("\t, param_" + i + " = " + ge[i] + "\t:\t"+Long.toString(v, 16) );  //$NON-NLS-2$
			}

			if (verbose)
				// if (ge.length>0)
				System.out.println("\t" + DVX_Messages.getString("PlayDVD.30")); 
			int ops = dvd.getUOPs();
			
			
			dvdStates.updateState(ops);
			
			int dvdDomain = dvd.getCurrentDomain();
			dvdStates.setDVDDomain(dvdDomain);
			
//			dvdStates.getjTextField7().setText(state);
			
			dvxPlayerLogger.warn("\t" + DSJUtils.getEventValue_int(pe) + "\t" + 
										DSConstants.eventToString(DSJUtils.getEventValue_int(pe)) +  "\t" + 
										ops+ "\t" + 
										Long.toString(ops, 16) + "\t\t" + 
										numToBool(ops));
//			System.out.println("Get Ops is - " + dvd.getUOPs() + " : " + Long.toString(dvd.getUOPs(), 16));
//			System.out.println("UOP_ShowMenu_Title is - " +(dvd.getUOPs() & DSDvd.UOP_ShowMenu_Title));
// *************************************************************************************************************************************
// 
// EC_DVD_VALID_UOPS_CHANGE
// NEW MOVIE IDENTIFIED !!!
//
// *************************************************************************************************************************************			

			if (DSJUtils.getEventValue_int(pe) == de.humatic.dsj.DSConstants.EC_DVD_VALID_UOPS_CHANGE) {
				// dvdSupport.playSound(menuFilePathPre +
				// "Global/Audio/Loading_DVD.wav");

				// if (33554431==ge[1])
				{
					String result = DVX_DVD_Identification.getDVD_ID();

					if (lastDVD_ID.equalsIgnoreCase(result)) // don't tell me
																// unless the ID
																// changes...
						return;
/*					DVX_Get_Movie_Name_Google.getMovieName(	DVX_Constants.MOVIE_PATH + 
							result + 
							DVX_Constants.MOVIE_MENUS_PATH +
							DVX_Constants.MOVIE_NAME_WAV,result); */

//					System.out.println("Was fbi = " + wasFBI);
					System.out.println("Disk Id = " + result);
					

					
					lastDVD_ID = result;
//					dvxDBSupport.playSound(DVX_Constants.DVD_Identified_WAV , true); 
					dvxSpeak.speak("DVD Identified.");
					
					

					System.out.println(DVX_Constants.ASTRIX_BAR); 
					System.out.println(DVX_Constants.DVD_ID + result); 
					
					Movie movieID = dvxDBSupport.getInsertMovieHash(result,
																	DVX_Constants.MOVIE_PATH + 
																	result + 
																	DVX_Constants.MOVIE_MENUS_PATH +
																	DVX_Constants.MOVIE_NAME_MP3
																	);
					if (movieID!=null)
					{
						movie = dvxDBSupport.getInsertMovieHash(result,
								DVX_Constants.MOVIE_PATH + 
								result + 
								DVX_Constants.MOVIE_MENUS_PATH +
								DVX_Constants.MOVIE_NAME_MP3
								);
						dvxDBSupport.log(	movie, 
											getUser(),  
											DVX_Constants.TRANSACTION_TYPE_LOGIN, 
											DVX_Constants.TRANSACTION_LEVEL_INFO, 
											"Movie identified : " + movie.getMovieName());
						
//						String movieNameString = movieID.getMovieName();
						System.out.println(movie);
						
						DVX_File_Support.DVX_File_Support(result); // validate DVD path...
	
						// Movie movieTemp = dvdSupport.getMovieHash(result);
						/*Movie movieTemp = new Movie();
						int realId = -1;
						if (movieID!=null)
							if (movieID.length()>0)
								realId = Integer.parseInt(movieID);
						movieTemp.setMovieId(realId);
						movieTemp.setMovieName(movieNameString);
						movieTemp.setMovieSbnNumber(result);
	*/
//						if (movieTemp != null)
//							movie = movieID;
						System.out.println(movie.getMovieName());
						System.out.println(DVX_Constants.ASTRIX_BAR); 
	
//						baseTime = dvd.getTime();
						
						// this needs work... it will pay all movie data...
					/*	DVX_Play_MP3.play(DVX_Constants.MOVIE_PATH + 
								movie.getMovieSbnNumber() + 
								DVX_Constants.MOVIE_MENUS_PATH +
								DVX_Constants.MOVIE_NAME_MP3); */
						if(new File(DVX_Constants.MOVIE_PATH + // is there a .wav file with the name
								movie.getMovieSbnNumber() + 
								DVX_Constants.MOVIE_MENUS_PATH +
								DVX_Constants.MOVIE_NAME_WAV).exists())	// recorded version...
						{
							DVX_PlaySound.playWav(	DVX_Constants.MOVIE_PATH + 
												movie.getMovieSbnNumber() + 
												DVX_Constants.MOVIE_MENUS_PATH +
												DVX_Constants.MOVIE_NAME_WAV, true); 
						}
						else	// default version from google
						if( new File(DVX_Constants.MOVIE_PATH + 
								movie.getMovieSbnNumber() + 
								DVX_Constants.MOVIE_MENUS_PATH +
								DVX_Constants.MOVIE_NAME_MP3).exists())	// is there an mp3 file...
						{
								DVX_PlaySound.playMP3(DVX_Constants.MOVIE_PATH + 
										movie.getMovieSbnNumber() + 
										DVX_Constants.MOVIE_MENUS_PATH +
										DVX_Constants.MOVIE_NAME_MP3);
						}
						else
						{
							dvxSpeak.speak("DVD Title lookup failed.");	// nope... speak the truth...
						}
						// dvd.play();
						// dvd.playChapter(5) ;
						setMovie(movie);
						
						setMenuMode();
						setMenuTitleSeen(false);
						
//						StringWriter sw = new StringWriter();
						ByteArrayOutputStream os = new ByteArrayOutputStream();
						PrintStream ps = new PrintStream(os);
						dvd.list(ps);
						System.out.println(os.toString());	// this should be put in the movie info and updated...
						dvd.list(System.err);
						movie.setMovieQuote(os.toString());  // should update the movie after this...
						setMovieInfo(os.toString());
//						dvxDBSupport.updateMovie(movie);
						
						dvdStates.getjTextFieldMovieID().setText(movie.getMovieSbnNumber());
						dvdStates.getjTextFieldMovieName().setText(movie.getMovieName());
						dvdStates.getjTextFieldDSJName().setText(dvd.getName());
						
					}

				}
			}
			
			if (de.humatic.dsj.DSConstants.EC_DVD_SUBPICTURE_STREAM_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				if (isVerbose())
					dvxSpeak.speak("DVD Sub Picture Stream Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_AUDIO_STREAM_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				if (isVerbose())
					dvxSpeak.speak("DVD Audio Stream Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_VALID_UOPS_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				if (isVerbose())
					dvxSpeak.speak("DVD Domain Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_VALID_UOPS_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				if (isVerbose())
					dvxSpeak.speak("DVD Operations Change" );
			}
	// *************************************************************************************************************************************
// 
// EC_DVD_CURRENT_TIME
//
// timecode is currently fudged because the library is goofy.
// timecode is really an offset of runtime from the chapter transitions
//
// WARNING - any seek to other than a chapter will do bad things...
//
// Known ISSUE - GCA
//
// *************************************************************************************************************************************			
			if (de.humatic.dsj.DSConstants.EC_DVD_CURRENT_TIME == DSJUtils.getEventValue_int(pe)  ) {
		/*		int[] ge1 = (int[]) (pe.getOldValue());
				if (movie!=null)
				{
	
					 System.out.println("Time event = " + Math.abs(ge[1]) + " - "
					 + Long.toString(Math.abs(ge[1]), 16));
	
					System.out
							.println(DVX_Messages.getString("PlayDVD.36") + chapter + DVX_Messages.getString("PlayDVD.37") + (dvd.getTime() - baseTime) / 1000);  //$NON-NLS-2$
					// System.out.println("Time event 3 = " + ge1[1] / 1000);
					// System.out.println("Time event 3 = " +
					// Integer.toString(ge1[1], 16));
					if (dvxRecordButton!=null)
						dvxRecordButton.setTimeOffset((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
					if (dvxDBSupport!=null)
						if (movie!=null)
						{
							dvxDBSupport.checkTimeEvent(getAuthor(), language, movie, chapter,
								((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
						}
					setPlayingMode();	// set the status for record to time mode...
					
					int theTime = ((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
					jTextMinutes.setText("" + theTime / 60);
					jTextSeconds.setText("" + theTime % 60);
					jTextFrame.setText("" + 0);
				}
*/
			}
// *************************************************************************************************************************************			
//
// EC_DVD_CURRENT_HMSF_TIME : Correct DVD time...
//
// *************************************************************************************************************************************			
			
			if (de.humatic.dsj.DSConstants.EC_DVD_CURRENT_HMSF_TIME == DSJUtils.getEventValue_int(pe)  ) {
				
				int[] ge1 = (int[]) (pe.getOldValue());
				
				int hours = ge1[1] & 0xff;
				int minutes = (ge1[1] & 0xff00 )/0x100;
				int remainder = ge1[1] / 0x10000;
				int seconds = remainder & 0xff;
				int frame = (remainder  & 0xff00 )/0x100;
				
				int  realTime = seconds + (minutes * DVX_Constants.SECONDS_PER_MINUTE) + (hours *DVX_Constants.SECONDS_PER_HOUR);
				if (dvxRecordButton!=null)
					dvxRecordButton.setTimeOffset(realTime);
				if (dvxDBSupport!=null)
					if (movie!=null)
					{
						dvxDBSupport.checkTimeEvent(getAuthor(), getLanguage(), getMovie(), chapter,
//								((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
								realTime, frame);
					}
				setPlayingMode();	// set the status for record to time mode...
				
//				int theTime = ((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
				jLabelHour.setText(		num2StringFmt(hours));
				jTextMinutes.setText(	num2StringFmt(minutes));
				jTextSeconds.setText(	num2StringFmt(seconds));
				jTextHour.setText(		num2StringFmt( frame));
				
//				System.out.println("The current time is - " + num2StringFmt(hours) + ":" + num2StringFmt(minutes) + ":" +  num2StringFmt(seconds) + ":" +  num2StringFmt(frame));
				
			}
			
// *************************************************************************************************************************************			
//
// EC_DVD_CHAPTER_START
//
// *************************************************************************************************************************************			

			if (de.humatic.dsj.DSConstants.EC_DVD_CHAPTER_START == DSJUtils.getEventValue_int(pe) )
			{
				chapter = ge[1];
				System.out.println(DVX_Messages.getString(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")); 
				System.out.println(DVX_Messages.getString("Chapter Start : ") + chapter); 
				System.out.println(DVX_Messages.getString(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")); 
//				baseTime = dvd.getTime();	// resets the baseTime offset... to whatever random number the DSJ has currently
				if (dvxRecordButton!=null)
				{
					dvxRecordButton.setMenuMode(false);				
					dvxRecordButton.setChapter(chapter);
				}
				if (jComboBoxChapter!=null)
					jComboBoxChapter.setSelectedIndex(chapter);
				if (jTextChapter!=null)
					jTextChapter.setText("" + chapter);
				if(chapter!=lastChapter)
					dvxSpeak.speak("Chapter " + chapter );
				setPlayingMode();
				lastChapter = chapter;
			}
// *************************************************************************************************************************************			
//
// EC_DVD_BUTTON_CHANGE
//
// *************************************************************************************************************************************			
// TODO
// use the path in the Menu...
			
			if (de.humatic.dsj.DSConstants.EC_DVD_BUTTON_CHANGE == DSJUtils.getEventValue_int(pe) ) 
			{
				System.out.print("Menu Hover : " + ge[1] + " = " + ge[2] + DVX_Messages.getString("PlayDVD.43"));  //$NON-NLS-2$ //$NON-NLS-3$
				// System.out.println(dvdSupport.getMenuName(movie,(int) ge[1],
				// (int) ge[2]));
				// String soundFile = dvdSupport.getMenuURI(movie, (int) ge[1],
				// (int) ge[2]);
				int menuPage = ge[1];
				int menuID = ge[2];
				dvxRecordButton.setMenuPage(menuPage);
				dvxRecordButton.setMenuId(menuID);
				dvxRecordButton.setMenuMode(true);
				dvxRecordButton.setPlayingMode(false);
				MovieMenu movieMenu = dvxDBSupport.getMovieMenu(getAuthor() , getLanguage(), getMovie(), menuPage, menuID);
				String soundFile = null;
				if (movieMenu!=null)
					soundFile = movieMenu.getMenuUri();
					//if (movieMenu!=null)
					System.out.println(
										"Sound file = " + 
										DVX_Constants.MOVIE_PATH + 
										movie.getMovieSbnNumber() + 
										DVX_Constants.MOVIE_MENUS_PATH + 
										soundFile); 
				if (soundFile != null) {
					if (new File(	DVX_Constants.MOVIE_PATH + 
									movie.getMovieSbnNumber() + 
									DVX_Constants.MOVIE_MENUS_PATH + soundFile).exists()) {
						DVX_PlaySound.playWav(
												DVX_Constants.MOVIE_PATH + 
												movie.getMovieSbnNumber() + 
												DVX_Constants.MOVIE_MENUS_PATH + soundFile, false);
					} else {
						System.out
								.print(DVX_Messages.getString("PlayDVD.44") + DVX_Constants.MOVIE_PATH + movie.getMovieId() + DVX_Constants.MOVIE_MENUS_PATH + soundFile); 
						if (isVerbose())
							dvxSpeak.speak("Menu Page " + menuPage + ". Id " + menuID);
					}
				}
				else // is null
				{
					if (isVerbose())
						dvxSpeak.speak("Menu Page " + menuPage + ". Id " + menuID);					
				}
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_ON == DSJUtils.getEventValue_int(pe) ) 
			{
//				DVX_PlaySound.playWav(DVX_Constants.FBI_LOVE, false);
//				System.out.println("The FBI Loves you...");
//				wasFBI = true;
				if (isVerbose())
					dvxSpeak.speak("DVX DVD Still Mode is On");
				break;
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_OFF == DSJUtils.getEventValue_int(pe) ) 
			{
				if (isVerbose())
					dvxSpeak.speak("DVX DVD Still Mode is Off");

//				System.out.println("The FBI No Longer Loves you...");
//				if (wasFBI == true)
//				{
//					DVX_PlaySound.playWav(DVX_Constants.FBI_NO_LOVE, false);
//					wasFBI = false;
//				}
//				wasFBI = false;
				break;
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_DISC_EJECTED == DSJUtils.getEventValue_int(pe) )
				{
//					DVX_PlaySound.playWav(DVX_Constants.DVD_EJECTED, false);
					if (isVerbose())
						dvxSpeak.speak("DVX Disk Ejected");
				}
			if (de.humatic.dsj.DSConstants.EC_DVD_DISC_INSERTED == DSJUtils.getEventValue_int(pe) ) 
				{
					DVX_PlaySound.playWav(DVX_Constants.DVD_MOUNTED, false);
					if (isVerbose())
						dvxSpeak.speak("DVX DVD Mounted");
				}
			
			break;
		}
// *************************************************************************************************************************************			
//
// GRAPH_ERROR
//
// *************************************************************************************************************************************			
		case DSFiltergraph.GRAPH_ERROR:
		{
			if (DSJUtils.getEventValue_int(pe) == DSJException.E_CANT_CONNECT) {

				System.err.println("oops, reconnection after format change failed"); 

				mainDVXFrame.setVisible(false);

				mainDVXFrame.dispose();

			}
			break;
		}
		 default:
		 {
			
			 if (DSJUtils.getEventType(pe)!=0)
			 {
				System.err.println("@@@@@@@@@@@@@ Default case unhandled in property change @@@@@@@@@@@@@@@@@@@@@"); 
				System.err.println("Event type = " + DSJUtils.getEventType(pe));
			 }
				
			break;
		 }

		}
		}
		catch (Exception ex)
		{
			System.err.println();
			System.err.println("Exception property Change " + ex);
			ex.printStackTrace(System.err);
			System.err.println();
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try
		{
	       UIManager.setLookAndFeel(
	               UIManager.getSystemLookAndFeelClassName());	// make it look more like a Windows application
	       } 
	       catch (UnsupportedLookAndFeelException e) {
	          // handle exception
	       }
	       catch (ClassNotFoundException e) {
	          // handle exception
	       }
	       catch (InstantiationException e) {
	          // handle exception
	       }
	       catch (IllegalAccessException e) {
	          // handle exception
	       }
//		BasicConfigurator.configure();
/*		try
		{
			BasicConfigurator.configure(new FileAppender(new PatternLayout("%d{HH:mm:ss,SSS}:%-5p [%t]: %m%n"), "This.log"));
			logger_root = Logger.getLogger(DVX_Player.class);
			logger_getUOPs = Logger.getLogger(DVX_Player.class);
			logger_getUOPs.debug("Sample debug message");
			logger_getUOPs.info("Sample info message");
			logger_getUOPs.warn("Sample warn message");
			logger_getUOPs.error("Sample error message");
			logger_getUOPs.fatal("Sample fatal message");	
		}
		catch (Exception ex)
		{
			System.err.println("Logger exception..." + ex);
		} */
		
//		System.out.println(getOpsHeaders());
	       
/*	       
	       try
	       {
		       java.net.URL imageURL = ClassLoader.getSystemClassLoader().getResource("/resources/images/sksplash.gif");
		        if (imageURL != null) {
		           ImageIcon icon = new ImageIcon(imageURL);
		       }
	       } 
	       catch (Exception ex)
	       {
	    	   System.out.println("Exception = " + ex);
	       } */
		DVX_Player dvx_player = new DVX_Player();
		
//		System.out.println("Path = " + dvx_player.getClass().getProtectionDomain().getCodeSource().getLocation());
		dvx_player.createGraph();
		


	}
//
//
// ******************************************************************
//
//

	/**
	 * @param userName
	 * @param password
	 */
	public boolean userLogin(String userName, String password) {
		// TODO Auto-generated method stub
		
		User user = dvxDBSupport.getUserLogin(userName, password);
		if (user!=null)
		{
			// found valid user to login
			
			System.out.println("User login succeeded...");
			
			setUser(user);
			setAuthor	(dvxDBSupport.getAuthor	( user.getUserHandle() ));
			
			user.setUserLastLogin(new Timestamp(System.currentTimeMillis()));
			dvxDBSupport.updateUser(user);
			return true;
		}
		else
		{
			System.out.println("User login failed...");

		}
		return false;
	}

}