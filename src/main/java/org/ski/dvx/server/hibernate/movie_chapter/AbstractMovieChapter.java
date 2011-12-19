package org.ski.dvx.server.hibernate.movie_chapter;

/**
 * AbstractMovieChapter entity provides the base persistence definition of the
 * MovieChapter entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieChapter implements java.io.Serializable {

	// Fields

	private Integer movieChapterId;
	private Integer movieFk;
	private String movieChapterDescription;
	private String movieChapterName;
	private Long movieChapterStartTime;
	private Long movieChapterEndTime;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractMovieChapter() {
	}

	/** full constructor */
	public AbstractMovieChapter(Integer movieFk,
			String movieChapterDescription, String movieChapterName,
			Long movieChapterStartTime, Long movieChapterEndTime,
			Long modified, Long created) {
		this.movieFk = movieFk;
		this.movieChapterDescription = movieChapterDescription;
		this.movieChapterName = movieChapterName;
		this.movieChapterStartTime = movieChapterStartTime;
		this.movieChapterEndTime = movieChapterEndTime;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getMovieChapterId() {
		return this.movieChapterId;
	}

	public void setMovieChapterId(Integer movieChapterId) {
		this.movieChapterId = movieChapterId;
	}

	public Integer getMovieFk() {
		return this.movieFk;
	}

	public void setMovieFk(Integer movieFk) {
		this.movieFk = movieFk;
	}

	public String getMovieChapterDescription() {
		return this.movieChapterDescription;
	}

	public void setMovieChapterDescription(String movieChapterDescription) {
		this.movieChapterDescription = movieChapterDescription;
	}

	public String getMovieChapterName() {
		return this.movieChapterName;
	}

	public void setMovieChapterName(String movieChapterName) {
		this.movieChapterName = movieChapterName;
	}

	public Long getMovieChapterStartTime() {
		return this.movieChapterStartTime;
	}

	public void setMovieChapterStartTime(Long movieChapterStartTime) {
		this.movieChapterStartTime = movieChapterStartTime;
	}

	public Long getMovieChapterEndTime() {
		return this.movieChapterEndTime;
	}

	public void setMovieChapterEndTime(Long movieChapterEndTime) {
		this.movieChapterEndTime = movieChapterEndTime;
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