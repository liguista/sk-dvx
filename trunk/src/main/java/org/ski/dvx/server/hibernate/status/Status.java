package org.ski.dvx.server.hibernate.status;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */
public class Status extends AbstractStatus implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Status() {
	}

	/** full constructor */
	public Status(String statusDescription, Long modified, Long created) {
		super(statusDescription, modified, created);
	}

}
