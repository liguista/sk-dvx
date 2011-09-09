package org.ski.dvx.hibernate;

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
	public Description(Movie movie, Author author) {
		super(movie, author);
	}

	/** full constructor */
	public Description(Movie movie, Language language, Author author,
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
		super(movie, language, author, path, descriptionOrder,
				descriptionTypeEnum, descriptionLong, descriptionShort,
				descriptionVersion, descriptionUri, descriptionChapter,
				descriptionStartTimeInt, descriptionStartFrame,
				descriptionTimeOffset, descriptionStartTimeText,
				descriptionEndTimeInt, descriptionEndTimeText,
				descriptionDurationInt, descriptionDurationText,
				descriptionActive, descriptionRatingTotal,
				descriptionCompression, created, modified);
	}

}
