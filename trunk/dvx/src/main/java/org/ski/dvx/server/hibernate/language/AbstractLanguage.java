package org.ski.dvx.server.hibernate.language;

/**
 * AbstractLanguage entity provides the base persistence definition of the
 * Language entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLanguage implements java.io.Serializable {

	// Fields

	private Integer languageId;
	private String languageName;
	private String languageNameShort;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractLanguage() {
	}

	/** full constructor */
	public AbstractLanguage(String languageName, String languageNameShort,
			Long modified, Long created) {
		this.languageName = languageName;
		this.languageNameShort = languageNameShort;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageNameShort() {
		return this.languageNameShort;
	}

	public void setLanguageNameShort(String languageNameShort) {
		this.languageNameShort = languageNameShort;
	}

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

}