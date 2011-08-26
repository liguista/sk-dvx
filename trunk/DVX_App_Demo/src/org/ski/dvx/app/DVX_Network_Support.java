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
