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

import java.io.File;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_File_Support.
 */
public class DVX_File_Support {

	// validate the directory structure is valid on the disk...
	
	/**
	 * DV x_ file_ support.
	 *
	 * @param dvdId the dvd id
	 */
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
