package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Attribute entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.ski.dvx.hibernate.Attribute
 * @author MyEclipse Persistence Tools
 */

public class AttributeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AttributeDAO.class);
	// property constants
	public static final String ATTIBUTE_NAME = "attibuteName";
	public static final String ATTRIBUTE_VALUE = "attributeValue";

	public void save(Attribute transientInstance) {
		log.debug("saving Attribute instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Attribute persistentInstance) {
		log.debug("deleting Attribute instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Attribute findById(java.lang.Integer id) {
		log.debug("getting Attribute instance with id: " + id);
		try {
			Attribute instance = (Attribute) getSession().get(
					"org.ski.dvx.hibernate.Attribute", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Attribute instance) {
		log.debug("finding Attribute instance by example");
		try {
			List results = getSession()
					.createCriteria("org.ski.dvx.hibernate.Attribute")
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
		log.debug("finding Attribute instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Attribute as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAttibuteName(Object attibuteName) {
		return findByProperty(ATTIBUTE_NAME, attibuteName);
	}

	public List findByAttributeValue(Object attributeValue) {
		return findByProperty(ATTRIBUTE_VALUE, attributeValue);
	}

	public List findAll() {
		log.debug("finding all Attribute instances");
		try {
			String queryString = "from Attribute";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Attribute merge(Attribute detachedInstance) {
		log.debug("merging Attribute instance");
		try {
			Attribute result = (Attribute) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Attribute instance) {
		log.debug("attaching dirty Attribute instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Attribute instance) {
		log.debug("attaching clean Attribute instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}