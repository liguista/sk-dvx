package org.ski.dvx.hibernate;

/**
 * AbstractAttribute entity provides the base persistence definition of the
 * Attribute entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttribute implements java.io.Serializable {

	// Fields

	private AttributeId id;

	// Constructors

	/** default constructor */
	public AbstractAttribute() {
	}

	/** full constructor */
	public AbstractAttribute(AttributeId id) {
		this.id = id;
	}

	// Property accessors

	public AttributeId getId() {
		return this.id;
	}

	public void setId(AttributeId id) {
		this.id = id;
	}

}