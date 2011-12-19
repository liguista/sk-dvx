package org.ski.dvx.server.hibernate.zip_code;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://zip_code.hibernate.server.dvx.ski.org/", serviceName = "ZipCodeDAOService", portName = "ZipCodeDAOPort")
public class ZipCodeDAODelegate {

	org.ski.dvx.server.hibernate.zip_code.ZipCodeDAO zipCodeDAO = new org.ski.dvx.server.hibernate.zip_code.ZipCodeDAO();

	public void save(ZipCode transientInstance) {
		zipCodeDAO.save(transientInstance);
	}

	public void delete(ZipCode persistentInstance) {
		zipCodeDAO.delete(persistentInstance);
	}

	public ZipCode findById(java.lang.Integer id) {
		return zipCodeDAO.findById(id);
	}

	public List findByExample(ZipCode instance) {
		return zipCodeDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return zipCodeDAO.findByProperty(propertyName, value);
	}

	public List findByZipCode(Object zipCode) {
		return zipCodeDAO.findByZipCode(zipCode);
	}

	public List findByZipCodeExtended(Object zipCodeExtended) {
		return zipCodeDAO.findByZipCodeExtended(zipCodeExtended);
	}

	public List findByZipCodeGeocodeFk(Object zipCodeGeocodeFk) {
		return zipCodeDAO.findByZipCodeGeocodeFk(zipCodeGeocodeFk);
	}

	public List findByZipCodeCityFk(Object zipCodeCityFk) {
		return zipCodeDAO.findByZipCodeCityFk(zipCodeCityFk);
	}

	public List findByZipCodeStateFk(Object zipCodeStateFk) {
		return zipCodeDAO.findByZipCodeStateFk(zipCodeStateFk);
	}

	public List findByModified(Object modified) {
		return zipCodeDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return zipCodeDAO.findByCreated(created);
	}

	public List findAll() {
		return zipCodeDAO.findAll();
	}

	public ZipCode merge(ZipCode detachedInstance) {
		return zipCodeDAO.merge(detachedInstance);
	}

	public void attachDirty(ZipCode instance) {
		zipCodeDAO.attachDirty(instance);
	}

	public void attachClean(ZipCode instance) {
		zipCodeDAO.attachClean(instance);
	}

}