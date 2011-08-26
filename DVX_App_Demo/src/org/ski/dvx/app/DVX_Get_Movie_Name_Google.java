package org.ski.dvx.app;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DVX_Get_Movie_Name_Google {

	public static void getGoogleWave(String path, String message)
	{
		String result = "";
		
		String url = "http://translate.google.com/translate_tts?q=" + message.replace(" ","+").replace("&amp;", "&");
		try
		{
				URL urlObject = new URL(url);
				URLConnection con = urlObject.openConnection();
				con.setRequestProperty
				  ( "User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)" );
				DataInputStream webData = new DataInputStream(con.getInputStream());
				
			     FileOutputStream fo = null;
			     byte [] b = new byte[1];  
	
		       fo = new FileOutputStream(path);
		
		       //  copy the actual file
		       //   (it would better to use a buffer bigger than this)
		
		       while(-1 != webData.read(b,0,b.length)) 
		         fo.write(b,0,1);
		       webData.close();  
		       fo.close();  		
		       DVX_PlaySound.playMP3(path);
         }
		catch (Exception ex)
		{
			System.err.println("Error reading Google : " + ex.toString());
		}
	}
	
	public static String getMovieName(String path, String hash)
	{
		String result = DVX_Constants.MOVE_UNIDENTIFIED;
		String tempBuffer = "";
		
		String url = "http://www.google.com/search?q=dvdid+" + hash + "&hl=en&ie=UTF-8&oe=UTF8";
		try
		{
		URL urlObject = new URL(url);
		URLConnection con = urlObject.openConnection();
		con.setRequestProperty
		  ( "User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)" );
		BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
		while (webData.ready())
		{
			String line = webData.readLine();
//			System.out.println("--->" + webData.readLine());
			tempBuffer+=line;
		}
		String startTarget = "DVD Title: ";
		int dvdTitleStart = tempBuffer.indexOf(startTarget);
		int dvdTitleEnd = tempBuffer.indexOf(";",dvdTitleStart+1);
		if(( dvdTitleStart!=-1)&&	// found start
		  ((dvdTitleEnd-dvdTitleStart)<100)&&	// < 100 characters
		  (dvdTitleEnd>dvdTitleStart))	// end is > start
		{
			result = tempBuffer.substring(dvdTitleStart +startTarget.length(), dvdTitleEnd ). trim();
			result = result.replace("&amp;", "&");
			System.out.println("DVD Name from google is : " + result);
			String temp = result.replace(" ", "+");
			getGoogleWave(path, temp);		// make wave file to commerate the name. 
		}
		
		}
		catch (Exception ex)
		{
			System.err.println("Error reading Google : " + ex.toString());
		}
		
		return result;
		
	}
}
