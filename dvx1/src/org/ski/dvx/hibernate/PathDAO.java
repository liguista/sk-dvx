package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Path
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see org.ski.dvx.hibernate.Path
 * @author MyEclipse Persistence Tools
 */

public class PathDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PathDAO.class);
	// property constants
	public static final String PATH_PREFIX = "pathPrefix";

	public void save(Path transientInstance) {
		log.debug("saving Path instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Path persistentInstance) {
		log.debug("deleting Path instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Path findById(java.lang.Integer id) {
		log.debug("getting Path instance with id: " + id);
		try {
			Path instance = (Path) getSession().get(
					"org.ski.dvx.hibernate.Path", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Path instance) {
		log.debug("finding Path instance by example");
		try {
			List results = getSession()
					.createCriteria("org.ski.dvx.hibernate.Path")
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
		log.debug("finding Path instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Path as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPathPrefix(Object pathPrefix) {
		return findByProperty(PATH_PREFIX, pathPrefix);
	}

	public List findAll() {
		log.debug("finding all Path instances");
		try {
			String queryString = "from Path";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Path merge(Path detachedInstance) {
		log.debug("merging Path instance");
		try {
			Path result = (Path) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Path instance) {
		log.debug("attaching dirty Path instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Path instance) {
		log.debug("attaching clean Path instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}