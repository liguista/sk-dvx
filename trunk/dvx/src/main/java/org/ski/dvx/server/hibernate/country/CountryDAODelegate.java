package org.ski.dvx.server.hibernate.country;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://country.hibernate.server.dvx.ski.org/", serviceName = "CountryDAOService", portName = "CountryDAOPort")
public class CountryDAODelegate {

	org.ski.dvx.server.hibernate.country.CountryDAO countryDAO = new org.ski.dvx.server.hibernate.country.CountryDAO();

	public void save(Country transientInstance) {
		countryDAO.save(transientInstance);
	}

	public void delete(Country persistentInstance) {
		countryDAO.delete(persistentInstance);
	}

	public Country findById(java.lang.Integer id) {
		return countryDAO.findById(id);
	}

	public List findByExample(Country instance) {
		return countryDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return countryDAO.findByProperty(propertyName, value);
	}

	public List findByCountryName(Object countryName) {
		return countryDAO.findByCountryName(countryName);
	}

	public List findByCountryNameShort(Object countryNameShort) {
		return countryDAO.findByCountryNameShort(countryNameShort);
	}

	public List findByContinentIdFk(Object continentIdFk) {
		return countryDAO.findByContinentIdFk(continentIdFk);
	}

	public List findByModified(Object modified) {
		return countryDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return countryDAO.findByCreated(created);
	}

	public List findAll() {
		return countryDAO.findAll();
	}

	public Country merge(Country detachedInstance) {
		return countryDAO.merge(detachedInstance);
	}

	public void attachDirty(Country instance) {
		countryDAO.attachDirty(instance);
	}

	public void attachClean(Country instance) {
		countryDAO.attachClean(instance);
	}

}