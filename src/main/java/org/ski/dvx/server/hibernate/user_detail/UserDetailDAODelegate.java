package org.ski.dvx.server.hibernate.user_detail;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://user_detail.hibernate.server.dvx.ski.org/", serviceName = "UserDetailDAOService", portName = "UserDetailDAOPort")
public class UserDetailDAODelegate {

	org.ski.dvx.server.hibernate.user_detail.UserDetailDAO userDetailDAO = new org.ski.dvx.server.hibernate.user_detail.UserDetailDAO();

	public void save(UserDetail transientInstance) {
		userDetailDAO.save(transientInstance);
	}

	public void delete(UserDetail persistentInstance) {
		userDetailDAO.delete(persistentInstance);
	}

	public UserDetail findById(java.lang.Integer id) {
		return userDetailDAO.findById(id);
	}

	public List findByExample(UserDetail instance) {
		return userDetailDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return userDetailDAO.findByProperty(propertyName, value);
	}

	public List findByUserDetailUserFk(Object userDetailUserFk) {
		return userDetailDAO.findByUserDetailUserFk(userDetailUserFk);
	}

	public List findByUserDetailFirstName(Object userDetailFirstName) {
		return userDetailDAO.findByUserDetailFirstName(userDetailFirstName);
	}

	public List findByUserDetailLastName(Object userDetailLastName) {
		return userDetailDAO.findByUserDetailLastName(userDetailLastName);
	}

	public List findByUserDetailEmail(Object userDetailEmail) {
		return userDetailDAO.findByUserDetailEmail(userDetailEmail);
	}

	public List findByUserDetailAddress1(Object userDetailAddress1) {
		return userDetailDAO.findByUserDetailAddress1(userDetailAddress1);
	}

	public List findByUserDetailAddress2(Object userDetailAddress2) {
		return userDetailDAO.findByUserDetailAddress2(userDetailAddress2);
	}

	public List findByUserDetailCityFk(Object userDetailCityFk) {
		return userDetailDAO.findByUserDetailCityFk(userDetailCityFk);
	}

	public List findByUserDetailStateFk(Object userDetailStateFk) {
		return userDetailDAO.findByUserDetailStateFk(userDetailStateFk);
	}

	public List findByUserDetailZipCodeFk(Object userDetailZipCodeFk) {
		return userDetailDAO.findByUserDetailZipCodeFk(userDetailZipCodeFk);
	}

	public List findByUserDetailCountryFk(Object userDetailCountryFk) {
		return userDetailDAO.findByUserDetailCountryFk(userDetailCountryFk);
	}

	public List findByUserDetailWorkPhoneNumber(Object userDetailWorkPhoneNumber) {
		return userDetailDAO
				.findByUserDetailWorkPhoneNumber(userDetailWorkPhoneNumber);
	}

	public List findByUserDetailHomePhoneNumber(Object userDetailHomePhoneNumber) {
		return userDetailDAO
				.findByUserDetailHomePhoneNumber(userDetailHomePhoneNumber);
	}

	public List findByUserDetailCellPhoneNumber(Object userDetailCellPhoneNumber) {
		return userDetailDAO
				.findByUserDetailCellPhoneNumber(userDetailCellPhoneNumber);
	}

	public List findByUserDetailSubscriptionStart(
			Object userDetailSubscriptionStart) {
		return userDetailDAO
				.findByUserDetailSubscriptionStart(userDetailSubscriptionStart);
	}

	public List findByUserDetailSubscriptionEndDate(
			Object userDetailSubscriptionEndDate) {
		return userDetailDAO
				.findByUserDetailSubscriptionEndDate(userDetailSubscriptionEndDate);
	}

	public List findByUserDetailActive(Object userDetailActive) {
		return userDetailDAO.findByUserDetailActive(userDetailActive);
	}

	public List findByUserDetailYearOfBirth(Object userDetailYearOfBirth) {
		return userDetailDAO.findByUserDetailYearOfBirth(userDetailYearOfBirth);
	}

	public List findByUserDetailGender(Object userDetailGender) {
		return userDetailDAO.findByUserDetailGender(userDetailGender);
	}

	public List findByUserDetailVisionAbility(Object userDetailVisionAbility) {
		return userDetailDAO
				.findByUserDetailVisionAbility(userDetailVisionAbility);
	}

	public List findByCreated(Object created) {
		return userDetailDAO.findByCreated(created);
	}

	public List findByModified(Object modified) {
		return userDetailDAO.findByModified(modified);
	}

	public List findAll() {
		return userDetailDAO.findAll();
	}

	public UserDetail merge(UserDetail detachedInstance) {
		return userDetailDAO.merge(detachedInstance);
	}

	public void attachDirty(UserDetail instance) {
		userDetailDAO.attachDirty(instance);
	}

	public void attachClean(UserDetail instance) {
		userDetailDAO.attachClean(instance);
	}

}