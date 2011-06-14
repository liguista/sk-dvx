package hibernate_dvx;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AudioTrackInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see hibernate_dvx.AudioTrackInfo
 * @author MyEclipse Persistence Tools
 */

public class AudioTrackInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AudioTrackInfoDAO.class);
	// property constants
	public static final String AUDIO_TRACK_DESCRIPTION = "audioTrackDescription";
	public static final String AUDIO_TRACK_GAIN = "audioTrackGain";
	public static final String AUDIO_TRACK_PAN = "audioTrackPan";

	public void save(AudioTrackInfo transientInstance) {
		log.debug("saving AudioTrackInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AudioTrackInfo persistentInstance) {
		log.debug("deleting AudioTrackInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AudioTrackInfo findById(java.lang.Integer id) {
		log.debug("getting AudioTrackInfo instance with id: " + id);
		try {
			AudioTrackInfo instance = (AudioTrackInfo) getSession().get(
					"hibernate_dvx.AudioTrackInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AudioTrackInfo instance) {
		log.debug("finding AudioTrackInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("hibernate_dvx.AudioTrackInfo")
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
		log.debug("finding AudioTrackInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AudioTrackInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAudioTrackDescription(Object audioTrackDescription) {
		return findByProperty(AUDIO_TRACK_DESCRIPTION, audioTrackDescription);
	}

	public List findByAudioTrackGain(Object audioTrackGain) {
		return findByProperty(AUDIO_TRACK_GAIN, audioTrackGain);
	}

	public List findByAudioTrackPan(Object audioTrackPan) {
		return findByProperty(AUDIO_TRACK_PAN, audioTrackPan);
	}

	public List findAll() {
		log.debug("finding all AudioTrackInfo instances");
		try {
			String queryString = "from AudioTrackInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AudioTrackInfo merge(AudioTrackInfo detachedInstance) {
		log.debug("merging AudioTrackInfo instance");
		try {
			AudioTrackInfo result = (AudioTrackInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AudioTrackInfo instance) {
		log.debug("attaching dirty AudioTrackInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AudioTrackInfo instance) {
		log.debug("attaching clean AudioTrackInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}