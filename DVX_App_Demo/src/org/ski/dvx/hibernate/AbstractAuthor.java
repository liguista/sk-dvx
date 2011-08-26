package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAuthor entity provides the base persistence definition of the Author
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAuthor implements java.io.Serializable {

	// Fields

	private Integer authorId;
	private User user;
	private Timestamp created;
	private Timestamp modified;
	private Set movieMenus = new HashSet(0);
	private Set descriptions = new HashSet(0);
	private Set paths = new HashSet(0);
	private Set crewCasts = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAuthor() {
	}

	/** minimal constructor */
	public AbstractAuthor(Timestamp created) {
		this.created = created;
	}

	/** full constructor */
	public AbstractAuthor(User user, Timestamp created, Timestamp modified,
			Set movieMenus, Set descriptions, Set paths, Set crewCasts) {
		this.user = user;
		this.created = created;
		this.modified = modified;
		this.movieMenus = movieMenus;
		this.descriptions = descriptions;
		this.paths = paths;
		this.crewCasts = crewCasts;
	}

	// Property accessors

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Set getPaths() {
		return this.paths;
	}

	public void setPaths(Set paths) {
		this.paths = paths;
	}

	public Set getCrewCasts() {
		return this.crewCasts;
	}

	public void setCrewCasts(Set crewCasts) {
		this.crewCasts = crewCasts;
	}

}