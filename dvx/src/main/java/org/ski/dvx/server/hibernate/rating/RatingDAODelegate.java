package org.ski.dvx.server.hibernate.rating;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://rating.hibernate.server.dvx.ski.org/", serviceName = "RatingDAOService", portName = "RatingDAOPort")
public class RatingDAODelegate {

	org.ski.dvx.server.hibernate.rating.RatingDAO ratingDAO = new org.ski.dvx.server.hibernate.rating.RatingDAO();

	public void save(Rating transientInstance) {
		ratingDAO.save(transientInstance);
	}

	public void delete(Rating persistentInstance) {
		ratingDAO.delete(persistentInstance);
	}

	public Rating findById(java.lang.Integer id) {
		return ratingDAO.findById(id);
	}

	public List findByExample(Rating instance) {
		return ratingDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return ratingDAO.findByProperty(propertyName, value);
	}

	public List findByRatingUserFk(Object ratingUserFk) {
		return ratingDAO.findByRatingUserFk(ratingUserFk);
	}

	public List findByRatingLanguageFk(Object ratingLanguageFk) {
		return ratingDAO.findByRatingLanguageFk(ratingLanguageFk);
	}

	public List findByRatingMovieFk(Object ratingMovieFk) {
		return ratingDAO.findByRatingMovieFk(ratingMovieFk);
	}

	public List findByDescriptionFk(Object descriptionFk) {
		return ratingDAO.findByDescriptionFk(descriptionFk);
	}

	public List findByRatingVersionFk(Object ratingVersionFk) {
		return ratingDAO.findByRatingVersionFk(ratingVersionFk);
	}

	public List findByRatingNameShort(Object ratingNameShort) {
		return ratingDAO.findByRatingNameShort(ratingNameShort);
	}

	public List findByRating(Object rating) {
		return ratingDAO.findByRating(rating);
	}

	public List findByModified(Object modified) {
		return ratingDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return ratingDAO.findByCreated(created);
	}

	public List findAll() {
		return ratingDAO.findAll();
	}

	public Rating merge(Rating detachedInstance) {
		return ratingDAO.merge(detachedInstance);
	}

	public void attachDirty(Rating instance) {
		ratingDAO.attachDirty(instance);
	}

	public void attachClean(Rating instance) {
		ratingDAO.attachClean(instance);
	}

}