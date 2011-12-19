package org.ski.dvx.server.hibernate.version;

/**
 * Version entity. @author MyEclipse Persistence Tools
 */
public class Version extends AbstractVersion implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Version() {
	}

	/** full constructor */
	public Version(String versionDescription, Integer authorFk,
			Integer movieFk, Integer languageFk, Long modified, Long created) {
		super(versionDescription, authorFk, movieFk, languageFk, modified,
				created);
	}

}
