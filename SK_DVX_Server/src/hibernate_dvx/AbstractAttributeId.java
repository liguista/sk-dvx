package hibernate_dvx;

import java.sql.Timestamp;

/**
 * AbstractAttributeId entity provides the base persistence definition of the
 * AttributeId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttributeId extends HibernateBaseClass implements
		java.io.Serializable {

	// Fields

	private Integer attributeId;
	private String attibuteName;
	private String attributeValue;
	private Timestamp modified;
	private Timestamp created;

	// Constructors

	/** default constructor */
	public AbstractAttributeId() {
	}

	/** full constructor */
	public AbstractAttributeId(Integer attributeId, String attibuteName,
			String attributeValue, Timestamp modified, Timestamp created) {
		this.attributeId = attributeId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAttributeId))
			return false;
		AbstractAttributeId castOther = (AbstractAttributeId) other;

		return ((this.getAttributeId() == castOther.getAttributeId()) || (this
				.getAttributeId() != null && castOther.getAttributeId() != null && this
				.getAttributeId().equals(castOther.getAttributeId())))
				&& ((this.getAttibuteName() == castOther.getAttibuteName()) || (this
						.getAttibuteName() != null
						&& castOther.getAttibuteName() != null && this
						.getAttibuteName().equals(castOther.getAttibuteName())))
				&& ((this.getAttributeValue() == castOther.getAttributeValue()) || (this
						.getAttributeValue() != null
						&& castOther.getAttributeValue() != null && this
						.getAttributeValue().equals(
								castOther.getAttributeValue())))
				&& ((this.getModified() == castOther.getModified()) || (this
						.getModified() != null
						&& castOther.getModified() != null && this
						.getModified().equals(castOther.getModified())))
				&& ((this.getCreated() == castOther.getCreated()) || (this
						.getCreated() != null && castOther.getCreated() != null && this
						.getCreated().equals(castOther.getCreated())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAttributeId() == null ? 0 : this.getAttributeId()
						.hashCode());
		result = 37
				* result
				+ (getAttibuteName() == null ? 0 : this.getAttibuteName()
						.hashCode());
		result = 37
				* result
				+ (getAttributeValue() == null ? 0 : this.getAttributeValue()
						.hashCode());
		result = 37 * result
				+ (getModified() == null ? 0 : this.getModified().hashCode());
		result = 37 * result
				+ (getCreated() == null ? 0 : this.getCreated().hashCode());
		return result;
	}

}