package org.ski.dvx.server.hibernate.movie_genre;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie_genre.hibernate.server.dvx.ski.org/", serviceName = "MovieGenreDAOService", portName = "MovieGenreDAOPort")
public class MovieGenreDAODelegate {

	org.ski.dvx.server.hibernate.movie_genre.MovieGenreDAO movieGenreDAO = new org.ski.dvx.server.hibernate.movie_genre.MovieGenreDAO();

	public void save(MovieGenre transientInstance) {
		movieGenreDAO.save(transientInstance);
	}

	public void delete(MovieGenre persistentInstance) {
		movieGenreDAO.delete(persistentInstance);
	}

	public MovieGenre findById(java.lang.Integer id) {
		return movieGenreDAO.findById(id);
	}

	public List findByExample(MovieGenre instance) {
		return movieGenreDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieGenreDAO.findByProperty(propertyName, value);
	}

	public List findByMovieGenreDescription(Object movieGenreDescription) {
		return movieGenreDAO.findByMovieGenreDescription(movieGenreDescription);
	}

	public List findByMovieGenreDescriptionLong(Object movieGenreDescriptionLong) {
		return movieGenreDAO
				.findByMovieGenreDescriptionLong(movieGenreDescriptionLong);
	}

	public List findByModified(Object modified) {
		return movieGenreDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieGenreDAO.findByCreated(created);
	}

	public List findAll() {
		return movieGenreDAO.findAll();
	}

	public MovieGenre merge(MovieGenre detachedInstance) {
		return movieGenreDAO.merge(detachedInstance);
	}

	public void attachDirty(MovieGenre instance) {
		movieGenreDAO.attachDirty(instance);
	}

	public void attachClean(MovieGenre instance) {
		movieGenreDAO.attachClean(instance);
	}

}