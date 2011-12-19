package org.ski.dvx.server.hibernate.author;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://author.hibernate.server.dvx.ski.org/", serviceName = "AuthorDAOService", portName = "AuthorDAOPort")
public class AuthorDAODelegate {

	org.ski.dvx.server.hibernate.author.AuthorDAO authorDAO = new org.ski.dvx.server.hibernate.author.AuthorDAO();

	public void save(Author transientInstance) {
		authorDAO.save(transientInstance);
	}

	public void delete(Author persistentInstance) {
		authorDAO.delete(persistentInstance);
	}

	public Author findById(java.lang.Integer id) {
		return authorDAO.findById(id);
	}

	public List findByExample(Author instance) {
		return authorDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return authorDAO.findByProperty(propertyName, value);
	}

	public List findByUserFk(Object userFk) {
		return authorDAO.findByUserFk(userFk);
	}

	public List findByModified(Object modified) {
		return authorDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return authorDAO.findByCreated(created);
	}

	public List findAll() {
		return authorDAO.findAll();
	}

	public Author merge(Author detachedInstance) {
		return authorDAO.merge(detachedInstance);
	}

	public void attachDirty(Author instance) {
		authorDAO.attachDirty(instance);
	}

	public void attachClean(Author instance) {
		authorDAO.attachClean(instance);
	}

}