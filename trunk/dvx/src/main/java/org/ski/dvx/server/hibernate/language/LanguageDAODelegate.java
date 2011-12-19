package org.ski.dvx.server.hibernate.language;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://language.hibernate.server.dvx.ski.org/", serviceName = "LanguageDAOService", portName = "LanguageDAOPort")
public class LanguageDAODelegate {

	org.ski.dvx.server.hibernate.language.LanguageDAO languageDAO = new org.ski.dvx.server.hibernate.language.LanguageDAO();

	public void save(Language transientInstance) {
		languageDAO.save(transientInstance);
	}

	public void delete(Language persistentInstance) {
		languageDAO.delete(persistentInstance);
	}

	public Language findById(java.lang.Integer id) {
		return languageDAO.findById(id);
	}

	public List findByExample(Language instance) {
		return languageDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return languageDAO.findByProperty(propertyName, value);
	}

	public List findByLanguageName(Object languageName) {
		return languageDAO.findByLanguageName(languageName);
	}

	public List findByLanguageNameShort(Object languageNameShort) {
		return languageDAO.findByLanguageNameShort(languageNameShort);
	}

	public List findByModified(Object modified) {
		return languageDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return languageDAO.findByCreated(created);
	}

	public List findAll() {
		return languageDAO.findAll();
	}

	public Language merge(Language detachedInstance) {
		return languageDAO.merge(detachedInstance);
	}

	public void attachDirty(Language instance) {
		languageDAO.attachDirty(instance);
	}

	public void attachClean(Language instance) {
		languageDAO.attachClean(instance);
	}

}