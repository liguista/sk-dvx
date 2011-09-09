package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Language entity. @author MyEclipse Persistence Tools
 */
public class Language extends AbstractLanguage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Language() {
	}

	/** full constructor */
	public Language(String languageName, String languageNameShort,
			Timestamp created, Timestamp modified, Set movieMenus,
			Set descriptions) {
		super(languageName, languageNameShort, created, modified, movieMenus,
				descriptions);
	}

}
