package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * AbstractDescription entity provides the base persistence definition of the
 * Description entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDescription implements java.io.Serializable {

	// Fields

	private Integer descriptionId;
	private Movie movie;
	private Language language;
	private Author author;
	private Path path;
	private Integer descriptionOrder;
	private String descriptionTypeEnum;
	private String descriptionLong;
	private String descriptionShort;
	private Integer descriptionVersion;
	private String descriptionUri;
	private Integer descriptionChapter;
	private Integer descriptionStartTimeInt;
	private Integer descriptionStartFrame;
	private Integer descriptionTimeOffset;
	private String descriptionStartTimeText;
	private Integer descriptionEndTimeInt;
	private String descriptionEndTimeText;
	private Integer descriptionDurationInt;
	private String descriptionDurationText;
	private Integer descriptionActive;
	private Integer descriptionRatingTotal;
	private Float descriptionCompression;
	private Timestamp created;
	private Timestamp modified;

	// Constructors

	/** default constructor */
	public AbstractDescription() {
	}

	/** minimal constructor */
	public AbstractDescription(Movie movie, Author author) {
		this.movie = movie;
		this.author = author;
	}

	/** full constructor */
	public AbstractDescription(Movie movie, Language language, Author author,
			Path path, Integer descriptionOrder, String descriptionTypeEnum,
			String descriptionLong, String descriptionShort,
			Integer descriptionVersion, String descriptionUri,
			Integer descriptionChapter, Integer descriptionStartTimeInt,
			Integer descriptionStartFrame, Integer descriptionTimeOffset,
			String descriptionStartTimeText, Integer descriptionEndTimeInt,
			String descriptionEndTimeText, Integer descriptionDurationInt,
			String descriptionDurationText, Integer descriptionActive,
			Integer descriptionRatingTotal, Float descriptionCompression,
			Timestamp created, Timestamp modified) {
		this.movie = movie;
		this.language = language;
		this.author = author;
		this.path = path;
		this.descriptionOrder = descriptionOrder;
		this.descriptionTypeEnum = descriptionTypeEnum;
		this.descriptionLong = descriptionLong;
		this.descriptionShort = descriptionShort;
		this.descriptionVersion = descriptionVersion;
		this.descriptionUri = descriptionUri;
		this.descriptionChapter = descriptionChapter;
		this.descriptionStartTimeInt = descriptionStartTimeInt;
		this.descriptionStartFrame = descriptionStartFrame;
		this.descriptionTimeOffset = descriptionTimeOffset;
		this.descriptionStartTimeText = descriptionStartTimeText;
		this.descriptionEndTimeInt = descriptionEndTimeInt;
		this.descriptionEndTimeText = descriptionEndTimeText;
		this.descriptionDurationInt = descriptionDurationInt;
		this.descriptionDurationText = descriptionDurationText;
		this.descriptionActive = descriptionActive;
		this.descriptionRatingTotal = descriptionRatingTotal;
		this.descriptionCompression = descriptionCompression;
		this.created = created;
		this.modified = modified;
	}

	// Property accessors

	public Integer getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(Integer descriptionId) {
		this.descriptionId = descriptionId;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Path getPath() {
		return this.path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public Integer getDescriptionOrder() {
		return this.descriptionOrder;
	}

	public void setDescriptionOrder(Integer descriptionOrder) {
		this.descriptionOrder = descriptionOrder;
	}

	public String getDescriptionTypeEnum() {
		return this.descriptionTypeEnum;
	}

	public void setDescriptionTypeEnum(String descriptionTypeEnum) {
		this.descriptionTypeEnum = descriptionTypeEnum;
	}

	public String getDescriptionLong() {
		return this.descriptionLong;
	}

	public void setDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
	}

	public String getDescriptionShort() {
		return this.descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	public Integer getDescriptionVersion() {
		return this.descriptionVersion;
	}

	public void setDescriptionVersion(Integer descriptionVersion) {
		this.descriptionVersion = descriptionVersion;
	}

	public String getDescriptionUri() {
		return this.descriptionUri;
	}

	public void setDescriptionUri(String descriptionUri) {
		this.descriptionUri = descriptionUri;
	}

	public Integer getDescriptionChapter() {
		return this.descriptionChapter;
	}

	public void setDescriptionChapter(Integer descriptionChapter) {
		this.descriptionChapter = descriptionChapter;
	}

	public Integer getDescriptionStartTimeInt() {
		return this.descriptionStartTimeInt;
	}

	public void setDescriptionStartTimeInt(Integer descriptionStartTimeInt) {
		this.descriptionStartTimeInt = descriptionStartTimeInt;
	}

	public Integer getDescriptionStartFrame() {
		return this.descriptionStartFrame;
	}

	public void setDescriptionStartFrame(Integer descriptionStartFrame) {
		this.descriptionStartFrame = descriptionStartFrame;
	}

	public Integer getDescriptionTimeOffset() {
		return this.descriptionTimeOffset;
	}

	public void setDescriptionTimeOffset(Integer descriptionTimeOffset) {
		this.descriptionTimeOffset = descriptionTimeOffset;
	}

	public String getDescriptionStartTimeText() {
		return this.descriptionStartTimeText;
	}

	public void setDescriptionStartTimeText(String descriptionStartTimeText) {
		this.descriptionStartTimeText = descriptionStartTimeText;
	}

	public Integer getDescriptionEndTimeInt() {
		return this.descriptionEndTimeInt;
	}

	public void setDescriptionEndTimeInt(Integer descriptionEndTimeInt) {
		this.descriptionEndTimeInt = descriptionEndTimeInt;
	}

	public String getDescriptionEndTimeText() {
		return this.descriptionEndTimeText;
	}

	public void setDescriptionEndTimeText(String descriptionEndTimeText) {
		this.descriptionEndTimeText = descriptionEndTimeText;
	}

	public Integer getDescriptionDurationInt() {
		return this.descriptionDurationInt;
	}

	public void setDescriptionDurationInt(Integer descriptionDurationInt) {
		this.descriptionDurationInt = descriptionDurationInt;
	}

	public String getDescriptionDurationText() {
		return this.descriptionDurationText;
	}

	public void setDescriptionDurationText(String descriptionDurationText) {
		this.descriptionDurationText = descriptionDurationText;
	}

	public Integer getDescriptionActive() {
		return this.descriptionActive;
	}

	public void setDescriptionActive(Integer descriptionActive) {
		this.descriptionActive = descriptionActive;
	}

	public Integer getDescriptionRatingTotal() {
		return this.descriptionRatingTotal;
	}

	public void setDescriptionRatingTotal(Integer descriptionRatingTotal) {
		this.descriptionRatingTotal = descriptionRatingTotal;
	}

	public Float getDescriptionCompression() {
		return this.descriptionCompression;
	}

	public void setDescriptionCompression(Float descriptionCompression) {
		this.descriptionCompression = descriptionCompression;
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

}