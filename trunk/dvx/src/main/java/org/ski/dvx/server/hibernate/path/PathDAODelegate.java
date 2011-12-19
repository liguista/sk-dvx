package org.ski.dvx.server.hibernate.path;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://path.hibernate.server.dvx.ski.org/", serviceName = "PathDAOService", portName = "PathDAOPort")
public class PathDAODelegate {

	org.ski.dvx.server.hibernate.path.PathDAO pathDAO = new org.ski.dvx.server.hibernate.path.PathDAO();

	public void save(Path transientInstance) {
		pathDAO.save(transientInstance);
	}

	public void delete(Path persistentInstance) {
		pathDAO.delete(persistentInstance);
	}

	public Path findById(java.lang.Integer id) {
		return pathDAO.findById(id);
	}

	public List findByExample(Path instance) {
		return pathDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return pathDAO.findByProperty(propertyName, value);
	}

	public List findByAuthorFk(Object authorFk) {
		return pathDAO.findByAuthorFk(authorFk);
	}

	public List findByPathPrefix(Object pathPrefix) {
		return pathDAO.findByPathPrefix(pathPrefix);
	}

	public List findByModified(Object modified) {
		return pathDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return pathDAO.findByCreated(created);
	}

	public List findAll() {
		return pathDAO.findAll();
	}

	public Path merge(Path detachedInstance) {
		return pathDAO.merge(detachedInstance);
	}

	public void attachDirty(Path instance) {
		pathDAO.attachDirty(instance);
	}

	public void attachClean(Path instance) {
		pathDAO.attachClean(instance);
	}

}