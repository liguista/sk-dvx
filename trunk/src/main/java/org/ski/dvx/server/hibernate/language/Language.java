package org.ski.dvx.server.hibernate.language;

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
			Long modified, Long created) {
		super(languageName, languageNameShort, modified, created);
	}

}
