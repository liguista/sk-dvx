package org.ski.dvx.server.hibernate.city;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://city.hibernate.server.dvx.ski.org/", serviceName = "CityDAOService", portName = "CityDAOPort")
public class CityDAODelegate {

	org.ski.dvx.server.hibernate.city.CityDAO cityDAO = new org.ski.dvx.server.hibernate.city.CityDAO();

	public void save(City transientInstance) {
		cityDAO.save(transientInstance);
	}

	public void delete(City persistentInstance) {
		cityDAO.delete(persistentInstance);
	}

	public City findById(java.lang.Integer id) {
		return cityDAO.findById(id);
	}

	public List findByExample(City instance) {
		return cityDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return cityDAO.findByProperty(propertyName, value);
	}

	public List findByCityName(Object cityName) {
		return cityDAO.findByCityName(cityName);
	}

	public List findByCityZipCodeFk(Object cityZipCodeFk) {
		return cityDAO.findByCityZipCodeFk(cityZipCodeFk);
	}

	public List findByCityStateFk(Object cityStateFk) {
		return cityDAO.findByCityStateFk(cityStateFk);
	}

	public List findByCityCountryFk(Object cityCountryFk) {
		return cityDAO.findByCityCountryFk(cityCountryFk);
	}

	public List findByCityGeoCodeFk(Object cityGeoCodeFk) {
		return cityDAO.findByCityGeoCodeFk(cityGeoCodeFk);
	}

	public List findByCityPopulation(Object cityPopulation) {
		return cityDAO.findByCityPopulation(cityPopulation);
	}

	public List findByModified(Object modified) {
		return cityDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return cityDAO.findByCreated(created);
	}

	public List findAll() {
		return cityDAO.findAll();
	}

	public City merge(City detachedInstance) {
		return cityDAO.merge(detachedInstance);
	}

	public void attachDirty(City instance) {
		cityDAO.attachDirty(instance);
	}

	public void attachClean(City instance) {
		cityDAO.attachClean(instance);
	}

}