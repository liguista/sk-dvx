package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * MovieMenu entity. @author MyEclipse Persistence Tools
 */
public class MovieMenu extends AbstractMovieMenu implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MovieMenu() {
	}

	/** full constructor */
	public MovieMenu(Movie movie, Language language, Author author, Path path,
			Integer languageFk, Integer menuActive, Integer menuNumber,
			Integer menuItem, String description, Integer menuVersion,
			String menuUri, Timestamp created, Timestamp modified) {
		super(movie, language, author, path, languageFk, menuActive,
				menuNumber, menuItem, description, menuVersion, menuUri,
				created, modified);
	}

}
