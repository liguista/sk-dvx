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

