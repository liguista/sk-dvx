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

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.Path;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_RecordButton.
 */
public class DVX_RecordButton extends JButton{

//	public Movie movie;
//	public Author author;
//	public Language language;
	
	/** The dvx_player. */
DVX_GUI dvx_player; 
	
	/** The menu page. */
	public int menuPage;
	
	/** The menu id. */
	public int menuId;
	
	/** The chapter. */
	public int chapter = 0;
	
	/** The time offset. */
	public int timeOffset;
	
	/** The frame offset. */
	public int frameOffset;

//	DVX_DB_Support dvx_db_support = null; 

	/** The playing mode. */
boolean playingMode = false;
	
	/** The menu mode. */
	boolean menuMode = false;

	/** The waiting for first menu. */
	boolean waitingForFirstMenu = true;
	
	/** The mouse listener. */
	MyMouseListener mouseListener;
	
	/**
	 * Gets the frame offset.
	 *
	 * @return the frame offset
	 */
	public int getFrameOffset() {
		return frameOffset;
	}

	/**
	 * Sets the frame offset.
	 *
	 * @param frameOffset the new frame offset
	 */
	public void setFrameOffset(int frameOffset) {
		this.frameOffset = frameOffset;
	}
	
	/**
	 * Checks if is waiting for first menu.
	 *
	 * @return true, if is waiting for first menu
	 */
	public boolean isWaitingForFirstMenu() {
		return waitingForFirstMenu;
	}

	/**
	 * Sets the waiting for first menu.
	 *
	 * @param waitingForFirstMenu the new waiting for first menu
	 */
	public void setWaitingForFirstMenu(boolean waitingForFirstMenu) {
		this.waitingForFirstMenu = waitingForFirstMenu;
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
//		setWaitingForFirstMenu(false);
		this.chapter = chapter;
		if (chapter==0)
		{
			setPlayingMode(false);
			setMenuMode(false);
			setWaitingForFirstMenu(true);
		}
	}

	/**
	 * Gets the time offset.
	 *
	 * @return the time offset
	 */
	public int getTimeOffset() {
		return timeOffset;
	}

	/**
	 * Sets the time offset.
	 *
	 * @param timeOffset the new time offset
	 */
	public void setTimeOffset(int timeOffset) {
		this.timeOffset = timeOffset;
	}

	/**
	 * Checks if is playing mode.
	 *
	 * @return true, if is playing mode
	 */
	public boolean isPlayingMode() {
		return playingMode;
	}
	
	/**
	 * Sets the playing mode.
	 *
	 * @param playingMode the new playing mode
	 */
	public void setPlayingMode(boolean playingMode) {
//		System.out.println(">>>>>> Setting menu mode " + playingMode +   "  - first menu = " + waitingForFirstMenu);
		if (waitingForFirstMenu== false)
			this.playingMode = playingMode;
	}
	
	/**
	 * Checks if is menu mode.
	 *
	 * @return true, if is menu mode
	 */
	public boolean isMenuMode() {
		return menuMode;
	}
	
	/**
	 * Sets the menu mode.
	 *
	 * @param menuMode the new menu mode
	 */
	public void setMenuMode(boolean menuMode) {
//		System.out.println(">>>>>> Setting menu mode " + menuMode +   "  - first menu = " + waitingForFirstMenu);
		this.menuMode = menuMode;
		if (menuMode== true)
			waitingForFirstMenu = false;
	}
	
	/**
	 * Gets the menu page.
	 *
	 * @return the menu page
	 */
	public int getMenuPage() {
		return menuPage;
	}
	
	/**
	 * Sets the menu page.
	 *
	 * @param menuPage the new menu page
	 */
	public void setMenuPage(int menuPage) {
		this.menuPage = menuPage;
	}
	
	/**
	 * Gets the menu id.
	 *
	 * @return the menu id
	 */
	public int getMenuId() {
		return menuId;
	}
	
	/**
	 * Sets the menu id.
	 *
	 * @param menuId the new menu id
	 */
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	
	/** The is key recording. */
	boolean isKeyRecording = false;
	
	/**
	 * The listener interface for receiving myKey events.
	 * The class that is interested in processing a myKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addMyKeyListener<code> method. When
	 * the myKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see MyKeyEvent
	 */
	class MyKeyListener implements KeyListener
	{
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			
			char keyPressed = e.getKeyChar();
			if ((!isKeyRecording)&&(keyPressed=='r'))
			{
				System.out.println("Key Recording started... ");
				isKeyRecording = true;
				dispatchStartRecord();
			}
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println("MyKeyListener - keyPressed = " + e.toString());
//			char keyPressed = e.getKeyChar();
//			if (keyPressed=='r')
//				System.out.println("MyKeyListener - keyTyped = " + e.toString());
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			char keyPressed = e.getKeyChar();
			if ((isKeyRecording)&&(keyPressed=='r'))
//			System.out.println("MyKeyListener - keyReleased = " + e.toString());
			
//			if (keyPressed=='r')
				System.out.println("Key Recording ended.");
			rs.stopRecording();
			
			isKeyRecording= false;
		}
		
		/**
		 * Dispatch start record.
		 */
		void dispatchStartRecord()
		{
			if(waitingForFirstMenu)
			{
				startRecordMovieNameClip();
				return;
			}
			
			if(menuMode)
			{
				startRecordMenuClip();
				return;
			}
			
			if(playingMode)
			{
				startRecordTimeClip();
				return;
			}			
		}
	}

	/** The output file. */
	File outputFile = null;
	
	/** The rs. */
	DVX_RecordSound rs = null;
	
	/**
	 * The listener interface for receiving myMouse events.
	 * The class that is interested in processing a myMouse
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addMyMouseListener<code> method. When
	 * the myMouse event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see MyMouseEvent
	 */
	class MyMouseListener implements MouseListener
	{
		
		/**
		 * Instantiates a new my mouse listener.
		 */
		MyMouseListener()
		{
		}
		
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("MyMouseListener - mouseClicked" + e.toString());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			
			System.out.println();
			System.out.println("mousePressed");
	/*			System.out.println("getMovie " + getMovie());
			System.out.println("getAuthor " + getAuthor());
			System.out.println("menuPage " + menuPage);
			System.out.println("menuId " + menuId);*/

			System.out.println("menuMode = " + menuMode);
			System.out.println("playingMode = " + playingMode);

			dispatchStartRecord();

		}
		
		/**
		 * Dispatch start record.
		 */
		void dispatchStartRecord()
		{
			if(waitingForFirstMenu)
			{
				startRecordMovieNameClip();
				return;
			}
			
			if(menuMode)
			{
				startRecordMenuClip();
				return;
			}
			
			if(playingMode)
			{
				startRecordTimeClip();
				return;
			}			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("MyMouseListener - mouseReleased" + e.toString());
			rs.stopRecording();
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("MyMouseListener - mouseEntered = " + e.toString());
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("MyMouseListener - mouseExited = "  + e.toString());
			
		}
	}
	
	/**
	 * Start record menu clip.
	 */
	void startRecordMenuClip()
	{

		System.out.println("startRecordMenuClip()");
		
		String filePrefix = DVX_Constants.MOVIE_PATH + 
							dvx_player.getMovie().getMovieSbnNumber() + 
							DVX_Constants.MOVIE_MENUS_PATH;
		Path path = dvx_player.getDvxDBSupport().getInsertPath(dvx_player.getAuthor(), filePrefix);

		String filePath = 	filePrefix + 
							dvx_player.getMovie().getMovieSbnNumber() + 
							DVX_Constants.HYPHEN  +
							dvx_player.getAuthor().getAuthorId() + 
							DVX_Constants.HYPHEN  + 
							menuPage + 
							DVX_Constants.HYPHEN + 
							menuId + 
							DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV  
							;
		startRecording(filePath);
		dvx_player.getDvxDBSupport().insertUpdateMovieMenu(dvx_player.getAuthor(), dvx_player.getLanguage(), dvx_player.getMovie(),  getMenuPage(), getMenuId(), path, "");
		dvx_player.getDvxDBSupport().log(dvx_player.getMovie(), 
				dvx_player.getAuthor().getUser(), 
				DVX_Constants.TRANSACTION_TYPE_ADD_MOVIE_MENU, 
				DVX_Constants.TRANSACTION_LEVEL_INFO, 
				"Adding Movie Menu Clip. " + filePath);	
	}
	
	/**
	 * Start record time clip.
	 */
	void startRecordTimeClip()
	{
		System.out.println("startRecordTimeClip");
		int chapterNow = getChapter();
		int timeOffset = getTimeOffset();
		int frameOffsetNow = getFrameOffset();
		
		String filePrefix = DVX_Constants.MOVIE_PATH + 
		dvx_player.getMovie().getMovieSbnNumber() + 
		DVX_Constants.MOVIE_DESCRIPTIONS_PATH;
		Path path = dvx_player.getDvxDBSupport().getInsertPath(dvx_player.getAuthor(), filePrefix);
		

		String filePath = 	
							filePrefix + 
							dvx_player.getMovie().getMovieSbnNumber() + 
							DVX_Constants.HYPHEN +
							dvx_player.getAuthor().getAuthorId() + 
							DVX_Constants.HYPHEN  + 
							dvx_player.getLanguage().getLanguageId() + 
							DVX_Constants.HYPHEN  + 
							chapterNow + 
							DVX_Constants.HYPHEN  + 
							timeOffset + 
							DVX_Constants.HYPHEN  + 
							frameOffsetNow + 
							DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV  
							;
		startRecording(filePath);
		dvx_player.getDvxDBSupport().log(dvx_player.getMovie(), 
				dvx_player.getAuthor().getUser(), 
				DVX_Constants.TRANSACTION_TYPE_ADD_MOVIE_EVENT, 
				DVX_Constants.TRANSACTION_LEVEL_INFO, 
				"Adding Movie Time Clip. " + filePath);	
		dvx_player.getDvxDBSupport().insertUpdateTimeClip(dvx_player.getAuthor(), dvx_player.getLanguage(), dvx_player.getMovie(),  chapterNow, timeOffset, frameOffsetNow, path, "");
	}
	
	/**
	 * Start record movie name clip.
	 */
	void startRecordMovieNameClip()
	{
		System.out.println("startRecordMovieNameClip");
		String filePrefix = DVX_Constants.MOVIE_PATH + 
		dvx_player.getMovie().getMovieSbnNumber() + 
		DVX_Constants.MOVIE_MENUS_PATH;
		Path path = dvx_player.getDvxDBSupport().getInsertPath(dvx_player.getAuthor(), filePrefix);

		String filePath = 	filePrefix + 
				DVX_Constants.MOVIE_NAME_WAV  
				;
		startRecording(filePath);
		
		dvx_player.getDvxDBSupport().insertUpdateMovieNameClip(dvx_player.getAuthor(), dvx_player.getLanguage(), dvx_player.getMovie(),  menuPage, menuId, path, "");
		dvx_player.getDvxDBSupport().log(dvx_player.getMovie(), 
				dvx_player.getAuthor().getUser(), 
				DVX_Constants.TRANSACTION_TYPE_ADD_MOVIE_NAME, 
				DVX_Constants.TRANSACTION_LEVEL_INFO, 
				"Adding Movie Name Clip. " + filePath);	
	}
	
	/**
	 * Start recording.
	 *
	 * @param filePath the file path
	 */
	void startRecording(String filePath)
	{
		outputFile = new File(filePath);
		System.out.println("Recording to : " + filePath);
								
		AudioFormat	audioFormat = new AudioFormat(
				DVX_Constants.AUDIO_CHANNELS_ENCODING,
				DVX_Constants.AUDIO_SAMPLE_RATE, 
				DVX_Constants.AUDIO_BITS_PER_CHANNEL, 
//				DVX_Constants.AUDIO_CHANNELS_MONO, 
				DVX_Constants.AUDIO_CHANNELS_STEREO, 
				DVX_Constants.AUDIO_FRAME_SIZE, 
				DVX_Constants.AUDIO_FRAME_RATE, 
				false);
		DataLine.Info	info = new DataLine.Info(TargetDataLine.class, audioFormat);
		TargetDataLine	targetDataLine = null;
		try
		{
			targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
			targetDataLine.open(audioFormat);
		}
		catch (Exception ex)
		{
			System.out.println("Unable to get a recording line" + ex.toString());
			ex.printStackTrace();
			dvx_player.getDvxDBSupport().log(dvx_player.getMovie(), 
								dvx_player.getAuthor().getUser(), 
								DVX_Constants.TRANSACTION_TYPE_OTHER, 
								DVX_Constants.TRANSACTION_LEVEL_ERROR, 
								"Unable to get a recording line. " + ex.toString());
//			System.exit(1);
		}

		/* Again for simplicity, we've hard coded the audio file
		   type, too.
		*/
		AudioFileFormat.Type	targetType = AudioFileFormat.Type.WAVE;
		
		/* Now, we are creating an SimpleAudioRecorder object. It
		   contains the logic of starting and stopping the
		   recording, reading audio data from the TargetDataLine
		   and writing the data to a file.
		*/
		rs = new DVX_RecordSound(
				targetDataLine,
				targetType,
				outputFile);
		rs.start();
		System.out.println("Recording...");

	}
	
	/**
	 * Instantiates a new dV x_ record button.
	 *
	 * @param dvx_player the dvx_player
	 * @param label the label
	 * @param icon the icon
	 */
	DVX_RecordButton(DVX_GUI dvx_player, String label,ImageIcon icon)
//	RecordButton(String label)
	{
		super(label, icon);
		this.dvx_player =  dvx_player;
//		super(label);
		mouseListener = new MyMouseListener();
		this.addMouseListener( mouseListener);
		// this.setLabel(label);
		this.addKeyListener(new MyKeyListener());
		
//		dvx_db_support = new DVX_DB_Support();

	}


}
