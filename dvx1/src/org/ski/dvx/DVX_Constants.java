package org.ski.dvx;

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

import javax.sound.sampled.AudioFormat;

public class DVX_Constants {
	
	public final static String CR_LF = "\r\n";
	public final static String HYPHEN = "-";
	public final static String SPACE_HYPHEN_SPACE = "-";
	public final static String MEDIA_PATH = "media/";
	
//	public final static String DVX_RESOURCES = "../resources/" ;
//	public final static String DVX_RESOURCES_IMAGES = DVX_RESOURCES + "images/";

	public final static String GLOBAL_PATH = MEDIA_PATH + "globals/";
	public final static String GLOBAL_IMAGES_PATH = GLOBAL_PATH + "images/";
	public final static String GLOBAL_IMAGES_PATH_24_X_24 = GLOBAL_IMAGES_PATH + "icons/";
	public final static String GLOBAL_MOVIE_PATH = GLOBAL_PATH  + "movies/";
	
	public final static String GLOBAL_SPLASH_IMAGE = GLOBAL_IMAGES_PATH  + "sksplash.gif";
	public final static String GLOBAL_APPLICATION_ICON = GLOBAL_IMAGES_PATH  + "dvxicon.gif";
	public final static String DVX_APPLICATION_NAME = "DVX - The New Media Player";

	public final static String MOVIE_PATH = MEDIA_PATH  + "movies/";

	public final static String MOVIE_AUDIO_PATH = "/audio/";	// this follows the movie id path
	public final static String MOVIE_DESCRIPTIONS_PATH = MOVIE_AUDIO_PATH + "descriptions/";
	public final static String MOVIE_MENUS_PATH = MOVIE_AUDIO_PATH + "menus/";
	
	public final static String GLOBAL_AUDIO_PATH = GLOBAL_PATH + "audio/";
	
	public final static String MOVE_UNIDENTIFIED = "Unable to lookup movie name";
	
	public final static String GLOBAL_AUDIO_FILE_TYPE_WAV = ".wav";
	public final static String GLOBAL_AUDIO_FILE_TYPE_MP3 = ".mp3";
	
	public final static String DVX_BOOKMARK_FILE = "DVX_BOOKMARK_";
	
	
	public final static String DVD_Identified_WAV			= GLOBAL_AUDIO_PATH  + "DVD_Identified" 		+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String DVD_Not_In_Database_WAV		= GLOBAL_AUDIO_PATH  + "DVD_Not_In_Database" 	+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String DVX_Waiting_WAV				= GLOBAL_AUDIO_PATH  + "DVX_Waiting" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String Is_This_Correct_WAV			= GLOBAL_AUDIO_PATH  + "Is_This_Correct" 		+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String Loading_DVD_WAV				= GLOBAL_AUDIO_PATH  + "Loading_DVD" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String No_DVD_In_Drive_WAV			= GLOBAL_AUDIO_PATH  + "No_DVD_In_Drive" 		+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String Speak_The_Name_Of_DVD_WAV	= GLOBAL_AUDIO_PATH  + "Speak_The_Name_Of_DVD" 	+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String Thank_You_WAV				= GLOBAL_AUDIO_PATH  + "Thank_You" 				+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String The_DVD_Name_Is_WAV			= GLOBAL_AUDIO_PATH  + "The_DVD_Name_Is" 		+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String Welcome_DVX_WAV				= GLOBAL_AUDIO_PATH  + "Welcome_DVX" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String FBI_LOVE						= GLOBAL_AUDIO_PATH  + "FBI_Love" 				+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String FBI_NO_LOVE					= GLOBAL_AUDIO_PATH  + "FBI_No_Love" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String ADDING_MOVIE_TO_DVX_DATABASE	= GLOBAL_AUDIO_PATH  + "Adding_Movie_DVX" 		+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String DVD_EJECTED					= GLOBAL_AUDIO_PATH  + "DVD_EJECTED" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String DVD_MOUNTED					= GLOBAL_AUDIO_PATH  + "DVD_MOUNTED" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String COMMUNICATION_FAILURE_WAV	= GLOBAL_AUDIO_PATH  + "Communication_Failure" 	+ GLOBAL_AUDIO_FILE_TYPE_WAV ;

	public final static String MOVIE_NAME_WAV				=					   "Movie_Name" 			+ GLOBAL_AUDIO_FILE_TYPE_WAV ;
	public final static String MOVIE_NAME_MP3				=					   "Movie_Name" 			+ GLOBAL_AUDIO_FILE_TYPE_MP3 ;
	
	public final static String ASTRIX_BAR = "************************************";
	public final static String DVD_ID = "DVD ID = ";
		
	public final static int USER_TYPE_ALL = 0;
	public final static int USER_TYPE_USER = 1;
	public final static int USER_TYPE_AUTHOR = 2;
	public final static int USER_TYPE_ADMIN = 3;
	public final static int USER_TYPE_GOD = 100;
	
	public final static int MOVIE_MOUNT_DELAY_MS = 5 * 1000;

	public final static int MS_PER_SEC =  1000;

	public final static int SECONDS_PER_MINUTE =  60;
	public final static int SECONDS_PER_HOUR =  (SECONDS_PER_MINUTE * 60);


//  transaction log type enums
	
	public final static String	TRANSACTION_TYPE_LOG 					= "Log";
	public final static String	TRANSACTION_TYPE_LOGIN 					= "Login";
	public final static String	TRANSACTION_TYPE_LOGOUT 				= "Logout";
	public final static String	TRANSACTION_TYPE_FIND_DVD 				= "Find_Dvd";
	public final static String	TRANSACTION_TYPE_ADD_USER 				= "Add_User";
	public final static String	TRANSACTION_TYPE_ADD_MOVIE_NAME	 		= "Add_Movie_Name";
	public final static String	TRANSACTION_TYPE_ADD_MOVIE_MENU 		= "Add_Movie_Menu";
	public final static String	TRANSACTION_TYPE_ADD_MOVIE_EVENT 		= "Add_Movie_Event";
	public final static String	TRANSACTION_TYPE_UPDATE_MOVIE_MENU 		= "Update_Movie_Menu";
	public final static String	TRANSACTION_TYPE_UPDATE_MOVIE_EVENT 	= "Update_Movie_Event";
	public final static String	TRANSACTION_TYPE_OTHER 					= "Other";
	public final static String	TRANSACTION_TYPE_UNDEFINED 				= "Undefined";
	
//  transaction log level enums

	public final static String	TRANSACTION_LEVEL_FATAL 				= "Fatal";
	public final static String	TRANSACTION_LEVEL_ERROR 				= "Error";
	public final static String	TRANSACTION_LEVEL_WARNING 				= "Warning";
	public final static String	TRANSACTION_LEVEL_INFO 					= "Info";
	public final static String	TRANSACTION_LEVEL_MESSAGE 				= "Message";
	public final static String	TRANSACTION_LEVEL_OTHER 				= "Other";
	public final static String	TRANSACTION_LEVEL_UNDEFINED 			= "Undefined";

	// recording options
	
	public final static  		AudioFormat.Encoding	    
								AUDIO_CHANNELS_ENCODING 				= AudioFormat.Encoding.PCM_SIGNED;
	public final static int	    AUDIO_BITS_PER_CHANNEL 					= 16;
	
	public final static int	    AUDIO_CHANNELS_MONO 					= 1;
	public final static int	    AUDIO_CHANNELS_STEREO 					= 2;	// this on is used for now...
	
	public final static float   AUDIO_SAMPLE_RATE 						= 44100.0F;
	public final static float   AUDIO_FRAME_RATE 						= 44100.0F;
	public final static int     AUDIO_FRAME_SIZE 						= 4;	// bytes per audio stereo frame???
	
	// description types enum values
	
	public final static String  DESCRIPTION_TYPE_AUDIO_ALERT			= "Audio Alert";
	public final static String  DESCRIPTION_TYPE_AUDIO_DESCRIPTION		= "Audio Description";
	public final static String  DESCRIPTION_TYPE_AUDIO_EVENT			= "Audio Event";
	public final static String  DESCRIPTION_TYPE_AUDIO_CLOSED_CAPTION	= "Closed Caption";
	public final static String  DESCRIPTION_TYPE_AUDIO_MENU_DESCRIPTION	= "Menu Description";
	public final static String  DESCRIPTION_TYPE_AUDIO_MIDI_EVENT		= "Midi Event";
	public final static String  DESCRIPTION_TYPE_AUDIO_VISUAL_QUE		= "Visual Que";
	public final static String  DESCRIPTION_TYPE_AUDIO_OTHER			= "Other";
	public final static String  DESCRIPTION_TYPE_AUDIO_UNDEFINED		= "Undefined";
	public final static String  DESCRIPTION_TYPE_AUDIO_INTERSTITUAL		= "Interstitual";
	
	public static final String 	DVX_DEFAULT_USER 		= "Greg";
	public static final String 	DVX_DEFAULT_AUTHOR 		= "Greg";
	public static final String 	DVX_DEFAULT_LANGUAGE 	= "English";
	
	public static final String 	DVX_USER_ALL = "All";
	public static final int 	DVX_USER_ALL_ID = 0;

	public static final String 	DVX_AUTHOR_ALL = "All";
	public static final int 	DVX_AUTHOR_ALL_ID = 0;

	public static final String 	DVX_LANGUAGE_ALL = "All";
	public static final int 	DVX_LANGUAGE_ALL_ID = 0;

	
	}

