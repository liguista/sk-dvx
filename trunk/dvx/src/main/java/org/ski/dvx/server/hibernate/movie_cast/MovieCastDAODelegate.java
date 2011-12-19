package org.ski.dvx.server.hibernate.movie_cast;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie_cast.hibernate.server.dvx.ski.org/", serviceName = "MovieCastDAOService", portName = "MovieCastDAOPort")
public class MovieCastDAODelegate {

	org.ski.dvx.server.hibernate.movie_cast.MovieCastDAO movieCastDAO = new org.ski.dvx.server.hibernate.movie_cast.MovieCastDAO();

	public void save(MovieCast transientInstance) {
		movieCastDAO.save(transientInstance);
	}

	public void delete(MovieCast persistentInstance) {
		movieCastDAO.delete(persistentInstance);
	}

	public MovieCast findById(java.lang.Integer id) {
		return movieCastDAO.findById(id);
	}

	public List findByExample(MovieCast instance) {
		return movieCastDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieCastDAO.findByProperty(propertyName, value);
	}

	public List findByMovieCastMovieIdFk(Object movieCastMovieIdFk) {
		return movieCastDAO.findByMovieCastMovieIdFk(movieCastMovieIdFk);
	}

	public List findByMovieCastCrewCastIdFk(Object movieCastCrewCastIdFk) {
		return movieCastDAO.findByMovieCastCrewCastIdFk(movieCastCrewCastIdFk);
	}

	public List findByMovieCastRoleOrder(Object movieCastRoleOrder) {
		return movieCastDAO.findByMovieCastRoleOrder(movieCastRoleOrder);
	}

	public List findByMovieCastRoleName(Object movieCastRoleName) {
		return movieCastDAO.findByMovieCastRoleName(movieCastRoleName);
	}

	public List findByMovieCastRoleDescription(Object movieCastRoleDescription) {
		return movieCastDAO
				.findByMovieCastRoleDescription(movieCastRoleDescription);
	}

	public List findByModified(Object modified) {
		return movieCastDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieCastDAO.findByCreated(created);
	}

	public List findAll() {
		return movieCastDAO.findAll();
	}

	public MovieCast merge(MovieCast detachedInstance) {
		return movieCastDAO.merge(detachedInstance);
	}

	public void attachDirty(MovieCast instance) {
		movieCastDAO.attachDirty(instance);
	}

	public void attachClean(MovieCast instance) {
		movieCastDAO.attachClean(instance);
	}

}