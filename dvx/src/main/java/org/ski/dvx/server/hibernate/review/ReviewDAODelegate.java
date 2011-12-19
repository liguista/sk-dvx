package org.ski.dvx.server.hibernate.review;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://review.hibernate.server.dvx.ski.org/", serviceName = "ReviewDAOService", portName = "ReviewDAOPort")
public class ReviewDAODelegate {

	org.ski.dvx.server.hibernate.review.ReviewDAO reviewDAO = new org.ski.dvx.server.hibernate.review.ReviewDAO();

	public void save(Review transientInstance) {
		reviewDAO.save(transientInstance);
	}

	public void delete(Review persistentInstance) {
		reviewDAO.delete(persistentInstance);
	}

	public Review findById(java.lang.Integer id) {
		return reviewDAO.findById(id);
	}

	public List findByExample(Review instance) {
		return reviewDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return reviewDAO.findByProperty(propertyName, value);
	}

	public List findByReviewUserFk(Object reviewUserFk) {
		return reviewDAO.findByReviewUserFk(reviewUserFk);
	}

	public List findByReviewLanguageFk(Object reviewLanguageFk) {
		return reviewDAO.findByReviewLanguageFk(reviewLanguageFk);
	}

	public List findByReviewVersionFk(Object reviewVersionFk) {
		return reviewDAO.findByReviewVersionFk(reviewVersionFk);
	}

	public List findByMovieFk(Object movieFk) {
		return reviewDAO.findByMovieFk(movieFk);
	}

	public List findByReviewSummary(Object reviewSummary) {
		return reviewDAO.findByReviewSummary(reviewSummary);
	}

	public List findByReviewLong(Object reviewLong) {
		return reviewDAO.findByReviewLong(reviewLong);
	}

	public List findByReviewActive(Object reviewActive) {
		return reviewDAO.findByReviewActive(reviewActive);
	}

	public List findByModified(Object modified) {
		return reviewDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return reviewDAO.findByCreated(created);
	}

	public List findAll() {
		return reviewDAO.findAll();
	}

	public Review merge(Review detachedInstance) {
		return reviewDAO.merge(detachedInstance);
	}

	public void attachDirty(Review instance) {
		reviewDAO.attachDirty(instance);
	}

	public void attachClean(Review instance) {
		reviewDAO.attachClean(instance);
	}

}