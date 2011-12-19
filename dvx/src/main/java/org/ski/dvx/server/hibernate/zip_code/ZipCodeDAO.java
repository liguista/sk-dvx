package org.ski.dvx.server.hibernate.zip_code;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * ZipCode entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.ski.dvx.server.hibernate.zip_code.ZipCode
 * @author MyEclipse Persistence Tools
 */

public class ZipCodeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ZipCodeDAO.class);
	// property constants
	public static final String ZIP_CODE = "zipCode";
	public static final String ZIP_CODE_EXTENDED = "zipCodeExtended";
	public static final String ZIP_CODE_GEOCODE_FK = "zipCodeGeocodeFk";
	public static final String ZIP_CODE_CITY_FK = "zipCodeCityFk";
	public static final String ZIP_CODE_STATE_FK = "zipCodeStateFk";
	public static final String MODIFIED = "modified";
	public static final String CREATED = "created";

	public void save(ZipCode transientInstance) {
		log.debug("saving ZipCode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ZipCode persistentInstance) {
		log.debug("deleting ZipCode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ZipCode findById(java.lang.Integer id) {
		log.debug("getting ZipCode instance with id: " + id);
		try {
			ZipCode instance = (ZipCode) getSession().get(
					"org.ski.dvx.server.hibernate.zip_code.ZipCode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ZipCode instance) {
		log.debug("finding ZipCode instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"org.ski.dvx.server.hibernate.zip_code.ZipCode")
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
		log.debug("finding ZipCode instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ZipCode as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List findByZipCodeExtended(Object zipCodeExtended) {
		return findByProperty(ZIP_CODE_EXTENDED, zipCodeExtended);
	}

	public List findByZipCodeGeocodeFk(Object zipCodeGeocodeFk) {
		return findByProperty(ZIP_CODE_GEOCODE_FK, zipCodeGeocodeFk);
	}

	public List findByZipCodeCityFk(Object zipCodeCityFk) {
		return findByProperty(ZIP_CODE_CITY_FK, zipCodeCityFk);
	}

	public List findByZipCodeStateFk(Object zipCodeStateFk) {
		return findByProperty(ZIP_CODE_STATE_FK, zipCodeStateFk);
	}

	public List findByModified(Object modified) {
		return findByProperty(MODIFIED, modified);
	}

	public List findByCreated(Object created) {
		return findByProperty(CREATED, created);
	}

	public List findAll() {
		log.debug("finding all ZipCode instances");
		try {
			String queryString = "from ZipCode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ZipCode merge(ZipCode detachedInstance) {
		log.debug("merging ZipCode instance");
		try {
			ZipCode result = (ZipCode) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ZipCode instance) {
		log.debug("attaching dirty ZipCode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ZipCode instance) {
		log.debug("attaching clean ZipCode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}