package org.ski.dvx.server.hibernate.path;

/**
 * Path entity. @author MyEclipse Persistence Tools
 */
public class Path extends AbstractPath implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Path() {
	}

	/** full constructor */
	public Path(Integer authorFk, String pathPrefix, Long modified, Long created) {
		super(authorFk, pathPrefix, modified, created);
	}

}
