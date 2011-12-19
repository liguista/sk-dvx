package org.ski.dvx.server.hibernate.continent;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://continent.hibernate.server.dvx.ski.org/", serviceName = "ContinentDAOService", portName = "ContinentDAOPort")
public class ContinentDAODelegate {

	org.ski.dvx.server.hibernate.continent.ContinentDAO continentDAO = new org.ski.dvx.server.hibernate.continent.ContinentDAO();

	public void save(Continent transientInstance) {
		continentDAO.save(transientInstance);
	}

	public void delete(Continent persistentInstance) {
		continentDAO.delete(persistentInstance);
	}

	public Continent findById(java.lang.Integer id) {
		return continentDAO.findById(id);
	}

	public List findByExample(Continent instance) {
		return continentDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return continentDAO.findByProperty(propertyName, value);
	}

	public List findByContinentName(Object continentName) {
		return continentDAO.findByContinentName(continentName);
	}

	public List findByModified(Object modified) {
		return continentDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return continentDAO.findByCreated(created);
	}

	public List findAll() {
		return continentDAO.findAll();
	}

	public Continent merge(Continent detachedInstance) {
		return continentDAO.merge(detachedInstance);
	}

	public void attachDirty(Continent instance) {
		continentDAO.attachDirty(instance);
	}

	public void attachClean(Continent instance) {
		continentDAO.attachClean(instance);
	}

}