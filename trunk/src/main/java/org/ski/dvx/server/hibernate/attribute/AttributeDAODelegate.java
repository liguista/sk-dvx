package org.ski.dvx.server.hibernate.attribute;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://attribute.hibernate.server.dvx.ski.org/", serviceName = "AttributeDAOService", portName = "AttributeDAOPort")
public class AttributeDAODelegate {

	org.ski.dvx.server.hibernate.attribute.AttributeDAO attributeDAO = new org.ski.dvx.server.hibernate.attribute.AttributeDAO();

	public void save(Attribute transientInstance) {
		attributeDAO.save(transientInstance);
	}

	public void delete(Attribute persistentInstance) {
		attributeDAO.delete(persistentInstance);
	}

	public Attribute findById(java.lang.Integer id) {
		return attributeDAO.findById(id);
	}

	public List findByExample(Attribute instance) {
		return attributeDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return attributeDAO.findByProperty(propertyName, value);
	}

	public List findByAttibuteName(Object attibuteName) {
		return attributeDAO.findByAttibuteName(attibuteName);
	}

	public List findByAttributeValue(Object attributeValue) {
		return attributeDAO.findByAttributeValue(attributeValue);
	}

	public List findByModified(Object modified) {
		return attributeDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return attributeDAO.findByCreated(created);
	}

	public List findAll() {
		return attributeDAO.findAll();
	}

	public Attribute merge(Attribute detachedInstance) {
		return attributeDAO.merge(detachedInstance);
	}

	public void attachDirty(Attribute instance) {
		attributeDAO.attachDirty(instance);
	}

	public void attachClean(Attribute instance) {
		attributeDAO.attachClean(instance);
	}

}