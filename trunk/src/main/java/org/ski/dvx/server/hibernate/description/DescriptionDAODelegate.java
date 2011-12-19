package org.ski.dvx.server.hibernate.description;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://description.hibernate.server.dvx.ski.org/", serviceName = "DescriptionDAOService", portName = "DescriptionDAOPort")
public class DescriptionDAODelegate {

	org.ski.dvx.server.hibernate.description.DescriptionDAO descriptionDAO = new org.ski.dvx.server.hibernate.description.DescriptionDAO();

	public void save(Description transientInstance) {
		descriptionDAO.save(transientInstance);
	}

	public void delete(Description persistentInstance) {
		descriptionDAO.delete(persistentInstance);
	}

	public Description findById(java.lang.Integer id) {
		return descriptionDAO.findById(id);
	}

	public List findByExample(Description instance) {
		return descriptionDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return descriptionDAO.findByProperty(propertyName, value);
	}

	public List findByAuthorFk(Object authorFk) {
		return descriptionDAO.findByAuthorFk(authorFk);
	}

	public List findByDescriptionLanguageFk(Object descriptionLanguageFk) {
		return descriptionDAO
				.findByDescriptionLanguageFk(descriptionLanguageFk);
	}

	public List findByMovieFk(Object movieFk) {
		return descriptionDAO.findByMovieFk(movieFk);
	}

	public List findByDescriptionTitleId(Object descriptionTitleId) {
		return descriptionDAO.findByDescriptionTitleId(descriptionTitleId);
	}

	public List findByDescriptionActive(Object descriptionActive) {
		return descriptionDAO.findByDescriptionActive(descriptionActive);
	}

	public List findByDescriptionChapter(Object descriptionChapter) {
		return descriptionDAO.findByDescriptionChapter(descriptionChapter);
	}

	public List findByDescriptionStartTimeInt(Object descriptionStartTimeInt) {
		return descriptionDAO
				.findByDescriptionStartTimeInt(descriptionStartTimeInt);
	}

	public List findByDescriptionStartFrame(Object descriptionStartFrame) {
		return descriptionDAO
				.findByDescriptionStartFrame(descriptionStartFrame);
	}

	public List findByDescriptionOrder(Object descriptionOrder) {
		return descriptionDAO.findByDescriptionOrder(descriptionOrder);
	}

	public List findByDescriptionTypeEnum(Object descriptionTypeEnum) {
		return descriptionDAO.findByDescriptionTypeEnum(descriptionTypeEnum);
	}

	public List findByDescriptionLong(Object descriptionLong) {
		return descriptionDAO.findByDescriptionLong(descriptionLong);
	}

	public List findByDescriptionShort(Object descriptionShort) {
		return descriptionDAO.findByDescriptionShort(descriptionShort);
	}

	public List findByDescriptionMetaData(Object descriptionMetaData) {
		return descriptionDAO.findByDescriptionMetaData(descriptionMetaData);
	}

	public List findByDescriptionMetaXml(Object descriptionMetaXml) {
		return descriptionDAO.findByDescriptionMetaXml(descriptionMetaXml);
	}

	public List findByDescriptionVersion(Object descriptionVersion) {
		return descriptionDAO.findByDescriptionVersion(descriptionVersion);
	}

	public List findByDescriptionPathFk(Object descriptionPathFk) {
		return descriptionDAO.findByDescriptionPathFk(descriptionPathFk);
	}

	public List findByDescriptionUri(Object descriptionUri) {
		return descriptionDAO.findByDescriptionUri(descriptionUri);
	}

	public List findByDescriptionTimeOffset(Object descriptionTimeOffset) {
		return descriptionDAO
				.findByDescriptionTimeOffset(descriptionTimeOffset);
	}

	public List findByDescriptionStartTimeText(Object descriptionStartTimeText) {
		return descriptionDAO
				.findByDescriptionStartTimeText(descriptionStartTimeText);
	}

	public List findByDescriptionEndTimeInt(Object descriptionEndTimeInt) {
		return descriptionDAO
				.findByDescriptionEndTimeInt(descriptionEndTimeInt);
	}

	public List findByDescriptionEndTimeText(Object descriptionEndTimeText) {
		return descriptionDAO
				.findByDescriptionEndTimeText(descriptionEndTimeText);
	}

	public List findByDescriptionDurationInt(Object descriptionDurationInt) {
		return descriptionDAO
				.findByDescriptionDurationInt(descriptionDurationInt);
	}

	public List findByDescriptionDurationText(Object descriptionDurationText) {
		return descriptionDAO
				.findByDescriptionDurationText(descriptionDurationText);
	}

	public List findByDescriptionRatingTotal(Object descriptionRatingTotal) {
		return descriptionDAO
				.findByDescriptionRatingTotal(descriptionRatingTotal);
	}

	public List findByDescriptionCompression(Object descriptionCompression) {
		return descriptionDAO
				.findByDescriptionCompression(descriptionCompression);
	}

	public List findByModified(Object modified) {
		return descriptionDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return descriptionDAO.findByCreated(created);
	}

	public List findAll() {
		return descriptionDAO.findAll();
	}

	public Description merge(Description detachedInstance) {
		return descriptionDAO.merge(detachedInstance);
	}

	public void attachDirty(Description instance) {
		descriptionDAO.attachDirty(instance);
	}

	public void attachClean(Description instance) {
		descriptionDAO.attachClean(instance);
	}

}