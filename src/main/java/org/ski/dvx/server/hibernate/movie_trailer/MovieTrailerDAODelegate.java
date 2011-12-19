package org.ski.dvx.server.hibernate.movie_trailer;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie_trailer.hibernate.server.dvx.ski.org/", serviceName = "MovieTrailerDAOService", portName = "MovieTrailerDAOPort")
public class MovieTrailerDAODelegate {

	org.ski.dvx.server.hibernate.movie_trailer.MovieTrailerDAO movieTrailerDAO = new org.ski.dvx.server.hibernate.movie_trailer.MovieTrailerDAO();

	public void save(MovieTrailer transientInstance) {
		movieTrailerDAO.save(transientInstance);
	}

	public void delete(MovieTrailer persistentInstance) {
		movieTrailerDAO.delete(persistentInstance);
	}

	public MovieTrailer findById(java.lang.Integer id) {
		return movieTrailerDAO.findById(id);
	}

	public List findByExample(MovieTrailer instance) {
		return movieTrailerDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieTrailerDAO.findByProperty(propertyName, value);
	}

	public List findByMovieIdFk(Object movieIdFk) {
		return movieTrailerDAO.findByMovieIdFk(movieIdFk);
	}

	public List findByMovieTrailerUri(Object movieTrailerUri) {
		return movieTrailerDAO.findByMovieTrailerUri(movieTrailerUri);
	}

	public List findByMovieTrailerIndex(Object movieTrailerIndex) {
		return movieTrailerDAO.findByMovieTrailerIndex(movieTrailerIndex);
	}

	public List findByModified(Object modified) {
		return movieTrailerDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieTrailerDAO.findByCreated(created);
	}

	public List findAll() {
		return movieTrailerDAO.findAll();
	}

	public MovieTrailer merge(MovieTrailer detachedInstance) {
		return movieTrailerDAO.merge(detachedInstance);
	}

	public void attachDirty(MovieTrailer instance) {
		movieTrailerDAO.attachDirty(instance);
	}

	public void attachClean(MovieTrailer instance) {
		movieTrailerDAO.attachClean(instance);
	}

}