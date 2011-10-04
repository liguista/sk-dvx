/*
	Project:		DVX_App_Demo	
	File Name:		DVX_Player_Init.java
	Designer:		Josh Miele
	Author:			Greg
	Contributors:	Owen Edwards					
	Created:		Sep 14, 2011	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					© 2011 - 2011
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

/** Class starts here **/
package org.ski.dvx.app;

import java.awt.Toolkit;

import javax.swing.JPanel;

import org.apache.log4j.Logger;
import org.ski.dvx.app.dialogs.DVDStates;

import de.humatic.dsj.DSDvd;
import de.humatic.dsj.DSFilterInfo;
import de.humatic.dsj.DSFiltergraph;
import de.humatic.dsj.DSJUtils;
import de.humatic.dsj.SwingMovieController;

/**
 * @author Greg
 *
 */
public class DVX_Player_Init extends DVX_GUI {

//	static Logger logger_getUOPs;
	/** The dvx player logger. */
static Logger dvxPlayerLogger;


	/**
	 * Rendering mode flags. Some decoders, subtitles etc. will only work with
	 * DirectShow renderer filters (VMR7 / 9 or EVR). See javadocs for more
	 * details on the matter.
	 **/

	 int flags = DSFiltergraph.VMR9; // DSFiltergraph.DD7 |
											// DSFiltergraph.YUV |
											// DSFiltergraph.DVD_MENU_ENABLED;
	/**
	 * Video and Audio decoders. None of these is installed by dsj, you will
	 * need to check what is available on your system and adjust the names here.
	 **/

	 DSFilterInfo[] videoDecoders = new DSFilterInfo[] { null,
			// DSFilterInfo.filterInfoForName("Elecard MPEG-2 Video Decoder SD"),
			DSFilterInfo.filterInfoForName("Microsoft DTV-DVD Video Decoder") //, 
	// DSFilterInfo.filterInfoForName("CyberLink Video Decoder (PDVD8)")//,
	// DSFilterInfo.filterInfoForName("CyberLink Video/SP Decoder (PDVD9)")//,

	// DSFilterInfo.filterInfoForName("MainConcept (Demo) MPEG-2 Video Decoder")
	};

	/** The audio decoders. */
	 DSFilterInfo[] audioDecoders = new DSFilterInfo[] { null,
			DSFilterInfo.filterInfoForName("Default DirectSound Device"), 
			DSFilterInfo.filterInfoForName("Microsoft DTV-DVD Audio Decoder"), 
			DSFilterInfo.filterInfoForName("ffdshow audio decoder") 
	};

	/**
	 * Instantiates a new dV x_ player.
	 */
	public DVX_Player_Init() {
		// movie = dvdSupport.getMovie("A Beautiful Mind");
		super();
		dvxSpeak = new DVX_Speak();
//		dvxDBSupport.setDvx_speak(dvxSpeak);	
		
		dvxPlayerLogger = Logger.getLogger(this.getClass());
		
		dvdStates = new DVDStates();
		dvdStates.setVisible(false);

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


}
