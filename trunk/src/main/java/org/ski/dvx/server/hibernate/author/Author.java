package org.ski.dvx.server.hibernate.author;

/**
 * Author entity. @author MyEclipse Persistence Tools
 */
public class Author extends AbstractAuthor implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Author() {
	}

	/** full constructor */
	public Author(Integer userFk, Long modified, Long created) {
		super(userFk, modified, created);
	}

}
