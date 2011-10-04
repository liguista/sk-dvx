/*
	Project:		DVX_App_Demo	
	File Name:		DVX_FTP.java
	Designer:		Josh Miele
	Author:			Greg
	Contributors:	Owen Edwards					
	Created:		Oct 3, 2011	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					© 2011 - 2011
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

/** Class starts here **/
package org.ski.dvx.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.StringTokenizer;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 * @author Greg
 *
 */
public class DVX_FTP implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	String userName;
	String password;
	String server;
	File  file;
	
	DVX_FTP(File file)
	{
		userName = DVX_Messages.getString("FTP.USERNAME");
		password = DVX_Messages.getString("FTP.PASSWORD");
		server = DVX_Messages.getString("FTP.SERVER");
		this.file = file;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		FTPClient ftp = new FTPClient ();
		try
		{
	      ftp.connect(server);
	      System.out.println("Connected to " + server + ".");
	      System.out.print(ftp.getReplyString());
	      boolean flag = ftp.login(userName, password);
	      
	      createFTPPath(ftp);
	      copyFile(ftp);
	      ftp.disconnect();
		}
		catch (Exception ex)
		{
			System.out.println("FTP Exception : " + ex);
		}

		
	}

	/**
	 * 
	 */
	private void copyFile(FTPClient ftp) {
		// TODO Auto-generated method stub
		
		try
		{
			ftp.enterLocalPassiveMode();

			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			
            InputStream input;

            input = new FileInputStream(file);

            System.out.println(file.getParent() + "/" + file.getName());
            ftp.storeFile(file.getParent() + "/" + file.getName(), input);

            input.close();
			
		}
		catch (Exception ex)
		{
			System.out.println("FTP Send File exception : " + ex);
			
		}
		
	}

	/**
	 * 
	 */
	private void createFTPPath(FTPClient ftp) {
		// TODO Auto-generated method stub
		String buildPath = "";
//		String pathString = file.getPath();
		String parent = file.getParent();
		StringTokenizer st = 
		       new StringTokenizer
		           (parent, "\\");
		try
		{
		while(st.hasMoreTokens()){
		  String s=st.nextToken();
		  if (s.equals("media"))
			  	s="";
		  System.out.println(buildPath + "/" + s);
		  boolean flag =  ftp.makeDirectory(buildPath  + "/" +  s);
		  buildPath += "/" + s;
		  }		
		}
		catch (Exception ex)
		{
			System.out.println("FTP Create Directory exception : " + ex);
		}
	}

	public static void main(String[] args) 	{
		
		System.out.println("FTP Test Startup...");
		File file = new File("a/b/c/d/", "abc.bin");
		DVX_FTP ftp= new DVX_FTP(file);
		ftp.run();
		System.out.println("FTP Test end...");
		
	}
}
