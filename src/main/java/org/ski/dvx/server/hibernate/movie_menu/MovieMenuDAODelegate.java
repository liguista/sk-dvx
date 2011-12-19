package org.ski.dvx.server.hibernate.movie_menu;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie_menu.hibernate.server.dvx.ski.org/", serviceName = "MovieMenuDAOService", portName = "MovieMenuDAOPort")
public class MovieMenuDAODelegate {

	org.ski.dvx.server.hibernate.movie_menu.MovieMenuDAO movieMenuDAO = new org.ski.dvx.server.hibernate.movie_menu.MovieMenuDAO();

	public void save(MovieMenu transientInstance) {
		movieMenuDAO.save(transientInstance);
	}

	public void delete(MovieMenu persistentInstance) {
		movieMenuDAO.delete(persistentInstance);
	}

	public MovieMenu findById(java.lang.Integer id) {
		return movieMenuDAO.findById(id);
	}

	public List findByExample(MovieMenu instance) {
		return movieMenuDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieMenuDAO.findByProperty(propertyName, value);
	}

	public List findByAuthorFk(Object authorFk) {
		return movieMenuDAO.findByAuthorFk(authorFk);
	}

	public List findByLanguageFk(Object languageFk) {
		return movieMenuDAO.findByLanguageFk(languageFk);
	}

	public List findByMovieIdFk(Object movieIdFk) {
		return movieMenuDAO.findByMovieIdFk(movieIdFk);
	}

	public List findByMenuActive(Object menuActive) {
		return movieMenuDAO.findByMenuActive(menuActive);
	}

	public List findByMenuNumber(Object menuNumber) {
		return movieMenuDAO.findByMenuNumber(menuNumber);
	}

	public List findByMenuItem(Object menuItem) {
		return movieMenuDAO.findByMenuItem(menuItem);
	}

	public List findByDescription(Object description) {
		return movieMenuDAO.findByDescription(description);
	}

	public List findByMenuPathFk(Object menuPathFk) {
		return movieMenuDAO.findByMenuPathFk(menuPathFk);
	}

	public List findByMenuVersion(Object menuVersion) {
		return movieMenuDAO.findByMenuVersion(menuVersion);
	}

	public List findByMenuUri(Object menuUri) {
		return movieMenuDAO.findByMenuUri(menuUri);
	}

	public List findByModified(Object modified) {
		return movieMenuDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieMenuDAO.findByCreated(created);
	}

	public List findAll() {
		return movieMenuDAO.findAll();
	}

	public MovieMenu merge(MovieMenu detachedInstance) {
		return movieMenuDAO.merge(detachedInstance);
	}

	public void attachDirty(MovieMenu instance) {
		movieMenuDAO.attachDirty(instance);
	}

	public void attachClean(MovieMenu instance) {
		movieMenuDAO.attachClean(instance);
	}

}