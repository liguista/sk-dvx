package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * Attribute entity. @author MyEclipse Persistence Tools
 */
public class Attribute extends AbstractAttribute implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Attribute() {
	}

	/** full constructor */
	public Attribute(String attibuteName, String attributeValue,
			Timestamp modified, Timestamp created) {
		super(attibuteName, attributeValue, modified, created);
	}

}
