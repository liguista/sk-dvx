package org.ski.dvx.server.hibernate.description;

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
	public Description(Integer authorFk, Integer movieFk) {
		super(authorFk, movieFk);
	}

	/** full constructor */
	public Description(Integer authorFk, Integer descriptionLanguageFk,
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
		super(authorFk, descriptionLanguageFk, movieFk, descriptionTitleId,
				descriptionActive, descriptionChapter, descriptionStartTimeInt,
				descriptionStartFrame, descriptionOrder, descriptionTypeEnum,
				descriptionLong, descriptionShort, descriptionMetaData,
				descriptionMetaXml, descriptionVersion, descriptionPathFk,
				descriptionUri, descriptionTimeOffset,
				descriptionStartTimeText, descriptionEndTimeInt,
				descriptionEndTimeText, descriptionDurationInt,
				descriptionDurationText, descriptionRatingTotal,
				descriptionCompression, modified, created);
	}

}
