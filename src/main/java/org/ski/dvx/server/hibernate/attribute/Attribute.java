package org.ski.dvx.server.hibernate.attribute;

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
	public Attribute(String attibuteName, String attributeValue, Long modified,
			Integer created) {
		super(attibuteName, attributeValue, modified, created);
	}

}
