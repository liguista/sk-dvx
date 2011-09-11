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

import java.net.InetAddress;
import java.net.UnknownHostException;

//***********************************************************************************

public class DVX_Network_Support {

	// ------------------------------------------------------------------------------------

	public String getIpAddress() {
		return ipAddress;
	}

	// ------------------------------------------------------------------------------------

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	// ------------------------------------------------------------------------------------

	public String getHostname() {
		return hostname;
	}

	// ------------------------------------------------------------------------------------

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	String ipAddress = "";
	String hostname = "";

	// ------------------------------------------------------------------------------------
	
	DVX_Network_Support()
	{
		try 
		{
		    setIpAddress(InetAddress.getLocalHost().toString());
		    setHostname(InetAddress.getLocalHost().getHostName());
		} 
		catch (UnknownHostException e) 
		{
		}
		
	}		

}

//***********************************************************************************
