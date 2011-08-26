package org.ski.dvx.app;

//To compile, execute the command javac DBID.java
//To run, execute the command java DBID [-url]
//The -url parameter will output a full URL, without it only the DBID


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
//import java.util.List;
import java.util.logging.Logger;
import java.util.zip.CRC32;

public class DVX_DVD_Identification
{
     private static final Logger LOGGER = Logger.getLogger(DVX_DVD_Identification.class.getName());
     
     private static final String DBID_EXEC = DVX_Messages.getString("DBID.0"); //$NON-NLS-1$
     
     private static String dvdDevice = "";
/*
     public static void main(String[] args)
     {
    	 	File[] rootList = File.listRoots();
    	 	
    	 	String volumeLabel = Messages.getString("DBID.1"); //$NON-NLS-1$
    	 	
    	 	for (int i = 0;i<rootList.length;i++)
    	 	{
    	 		File theVolume =rootList[i]; 
    	 		File DVD = new File(theVolume.getAbsolutePath(),Messages.getString("DBID.2")); //$NON-NLS-1$
    	 		if (DVD.exists())
    	 		{
    	 			System.out.println(Messages.getString("DBID.3") + theVolume.getAbsolutePath()); //$NON-NLS-1$
    	 			volumeLabel = theVolume.getAbsolutePath();
    	 		}
    	 		else
    	 		{
    	 			// System.out.println("DVD not found : " + theVolume.getAbsolutePath());
    	 		}
    	 			
//    	 		System.out.println(theVolume.getAbsolutePath());
    	 		 
    	 	}
             // String volumeLabel = getVolumeLabel();
             LOGGER.fine(Messages.getString("DBID.4") + volumeLabel); //$NON-NLS-1$
             
             System.out.println(Messages.getString("DBID.5") + getDVD_ID(volumeLabel)); //$NON-NLS-1$
             CRC32 crc32 = new CRC32();
//I'm not sure of the intent of the substring command below, but on my system 
//it crashes if less than 12 characters.  It could mean to truncate to 12 
//characters or it could mean to pad to 12 characters.  Current code truncates,
//add comment to the trim() line to pad. Truncate seems to be what Windows
//utility does.
String paddedVolumeLabel = volumeLabel.concat(Messages.getString("DBID.6")); //$NON-NLS-1$
             String labelHead = paddedVolumeLabel.substring(0, 11);
		labelHead = labelHead.trim();
             LOGGER.fine(Messages.getString("DBID.7") + labelHead); //$NON-NLS-1$
             crc32.update(labelHead.getBytes());
             LOGGER.fine(Messages.getString("DBID.8") + Long.toHexString(crc32.getValue()).toUpperCase()); //$NON-NLS-1$
//The original Java code was written by a Mac user, why implement something in
//Java if it's not portable?  As a hack, this should work for Ubuntu systems.
             File[] vobs = new File(volumeLabel+Messages.getString("DBID.9")).listFiles(new FileFilter() { //$NON-NLS-1$

                     public boolean accept(File pathname)
                     {
                             return pathname.isFile() && pathname.getName().endsWith(Messages.getString("DBID.10")); //$NON-NLS-1$
                     }
             });

             for (File vob : vobs) {
                     String name = vob.getName().toUpperCase();
                     LOGGER.fine(Messages.getString("DBID.11")+name+Messages.getString("DBID.12")); //$NON-NLS-1$ //$NON-NLS-2$
                     crc32.update(name.getBytes());
                     ByteBuffer buf = ByteBuffer.allocate(8);
                     buf.order(ByteOrder.BIG_ENDIAN);	// was little endian...
                     buf.putLong(vob.length());
                     buf.flip();
                     //buf.position(4);
                     crc32.update(buf.get());
                     crc32.update(buf.get());
                     crc32.update(buf.get());
                     crc32.update(buf.get());
             }

//Potential issue with not using a 0 pad? Windows utility seems to use one
//but this program doesn't.
             long dbid = crc32.getValue()^0xFFFFFFFFl;
             if(args.length > 0 && args[0].equals(Messages.getString("DBID.13"))) //$NON-NLS-1$
             {
                     System.out.println(Messages.getString("DBID.14")+Long.toHexString(dbid).toUpperCase()); //$NON-NLS-1$
             }
             else
             {
                     System.out.println(Long.toHexString(dbid).toUpperCase());
                     System.out.println(Messages.getString("DBID.15")+Long.toHexString(dbid).toUpperCase()); //$NON-NLS-1$
                     System.out.println(Messages.getString("DBID.16") + Messages.getString("DBID.17")); //$NON-NLS-1$ //$NON-NLS-2$
            }
     } */

     public static String getDVD_ID(String path)
     {
    	 try
         {
//get-volume.sh is only a single line but hard to get to run in exec()
///usr/bin/isoinfo -d -i /dev/cdrom | awk -F": " '/Volume id/{print $2}'
                 Process proc = Runtime.getRuntime().exec(DBID_EXEC + DVX_Messages.getString("DBID.18") + path); //$NON-NLS-1$

                 LineNumberReader reader = new LineNumberReader(new InputStreamReader(new BufferedInputStream(proc.getInputStream())));
                 String line = null;
                 do
                 {
                         line = reader.readLine();

                         if(line == null) 
                        	 continue;
                         return line;
                 }
                 while(line != null);

         }
         catch (Exception e)
         {
                 e.printStackTrace();
         }
         return null;
     }
     public static String getVolumeLabel()
     {
             try
             {
//get-volume.sh is only a single line but hard to get to run in exec()
///usr/bin/isoinfo -d -i /dev/cdrom | awk -F": " '/Volume id/{print $2}'
                     Process proc = Runtime.getRuntime().exec(DVX_Messages.getString("DBID.19")); //$NON-NLS-1$

                     LineNumberReader reader = new LineNumberReader(new InputStreamReader(new BufferedInputStream(proc.getInputStream())));
                     String line = null;
                     do
                     {
                             line = reader.readLine();

                             if(line == null) continue;
                             return line;
                     }
                     while(line != null);

             }
             catch (Exception e)
             {
                     e.printStackTrace();
             }
             return null;
     }
     
     public static String GetDVDVolumeName()
     {
   	 	String volumeLabel = DVX_Messages.getString("DBID.20"); //$NON-NLS-1$
   	 	File[] rootList = File.listRoots(); 	
    	 	for (int i = 0;i<rootList.length;i++)
    	 	{
    	 		File theVolume =rootList[i]; 
    	 		File DVD = new File(theVolume.getAbsolutePath(),"VIDEO_TS"); //$NON-NLS-1$
    	 		if (DVD.exists())
    	 		{
    	 			System.out.println("DVD found :" + theVolume.getAbsolutePath()); //$NON-NLS-1$
    	 			volumeLabel = theVolume.getAbsolutePath();
    	 		}
    	 		else
    	 		{
    	 			// System.out.println("DVD not found : " + theVolume.getAbsolutePath());
    	 		}
    	 			
//    	 		System.out.println(theVolume.getAbsolutePath());
    	 		 
    	 	}
    	 	dvdDevice = volumeLabel;
    	 	return volumeLabel;
     }
     
     public static String getDVD_ID()
     {  	 
    	 String result = getDVD_ID(GetDVDVolumeName()); 
    	 int index = result.indexOf(DVX_Messages.getString("DBID.23")); //$NON-NLS-1$
    	 result = result.substring(index +1 ,result.length());
    	 return result;  	    	
     }
     
     public static void openDvdDrive() {
    	    try {
    	        File file = File.createTempFile("realhowto",".vbs");
    	        file.deleteOnExit();
    	        FileWriter fw = new java.io.FileWriter(file);
    	        String vbs = "Set wmp = CreateObject(\"WMPlayer.OCX\") \n"
    	                   + "Set cd = wmp.cdromCollection.getByDriveSpecifier(\""
    	                   + dvdDevice + "\") \n"
    	                   + "cd.Eject";
    	        fw.write(vbs);
    	        fw.close();
    	        Runtime.getRuntime().exec("wscript " + file.getPath()).waitFor();
    	        // thanks to TrueJavaProgammer for the waitFor() tip!      
    	        // Runtime.getRuntime().exec("wscript " + file.getPath()).waitFor();
    	        // Thread.sleep(2000);
    	    }
    	    catch(Exception e){
    	        e.printStackTrace();
    	    }
    	  }

    	  public static void closeDvdDrive() {
    	    try {
    	        File file = File.createTempFile("realhowto",".vbs");
    	        file.deleteOnExit();
    	        FileWriter fw = new FileWriter(file);
    	        // to close a CD, we need eject two times!
    	        String vbs = "Set wmp = CreateObject(\"WMPlayer.OCX\") \n"
    	                   + "Set cd = wmp.cdromCollection.getByDriveSpecifier(\""
    	                   + dvdDevice + "\") \n"
    	                   + "cd.Eject \n "
    	                   + "cd.Eject ";
    	        fw.write(vbs);
    	        fw.close();
    	        Runtime.getRuntime().exec("wscript " + file.getPath()).waitFor();
    	        // thanks to TrueJavaProgammer for the waitFor() tip!      
    	        // Runtime.getRuntime().exec("wscript "+ file.getPath());
    	        // Thread.sleep(2000);
    	    }
    	    catch(Exception e){
    	        e.printStackTrace();
    	    }
    	  }
}