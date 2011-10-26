package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * AbstractAttribute entity provides the base persistence definition of the
 * Attribute entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttribute implements java.io.Serializable {

	// Fields

	private Integer attributeId;
	private String attibuteName;
	private String attributeValue;
	private Timestamp modified;
	private Timestamp created;

	// Constructors

	/** default constructor */
	public AbstractAttribute() {
	}

	/** full constructor */
	public AbstractAttribute(String attibuteName, String attributeValue,
			Timestamp modified, Timestamp created) {
		this.attibuteName = attibuteName;
		this.attributeValue = attributeValue;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttibuteName() {
		return this.attibuteName;
	}

	public void setAttibuteName(String attibuteName) {
		this.attibuteName = attibuteName;
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

}