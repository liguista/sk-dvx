package hibernate_dvx;

import java.sql.Timestamp;

/**
 * AbstractDescription entity provides the base persistence definition of the
 * Description entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDescription extends HibernateBaseClass implements
		java.io.Serializable {

	// Fields

	private Integer descriptionId;
	private Movie movie;
	private Author author;
	private Integer descriptionOrder;
	private String descriptionTypeEnum;
	private String descriptionLong;
	private String descriptionShort;
	private String descriptionUri;
	private Integer descriptionTimeOffset;
	private Integer descriptionStartTimeInt;
	private String descriptionStartTimeText;
	private Integer descriptionEndTimeInt;
	private String descriptionEndTimeText;
	private Integer descriptionDurationInt;
	private String descriptionDurationText;
	private String descriptionActive;
	private Integer descriptionRatingTotal;
	private Float descriptionCompression;
	private Timestamp created;
	private Timestamp modified;

	// Constructors

	/** default constructor */
	public AbstractDescription() {
	}

	/** minimal constructor */
	public AbstractDescription(Movie movie, Author author,
			String descriptionTypeEnum, Integer descriptionTimeOffset,
			Integer descriptionStartTimeInt, Integer descriptionEndTimeInt,
			Integer descriptionDurationInt, String descriptionActive,
			Integer descriptionRatingTotal, Float descriptionCompression) {
		this.movie = movie;
		this.author = author;
		this.descriptionTypeEnum = descriptionTypeEnum;
		this.descriptionTimeOffset = descriptionTimeOffset;
		this.descriptionStartTimeInt = descriptionStartTimeInt;
		this.descriptionEndTimeInt = descriptionEndTimeInt;
		this.descriptionDurationInt = descriptionDurationInt;
		this.descriptionActive = descriptionActive;
		this.descriptionRatingTotal = descriptionRatingTotal;
		this.descriptionCompression = descriptionCompression;
	}

	/** full constructor */
	public AbstractDescription(Movie movie, Author author,
			Integer descriptionOrder, String descriptionTypeEnum,
			String descriptionLong, String descriptionShort,
			String descriptionUri, Integer descriptionTimeOffset,
			Integer descriptionStartTimeInt, String descriptionStartTimeText,
			Integer descriptionEndTimeInt, String descriptionEndTimeText,
			Integer descriptionDurationInt, String descriptionDurationText,
			String descriptionActive, Integer descriptionRatingTotal,
			Float descriptionCompression, Timestamp created, Timestamp modified) {
		this.movie = movie;
		this.author = author;
		this.descriptionOrder = descriptionOrder;
		this.descriptionTypeEnum = descriptionTypeEnum;
		this.descriptionLong = descriptionLong;
		this.descriptionShort = descriptionShort;
		this.descriptionUri = descriptionUri;
		this.descriptionTimeOffset = descriptionTimeOffset;
		this.descriptionStartTimeInt = descriptionStartTimeInt;
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

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
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

	public Integer getDescriptionStartTimeInt() {
		return this.descriptionStartTimeInt;
	}

	public void setDescriptionStartTimeInt(Integer descriptionStartTimeInt) {
		this.descriptionStartTimeInt = descriptionStartTimeInt;
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

	public String getDescriptionActive() {
		return this.descriptionActive;
	}

	public void setDescriptionActive(String descriptionActive) {
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