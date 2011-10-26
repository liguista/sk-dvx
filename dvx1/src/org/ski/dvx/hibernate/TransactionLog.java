package org.ski.dvx.hibernate;

import java.sql.Timestamp;

/**
 * TransactionLog entity. @author MyEclipse Persistence Tools
 */
public class TransactionLog extends AbstractTransactionLog implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TransactionLog() {
	}

	/** full constructor */
	public TransactionLog(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails,
			Timestamp created, Timestamp modified) {
		super(movie, user, transactionType, transactionLevel,
				transactionDetails, created, modified);
	}

}
