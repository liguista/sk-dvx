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
	
	DVX_RecordButton recordButton = null;
	
	DVX_File_Support dvxFileSupport = null;
	
	Language language = null;
	
	boolean wasFBI = false;
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
		recordButton.setMenuMode(false);
		recordButton.setPlayingMode(true);
	}

	void setMenuMode()
	{
		recordButton.setMenuMode(true);
		recordButton.setPlayingMode(false);
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
			recordButton = new DVX_RecordButton("Record", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Record-Normal-icon.png"));
			//			recordButton = new RecordButton("Record");
			recordButton.setAuthor(dvxDBSupport.getAuthor());
			recordButton.setMovie(movie);
			recordButton.setLanguage(language);
			recordButton.setMnemonic('r');
			
/*			BorderLayout dvxButtons = new BorderLayout();
			dvxButtons.addLayoutComponent(new JButton("Hello"), JButton.LEFT);
			dvxButtons.addLayoutComponent(new JButton("There"), JButton.CENTER);
			dvxButtons.addLayoutComponent(new JButton("Tool"), JButton.RIGHT);*/
			
//			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
//					recordButton);
			
			JButton btnChapterPlus 	= new JButton("C+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
			JButton btnChapterMinus = new JButton("C-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));

			JButton btnTitlePlus 	= new JButton("T+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
			JButton btnTitleMinus 	= new JButton("T-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));

			JButton btnShutUp = new JButton("Shut Up",new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "sound-off-icon.png"));
			JButton btnTime = new JButton("Time", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Time-Machine-icon.png"));
			JButton btnPlay = new JButton("Play", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Button-Play-icon_002.png"));
			JButton btnPause = new JButton("Pause", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Pause-icon.png"));
			JButton btnStop = new JButton("Stop", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Stop-Pressed-Blue-icon.png"));
			JButton btnEject = new JButton("Eject", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "cd-eject-icon.png"));
			JButton btnMount = new JButton("Mount", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Device-cd-rom-mount-icon.png"));
			btnPlay.disable();
			btnPause.disable();
			btnStop.disable();
			btnEject.disable(); 
			JPanel myPanel = new JPanel();
			
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

			myPanel.add(btnEject);
			btnEject.addActionListener(new MyButtonListener());
			char c = 'e';
			c = DVX_Messages.getChar("PlayDVD.Keyboard.Eject");
//			btnEject.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Eject"));
			btnEject.setMnemonic(c);
			
			myPanel.add(btnMount);
			btnMount.addActionListener(new MyButtonListener());
			btnMount.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Mount"));
       
			myPanel.add(btnShutUp);
			btnShutUp.addActionListener(new MyButtonListener());
			btnShutUp.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ShutUp"));
			
			myPanel.add(btnTime);
			btnTime.addActionListener(new MyButtonListener());
			btnTime.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Time"));

			myPanel.add(btnPlay);
			btnPlay.addActionListener(new MyButtonListener());
			btnPlay.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Play"));
			
			myPanel.add(btnPause);
			btnPause.addActionListener(new MyButtonListener());
			btnPause.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Pause"));

			myPanel.add(btnStop);
			btnStop.addActionListener(new MyButtonListener());
			btnStop.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Stop"));
			
//			recordButton.setSize(40, 12);
			myPanel.add(recordButton);
//			JLayout buttonLayout = new JLayout();
			mainFrame.add(myPanel,java.awt.BorderLayout.SOUTH);
//			f.add(recordButton,java.awt.BorderLayout.SOUTH);
//			JPanel panel = new JPanel(new BorderLayout());
			
//			panel.add(new JButton("Record 1"), JPanel.LEFT_ALIGNMENT);
//			panel.add(new JButton("Record 2"), JPanel.CENTER_ALIGNMENT);
//			panel.add(new JButton("Record 3"), JPanel.RIGHT_ALIGNMENT);

//			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
//					panel);

/*			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
					new RecordButton("Click to Record"));
			f.getContentPane().add(java.awt.BorderLayout.SOUTH,
					new RecordButton("Click to Record"));
*/
			mainFrame.pack();

			mainFrame.setSize(1200, 800);

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
							.print(", param_" + i + " = " + ge[i] + ":"+Long.toString(v, 16) );  //$NON-NLS-2$
			}

			if (verbose)
				// if (ge.length>0)
				System.out.println(DVX_Messages.getString("PlayDVD.30")); 
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

					System.out.println("Was fbi = " + wasFBI);
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
						recordButton.setMovie(movie);
						
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

				// System.out.println("Time event = " + Math.abs(ge[1]) + " - "
				// + Long.toString(Math.abs(ge[1]), 16));

				System.out
						.println(DVX_Messages.getString("PlayDVD.36") + chapter + DVX_Messages.getString("PlayDVD.37") + (dvd.getTime() - baseTime) / 1000);  //$NON-NLS-2$
				// System.out.println("Time event 3 = " + ge1[1] / 1000);
				// System.out.println("Time event 3 = " +
				// Integer.toString(ge1[1], 16));
				if (recordButton!=null)
					recordButton.setTimeOffset((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC);
				if (dvxDBSupport!=null)
				dvxDBSupport.checkTimeEvent(movie, dvxDBSupport.getAuthor(), language, chapter,
						((dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC), 0);
				setPlayingMode();	// set the status for record to time mode...

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
				
				recordButton.setMenuMode(false);				
				recordButton.setChapter(chapter);
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
				recordButton.setMenuPage(menuPage);
				recordButton.setMenuId(menuID);
				recordButton.setMenuMode(true);
				recordButton.setPlayingMode(false);
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
					}
				}
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_ON == DSJUtils.getEventValue_int(pe) ) 
			{
				DVX_PlaySound.playWav(DVX_Constants.FBI_LOVE, false);
				System.out.println("The FBI Loves you...");
				wasFBI = true;
				break;
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_STILL_OFF == DSJUtils.getEventValue_int(pe) ) 
			{
				System.out.println("The FBI No Longer Loves you...");
//				if (wasFBI == true)
//				{
					DVX_PlaySound.playWav(DVX_Constants.FBI_NO_LOVE, false);
//					wasFBI = false;
//				}
				wasFBI = false;
				break;
			}
			if (de.humatic.dsj.DSConstants.EC_DVD_DISC_EJECTED == DSJUtils.getEventValue_int(pe) )
				{
					DVX_PlaySound.playWav(DVX_Constants.DVD_EJECTED, false);
				}
			if (de.humatic.dsj.DSConstants.EC_DVD_DISC_INSERTED == DSJUtils.getEventValue_int(pe) ) 
				{
					DVX_PlaySound.playWav(DVX_Constants.DVD_MOUNTED, false);
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
				
				recordButton.setLanguage(language);
			}
			if (menuName.equals("Author"))
			{
				System.out.println("Was Author...");
				Author newAuthor = dvxDBSupport.getAuthor(menuItem);
				dvxDBSupport.setAuthor(newAuthor);
				recordButton.setAuthor(newAuthor);				
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
		
	
//
//
// ******************************************************************
//
//
}