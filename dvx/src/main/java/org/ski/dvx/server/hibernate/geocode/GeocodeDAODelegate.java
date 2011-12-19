package org.ski.dvx.server.hibernate.geocode;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://geocode.hibernate.server.dvx.ski.org/", serviceName = "GeocodeDAOService", portName = "GeocodeDAOPort")
public class GeocodeDAODelegate {

	org.ski.dvx.server.hibernate.geocode.GeocodeDAO geocodeDAO = new org.ski.dvx.server.hibernate.geocode.GeocodeDAO();

	public void save(Geocode transientInstance) {
		geocodeDAO.save(transientInstance);
	}

	public void delete(Geocode persistentInstance) {
		geocodeDAO.delete(persistentInstance);
	}

	public Geocode findById(java.lang.Integer id) {
		return geocodeDAO.findById(id);
	}

	public List findByExample(Geocode instance) {
		return geocodeDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return geocodeDAO.findByProperty(propertyName, value);
	}

	public List findByGeocodeLatitude(Object geocodeLatitude) {
		return geocodeDAO.findByGeocodeLatitude(geocodeLatitude);
	}

	public List findByGeocodeLongitude(Object geocodeLongitude) {
		return geocodeDAO.findByGeocodeLongitude(geocodeLongitude);
	}

	public List findByGeocodeRadius(Object geocodeRadius) {
		return geocodeDAO.findByGeocodeRadius(geocodeRadius);
	}

	public List findByModified(Object modified) {
		return geocodeDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return geocodeDAO.findByCreated(created);
	}

	public List findAll() {
		return geocodeDAO.findAll();
	}

	public Geocode merge(Geocode detachedInstance) {
		return geocodeDAO.merge(detachedInstance);
	}

	public void attachDirty(Geocode instance) {
		geocodeDAO.attachDirty(instance);
	}

	public void attachClean(Geocode instance) {
		geocodeDAO.attachClean(instance);
	}

}