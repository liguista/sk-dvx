package org.ski.dvx.app;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.StringWriter;

//import org.ski.dvx.hibernate.Movie;

import de.humatic.dsj.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.AuthorDAO;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.User;

public class DVX_Player implements java.beans.PropertyChangeListener {

	private DSDvd dvd;
	
//	DVX_Logger dvx_logger = null;

	DVX_DB_Support dvxDBSupport = null;
	DVX_Speak dvxSpeak = null;

	Movie movie = null;

	private javax.swing.JFrame mainFrame = null;
	
	DVX_RecordButton dvxRecordButton = null;
	
	DVX_File_Support dvxFileSupport = null;
	
	Language language = null;
	
	boolean newGui = true;
	
//	boolean wasFBI = false;
// gca menus...	
	private JMenuBar mb = new JMenuBar(); // Menubar
	private JMenu mnuFile = new JMenu("File"); // File Entry on Menu bar
	private JMenuItem mnuItemQuit = new JMenuItem("Quit"); // Quit sub item
	private JMenu mnuHelp = new JMenu("Help"); // Help Menu entry
	private JMenuItem mnuItemAbout = new JMenuItem("About"); // About Entry
	
	JMenu mnuGreg = new JMenu("Greg"); // Help Menu entry
	
	JMenuItem mnuItemGreg1 = new JMenuItem("Greg 1",  KeyEvent.VK_T); // About Entry	
	JMenuItem mnuItemGreg2 = new JMenuItem("Greg 2", KeyEvent.VK_T); // About Entry
	JMenuItem mnuItemGreg3 = new JMenuItem("Greg 3",  KeyEvent.VK_T); // About Entry
// end gca manus...

//	private String menuFilePathPre = Messages.getString("PlayDVD.0"); 
//	private String menuFilePathPost = Messages.getString("PlayDVD.1"); 

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

	private DSFilterInfo[] audioDecoders = new DSFilterInfo[] { null,
			DSFilterInfo.filterInfoForName("Default DirectSound Device"), 
			DSFilterInfo.filterInfoForName("Microsoft DTV-DVD Audio Decoder"), 
			DSFilterInfo.filterInfoForName("ffdshow audio decoder") 
	};

	public DVX_Player() {
		// movie = dvdSupport.getMovie("A Beautiful Mind");
		dvxSpeak = new DVX_Speak();
		dvxDBSupport = new DVX_DB_Support();
		language = dvxDBSupport.getLanguage();
		dvxDBSupport.setDvx_speak(dvxSpeak);
		
	}

	DVX_Splash splash = null;
	
	void setPlayingMode()
	{
		dvxRecordButton.setMenuMode(false);
		dvxRecordButton.setPlayingMode(true);
	}

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

	public void createGraph() {

		try {
			if (mainFrame == null) {
				mainFrame = new javax.swing.JFrame(DVX_Constants.DVX_APPLICATION_NAME); 

				splash = new DVX_Splash(mainFrame, DVX_Constants.GLOBAL_SPLASH_IMAGE); 
				splash.showSplashScreen();

			}
			mainFrame.setJMenuBar(mb);
			mainFrame.pack();
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

			mainFrame.getContentPane().add(java.awt.BorderLayout.CENTER,
					dvd.asComponent());

			/**
			 * The SwingMovieController handles keyboard events for navigation
			 * using DSDvd.navigate(DSDvd.NAV_x).
			 **/

			mainFrame.getContentPane().add(java.awt.BorderLayout.NORTH,
					new SwingMovieController(dvd));
			System.out.println("Icon = " + DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Record-Normal-icon.png");
			
/*			BorderLayout dvxButtons = new BorderLayout();
			dvxButtons.addLayoutComponent(new JButton("Hello"), JButton.LEFT);
			dvxButtons.addLayoutComponent(new JButton("There"), JButton.CENTER);
			dvxButtons.addLayoutComponent(new JButton("Tool"), JButton.RIGHT);*/
			
//			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
//					dvxRecordButton);
			
			btnChapterPlus 	= new JButton("C+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
			btnChapterMinus = new JButton("C-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));

			btnTitlePlus 	= new JButton("T+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
			btnTitleMinus 	= new JButton("T-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));

//			jButtonPlay.disable();
//			jButtonPause.disable();
//			jButtonStop.disable();
//			jButtonEject.disable(); 
			JPanel myPanel = new JPanel();
			if (newGui)
				initComponents(myPanel);
			else	
{
	        //Create the combo box, select the item at index 4.
	        //Indices start at 0, so 4 specifies the pig.
	        JComboBox authorList = new JComboBox(dvxDBSupport.getAuthorList());
	        myPanel.add(authorList);
	        authorList.addActionListener(new MyMenuListener());
	        authorList.setName("Author");

	        JComboBox languageList = new JComboBox(dvxDBSupport.getLanguageList());
	        myPanel.add(languageList);
	        languageList.addActionListener(new MyMenuListener());
	        languageList.setName("Language");
//
			myPanel.add(btnChapterMinus);			
			btnChapterMinus.addActionListener(new MyButtonListener());
			btnChapterMinus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterMinus"));
			
			myPanel.add(btnChapterPlus);
			btnChapterPlus.addActionListener(new MyButtonListener());
			btnChapterPlus.setMnemonic('+');
			btnChapterPlus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterPlus"));

//			myPanel.add(btnTitleMinus);
//			btnTitleMinus.addActionListener(new MyButtonListener());
//			btnTitleMinus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterMinus"));

//			myPanel.add(btnTitlePlus);
//			btnTitlePlus.addActionListener(new MyButtonListener());
//

			myPanel.add(jButtonEject);
			jButtonEject.addActionListener(new MyButtonListener());
			jButtonEject.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Eject"));
			
			myPanel.add(jButtonMount);
			jButtonMount.addActionListener(new MyButtonListener());
			jButtonMount.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Mount"));
       
			myPanel.add(jButtonShutUp);
			jButtonShutUp.addActionListener(new MyButtonListener());
			jButtonShutUp.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ShutUp"));
			
			myPanel.add(jButtonTime);
			jButtonTime.addActionListener(new MyButtonListener());
			jButtonTime.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Time"));

			myPanel.add(jButtonPlay);
			jButtonPlay.addActionListener(new MyButtonListener());
			jButtonPlay.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Play"));
			
			myPanel.add(jButtonPause);
			jButtonPause.addActionListener(new MyButtonListener());
			jButtonPause.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Pause"));

			myPanel.add(jButtonStop);
			jButtonStop.addActionListener(new MyButtonListener());
			jButtonStop.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Stop"));
			
//			dvxRecordButton.setSize(40, 12);
			myPanel.add(dvxRecordButton);
}		
//			JLayout buttonLayout = new JLayout();
			mainFrame.add(myPanel,java.awt.BorderLayout.SOUTH);
//			f.add(dvxRecordButton,java.awt.BorderLayout.SOUTH);
//			JPanel panel = new JPanel(new BorderLayout());
			
//			panel.add(new JButton("Record 1"), JPanel.LEFT_ALIGNMENT);
//			panel.add(new JButton("Record 2"), JPanel.CENTER_ALIGNMENT);
//			panel.add(new JButton("Record 3"), JPanel.RIGHT_ALIGNMENT);

//			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
//					panel);

/*			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
					new dvxRecordButton("Click to Record"));
			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
					new dvxRecordButton("Click to Record"));
*/
			mainFrame.pack();

			mainFrame.setSize(1024, 768);

			DSJUtils.centerFrame(mainFrame, null);

			mainFrame.setVisible(true);

			dvd.dumpGraph(false);

			mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

			System.out.println("dvd.toString() "  		+ dvd.toString()); 
			System.out.println("dvd.getInfo " 			+ dvd.getInfo()); 
			System.out.println("dvd.getName "  			+ dvd.getName()); 
			System.out.println("dvd.getNumChapters " 	+ dvd.getNumChapters()); 
			System.out.println("dvd.getNumTitles "  	+ dvd.getNumTitles()); 

			/*
			 * String [] streams = dvd.getStreams(0);
			 * 
			 * if (streams.length>0) for (int i = 0; i<streams.length; i++) {
			 * System.out.println("Stream " + i + " = " + streams[i]); }
			 */

			// z splash.close();
// VERY IMPORTANT!!! This makes DVD time codes work!!!
			mainFrame.setJMenuBar(mb);
		dvd.setDVDControlOption(DSDvd.DVD_HMSF_TimeCodeEvents, 1 );

		} catch (Exception e) {
			System.out.println("Exception create Graph: " + e);} 

	}

	boolean verbose = true;
	int baseTime = 0;
	int chapter = 0;
	String lastDVD_ID = ""; 

	// String movieIDString = "";

	// *************************************************************************************************************************************
	// 
	// propertyChange - This is the main dispatcher !!!
	//
	// *************************************************************************************************************************************			
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
			 * DVDNavigator, video decoder and graphics hardware occured.
			 * Updating your graphics driver may help" (or the like), that you
			 * might know from WMP is signalled here.
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
			
			System.out.println("Get Ops is - " + dvd.getUOPs() + " : " + Long.toString(dvd.getUOPs(), 16));
			System.out.println("UOP_ShowMenu_Title is - " +(dvd.getUOPs() & DSDvd.UOP_ShowMenu_Title));
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
					Movie movieID = dvxDBSupport.getInsertMovieHash(DVX_Constants.MOVIE_PATH + 
																	result + 
																	DVX_Constants.MOVIE_MENUS_PATH +
																	DVX_Constants.MOVIE_NAME_MP3,
																	result);
					if (movieID!=null)
					{
						dvxDBSupport.log(	movieID, 
											dvxDBSupport.getUser(),  
											DVX_Constants.TRANSACTION_TYPE_LOGIN, 
											DVX_Constants.TRANSACTION_LEVEL_INFO, 
											"Movie identified : " + movieID.getMovieName());
						
						String movieNameString = movieID.getMovieName();
						System.out.println(movieID);
						
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
							movie = movieID;
						System.out.println(movie.getMovieName());
						System.out.println(DVX_Constants.ASTRIX_BAR); 
	
						baseTime = dvd.getTime();
						
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
						dvxRecordButton.setMovie(movie);
						
						setMenuMode();
						
//						StringWriter sw = new StringWriter();
						ByteArrayOutputStream os = new ByteArrayOutputStream();
						PrintStream ps = new PrintStream(os);
						dvd.list(ps);
						System.out.println(os.toString());	// this should be put in the movie info and updated...
						dvd.list(System.err);
						movieID.setMovieQuote(os.toString());  // should update the movie after this...
						dvxDBSupport.updateMovie(movieID);
						
					}

				}
			}
			
			if (de.humatic.dsj.DSConstants.EC_DVD_SUBPICTURE_STREAM_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				dvxSpeak.speak("DVD Sub Picture Stream Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_AUDIO_STREAM_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				dvxSpeak.speak("DVD Audio Stream Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_VALID_UOPS_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
				dvxSpeak.speak("DVD Domain Change" );
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_VALID_UOPS_CHANGE == DSJUtils.getEventValue_int(pe)  ) {
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
					dvxDBSupport.checkTimeEvent(movie, dvxDBSupport.getAuthor(), language, chapter,
						((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
				setPlayingMode();	// set the status for record to time mode...
				
				int theTime = ((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
				jTextMinutes.setText("" + theTime / 60);
				jTextSeconds.setText("" + theTime % 60);
				jTextFrame.setText("" + 0);

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
					dvxDBSupport.checkTimeEvent(movie, dvxDBSupport.getAuthor(), language, chapter,
						((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
				setPlayingMode();	// set the status for record to time mode...
				
				int theTime = ((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
				jLabelHour.setText(num2StringFmt(hours));
				jTextMinutes.setText(num2StringFmt(minutes));
				jTextSeconds.setText(num2StringFmt(seconds));
				jTextFrame.setText(num2StringFmt( frame));
				
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
				
				dvxRecordButton.setMenuMode(false);				
				dvxRecordButton.setChapter(chapter);
				
				jComboBoxChapter.setSelectedIndex(chapter);
				jTextChapter.setText("" + chapter);
				
				setPlayingMode();
			}
// *************************************************************************************************************************************			
//
// EC_DVD_BUTTON_CHANGE
//
// *************************************************************************************************************************************			
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
				String soundFile = dvxDBSupport.getMenuURI(null /* author */, language, movie,
						menuPage, menuID);
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
						dvxSpeak.speak("Menu Page " + menuPage + ". Id " + menuID);
					}
				}
				else // is null
				{
					dvxSpeak.speak("Menu Page " + menuPage + ". Id " + menuID);					
				}
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_ON == DSJUtils.getEventValue_int(pe) ) 
			{
//				DVX_PlaySound.playWav(DVX_Constants.FBI_LOVE, false);
//				System.out.println("The FBI Loves you...");
//				wasFBI = true;
				dvxSpeak.speak("DVX DVD Still Mode is On");
				break;
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_OFF == DSJUtils.getEventValue_int(pe) ) 
			{
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
					dvxSpeak.speak("DVX Disk Ejected");
				}
			if (de.humatic.dsj.DSConstants.EC_DVD_DISC_INSERTED == DSJUtils.getEventValue_int(pe) ) 
				{
					DVX_PlaySound.playWav(DVX_Constants.DVD_MOUNTED, false);
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

				mainFrame.setVisible(false);

				mainFrame.dispose();

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

	public static void main(String[] args) {
		new DVX_Player().createGraph();

	}
//
//
// ******************************************************************
//
//
	
	public class MyMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String event = e.getActionCommand();
//			System.out.println("MyMenuListener Event " + e.getActionCommand() + " - " + event);
	        JComboBox cb = (JComboBox)e.getSource();
	        String menuName = cb.getName();
	        String menuItem = (String)cb.getSelectedItem();
			System.out.println(menuName + " is " + menuItem);
			
			if (menuName.equals("Language"))
			{
				System.out.println("Was Language...");
				
				language = dvxDBSupport.getLanguage (menuItem);
				dvxDBSupport.setLanguage(language);
				
				dvxRecordButton.setLanguage(language);
			}
			if (menuName.equals("Author"))
			{
				System.out.println("Was Author...");
				Author newAuthor = dvxDBSupport.getAuthor(menuItem);
				dvxDBSupport.setAuthor(newAuthor);
				dvxRecordButton.setAuthor(newAuthor);				
			}
		}
	}
	
	public class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			String  menuName = jb.getLabel();
			System.out.println("MyButtonListener - " + menuName);
			
			if (menuName.equals("Shut Up"))
			{
				dvxSpeak.speak("Shut Up");
			}
			if (menuName.equals("Eject"))
			{
				DVX_DVD_Identification.openDvdDrive();
				dvxSpeak.speak("Eject");
			}
			if (menuName.equals("Mount"))
			{
				DVX_DVD_Identification.closeDvdDrive();
				dvxSpeak.speak("Mount");
			}
			if (menuName.equals("Time"))
			{
				int seconds = (dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC;
				dvxSpeak.speak("Chapter " + chapter + ", " + seconds / 60 +" minutes " + seconds % 60 + " Seconds");
			}
			if (menuName.equals("Play"))
			{
				dvd.play();
				dvxSpeak.speak("Play");
			}
			if (menuName.equals("Pause"))
			{
				dvd.pause();
				dvxSpeak.speak("Pause");
			}
			if (menuName.equals("Stop"))
			{
				dvd.stop();
				dvxSpeak.speak("Stop");
			}
			if (menuName.equals("C+"))
			{
				dvd.chapterStep(1);
				dvxSpeak.speak("Chapter Plus");
			}
			if (menuName.equals("C-"))
			{
				dvd.chapterStep(-1);				
				dvxSpeak.speak("Chapter Minus");
			}
			if (menuName.equals("T+"))
			{
				
			}
			if (menuName.equals("T-"))
			{
				
			}
			
			}
		}
	// gca 8-28-11
	
    // Variables declaration - do not modify                     
//    private javax.swing.JButton jButtonAdd;
 //   private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonRecord;
    private javax.swing.JButton jButtonChapterMinus;
    private javax.swing.JButton jButtonChapterPlus;
    private javax.swing.JComboBox jComboBoxAuthor;
    private javax.swing.JComboBox jComboBoxChapter;
    private javax.swing.JComboBox jComboBoxTitle;
    private javax.swing.JComboBox jComboBoxLanguage;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelDVDvolume;
    private javax.swing.JLabel jLabelDVXVolume;
    private javax.swing.JLabel jLabelFrame;
    private javax.swing.JLabel jLabelLanguage;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelSec;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelRoot;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSliderDVXVolume;
    private javax.swing.JSlider jSliderDVDVolume;
    private javax.swing.JTextField jTextChapter;
    private javax.swing.JTextField jTextFrame;
    private javax.swing.JTextField jTextMinutes;
    private javax.swing.JTextField jTextSeconds;
    private javax.swing.JLabel labelChapter;
    private javax.swing.JLabel labelLanguage;
    private javax.swing.JLabel labelLanguage1;
    private javax.swing.JLabel labelLanguage2;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration    

    private javax.swing.JButton btnChapterPlus;
    private javax.swing.JButton btnChapterMinus;

    private javax.swing.JButton btnTitlePlus ;
    private javax.swing.JButton btnTitleMinus;

    private javax.swing.JButton jButtonShutUp;
    private javax.swing.JButton jButtonTime ;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonPause ;
    private javax.swing.JButton jButtonStop ;
    private javax.swing.JButton jButtonEject;
    private javax.swing.JButton jButtonMount;


	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(JPanel thePanel) {

        jPanel1 = new javax.swing.JPanel();
        jPanelRoot = new javax.swing.JPanel();
        jSliderDVDVolume = new javax.swing.JSlider();
        jSliderDVXVolume = new javax.swing.JSlider();
//        jButtonRecord = new javax.swing.JButton();
//        jButtonAdd = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jComboBoxAuthor = new javax.swing.JComboBox();
        jLabelAuthor = new javax.swing.JLabel();
        jComboBoxLanguage = new javax.swing.JComboBox();
        jLabelLanguage = new javax.swing.JLabel();
        jLabelDVDvolume = new javax.swing.JLabel();
        jLabelDVXVolume = new javax.swing.JLabel();
        labelChapter = new javax.swing.JLabel();
        jComboBoxChapter = new javax.swing.JComboBox();
        labelTitle = new javax.swing.JLabel();
        jComboBoxTitle = new javax.swing.JComboBox();
        jButtonChapterPlus = new javax.swing.JButton();
        jButtonChapterMinus = new javax.swing.JButton();
        labelLanguage1 = new javax.swing.JLabel();
        labelLanguage2 = new javax.swing.JLabel();
        jTextSeconds = new javax.swing.JTextField();
        jTextFrame = new javax.swing.JTextField();
        labelLanguage = new javax.swing.JLabel();
        jTextChapter = new javax.swing.JTextField();
        jTextMinutes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitle = new javax.swing.JLabel();
        jLabelHour = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jLabelFrame = new javax.swing.JLabel();
        
		jButtonEject = new JButton("Eject", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "cd-eject-icon.png"));
		jButtonEject.addActionListener(new MyButtonListener());
		jButtonEject.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Eject"));

		jButtonMount = new JButton("Mount", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Device-cd-rom-mount-icon.png"));
		jButtonMount.addActionListener(new MyButtonListener());
		jButtonMount.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Mount"));

		jButtonShutUp = new JButton("Shut Up",new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "sound-off-icon.png"));
		jButtonShutUp.addActionListener(new MyButtonListener());
		jButtonShutUp.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ShutUp"));
		
		jButtonTime = new JButton("Time", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Time-Machine-icon.png"));
		jButtonTime.addActionListener(new MyButtonListener());
		jButtonTime.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Time"));

		jButtonPlay = new JButton("Play", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Button-Play-icon_002.png"));
		jButtonPlay.addActionListener(new MyButtonListener());
		jButtonPlay.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Play"));

		jButtonPause = new JButton("Pause", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Pause-icon.png"));
		jButtonPause.addActionListener(new MyButtonListener());
		jButtonPause.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Pause"));

		jButtonStop = new JButton("Stop", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Stop-Pressed-Blue-icon.png"));
		jButtonStop.addActionListener(new MyButtonListener());
		jButtonStop.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Stop"));

		dvxRecordButton = new DVX_RecordButton("Record", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Record-Normal-icon.png"));
		//			dvxRecordButton = new dvxRecordButton("Record");
		dvxRecordButton.setAuthor(dvxDBSupport.getAuthor());
		dvxRecordButton.setMovie(movie);
		dvxRecordButton.setLanguage(language);
		dvxRecordButton.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Record"));

//
//

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

 //       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 //       setTitle("Root Panel");

        jSliderDVDVolume.setValue(100);
         jSliderDVDVolume.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
            	sliderDVDVolumeActionPerformed(evt);
            }
        });

        jSliderDVXVolume.setValue(100);
        
        jSliderDVXVolume.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
            	sliderDVXVolumeActionPerformed(evt);
               
            }
        });

/*
        jButtonRecord.setText("Record");
        jButtonRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecordActionPerformed(evt);
            }
        }); */
/*
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
*/
        jButtonPlay.setText("Play");

        jComboBoxAuthor.setModel(new javax.swing.DefaultComboBoxModel(dvxDBSupport.getAuthorList()));
        jComboBoxAuthor.setToolTipText("User");
        jComboBoxAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAuthorActionPerformed(evt);
            }
        });

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAuthor.setText("Author:");

        jComboBoxLanguage.setModel(new javax.swing.DefaultComboBoxModel(dvxDBSupport.getLanguageList()));
        jComboBoxLanguage.setToolTipText("Language");
        jComboBoxLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanguageActionPerformed(evt);
            }
        });

        jLabelLanguage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLanguage.setText("Language:");

        jLabelDVDvolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDVDvolume.setText("DVD Volume");

        jLabelDVXVolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDVXVolume.setText("DVX Volume");

        labelChapter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelChapter.setText("Chapter:");

     // added gca
       String [] chapterList  = new String[dvd.getNumChapters()+1];
       chapterList[0] = "Chapter:";
        for (int i = 0; i < dvd.getNumChapters(); i++) 
        	chapterList[i+1] = "Chapter "+ (i + 1);
        jComboBoxChapter.setModel(new javax.swing.DefaultComboBoxModel(chapterList));
        jComboBoxChapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jComboBoxChapterActionPerformed(evt);
            }
        });     // end added       	   

        
        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitle.setText("Title:");
// added gca
        String [] titleList  = new String[dvd.getNumTitles()+1];
        titleList[0] = "Title:";
        for (int  i = 0; i < dvd.getNumTitles(); i++) 
        	titleList[i+1] = "Title "+ (i + 1);
// end added       	   
        jComboBoxTitle.setModel(new javax.swing.DefaultComboBoxModel(titleList));
        jComboBoxTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jComboBoxTitleActionPerformed(evt);
            }
        });     // end added       	   

        jButtonChapterPlus.setText("+");
        jButtonChapterPlus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterPlus"));

        jButtonChapterPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChapterPlusActionPerformed(evt);
            }
        });

        jButtonChapterMinus.setText("-");
        jButtonChapterMinus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterMinus"));
        jButtonChapterMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChapterMinusActionPerformed(evt);
            }
        });

        labelLanguage1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLanguage1.setText(":");

        labelLanguage2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextSeconds.setText("00");
        jTextSeconds.setToolTipText("Seconds");
        jTextSeconds.setMargin(new java.awt.Insets(2, 4, 2, 4));

        jTextFrame.setText("00");
        jTextFrame.setToolTipText("Frame");
        jTextFrame.setMargin(new java.awt.Insets(2, 4, 2, 4));
/*        jTextFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFrameActionPerformed(evt);
            }
        }); */

        labelLanguage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelLanguage.setText("-");

        jTextChapter.setText("00");
        jTextChapter.setToolTipText("Chapter");
        jTextChapter.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextChapter.setMinimumSize(new java.awt.Dimension(60, 20));
 /*       jTextChapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChapterActionPerformed(evt);
            }
        });*/

        jTextMinutes.setText("00");
        jTextMinutes.setToolTipText("Minutes");
        jTextMinutes.setMargin(new java.awt.Insets(2, 4, 2, 4));
 /*       jTextMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMinutesActionPerformed(evt);
            }
        });*/

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 0, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("DVX- The New Media Player");

        jLabelHour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHour.setText("Hour");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMin.setText("Min.");

        jLabelSec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSec.setText("Sec.");

        jLabelFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFrame.setText("Frame");

        javax.swing.GroupLayout jPanelRootLayout = new javax.swing.GroupLayout(jPanelRoot);
        jPanelRoot.setLayout(jPanelRootLayout);
        jPanelRootLayout.setHorizontalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addGroup(jPanelRootLayout.createSequentialGroup()
                        .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRootLayout.createSequentialGroup()
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAuthor)
                                    .addComponent(jLabelLanguage))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(labelChapter))
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelTitle)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonChapterMinus)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonChapterPlus)
                                        .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelRootLayout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(labelLanguage2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelRootLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelHour)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabelMin)
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabelSec)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelFrame)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRootLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(labelLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLanguage1)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jTextFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDVDvolume)
                                    .addComponent(jLabelDVXVolume))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSliderDVDVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSliderDVXVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRootLayout.createSequentialGroup()
                                .addComponent(jButtonEject)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMount)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonShutUp)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonTime)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonPlay)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonPause)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonStop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dvxRecordButton)))
                        .addContainerGap())))
        );
        jPanelRootLayout.setVerticalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAuthor)
                        .addComponent(jComboBoxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelChapter)
                        .addComponent(jComboBoxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonChapterPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonChapterMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDVDvolume)
                        .addComponent(labelLanguage2)
                        .addComponent(jLabelHour)
                        .addComponent(jLabelMin)
                        .addComponent(jLabelSec)
                        .addComponent(jLabelFrame))
                    .addComponent(jSliderDVDVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLanguage)
                        .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTitle))
                    .addComponent(jSliderDVXVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDVXVolume)
                        .addComponent(jTextSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLanguage)
                        .addComponent(labelLanguage1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEject)
                    .addComponent(jButtonMount)
                    .addComponent(jButtonShutUp)
                    .addComponent(jButtonTime)
                    .addComponent(jButtonPlay)
                    .addComponent(jButtonPause)
                    .addComponent(jButtonStop)
                    .addComponent(dvxRecordButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(thePanel);
        thePanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

 //       pack();
    }// </editor-fold>                        

/*
private void buttonRecordActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
	System.out.println("buttonRecordActionPerformed - ");
}      */                                       

private void jComboBoxAuthorActionPerformed(java.awt.event.ActionEvent evt) {                                                
	String selected = jComboBoxAuthor.getSelectedItem().toString();
	System.out.println("jComboBoxAuthorActionPerformed - " + jComboBoxAuthor.getSelectedItem());
	Author newAuthor = dvxDBSupport.getAuthor(jComboBoxAuthor.getSelectedItem().toString());
	dvxDBSupport.setAuthor(newAuthor);
	dvxRecordButton.setAuthor(newAuthor);	
	dvxSpeak.speak("Author " + selected );
}                                               

private void jComboBoxLanguageActionPerformed(java.awt.event.ActionEvent evt) {                                                
	String selected = jComboBoxLanguage.getSelectedItem().toString();
		System.out.println("jComboBoxLanguageActionPerformed - " + selected);
		language = dvxDBSupport.getLanguage (selected);
		dvxDBSupport.setLanguage(language);
		
		dvxRecordButton.setLanguage(language);
		dvxSpeak.speak("Language " + selected );
	}                                               
/*
private void jTextChapterActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
	System.out.println("jTextChapterActionPerformed - ");
}   */                                         

private void jComboBoxChapterActionPerformed(java.awt.event.ActionEvent evt) {                                                   
		int chapter = + jComboBoxChapter.getSelectedIndex();
		dvd.chapterStep(chapter + 1);
		dvxSpeak.speak("Chapter " + chapter );
		System.out.println("jComboBoxChapterActionPerformed - " + chapter);
	}                                                  

private void jComboBoxTitleActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	// TODO add your handling code here:
		System.out.println("jComboBoxTitleActionPerformed - "+ jComboBoxTitle.getSelectedIndex());
	dvd.gotoTitle(jComboBoxTitle.getSelectedIndex());
	dvxSpeak.speak("Title " + jComboBoxTitle.getSelectedIndex());
		
	}                                                  

private void jButtonChapterPlusActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	System.out.println("jButtonChapterPlusActionPerformed - ");
	dvd.chapterStep(1);
	dvxSpeak.speak("Chapter Plus");
}                                                  

private void jButtonChapterMinusActionPerformed(java.awt.event.ActionEvent evt) {                                                    
	System.out.println("jButtonChapterMinusActionPerformed - ");
	dvd.chapterStep(-1);
	dvxSpeak.speak("Chapter Minus");
}                                                   
/*
private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {                                          
// 
	System.out.println("buttonAddActionPerformed - ");
}                                         
*/
private void sliderDVDVolumeActionPerformed(ChangeEvent evt) {                                          
		System.out.println("sliderDVDVolumeActionPerformed - " + jSliderDVDVolume.getValue());
		System.out.println("old volume = " + dvd.getVolume());
		float f = (jSliderDVDVolume.getValue()/ 100f);
		System.out.println("setting to = " + f );
		dvd.setVolume( f);
		
	}                                         

private void sliderDVXVolumeActionPerformed(ChangeEvent evt) {                                          
		System.out.println("sliderDVXVolumeActionPerformed - " + jSliderDVXVolume.getValue());		
		float f = jSliderDVXVolume.getValue();
		float vol = f / 100;
		dvxSpeak.setVolume(vol);
//		System.out.println("New voume =  " + vol);		
		
	}            

String num2StringFmt(int i)
{
	if (i<10)
		return "0" + i;
	return "" + i;
	
}

// gca 8-28-11
	
	
//
//
// ******************************************************************
//
//
}