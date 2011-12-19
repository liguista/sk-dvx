package org.ski.dvx.server.hibernate.version;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://version.hibernate.server.dvx.ski.org/", serviceName = "VersionDAOService", portName = "VersionDAOPort")
public class VersionDAODelegate {

	org.ski.dvx.server.hibernate.version.VersionDAO versionDAO = new org.ski.dvx.server.hibernate.version.VersionDAO();

	public void save(Version transientInstance) {
		versionDAO.save(transientInstance);
	}

	public void delete(Version persistentInstance) {
		versionDAO.delete(persistentInstance);
	}

	public Version findById(java.lang.Integer id) {
		return versionDAO.findById(id);
	}

	public List findByExample(Version instance) {
		return versionDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return versionDAO.findByProperty(propertyName, value);
	}

	public List findByVersionDescription(Object versionDescription) {
		return versionDAO.findByVersionDescription(versionDescription);
	}

	public List findByAuthorFk(Object authorFk) {
		return versionDAO.findByAuthorFk(authorFk);
	}

	public List findByMovieFk(Object movieFk) {
		return versionDAO.findByMovieFk(movieFk);
	}

	public List findByLanguageFk(Object languageFk) {
		return versionDAO.findByLanguageFk(languageFk);
	}

	public List findByModified(Object modified) {
		return versionDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return versionDAO.findByCreated(created);
	}

	public List findAll() {
		return versionDAO.findAll();
	}

	public Version merge(Version detachedInstance) {
		return versionDAO.merge(detachedInstance);
	}

	public void attachDirty(Version instance) {
		versionDAO.attachDirty(instance);
	}

	public void attachClean(Version instance) {
		versionDAO.attachClean(instance);
	}

}