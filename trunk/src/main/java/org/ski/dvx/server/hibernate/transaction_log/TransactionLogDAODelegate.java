package org.ski.dvx.server.hibernate.transaction_log;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://transaction_log.hibernate.server.dvx.ski.org/", serviceName = "TransactionLogDAOService", portName = "TransactionLogDAOPort")
public class TransactionLogDAODelegate {

	org.ski.dvx.server.hibernate.transaction_log.TransactionLogDAO transactionLogDAO = new org.ski.dvx.server.hibernate.transaction_log.TransactionLogDAO();

	public void save(TransactionLog transientInstance) {
		transactionLogDAO.save(transientInstance);
	}

	public void delete(TransactionLog persistentInstance) {
		transactionLogDAO.delete(persistentInstance);
	}

	public TransactionLog findById(java.lang.Integer id) {
		return transactionLogDAO.findById(id);
	}

	public List findByExample(TransactionLog instance) {
		return transactionLogDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return transactionLogDAO.findByProperty(propertyName, value);
	}

	public List findByUserFk(Object userFk) {
		return transactionLogDAO.findByUserFk(userFk);
	}

	public List findByMovieFk(Object movieFk) {
		return transactionLogDAO.findByMovieFk(movieFk);
	}

	public List findByTransactionType(Object transactionType) {
		return transactionLogDAO.findByTransactionType(transactionType);
	}

	public List findByTransactionLevel(Object transactionLevel) {
		return transactionLogDAO.findByTransactionLevel(transactionLevel);
	}

	public List findByTransactionDetails(Object transactionDetails) {
		return transactionLogDAO.findByTransactionDetails(transactionDetails);
	}

	public List findByModified(Object modified) {
		return transactionLogDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return transactionLogDAO.findByCreated(created);
	}

	public List findAll() {
		return transactionLogDAO.findAll();
	}

	public TransactionLog merge(TransactionLog detachedInstance) {
		return transactionLogDAO.merge(detachedInstance);
	}

	public void attachDirty(TransactionLog instance) {
		transactionLogDAO.attachDirty(instance);
	}

	public void attachClean(TransactionLog instance) {
		transactionLogDAO.attachClean(instance);
	}

}