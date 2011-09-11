/*
	Project:		Windows DVX Player/Editor
	
	File Name:		

	Designer:		Josh Miele

	Author:			Greg Ames

	Contributors:	Owen Edwards
					
	Created:		September 10, 2011
	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					� 2011
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

package org.ski.dvx.app;

import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class DVX_Play_MP3 {

	public static void playMP3(String path)
	{
		try
		{
        FileInputStream mp3_file=new FileInputStream(path);
        Player mp3=new Player(mp3_file);

        mp3.play();
		}
		catch (Exception ex)
		{
			System.err.println("Error playing /mp3 file " + ex.toString());
		}
		
	}
}

