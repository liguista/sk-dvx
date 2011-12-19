package org.ski.dvx.server.hibernate.status;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://status.hibernate.server.dvx.ski.org/", serviceName = "StatusDAOService", portName = "StatusDAOPort")
public class StatusDAODelegate {

	org.ski.dvx.server.hibernate.status.StatusDAO statusDAO = new org.ski.dvx.server.hibernate.status.StatusDAO();

	public void save(Status transientInstance) {
		statusDAO.save(transientInstance);
	}

	public void delete(Status persistentInstance) {
		statusDAO.delete(persistentInstance);
	}

	public Status findById(java.lang.Integer id) {
		return statusDAO.findById(id);
	}

	public List findByExample(Status instance) {
		return statusDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return statusDAO.findByProperty(propertyName, value);
	}

	public List findByStatusDescription(Object statusDescription) {
		return statusDAO.findByStatusDescription(statusDescription);
	}

	public List findByModified(Object modified) {
		return statusDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return statusDAO.findByCreated(created);
	}

	public List findAll() {
		return statusDAO.findAll();
	}

	public Status merge(Status detachedInstance) {
		return statusDAO.merge(detachedInstance);
	}

	public void attachDirty(Status instance) {
		statusDAO.attachDirty(instance);
	}

	public void attachClean(Status instance) {
		statusDAO.attachClean(instance);
	}

}