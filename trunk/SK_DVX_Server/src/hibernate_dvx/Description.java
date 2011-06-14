package hibernate_dvx;

import java.sql.Timestamp;

/**
 * Description entity. @author MyEclipse Persistence Tools
 */
public class Description extends AbstractDescription implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Description() {
	}

	/** minimal constructor */
	public Description(Movie movie, Author author, String descriptionTypeEnum,
			Integer descriptionTimeOffset, Integer descriptionStartTimeInt,
			Integer descriptionEndTimeInt, Integer descriptionDurationInt,
			String descriptionActive, Integer descriptionRatingTotal,
			Float descriptionCompression) {
		super(movie, author, descriptionTypeEnum, descriptionTimeOffset,
				descriptionStartTimeInt, descriptionEndTimeInt,
				descriptionDurationInt, descriptionActive,
				descriptionRatingTotal, descriptionCompression);
	}

	/** full constructor */
	public Description(Movie movie, Author author, Integer descriptionOrder,
			String descriptionTypeEnum, String descriptionLong,
			String descriptionShort, String descriptionUri,
			Integer descriptionTimeOffset, Integer descriptionStartTimeInt,
			String descriptionStartTimeText, Integer descriptionEndTimeInt,
			String descriptionEndTimeText, Integer descriptionDurationInt,
			String descriptionDurationText, String descriptionActive,
			Integer descriptionRatingTotal, Float descriptionCompression,
			Timestamp created, Timestamp modified) {
		super(movie, author, descriptionOrder, descriptionTypeEnum,
				descriptionLong, descriptionShort, descriptionUri,
				descriptionTimeOffset, descriptionStartTimeInt,
				descriptionStartTimeText, descriptionEndTimeInt,
				descriptionEndTimeText, descriptionDurationInt,
				descriptionDurationText, descriptionActive,
				descriptionRatingTotal, descriptionCompression, created,
				modified);
	}

}
