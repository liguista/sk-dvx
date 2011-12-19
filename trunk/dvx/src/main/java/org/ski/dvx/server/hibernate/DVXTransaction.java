package org.ski.dvx.server.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DVXTransaction {
	
	private Session session = HibernateSessionFactory.getSession();
	
	private Transaction transaction;
	
	public DVXTransaction()
	{
		transaction = null;
	}

	public void BeginTransaction()
	{
		transaction = session.beginTransaction();
	}
	
	public void EndTransaction()
	{
		transaction.commit();
		session.close();	// TODO This may not be the right thing to do...
	}
}
