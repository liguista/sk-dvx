package org.ski.dvx.server.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

@javax.jws.WebService(targetNamespace = "http://hibernate.server.dvx.ski.org/", serviceName = "DVXTransactionService", portName = "DVXTransactionPort")
public class DVXTransactionDelegate {

	org.ski.dvx.server.hibernate.DVXTransaction dVXTransaction = new org.ski.dvx.server.hibernate.DVXTransaction();

	public void BeginTransaction() {
		dVXTransaction.BeginTransaction();
	}

	public void EndTransaction() {
		dVXTransaction.EndTransaction();
	}

}