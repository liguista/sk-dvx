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
					and/or Public Domain Code. Please use good judgement 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

package org.ski.dvx.app;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class DVX_Splash extends Window {
  private Image splashImage;
  private int imgWidth, imgHeight;
  private String imgName;
  private static final int BORDERSIZE = 5;
  private static final Color BORDERCOLOR = Color.blue;
  Toolkit tk;


  public DVX_Splash(Frame f, String imgName) {
    super(f);
    this.imgName = imgName;
    tk = Toolkit.getDefaultToolkit();
    splashImage = loadSplashImage();
    showSplashScreen();
    f.addWindowListener(new WindowListener());
    }
  public Image loadSplashImage() {
    MediaTracker tracker = new MediaTracker(this);
    Image result = null;
//    result = tk.getImage(imgName);
    try
    {
    	URL imageURL = ClassLoader.getSystemClassLoader().getResource(imgName);
	    result = tk.getImage(imageURL);
	    
	    tracker.addImage(result, 0);
	    try {
	      tracker.waitForAll();
	      }
	    catch (Exception e) {
	      e.printStackTrace();
	      }
	    imgWidth = result.getWidth(this);
	    imgHeight = result.getHeight(this);
	    return (result);
	    }
    catch (Exception ex)
    {
        ex.printStackTrace();
   }
    return result;
   }

  public void showSplashScreen() {
    Dimension screenSize = tk.getScreenSize();
    setBackground(BORDERCOLOR);
    int w = imgWidth + (BORDERSIZE * 2);
    int h = imgHeight + (BORDERSIZE * 2);
    int x = (screenSize.width - w) /2;
    int y = (screenSize.height - h) /2;
    setBounds(x, y, w, h);
    setVisible(true);
    }

  public void paint(Graphics g) {
    g.drawImage(splashImage, BORDERSIZE, BORDERSIZE,
      imgWidth, imgHeight, this);
    }

  class WindowListener extends WindowAdapter {
    //  was windowActivated, thanks to H.Grippa for the fix!
    public void windowOpened(WindowEvent we) {
      setVisible(false);
      dispose();
      }
    }
}