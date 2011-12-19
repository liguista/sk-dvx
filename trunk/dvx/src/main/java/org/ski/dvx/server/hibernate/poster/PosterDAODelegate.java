package org.ski.dvx.server.hibernate.poster;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://poster.hibernate.server.dvx.ski.org/", serviceName = "PosterDAOService", portName = "PosterDAOPort")
public class PosterDAODelegate {

	org.ski.dvx.server.hibernate.poster.PosterDAO posterDAO = new org.ski.dvx.server.hibernate.poster.PosterDAO();

	public void save(Poster transientInstance) {
		posterDAO.save(transientInstance);
	}

	public void delete(Poster persistentInstance) {
		posterDAO.delete(persistentInstance);
	}

	public Poster findById(java.lang.Integer id) {
		return posterDAO.findById(id);
	}

	public List findByExample(Poster instance) {
		return posterDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return posterDAO.findByProperty(propertyName, value);
	}

	public List findByPosterMovieIdFk(Object posterMovieIdFk) {
		return posterDAO.findByPosterMovieIdFk(posterMovieIdFk);
	}

	public List findByPosterName(Object posterName) {
		return posterDAO.findByPosterName(posterName);
	}

	public List findByPosterUrl(Object posterUrl) {
		return posterDAO.findByPosterUrl(posterUrl);
	}

	public List findByModified(Object modified) {
		return posterDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return posterDAO.findByCreated(created);
	}

	public List findAll() {
		return posterDAO.findAll();
	}

	public Poster merge(Poster detachedInstance) {
		return posterDAO.merge(detachedInstance);
	}

	public void attachDirty(Poster instance) {
		posterDAO.attachDirty(instance);
	}

	public void attachClean(Poster instance) {
		posterDAO.attachClean(instance);
	}

}