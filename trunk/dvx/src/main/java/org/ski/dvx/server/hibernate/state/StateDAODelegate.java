package org.ski.dvx.server.hibernate.state;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://state.hibernate.server.dvx.ski.org/", serviceName = "StateDAOService", portName = "StateDAOPort")
public class StateDAODelegate {

	org.ski.dvx.server.hibernate.state.StateDAO stateDAO = new org.ski.dvx.server.hibernate.state.StateDAO();

	public void save(State transientInstance) {
		stateDAO.save(transientInstance);
	}

	public void delete(State persistentInstance) {
		stateDAO.delete(persistentInstance);
	}

	public State findById(java.lang.Integer id) {
		return stateDAO.findById(id);
	}

	public List findByExample(State instance) {
		return stateDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return stateDAO.findByProperty(propertyName, value);
	}

	public List findByStateName(Object stateName) {
		return stateDAO.findByStateName(stateName);
	}

	public List findByStateNameShort(Object stateNameShort) {
		return stateDAO.findByStateNameShort(stateNameShort);
	}

	public List findByStateCountryFk(Object stateCountryFk) {
		return stateDAO.findByStateCountryFk(stateCountryFk);
	}

	public List findByModified(Object modified) {
		return stateDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return stateDAO.findByCreated(created);
	}

	public List findAll() {
		return stateDAO.findAll();
	}

	public State merge(State detachedInstance) {
		return stateDAO.merge(detachedInstance);
	}

	public void attachDirty(State instance) {
		stateDAO.attachDirty(instance);
	}

	public void attachClean(State instance) {
		stateDAO.attachClean(instance);
	}

}