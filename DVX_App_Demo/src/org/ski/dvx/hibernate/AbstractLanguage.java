package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractLanguage entity provides the base persistence definition of the
 * Language entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLanguage implements java.io.Serializable {

	// Fields

	private Integer languageId;
	private String languageName;
	private String languageNameShort;
	private Timestamp created;
	private Timestamp modified;
	private Set movieMenus = new HashSet(0);
	private Set descriptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractLanguage() {
	}

	/** full constructor */
	public AbstractLanguage(String languageName, String languageNameShort,
			Timestamp created, Timestamp modified, Set movieMenus,
			Set descriptions) {
		this.languageName = languageName;
		this.languageNameShort = languageNameShort;
		this.created = created;
		this.modified = modified;
		this.movieMenus = movieMenus;
		this.descriptions = descriptions;
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

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public Set getMovieMenus() {
		return this.movieMenus;
	}

	public void setMovieMenus(Set movieMenus) {
		this.movieMenus = movieMenus;
	}

	public Set getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(Set descriptions) {
		this.descriptions = descriptions;
	}

}