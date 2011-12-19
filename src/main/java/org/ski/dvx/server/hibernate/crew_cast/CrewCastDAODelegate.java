package org.ski.dvx.server.hibernate.crew_cast;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://crew_cast.hibernate.server.dvx.ski.org/", serviceName = "CrewCastDAOService", portName = "CrewCastDAOPort")
public class CrewCastDAODelegate {

	org.ski.dvx.server.hibernate.crew_cast.CrewCastDAO crewCastDAO = new org.ski.dvx.server.hibernate.crew_cast.CrewCastDAO();

	public void save(CrewCast transientInstance) {
		crewCastDAO.save(transientInstance);
	}

	public void delete(CrewCast persistentInstance) {
		crewCastDAO.delete(persistentInstance);
	}

	public CrewCast findById(java.lang.Integer id) {
		return crewCastDAO.findById(id);
	}

	public List findByExample(CrewCast instance) {
		return crewCastDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return crewCastDAO.findByProperty(propertyName, value);
	}

	public List findByCrewCastFullName(Object crewCastFullName) {
		return crewCastDAO.findByCrewCastFullName(crewCastFullName);
	}

	public List findByCrewCastFirstName(Object crewCastFirstName) {
		return crewCastDAO.findByCrewCastFirstName(crewCastFirstName);
	}

	public List findByCrewCastMiddleName(Object crewCastMiddleName) {
		return crewCastDAO.findByCrewCastMiddleName(crewCastMiddleName);
	}

	public List findByCrewCastLastName(Object crewCastLastName) {
		return crewCastDAO.findByCrewCastLastName(crewCastLastName);
	}

	public List findByCrewCastBirthday(Object crewCastBirthday) {
		return crewCastDAO.findByCrewCastBirthday(crewCastBirthday);
	}

	public List findByCrewCastDescription(Object crewCastDescription) {
		return crewCastDAO.findByCrewCastDescription(crewCastDescription);
	}

	public List findByCrewCastBiography(Object crewCastBiography) {
		return crewCastDAO.findByCrewCastBiography(crewCastBiography);
	}

	public List findByCrewCastAuthorFk(Object crewCastAuthorFk) {
		return crewCastDAO.findByCrewCastAuthorFk(crewCastAuthorFk);
	}

	public List findByModified(Object modified) {
		return crewCastDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return crewCastDAO.findByCreated(created);
	}

	public List findAll() {
		return crewCastDAO.findAll();
	}

	public CrewCast merge(CrewCast detachedInstance) {
		return crewCastDAO.merge(detachedInstance);
	}

	public void attachDirty(CrewCast instance) {
		crewCastDAO.attachDirty(instance);
	}

	public void attachClean(CrewCast instance) {
		crewCastDAO.attachClean(instance);
	}

}