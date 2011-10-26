package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Path entity. @author MyEclipse Persistence Tools
 */
public class Path extends AbstractPath implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Path() {
	}

	/** full constructor */
	public Path(Author author, String pathPrefix, Timestamp modified,
			Timestamp created, Set movieMenus, Set descriptions) {
		super(author, pathPrefix, modified, created, movieMenus, descriptions);
	}

}
