/**
 * 
 */
package org.ski.dvx.app;

import java.beans.PropertyChangeEvent;

import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;

import de.humatic.dsj.DSDvd;

/**
 * @author Greg
 *
 */
public class DVX_Base_Class implements java.beans.PropertyChangeListener {

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	
	javax.swing.JFrame mainDVXFrame = null;

	DVX_RecordButton dvxRecordButton = null;
	DVX_File_Support dvxFileSupport = null;
	DVX_DB_Support dvxDBSupport = null;
	DVX_Speak dvxSpeak = null;
	Language language = null;
	Movie movie = null;
	DVX_Splash splash = null;


	DSDvd dvd;

	int baseTime = 0;
	int chapter = 0;
	
	boolean verbose = true;
	String lastDVD_ID = ""; 


	DVX_Base_Class()
	{
		super();
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

}
