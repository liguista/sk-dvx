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
					and/or Public Domain Code. Please use good judgment 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

package org.ski.dvx.app;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_Messages.
 */
public class DVX_Messages {
	
	/** The Constant BUNDLE_NAME. */
	private static final String BUNDLE_NAME = "org.ski.dvx.app.messages"; //$NON-NLS-1$

	/** The Constant RESOURCE_BUNDLE. */
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	/**
	 * Instantiates a new dV x_ messages.
	 */
	private DVX_Messages() {
	}

	/**
	 * Gets the char.
	 *
	 * @param key the key
	 * @return the char
	 */
	public static char getChar(String key) {
		char result = ' ';
		String temp = getString(key);
		if (temp!=null)
			if (temp.length()>0)
				result = temp.charAt(0);
		return result;
	}
	
	/**
	 * Gets the string from the resource bundle.
	 *
	 * @param key the key
	 * @return the string
	 */
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
