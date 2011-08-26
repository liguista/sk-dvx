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
