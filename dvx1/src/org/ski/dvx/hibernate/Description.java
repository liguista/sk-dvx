package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;

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
			Path path, Integer descriptionActive, Integer descriptionChapter,
			Integer descriptionStartTimeInt, Integer descriptionStartFrame,
			Integer descriptionOrder, String descriptionTypeEnum,
			String descriptionLong, String descriptionShort,
			Integer descriptionVersion, String descriptionUri,
			Integer descriptionTimeOffset, String descriptionStartTimeText,
			Integer descriptionEndTimeInt, String descriptionEndTimeText,
			Integer descriptionDurationInt, String descriptionDurationText,
			Integer descriptionRatingTotal, Float descriptionCompression,
			Timestamp created, Timestamp modified, Set ratings) {
		super(movie, language, author, path, descriptionActive,
				descriptionChapter, descriptionStartTimeInt,
				descriptionStartFrame, descriptionOrder, descriptionTypeEnum,
				descriptionLong, descriptionShort, descriptionVersion,
				descriptionUri, descriptionTimeOffset,
				descriptionStartTimeText, descriptionEndTimeInt,
				descriptionEndTimeText, descriptionDurationInt,
				descriptionDurationText, descriptionRatingTotal,
				descriptionCompression, created, modified, ratings);
	}

}
