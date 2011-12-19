package org.ski.dvx.server.hibernate.transaction_log;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TransactionLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.ski.dvx.server.hibernate.transaction_log.TransactionLog
 * @author MyEclipse Persistence Tools
 */

public class TransactionLogDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TransactionLogDAO.class);
	// property constants
	public static final String USER_FK = "userFk";
	public static final String MOVIE_FK = "movieFk";
	public static final String TRANSACTION_TYPE = "transactionType";
	public static final String TRANSACTION_LEVEL = "transactionLevel";
	public static final String TRANSACTION_DETAILS = "transactionDetails";
	public static final String MODIFIED = "modified";
	public static final String CREATED = "created";

	public void save(TransactionLog transientInstance) {
		log.debug("saving TransactionLog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TransactionLog persistentInstance) {
		log.debug("deleting TransactionLog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TransactionLog findById(java.lang.Integer id) {
		log.debug("getting TransactionLog instance with id: " + id);
		try {
			TransactionLog instance = (TransactionLog) getSession()
					.get("org.ski.dvx.server.hibernate.transaction_log.TransactionLog",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TransactionLog instance) {
		log.debug("finding TransactionLog instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"org.ski.dvx.server.hibernate.transaction_log.TransactionLog")
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
		log.debug("finding TransactionLog instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TransactionLog as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserFk(Object userFk) {
		return findByProperty(USER_FK, userFk);
	}

	public List findByMovieFk(Object movieFk) {
		return findByProperty(MOVIE_FK, movieFk);
	}

	public List findByTransactionType(Object transactionType) {
		return findByProperty(TRANSACTION_TYPE, transactionType);
	}

	public List findByTransactionLevel(Object transactionLevel) {
		return findByProperty(TRANSACTION_LEVEL, transactionLevel);
	}

	public List findByTransactionDetails(Object transactionDetails) {
		return findByProperty(TRANSACTION_DETAILS, transactionDetails);
	}

	public List findByModified(Object modified) {
		return findByProperty(MODIFIED, modified);
	}

	public List findByCreated(Object created) {
		return findByProperty(CREATED, created);
	}

	public List findAll() {
		log.debug("finding all TransactionLog instances");
		try {
			String queryString = "from TransactionLog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TransactionLog merge(TransactionLog detachedInstance) {
		log.debug("merging TransactionLog instance");
		try {
			TransactionLog result = (TransactionLog) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TransactionLog instance) {
		log.debug("attaching dirty TransactionLog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TransactionLog instance) {
		log.debug("attaching clean TransactionLog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}