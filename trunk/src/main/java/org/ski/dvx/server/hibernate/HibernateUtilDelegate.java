package org.ski.dvx.server.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@javax.jws.WebService(targetNamespace = "http://hibernate.server.dvx.ski.org/", serviceName = "HibernateUtilService", portName = "HibernateUtilPort")
public class HibernateUtilDelegate {

	org.ski.dvx.server.hibernate.HibernateUtil hibernateUtil = new org.ski.dvx.server.hibernate.HibernateUtil();

	public SessionFactory getSessionFactory() {
		return hibernateUtil.getSessionFactory();
	}

}