package org.ski.dvx.app;

import java.sql.Timestamp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.TransactionLog;
import org.ski.dvx.hibernate.TransactionLogDAO;
import org.ski.dvx.hibernate.User;

public class DVX_Logger {

	SessionFactory sessionFactory = null;
//	TransactionLogDAO transLogDao;
	
	DVX_Logger()
	{
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
//		transLogDao = new TransactionLogDAO();
		}
		catch (Exception ex)
		{
			System.err.println("DVX_Logger Constructor Exception " + ex);
		}
		
//		log((Movie)null,"Greg","","","");
	}
	
	void dvx_log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails)
	{
		if (true)
		return;
		if (sessionFactory==null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
//		transLogDao = new TransactionLogDAO();
		System.err.println("Kilroy was here!!!");
		TransactionLog transactionLog = new TransactionLog(
				 movie,  user,  transactionType,
				 transactionLevel,  transactionDetails, 
				 new Timestamp(System.currentTimeMillis()), 
				 new Timestamp(System.currentTimeMillis())
				);
		
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(transactionLog);
		tx.commit();

		session.close();
		
	}

}
