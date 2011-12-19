package org.ski.dvx.server.hibernate.movie_chapter;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * MovieChapter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.ski.dvx.server.hibernate.movie_chapter.MovieChapter
 * @author MyEclipse Persistence Tools
 */

public class MovieChapterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MovieChapterDAO.class);
	// property constants
	public static final String MOVIE_FK = "movieFk";
	public static final String MOVIE_CHAPTER_DESCRIPTION = "movieChapterDescription";
	public static final String MOVIE_CHAPTER_NAME = "movieChapterName";
	public static final String MOVIE_CHAPTER_START_TIME = "movieChapterStartTime";
	public static final String MOVIE_CHAPTER_END_TIME = "movieChapterEndTime";
	public static final String MODIFIED = "modified";
	public static final String CREATED = "created";

	public void save(MovieChapter transientInstance) {
		log.debug("saving MovieChapter instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MovieChapter persistentInstance) {
		log.debug("deleting MovieChapter instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MovieChapter findById(java.lang.Integer id) {
		log.debug("getting MovieChapter instance with id: " + id);
		try {
			MovieChapter instance = (MovieChapter) getSession().get(
					"org.ski.dvx.server.hibernate.movie_chapter.MovieChapter",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MovieChapter instance) {
		log.debug("finding MovieChapter instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"org.ski.dvx.server.hibernate.movie_chapter.MovieChapter")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MovieChapter instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MovieChapter as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMovieFk(Object movieFk) {
		return findByProperty(MOVIE_FK, movieFk);
	}

	public List findByMovieChapterDescription(Object movieChapterDescription) {
		return findByProperty(MOVIE_CHAPTER_DESCRIPTION,
				movieChapterDescription);
	}

	public List findByMovieChapterName(Object movieChapterName) {
		return findByProperty(MOVIE_CHAPTER_NAME, movieChapterName);
	}

	public List findByMovieChapterStartTime(Object movieChapterStartTime) {
		return findByProperty(MOVIE_CHAPTER_START_TIME, movieChapterStartTime);
	}

	public List findByMovieChapterEndTime(Object movieChapterEndTime) {
		return findByProperty(MOVIE_CHAPTER_END_TIME, movieChapterEndTime);
	}

	public List findByModified(Object modified) {
		return findByProperty(MODIFIED, modified);
	}

	public List findByCreated(Object created) {
		return findByProperty(CREATED, created);
	}

	public List findAll() {
		log.debug("finding all MovieChapter instances");
		try {
			String queryString = "from MovieChapter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MovieChapter merge(MovieChapter detachedInstance) {
		log.debug("merging MovieChapter instance");
		try {
			MovieChapter result = (MovieChapter) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MovieChapter instance) {
		log.debug("attaching dirty MovieChapter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MovieChapter instance) {
		log.debug("attaching clean MovieChapter instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}