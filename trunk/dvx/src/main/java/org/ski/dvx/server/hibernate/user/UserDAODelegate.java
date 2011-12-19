package org.ski.dvx.server.hibernate.user;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://user.hibernate.server.dvx.ski.org/", serviceName = "UserDAOService", portName = "UserDAOPort")
public class UserDAODelegate {

	org.ski.dvx.server.hibernate.user.UserDAO userDAO = new org.ski.dvx.server.hibernate.user.UserDAO();

	public void save(User transientInstance) {
		userDAO.save(transientInstance);
	}

	public void delete(User persistentInstance) {
		userDAO.delete(persistentInstance);
	}

	public User findById(java.lang.Integer id) {
		return userDAO.findById(id);
	}

	public List findByExample(User instance) {
		return userDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return userDAO.findByProperty(propertyName, value);
	}

	public List findByUserEmail(Object userEmail) {
		return userDAO.findByUserEmail(userEmail);
	}

	public List findByUserPassword(Object userPassword) {
		return userDAO.findByUserPassword(userPassword);
	}

	public List findByUserHandle(Object userHandle) {
		return userDAO.findByUserHandle(userHandle);
	}

	public List findByUserLastLogin(Object userLastLogin) {
		return userDAO.findByUserLastLogin(userLastLogin);
	}

	public List findByUserActive(Object userActive) {
		return userDAO.findByUserActive(userActive);
	}

	public List findByUserType(Object userType) {
		return userDAO.findByUserType(userType);
	}

	public List findByModified(Object modified) {
		return userDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return userDAO.findByCreated(created);
	}

	public List findAll() {
		return userDAO.findAll();
	}

	public User merge(User detachedInstance) {
		return userDAO.merge(detachedInstance);
	}

	public void attachDirty(User instance) {
		userDAO.attachDirty(instance);
	}

	public void attachClean(User instance) {
		userDAO.attachClean(instance);
	}

}