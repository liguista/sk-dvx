package org.ski.dvx.server.hibernate.movie_chapter;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie_chapter.hibernate.server.dvx.ski.org/", serviceName = "MovieChapterDAOService", portName = "MovieChapterDAOPort")
public class MovieChapterDAODelegate {

	org.ski.dvx.server.hibernate.movie_chapter.MovieChapterDAO movieChapterDAO = new org.ski.dvx.server.hibernate.movie_chapter.MovieChapterDAO();

	public void save(MovieChapter transientInstance) {
		movieChapterDAO.save(transientInstance);
	}

	public void delete(MovieChapter persistentInstance) {
		movieChapterDAO.delete(persistentInstance);
	}

	public MovieChapter findById(java.lang.Integer id) {
		return movieChapterDAO.findById(id);
	}

	public List findByExample(MovieChapter instance) {
		return movieChapterDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieChapterDAO.findByProperty(propertyName, value);
	}

	public List findByMovieFk(Object movieFk) {
		return movieChapterDAO.findByMovieFk(movieFk);
	}

	public List findByMovieChapterDescription(Object movieChapterDescription) {
		return movieChapterDAO
				.findByMovieChapterDescription(movieChapterDescription);
	}

	public List findByMovieChapterName(Object movieChapterName) {
		return movieChapterDAO.findByMovieChapterName(movieChapterName);
	}

	public List findByMovieChapterStartTime(Object movieChapterStartTime) {
		return movieChapterDAO
				.findByMovieChapterStartTime(movieChapterStartTime);
	}

	public List findByMovieChapterEndTime(Object movieChapterEndTime) {
		return movieChapterDAO.findByMovieChapterEndTime(movieChapterEndTime);
	}

	public List findByModified(Object modified) {
		return movieChapterDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieChapterDAO.findByCreated(created);
	}

	public List findAll() {
		return movieChapterDAO.findAll();
	}

	public MovieChapter merge(MovieChapter detachedInstance) {
		return movieChapterDAO.merge(detachedInstance);
	}

	public void attachDirty(MovieChapter instance) {
		movieChapterDAO.attachDirty(instance);
	}

	public void attachClean(MovieChapter instance) {
		movieChapterDAO.attachClean(instance);
	}

}