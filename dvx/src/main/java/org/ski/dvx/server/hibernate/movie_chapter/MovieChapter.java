package org.ski.dvx.server.hibernate.movie_chapter;

/**
 * MovieChapter entity. @author MyEclipse Persistence Tools
 */
public class MovieChapter extends AbstractMovieChapter implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MovieChapter() {
	}

	/** full constructor */
	public MovieChapter(Integer movieFk, String movieChapterDescription,
			String movieChapterName, Long movieChapterStartTime,
			Long movieChapterEndTime, Long modified, Long created) {
		super(movieFk, movieChapterDescription, movieChapterName,
				movieChapterStartTime, movieChapterEndTime, modified, created);
	}

}
