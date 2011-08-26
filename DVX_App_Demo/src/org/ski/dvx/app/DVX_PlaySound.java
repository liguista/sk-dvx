package org.ski.dvx.app;

import java.io.File;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

import javazoom.jl.player.Player;

public class DVX_PlaySound {
	static Clip soundClip = null;

	static boolean waiting ;
	
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

	static void  playWav(String filePath, boolean wait) {
		// specify the sound to play
		// (assuming the sound can be played by the audio system)
		
		if (waiting)
		{
			try{
			// this.wait(50);
			System.class.wait(50);

			} catch (Exception ex){};
		}
		waiting = wait;
		try {
			if (soundClip != null) // if clip is playing... stop it and close
									// it...
			{
				soundClip.stop();
				soundClip.close();
			}

			File soundFile = new File(filePath);
			AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);

			// load the sound into memory (a Clip)
			DataLine.Info info = new DataLine.Info(Clip.class,
					sound.getFormat());
			soundClip = (Clip) AudioSystem.getLine(info);
			soundClip.open(sound);

			// due to bug in Java Sound, explicitly exit the VM when
			// the sound has stopped.
			soundClip.addLineListener(new LineListener() {
				public void update(LineEvent event) {
					if (event.getType() == LineEvent.Type.STOP) {
						event.getLine().close();
						waiting = false;
						// System.exit(0);
					}
				}
			});

			// play the sound clip
			soundClip.start();
			while (waiting)
			{
				try{
					// this.wait(50);
					System.class.wait(50);
					} catch (Exception ex){};
			}
		} catch (Exception ex) {
			System.out.println("Exception Audio " + ex);
		}

	}
}