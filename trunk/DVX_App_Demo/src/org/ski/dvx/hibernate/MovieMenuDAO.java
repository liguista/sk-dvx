package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.hibernate.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for MovieMenu entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see org.ski.dvx.hibernate.MovieMenu
  * @author MyEclipse Persistence Tools 
 */

public class MovieMenuDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MovieMenuDAO.class);
		//property constants
	public static final String MENU_ACTIVE = "menuActive";
	public static final String MENU_NUMBER = "menuNumber";
	public static final String MENU_ITEM = "menuItem";
	public static final String DESCRIPTION = "description";
	public static final String MENU_VERSION = "menuVersion";
	public static final String MENU_URI = "menuUri";



    
    public void save(MovieMenu transientInstance) {
        log.debug("saving MovieMenu instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(MovieMenu persistentInstance) {
        log.debug("deleting MovieMenu instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public MovieMenu findById( java.lang.Integer id) {
        log.debug("getting MovieMenu instance with id: " + id);
        try {
            MovieMenu instance = (MovieMenu) getSession()
                    .get("org.ski.dvx.hibernate.MovieMenu", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(MovieMenu instance) {
        log.debug("finding MovieMenu instance by example");
        try {
            List results = getSession()
                    .createCriteria("org.ski.dvx.hibernate.MovieMenu")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding MovieMenu instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from MovieMenu as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByMenuActive(Object menuActive
	) {
		return findByProperty(MENU_ACTIVE, menuActive
		);
	}
	
	public List findByMenuNumber(Object menuNumber
	) {
		return findByProperty(MENU_NUMBER, menuNumber
		);
	}
	
	public List findByMenuItem(Object menuItem
	) {
		return findByProperty(MENU_ITEM, menuItem
		);
	}
	
	public List findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List findByMenuVersion(Object menuVersion
	) {
		return findByProperty(MENU_VERSION, menuVersion
		);
	}
	
	public List findByMenuUri(Object menuUri
	) {
		return findByProperty(MENU_URI, menuUri
		);
	}
	

	public List findAll() {
		log.debug("finding all MovieMenu instances");
		try {
			String queryString = "from MovieMenu";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public MovieMenu merge(MovieMenu detachedInstance) {
        log.debug("merging MovieMenu instance");
        try {
            MovieMenu result = (MovieMenu) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(MovieMenu instance) {
        log.debug("attaching dirty MovieMenu instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(MovieMenu instance) {
        log.debug("attaching clean MovieMenu instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}