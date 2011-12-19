package org.ski.dvx.server.hibernate.description;

/**
 * AbstractDescription entity provides the base persistence definition of the
 * Description entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDescription implements java.io.Serializable {

	// Fields

	private Integer descriptionId;
	private Integer authorFk;
	private Integer descriptionLanguageFk;
	private Integer movieFk;
	private Integer descriptionTitleId;
	private Integer descriptionActive;
	private Integer descriptionChapter;
	private Integer descriptionStartTimeInt;
	private Integer descriptionStartFrame;
	private Integer descriptionOrder;
	private String descriptionTypeEnum;
	private String descriptionLong;
	private String descriptionShort;
	private String descriptionMetaData;
	private String descriptionMetaXml;
	private Integer descriptionVersion;
	private Integer descriptionPathFk;
	private String descriptionUri;
	private Integer descriptionTimeOffset;
	private String descriptionStartTimeText;
	private Integer descriptionEndTimeInt;
	private String descriptionEndTimeText;
	private Integer descriptionDurationInt;
	private String descriptionDurationText;
	private Integer descriptionRatingTotal;
	private Float descriptionCompression;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractDescription() {
	}

	/** minimal constructor */
	public AbstractDescription(Integer authorFk, Integer movieFk) {
		this.authorFk = authorFk;
		this.movieFk = movieFk;
	}

	/** full constructor */
	public AbstractDescription(Integer authorFk, Integer descriptionLanguageFk,
			Integer movieFk, Integer descriptionTitleId,
			Integer descriptionActive, Integer descriptionChapter,
			Integer descriptionStartTimeInt, Integer descriptionStartFrame,
			Integer descriptionOrder, String descriptionTypeEnum,
			String descriptionLong, String descriptionShort,
			String descriptionMetaData, String descriptionMetaXml,
			Integer descriptionVersion, Integer descriptionPathFk,
			String descriptionUri, Integer descriptionTimeOffset,
			String descriptionStartTimeText, Integer descriptionEndTimeInt,
			String descriptionEndTimeText, Integer descriptionDurationInt,
			String descriptionDurationText, Integer descriptionRatingTotal,
			Float descriptionCompression, Long modified, Long created) {
		this.authorFk = authorFk;
		this.descriptionLanguageFk = descriptionLanguageFk;
		this.movieFk = movieFk;
		this.descriptionTitleId = descriptionTitleId;
		this.descriptionActive = descriptionActive;
		this.descriptionChapter = descriptionChapter;
		this.descriptionStartTimeInt = descriptionStartTimeInt;
		this.descriptionStartFrame = descriptionStartFrame;
		this.descriptionOrder = descriptionOrder;
		this.descriptionTypeEnum = descriptionTypeEnum;
		this.descriptionLong = descriptionLong;
		this.descriptionShort = descriptionShort;
		this.descriptionMetaData = descriptionMetaData;
		this.descriptionMetaXml = descriptionMetaXml;
		this.descriptionVersion = descriptionVersion;
		this.descriptionPathFk = descriptionPathFk;
		this.descriptionUri = descriptionUri;
		this.descriptionTimeOffset = descriptionTimeOffset;
		this.descriptionStartTimeText = descriptionStartTimeText;
		this.descriptionEndTimeInt = descriptionEndTimeInt;
		this.descriptionEndTimeText = descriptionEndTimeText;
		this.descriptionDurationInt = descriptionDurationInt;
		this.descriptionDurationText = descriptionDurationText;
		this.descriptionRatingTotal = descriptionRatingTotal;
		this.descriptionCompression = descriptionCompression;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(Integer descriptionId) {
		this.descriptionId = descriptionId;
	}

	public Integer getAuthorFk() {
		return this.authorFk;
	}

	public void setAuthorFk(Integer authorFk) {
		this.authorFk = authorFk;
	}

	public Integer getDescriptionLanguageFk() {
		return this.descriptionLanguageFk;
	}

	public void setDescriptionLanguageFk(Integer descriptionLanguageFk) {
		this.descriptionLanguageFk = descriptionLanguageFk;
	}

	public Integer getMovieFk() {
		return this.movieFk;
	}

	public void setMovieFk(Integer movieFk) {
		this.movieFk = movieFk;
	}

	public Integer getDescriptionTitleId() {
		return this.descriptionTitleId;
	}

	public void setDescriptionTitleId(Integer descriptionTitleId) {
		this.descriptionTitleId = descriptionTitleId;
	}

	public Integer getDescriptionActive() {
		return this.descriptionActive;
	}

	public void setDescriptionActive(Integer descriptionActive) {
		this.descriptionActive = descriptionActive;
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

	public String getDescriptionMetaData() {
		return this.descriptionMetaData;
	}

	public void setDescriptionMetaData(String descriptionMetaData) {
		this.descriptionMetaData = descriptionMetaData;
	}

	public String getDescriptionMetaXml() {
		return this.descriptionMetaXml;
	}

	public void setDescriptionMetaXml(String descriptionMetaXml) {
		this.descriptionMetaXml = descriptionMetaXml;
	}

	public Integer getDescriptionVersion() {
		return this.descriptionVersion;
	}

	public void setDescriptionVersion(Integer descriptionVersion) {
		this.descriptionVersion = descriptionVersion;
	}

	public Integer getDescriptionPathFk() {
		return this.descriptionPathFk;
	}

	public void setDescriptionPathFk(Integer descriptionPathFk) {
		this.descriptionPathFk = descriptionPathFk;
	}

	public String getDescriptionUri() {
		return this.descriptionUri;
	}

	public void setDescriptionUri(String descriptionUri) {
		this.descriptionUri = descriptionUri;
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