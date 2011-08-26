package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * AttributeId entity. @author MyEclipse Persistence Tools
 */
public class AttributeId extends AbstractAttributeId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AttributeId() {
	}

	/** minimal constructor */
	public AttributeId(Integer attributeId) {
		super(attributeId);
	}

	/** full constructor */
	public AttributeId(Integer attributeId, String attibuteName,
			String attributeValue, Timestamp modified, Timestamp created) {
		super(attributeId, attibuteName, attributeValue, modified, created);
	}

}
