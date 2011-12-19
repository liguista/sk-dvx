package org.ski.dvx.server.hibernate.user_profile;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://user_profile.hibernate.server.dvx.ski.org/", serviceName = "UserProfileDAOService", portName = "UserProfileDAOPort")
public class UserProfileDAODelegate {

	org.ski.dvx.server.hibernate.user_profile.UserProfileDAO userProfileDAO = new org.ski.dvx.server.hibernate.user_profile.UserProfileDAO();

	public void save(UserProfile transientInstance) {
		userProfileDAO.save(transientInstance);
	}

	public void delete(UserProfile persistentInstance) {
		userProfileDAO.delete(persistentInstance);
	}

	public UserProfile findById(java.lang.Integer id) {
		return userProfileDAO.findById(id);
	}

	public List findByExample(UserProfile instance) {
		return userProfileDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return userProfileDAO.findByProperty(propertyName, value);
	}

	public List findByUserFk(Object userFk) {
		return userProfileDAO.findByUserFk(userFk);
	}

	public List findByUserDetailFk(Object userDetailFk) {
		return userProfileDAO.findByUserDetailFk(userDetailFk);
	}

	public List findByUserProfileVisionImpared(Object userProfileVisionImpared) {
		return userProfileDAO
				.findByUserProfileVisionImpared(userProfileVisionImpared);
	}

	public List findByUserProfileMotionImpared(Object userProfileMotionImpared) {
		return userProfileDAO
				.findByUserProfileMotionImpared(userProfileMotionImpared);
	}

	public List findByModified(Object modified) {
		return userProfileDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return userProfileDAO.findByCreated(created);
	}

	public List findAll() {
		return userProfileDAO.findAll();
	}

	public UserProfile merge(UserProfile detachedInstance) {
		return userProfileDAO.merge(detachedInstance);
	}

	public void attachDirty(UserProfile instance) {
		userProfileDAO.attachDirty(instance);
	}

	public void attachClean(UserProfile instance) {
		userProfileDAO.attachClean(instance);
	}

}