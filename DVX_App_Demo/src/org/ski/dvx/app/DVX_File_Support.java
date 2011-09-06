package org.ski.dvx.app;

import java.io.File;

public class DVX_File_Support {

	// validate the directory structure is valid on the disk...
	
	public static void DVX_File_Support(String dvdId)
	{
		File path = new File(DVX_Constants.MOVIE_PATH +  dvdId);
		
		if (!path.exists())
		{
			boolean result = path.mkdir();
			System.out.println("Create path " + path.toString() + " was " + result);
		}
		
		path = new File(DVX_Constants.MOVIE_PATH +  dvdId + DVX_Constants.MOVIE_AUDIO_PATH);

		if (!path.exists())
		{
			boolean result = path.mkdir();
			System.out.println("Create path " + path.toString() + " was " + result);
		}

		path = new File(DVX_Constants.MOVIE_PATH +  dvdId + DVX_Constants.MOVIE_DESCRIPTIONS_PATH);
		if (!path.exists())
		{
			boolean result = path.mkdir();
			System.out.println("Create path " + path.toString() + " was " + result);
		}

		path = new File(DVX_Constants.MOVIE_PATH +  dvdId + DVX_Constants.MOVIE_MENUS_PATH);
		if (!path.exists())
		{
			boolean result = path.mkdir();
			System.out.println("Create path " + path.toString() + " was " + result);
		}
	}
}
