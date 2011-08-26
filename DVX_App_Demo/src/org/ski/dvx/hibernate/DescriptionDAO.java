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
 * Description entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.ski.dvx.hibernate.Description
 * @author MyEclipse Persistence Tools
 */

public class DescriptionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DescriptionDAO.class);
	// property constants
	public static final String DESCRIPTION_ORDER = "descriptionOrder";
	public static final String DESCRIPTION_TYPE_ENUM = "descriptionTypeEnum";
	public static final String DESCRIPTION_LONG = "descriptionLong";
	public static final String DESCRIPTION_SHORT = "descriptionShort";
	public static final String DESCRIPTION_VERSION = "descriptionVersion";
	public static final String DESCRIPTION_URI = "descriptionUri";
	public static final String DESCRIPTION_CHAPTER = "descriptionChapter";
	public static final String DESCRIPTION_START_TIME_INT = "descriptionStartTimeInt";
	public static final String DESCRIPTION_START_FRAME = "descriptionStartFrame";
	public static final String DESCRIPTION_TIME_OFFSET = "descriptionTimeOffset";
	public static final String DESCRIPTION_START_TIME_TEXT = "descriptionStartTimeText";
	public static final String DESCRIPTION_END_TIME_INT = "descriptionEndTimeInt";
	public static final String DESCRIPTION_END_TIME_TEXT = "descriptionEndTimeText";
	public static final String DESCRIPTION_DURATION_INT = "descriptionDurationInt";
	public static final String DESCRIPTION_DURATION_TEXT = "descriptionDurationText";
	public static final String DESCRIPTION_ACTIVE = "descriptionActive";
	public static final String DESCRIPTION_RATING_TOTAL = "descriptionRatingTotal";
	public static final String DESCRIPTION_COMPRESSION = "descriptionCompression";

	public void save(Description transientInstance) {
		log.debug("saving Description instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Description persistentInstance) {
		log.debug("deleting Description instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Description findById(java.lang.Integer id) {
		log.debug("getting Description instance with id: " + id);
		try {
			Description instance = (Description) getSession().get(
					"org.ski.dvx.hibernate.Description", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Description instance) {
		log.debug("finding Description instance by example");
		try {
			List results = getSession()
					.createCriteria("org.ski.dvx.hibernate.Description")
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
		log.debug("finding Description instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Description as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescriptionOrder(Object descriptionOrder) {
		return findByProperty(DESCRIPTION_ORDER, descriptionOrder);
	}

	public List findByDescriptionTypeEnum(Object descriptionTypeEnum) {
		return findByProperty(DESCRIPTION_TYPE_ENUM, descriptionTypeEnum);
	}

	public List findByDescriptionLong(Object descriptionLong) {
		return findByProperty(DESCRIPTION_LONG, descriptionLong);
	}

	public List findByDescriptionShort(Object descriptionShort) {
		return findByProperty(DESCRIPTION_SHORT, descriptionShort);
	}

	public List findByDescriptionVersion(Object descriptionVersion) {
		return findByProperty(DESCRIPTION_VERSION, descriptionVersion);
	}

	public List findByDescriptionUri(Object descriptionUri) {
		return findByProperty(DESCRIPTION_URI, descriptionUri);
	}

	public List findByDescriptionChapter(Object descriptionChapter) {
		return findByProperty(DESCRIPTION_CHAPTER, descriptionChapter);
	}

	public List findByDescriptionStartTimeInt(Object descriptionStartTimeInt) {
		return findByProperty(DESCRIPTION_START_TIME_INT,
				descriptionStartTimeInt);
	}

	public List findByDescriptionStartFrame(Object descriptionStartFrame) {
		return findByProperty(DESCRIPTION_START_FRAME, descriptionStartFrame);
	}

	public List findByDescriptionTimeOffset(Object descriptionTimeOffset) {
		return findByProperty(DESCRIPTION_TIME_OFFSET, descriptionTimeOffset);
	}

	public List findByDescriptionStartTimeText(Object descriptionStartTimeText) {
		return findByProperty(DESCRIPTION_START_TIME_TEXT,
				descriptionStartTimeText);
	}

	public List findByDescriptionEndTimeInt(Object descriptionEndTimeInt) {
		return findByProperty(DESCRIPTION_END_TIME_INT, descriptionEndTimeInt);
	}

	public List findByDescriptionEndTimeText(Object descriptionEndTimeText) {
		return findByProperty(DESCRIPTION_END_TIME_TEXT, descriptionEndTimeText);
	}

	public List findByDescriptionDurationInt(Object descriptionDurationInt) {
		return findByProperty(DESCRIPTION_DURATION_INT, descriptionDurationInt);
	}

	public List findByDescriptionDurationText(Object descriptionDurationText) {
		return findByProperty(DESCRIPTION_DURATION_TEXT,
				descriptionDurationText);
	}

	public List findByDescriptionActive(Object descriptionActive) {
		return findByProperty(DESCRIPTION_ACTIVE, descriptionActive);
	}

	public List findByDescriptionRatingTotal(Object descriptionRatingTotal) {
		return findByProperty(DESCRIPTION_RATING_TOTAL, descriptionRatingTotal);
	}

	public List findByDescriptionCompression(Object descriptionCompression) {
		return findByProperty(DESCRIPTION_COMPRESSION, descriptionCompression);
	}

	public List findAll() {
		log.debug("finding all Description instances");
		try {
			String queryString = "from Description";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Description merge(Description detachedInstance) {
		log.debug("merging Description instance");
		try {
			Description result = (Description) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Description instance) {
		log.debug("attaching dirty Description instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Description instance) {
		log.debug("attaching clean Description instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}