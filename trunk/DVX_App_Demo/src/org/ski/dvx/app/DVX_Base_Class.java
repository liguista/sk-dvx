/**
 * 
 */
package org.ski.dvx.app;

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.User;

import de.humatic.dsj.DSDvd;

/**
 * @author Greg
 *
 */
public class DVX_Base_Class implements java.beans.PropertyChangeListener {

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */

	DSDvd dvd;

	int baseTime = 0;
	int chapter = 0;
	
	boolean verbose = false;
	String lastDVD_ID = ""; 

	DVX_RecordButton dvxRecordButton = null;
	DVX_File_Support dvxFileSupport = null;
	DVX_DB_Support dvxDBSupport = null;
	DVX_Speak dvxSpeak = null;
	Language language = null;
	Movie movie = null;
	DVX_Splash splash = null;

	User user = null;
	Author author = null;
//	private Language language = null;
	
	String movieInfo;

	javax.swing.JFrame mainDVXFrame = null;

	public javax.swing.JFrame getMainDVXFrame() {
		return mainDVXFrame;
	}

	public void setMainDVXFrame(javax.swing.JFrame mainDVXFrame) {
		this.mainDVXFrame = mainDVXFrame;
	}

	public DVX_RecordButton getDvxRecordButton() {
		return dvxRecordButton;
	}

	public void setDvxRecordButton(DVX_RecordButton dvxRecordButton) {
		this.dvxRecordButton = dvxRecordButton;
	}

	public DVX_File_Support getDvxFileSupport() {
		return dvxFileSupport;
	}

	public void setDvxFileSupport(DVX_File_Support dvxFileSupport) {
		this.dvxFileSupport = dvxFileSupport;
	}

	public DVX_DB_Support getDvxDBSupport() {
		return dvxDBSupport;
	}

	public void setDvxDBSupport(DVX_DB_Support dvxDBSupport) {
		this.dvxDBSupport = dvxDBSupport;
	}

	public DVX_Speak getDvxSpeak() {
		return dvxSpeak;
	}

	public void setDvxSpeak(DVX_Speak dvxSpeak) {
		this.dvxSpeak = dvxSpeak;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public DVX_Splash getSplash() {
		return splash;
	}

	public void setSplash(DVX_Splash splash) {
		this.splash = splash;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public DSDvd getDvd() {
		return dvd;
	}

	public void setDvd(DSDvd dvd) {
		this.dvd = dvd;
	}

	public int getBaseTime() {
		return baseTime;
	}

	public void setBaseTime(int baseTime) {
		this.baseTime = baseTime;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getLastDVD_ID() {
		return lastDVD_ID;
	}

	public void setLastDVD_ID(String lastDVD_ID) {
		this.lastDVD_ID = lastDVD_ID;
	}

	public String getMovieInfo() {
		return movieInfo;
	}

	public void setMovieInfo(String movieInfo) {
		this.movieInfo = movieInfo;
	}

	Logger  log4JLogger;
	public Logger getLog4Jlogger() {
		return log4JLogger;
	}

	public void setLog4Jlogger(Logger log4JLogger) {
		this.log4JLogger = log4JLogger;
	}


	DVX_Base_Class()
	{
		super();
		try
		{
			File file = new File ("greg.log");
			if(file.exists())
			{
				file.delete();
			}
		}
		catch (Exception ex){
			
		}
		
		PropertyConfigurator.configure("log4j.properties"); //it likes it here
		log4JLogger = Logger.getLogger(this.getClass());
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
	String num2StringFmt(int number)
	{
		if (number<10)
			return "0" + Integer.toString(number);
		return Integer.toString(number);
		
	}
	
	String numToBool(int num)
	{
		String result = "";
		
		int mask = 0x1000000;
		
		while (mask>0)
		{
			int temp = num & mask;
			
			if (temp!=0)
				result += "1\t";
			else
				result += "0\t";
			mask = mask>>1;
		}
		return result;
	}
	
	static String getOpsHeaders()
	{
/*		String result = "";
		
		result += "UOP_Play_Backwards" +   "\t"  +     DSDvd.UOP_Play_Backwards + "\t"+ "\r";

		result += "UOP_Play_Chapter" +   "\t"  +     DSDvd.UOP_Play_Chapter + "\t"+ "\r";
		          
		result += "UOP_Play_Chapter_Or_AtTime" +   "\t"  +     DSDvd.UOP_Play_Chapter_Or_AtTime + "\t"+ "\r";
		          
		result += "UOP_Play_Forwards" +   "\t"  +     DSDvd.UOP_Play_Forwards + "\t"+ "\r";
		          
		result += "UOP_Play_Title" +   "\t"  +     DSDvd.UOP_Play_Title + "\t"+ "\r";
		          
		result += "UOP_Play_Title_Or_AtTime" +   "\t"  +     DSDvd.UOP_Play_Title_Or_AtTime + "\t"+ "\r";
		          
		result += "UOP_PlayNext_Chapter" +   "\t"  +     DSDvd.UOP_PlayNext_Chapter + "\t"+ "\r";
		          
		result += "UOP_PlayPrev_Or_Replay_Chapter" +   "\t"  +     DSDvd.UOP_PlayPrev_Or_Replay_Chapter + "\t"+ "\r";
		          
		result += "UOP_Resume" +   "\t"  +     DSDvd.UOP_Resume + "\t"+ "\r";
		          
		result += "UOP_ReturnFromSubMenu" +   "\t"  +     DSDvd.UOP_ReturnFromSubMenu + "\t"+ "\r";
		          
		result += "UOP_Select_Angle" +   "\t"  +     DSDvd.UOP_Select_Angle + "\t"+ "\r";
		          
		result += "UOP_Select_Audio_Stream" +   "\t"  +     DSDvd.UOP_Select_Audio_Stream + "\t"+ "\r";
		          
		result += "UOP_Select_Karaoke_Audio_Presentation_Mode" +   "\t"  +     DSDvd.UOP_Select_Karaoke_Audio_Presentation_Mode + "\t"+ "\r";
		          
		result += "UOP_Select_Or_Activate_Button" +   "\t"  +     DSDvd.UOP_Select_Or_Activate_Button + "\t"+ "\r";
		          
		result += "UOP_Select_SubPic_Stream" +   "\t"  +     DSDvd.UOP_Select_SubPic_Stream + "\t"+ "\r";
		          
		result += "UOP_Select_Video_Mode_Preference" +   "\t"  +     DSDvd.UOP_Select_Video_Mode_Preference + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Angle" +   "\t"  +     DSDvd.UOP_ShowMenu_Angle + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Audio" +   "\t"  +     DSDvd.UOP_ShowMenu_Audio + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Chapter" +   "\t"  +     DSDvd.UOP_ShowMenu_Chapter + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Root" +   "\t"  +     DSDvd.UOP_ShowMenu_Root + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_SubPic" +   "\t"  +     DSDvd.UOP_ShowMenu_SubPic + "\t"+ "\r";
		          
		result += "UOP_ShowMenu_Title" +   "\t"  +     DSDvd.UOP_ShowMenu_Title + "\t"+ "\r";
		          
		result += "UOP_Still_Off" +   "\t"  +     DSDvd.UOP_Still_Off + "\t"+ "\r";
		          
		result += "UOP_Stop" +   "\t"  +     DSDvd.UOP_Stop + "\t"+ "\r";		
		return result; */
		
		return "\t\t\t\tSelect_Video_Mode_Preference	" + 
		"Select_Karaoke_Audio_Presentation_Mode	Select_Angle	" + 
		"Select_SubPic_Stream	" + 
		"Select_Audio_Stream	" + 
		"Still_Off	" + 
		"Select_Or_Activate_Button	" + 
		"Resume	" + 
		"ShowMenu_Chapter	" + 
		"ShowMenu_Angle	" + 
		"ShowMenu_Audio	" + 
		"ShowMenu_SubPic	" + 
		"ShowMenu_Root	" + 
		"ShowMenu_Title	" + 
		"Play_Backwards	" + 
		"Play_Forwards	" + 
		"PlayNext_Chapter	" + 
		"PlayPrev_Or_Replay_Chapter	" + 
		"Play_Chapter_Or_AtTime	" + 
		"ReturnFromSubMenu	" + 
		"Stop	" + 
		"Play_Title	" + 
		"Play_Chapter	" + 
		"Play_Title_Or_AtTime";
	}

    public static boolean internetConnectionExists(String URLName){
        try {
          HttpURLConnection.setFollowRedirects(false);
          // note : you may also need
          //        HttpURLConnection.setInstanceFollowRedirects(false)
          HttpURLConnection con =
             (HttpURLConnection) new URL(URLName).openConnection();
          con.setRequestMethod("HEAD");
          return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
        }
        catch (Exception e) {
           e.printStackTrace();
           return false;
        }
         }

}
