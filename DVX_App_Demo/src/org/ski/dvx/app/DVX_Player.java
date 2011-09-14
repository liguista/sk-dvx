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

// TODO: Auto-generated Javadoc
/*import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.AuthorDAO;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.User;*/


/**
 * The Class DVX_Player.
 */
public class DVX_Player extends DVX_GUI {

//	static Logger logger_getUOPs;
	/** The dvx player logger. */
static Logger dvxPlayerLogger;


	/**
	 * Rendering mode flags. Some decoders, subtitles etc. will only work with
	 * DirectShow renderer filters (VMR7 / 9 or EVR). See javadocs for more
	 * details on the matter.
	 **/

	private int flags = DSFiltergraph.VMR9; // DSFiltergraph.DD7 |
											// DSFiltergraph.YUV |
											// DSFiltergraph.DVD_MENU_ENABLED;
	/**
	 * Video and Audio decoders. None of these is installed by dsj, you will
	 * need to check what is available on your system and adjust the names here.
	 **/

	private DSFilterInfo[] videoDecoders = new DSFilterInfo[] { null,
			// DSFilterInfo.filterInfoForName("Elecard MPEG-2 Video Decoder SD"),
			DSFilterInfo.filterInfoForName("Microsoft DTV-DVD Video Decoder") //, 
	// DSFilterInfo.filterInfoForName("CyberLink Video Decoder (PDVD8)")//,
	// DSFilterInfo.filterInfoForName("CyberLink Video/SP Decoder (PDVD9)")//,

	// DSFilterInfo.filterInfoForName("MainConcept (Demo) MPEG-2 Video Decoder")
	};

	/** The audio decoders. */
	private DSFilterInfo[] audioDecoders = new DSFilterInfo[] { null,
			DSFilterInfo.filterInfoForName("Default DirectSound Device"), 
			DSFilterInfo.filterInfoForName("Microsoft DTV-DVD Audio Decoder"), 
			DSFilterInfo.filterInfoForName("ffdshow audio decoder") 
	};

	/**
	 * Instantiates a new dV x_ player.
	 */
	public DVX_Player() {
		// movie = dvdSupport.getMovie("A Beautiful Mind");
		super();
		dvxSpeak = new DVX_Speak();
		dvxDBSupport = new DVX_DB_Support(this , DVX_Constants.DVX_DEFAULT_AUTHOR);
		language = dvxDBSupport.getLanguage(DVX_Constants.DVX_DEFAULT_LANGUAGE);
//		dvxDBSupport.setDvx_speak(dvxSpeak);	
		
		dvxPlayerLogger = Logger.getLogger(this.getClass());
		
		dvdStates = new DVDStates();
		dvdStates.setVisible(true);

	}

	
	/**
	 * Sets the playing mode.
	 */
	void setPlayingMode()
	{
		if (dvxRecordButton!=null)
		{
			dvxRecordButton.setMenuMode(false);
			dvxRecordButton.setPlayingMode(true);
		}
	}

	/**
	 * Sets the menu mode.
	 */
	void setMenuMode()
	{
		dvxRecordButton.setMenuMode(true);
		dvxRecordButton.setPlayingMode(false);
	}

	// *************************************************************************************************************************************
	// 
	// createGraph - This creates the magic !!!
	//
	// *************************************************************************************************************************************			

	/**
	 * Creates the graph.
	 */
	public void createGraph() {

		System.out.println("Root path = " + this.getClass().getProtectionDomain().getCodeSource().getLocation());
		try {
			if (mainDVXFrame == null) {
				mainDVXFrame = new javax.swing.JFrame(DVX_Constants.DVX_APPLICATION_NAME); 

				splash = new DVX_Splash(mainDVXFrame, DVX_Constants.GLOBAL_SPLASH_IMAGE); 
				splash.showSplashScreen();
				System.out.println("DVX_Constants.GLOBAL_APPLICATION_ICON = " + DVX_Constants.GLOBAL_APPLICATION_ICON);
				mainDVXFrame.setIconImage (Toolkit.getDefaultToolkit().getImage(DVX_Constants.GLOBAL_APPLICATION_ICON));
//				mainDVXFrame.setIconImage (Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemClassLoader().getResource(DVX_Constants.GLOBAL_APPLICATION_ICON)));
				//				mainDVXFrame.setIconImage (Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemClassLoader().getResource(DVX_Constants.GLOBAL_APPLICATION_ICON)));

			}
			/* jMenuFile.add(jMenuItemQuit);
			jMenuBar.add(jMenuFile);
			jMenuHelp.add(jMenuItemAbout);
			jMenuBar.add(jMenuHelp); 
			mainDVXFrame.setJMenuBar(jMenuBar);*/
			mainDVXFrame.pack();
//			dvxDBSupport.playSound(DVX_Constants.Welcome_DVX_WAV, true); 
			dvxSpeak.speak("Welcome to DVX... The new Media player.");
//			System.out.println(dvx_network.getHostname() + " - " + dvx_network.getIpAddress());
//			System.out.println(dvx_network.getIpAddress());

			boolean dvdOK = false;
//			while ((!dvdOK)&&(System.in.available()==0)) {	// need to add an escape in here...
			while (!dvdOK) {	// need to add an escape in here...
				try {
//					splash.setVisible(false);
//					splash.dispose();

					dvd = new DSDvd(/* path_to_ifo_directory, */0, flags,
							videoDecoders[1], audioDecoders[1], this);
					dvdOK = true;
				} catch (Exception ex) {
					//dvxDBSupport
						//	.playSound(DVX_Constants.DVX_Waiting_WAV, true); 
					dvxSpeak.speak("Waiting for a DVD to be inserted in the drive.");
					System.out.println("Exception reading DVD..." + ex);

					long loop = System.currentTimeMillis() + DVX_Constants.MOVIE_MOUNT_DELAY_MS;
					while (loop > System.currentTimeMillis()) {
						;
					}
//					System.out.println("Available = " + System.in.available()123fghfjghf);

				}
			}


			mainDVXFrame.getContentPane().add(java.awt.BorderLayout.CENTER,
					dvd.asComponent());

			/**
			 * The SwingMovieController handles keyboard events for navigation
			 * using DSDvd.navigate(DSDvd.NAV_x).
			 **/

			mainDVXFrame.getContentPane().add(java.awt.BorderLayout.SOUTH,
					new SwingMovieController(dvd));
			System.out.println("Icon = " + DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Record-Normal-icon.png");
			

			JPanel myPanel = new JPanel();
			initGui(mainDVXFrame, myPanel);
			mainDVXFrame.getContentPane().add(java.awt.BorderLayout.NORTH,
					myPanel);
			
			mainDVXFrame.pack();

			mainDVXFrame.setSize(1024, 768);

			DSJUtils.centerFrame(mainDVXFrame, null);

			mainDVXFrame.setVisible(true);

			dvd.dumpGraph(false);

			mainDVXFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

			dvd.asComponent().addMouseListener(
					new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent me) {
							if (me.getButton() != 3)
								return;
							final javax.swing.JPopupMenu popMeUp = new javax.swing.JPopupMenu();
							popMeUp.setLightWeightPopupEnabled(false);

							final javax.swing.JMenuItem fs = popMeUp
									.add(DVX_Messages.getString("PlayDVD.10")); 
							fs.addActionListener(new java.awt.event.ActionListener() {
								public void actionPerformed(
										java.awt.event.ActionEvent event) {
									dvd.goFullScreen(null, 0);
								}
							});

							popMeUp.addSeparator();

							String[] streams = dvd.getStreams(DSDvd.DVD_AUDIO);
							int selected = dvd
									.getSelectedStream(DSDvd.DVD_AUDIO);
							for (int i = 0; i < streams.length; i++) {
								final int ID = i;
								final javax.swing.JMenuItem mi = popMeUp
										.add(DVX_Messages.getString("PlayDVD.11") + streams[i]); 
								if (i == selected)
									mi.setBackground(java.awt.Color.lightGray);
								mi.addActionListener(new java.awt.event.ActionListener() {
									public void actionPerformed(
											java.awt.event.ActionEvent event) {
										dvd.selectStream(DSDvd.DVD_AUDIO, ID);
									}
								});
							}
							streams = dvd.getStreams(DSDvd.DVD_SUBPICTURE);
							if (streams.length > 0) {
								popMeUp.addSeparator();
								selected = dvd
										.getSelectedStream(DSDvd.DVD_SUBPICTURE);
								for (int i = 0; i < streams.length; i++) {
									final int ID = i;
									final javax.swing.JMenuItem mi = popMeUp.add(DVX_Messages
											.getString("PlayDVD.12") + streams[i]); 
									if (i == selected)
										mi.setBackground(java.awt.Color.lightGray);
									mi.addActionListener(new java.awt.event.ActionListener() {
										public void actionPerformed(
												java.awt.event.ActionEvent event) {
											dvd.selectStream(
													DSDvd.DVD_SUBPICTURE, ID);
										}
									});
								}
							}
							streams = dvd.getStreams(DSDvd.DVD_MENU_LANGUAGE);
							if (streams.length > 0) {
								popMeUp.addSeparator();
								selected = dvd
										.getSelectedStream(DSDvd.DVD_MENU_LANGUAGE);
								for (int i = 0; i < streams.length; i++) {
									final int ID = i;
									final javax.swing.JMenuItem mi = popMeUp.add(DVX_Messages
											.getString("PlayDVD.13") + streams[i]); 
									if (i == selected)
										mi.setBackground(java.awt.Color.lightGray);
									mi.addActionListener(new java.awt.event.ActionListener() {
										public void actionPerformed(
												java.awt.event.ActionEvent event) {
											dvd.setDefaultStream(
													DSDvd.DVD_MENU_LANGUAGE,
													ID, 0);
										}
									});
								}
							}

							popMeUp.addSeparator();

							final javax.swing.JMenuItem sb = popMeUp
									.add(DVX_Messages.getString("PlayDVD.14")); 
							sb.addActionListener(new java.awt.event.ActionListener() {
								public void actionPerformed(
										java.awt.event.ActionEvent event) {
									try {
										dvd.saveBookmark(null);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});

							final javax.swing.JMenuItem rb = popMeUp
									.add(DVX_Messages.getString("PlayDVD.15")); 
							rb.addActionListener(new java.awt.event.ActionListener() {
								public void actionPerformed(
										java.awt.event.ActionEvent event) {
									try {
										dvd.restoreBookmark(null);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});

							if ((flags & (DSFiltergraph.VMR9
									| DSFiltergraph.EVR | DSFiltergraph.DVD_MENU_ENABLED)) != 0) {

								popMeUp.addSeparator();

								final javax.swing.JMenu bm = new javax.swing.JMenu(
										DVX_Messages.getString("PlayDVD.16")); 
								popMeUp.add(bm);
								final javax.swing.JMenuItem bmd = bm
										.add(DVX_Messages.getString("PlayDVD.17")); 
								bmd.addActionListener(new java.awt.event.ActionListener() {
									public void actionPerformed(
											java.awt.event.ActionEvent event) {
										dvd.setButtonMapping(DSDvd.BM_DISPLAY);
									}
								});
								final javax.swing.JMenuItem bms = bm
										.add(DVX_Messages.getString("PlayDVD.18")); 
								bms.addActionListener(new java.awt.event.ActionListener() {
									public void actionPerformed(
											java.awt.event.ActionEvent event) {
										dvd.setButtonMapping(DSDvd.BM_SOURCE);
									}
								});

							}

							popMeUp.show(dvd.asComponent(), me.getX(),
									me.getY());

						}

					});
			String result= dvd.toString();
			System.out.println("dvd.toString() "  		+ result); 
			result = dvd.getInfo();
			System.out.println("dvd.getInfo " 			+ result); 
			dvdStates.getjTextFieldWidth().setText("" + dvd.getWidth());
			dvdStates.getjTextFieldHeight().setText("" + dvd.getHeight());
			dvdStates.getjTextFieldBitDepth().setText("" + dvd.getBitDepth());
			
			dvdStates.getjTextFieldDSJDuration().setText("" + dvd.getDuration());
			
			int[] ratio = dvd.getAspectRatio();
			dvdStates.getjTextFieldAspect().setText(ratio[0]+":"+ratio[1]);
			result = dvd.getName();
			System.out.println("dvd.getName "  			+ result); 
			int i = dvd.getNumChapters();
			System.out.println("dvd.getNumChapters " 	+ i); 
			dvdStates.getjTextFieldChapterCount().setText(""+i);
			i =dvd.getNumTitles();
			System.out.println("dvd.getNumTitles "  	+ i); 
			dvdStates.getjTextFieldTitleCount().setText(""+i);

			/*
			 * String [] streams = dvd.getStreams(0);
			 * 
			 * if (streams.length>0) for (int i = 0; i<streams.length; i++) {
			 * System.out.println("Stream " + i + " = " + streams[i]); }
			 */

			// z splash.close();
// VERY IMPORTANT!!! This makes DVD time codes work!!!
//			mainDVXFrame.setJMenuBar(jMenuBar);
		dvd.setDVDControlOption(DSDvd.DVD_HMSF_TimeCodeEvents, 1 );
		
		dvxPlayerLogger.warn(getOpsHeaders());

		} catch (Exception e) {
			System.out.println("Exception create Graph: " + e);} 

	}

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
				int[] ge1 = (int[]) (pe.getOldValue());
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
				int seconds = remainder & 0xff;;
				int frame = (remainder  & 0xff00 )/0x100;
				
				int  realTime = seconds + (minutes * DVX_Constants.SECONDS_PER_MINUTE) + (hours *DVX_Constants.SECONDS_PER_HOUR);
				if (dvxRecordButton!=null)
					dvxRecordButton.setTimeOffset(realTime);
				if (dvxDBSupport!=null)
					if (movie!=null)
					{
						dvxDBSupport.checkTimeEvent(getAuthor(), language, movie, chapter,
//								((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
								realTime, frame);
					}
				setPlayingMode();	// set the status for record to time mode...
				
//				int theTime = ((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
				jLabelHour.setText(		num2StringFmt(hours));
				jTextMinutes.setText(	num2StringFmt(minutes));
				jTextSeconds.setText(	num2StringFmt(seconds));
				jTextFrame.setText(		num2StringFmt( frame));
				
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
				baseTime = dvd.getTime();	// resets the baseTime offset... to whatever random number the DSJ has currently
				if (dvxRecordButton!=null)
				{
					dvxRecordButton.setMenuMode(false);				
					dvxRecordButton.setChapter(chapter);
				}
				if (jComboBoxChapter!=null)
					jComboBoxChapter.setSelectedIndex(chapter);
				if (jTextChapter!=null)
					jTextChapter.setText("" + chapter);
				
				setPlayingMode();
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
				MovieMenu movieMenu = dvxDBSupport.getMovieMenu(author , language, movie, menuPage, menuID);
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

}