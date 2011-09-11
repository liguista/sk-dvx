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

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DVX_Messages {
	private static final String BUNDLE_NAME = "org.ski.dvx.app.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private DVX_Messages() {
	}

	public static char getChar(String key) {
		char result = ' ';
		String temp = getString(key);
		if (temp!=null)
			if (temp.length()>0)
				result = temp.charAt(0);
		return result;
	}
	public static String getString(String key) {
//		System.out.println("Looking for : " + key);
		try {
			String result = RESOURCE_BUNDLE.getString(key);
//			System.out.println("Resource : " + key + " = " + result);
			return result;
		} catch (MissingResourceException e) {
//			System.out.println("MissingResourceException : " + e);
			return null;
//			return '!' + key + '!';
		}
	}
}
