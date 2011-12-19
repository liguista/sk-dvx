package org.ski.dvx.server.hibernate.movie;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://movie.hibernate.server.dvx.ski.org/", serviceName = "MovieDAOService", portName = "MovieDAOPort")
public class MovieDAODelegate {

	org.ski.dvx.server.hibernate.movie.MovieDAO movieDAO = new org.ski.dvx.server.hibernate.movie.MovieDAO();

	public void save(Movie transientInstance) {
		movieDAO.save(transientInstance);
	}

	public void delete(Movie persistentInstance) {
		movieDAO.delete(persistentInstance);
	}

	public Movie findById(java.lang.Integer id) {
		return movieDAO.findById(id);
	}

	public List findByExample(Movie instance) {
		return movieDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return movieDAO.findByProperty(propertyName, value);
	}

	public List findByMovieName(Object movieName) {
		return movieDAO.findByMovieName(movieName);
	}

	public List findByMovieSbnNumber(Object movieSbnNumber) {
		return movieDAO.findByMovieSbnNumber(movieSbnNumber);
	}

	public List findByMovieAuthorFk(Object movieAuthorFk) {
		return movieDAO.findByMovieAuthorFk(movieAuthorFk);
	}

	public List findByMovieActive(Object movieActive) {
		return movieDAO.findByMovieActive(movieActive);
	}

	public List findByMovieReleased(Object movieReleased) {
		return movieDAO.findByMovieReleased(movieReleased);
	}

	public List findByMovieRatingTemp(Object movieRatingTemp) {
		return movieDAO.findByMovieRatingTemp(movieRatingTemp);
	}

	public List findByMovieRatedFk(Object movieRatedFk) {
		return movieDAO.findByMovieRatedFk(movieRatedFk);
	}

	public List findByMovieLanguageMainFk(Object movieLanguageMainFk) {
		return movieDAO.findByMovieLanguageMainFk(movieLanguageMainFk);
	}

	public List findByMovieRating(Object movieRating) {
		return movieDAO.findByMovieRating(movieRating);
	}

	public List findByMovieQuote(Object movieQuote) {
		return movieDAO.findByMovieQuote(movieQuote);
	}

	public List findByMovieDescription(Object movieDescription) {
		return movieDAO.findByMovieDescription(movieDescription);
	}

	public List findByMovieExtraFeatures(Object movieExtraFeatures) {
		return movieDAO.findByMovieExtraFeatures(movieExtraFeatures);
	}

	public List findByMovieStatusFk(Object movieStatusFk) {
		return movieDAO.findByMovieStatusFk(movieStatusFk);
	}

	public List findByMovieRuntime(Object movieRuntime) {
		return movieDAO.findByMovieRuntime(movieRuntime);
	}

	public List findByMovieBudget(Object movieBudget) {
		return movieDAO.findByMovieBudget(movieBudget);
	}

	public List findByMovieRevenue(Object movieRevenue) {
		return movieDAO.findByMovieRevenue(movieRevenue);
	}

	public List findByMovieWebpage(Object movieWebpage) {
		return movieDAO.findByMovieWebpage(movieWebpage);
	}

	public List findByMoviePathFk(Object moviePathFk) {
		return movieDAO.findByMoviePathFk(moviePathFk);
	}

	public List findByMovieCountryOfOriginFk(Object movieCountryOfOriginFk) {
		return movieDAO.findByMovieCountryOfOriginFk(movieCountryOfOriginFk);
	}

	public List findByModified(Object modified) {
		return movieDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return movieDAO.findByCreated(created);
	}

	public List findAll() {
		return movieDAO.findAll();
	}

	public Movie merge(Movie detachedInstance) {
		return movieDAO.merge(detachedInstance);
	}

	public void attachDirty(Movie instance) {
		movieDAO.attachDirty(instance);
	}

	public void attachClean(Movie instance) {
		movieDAO.attachClean(instance);
	}

}