package org.ski.dvx.server.hibernate.transaction_log;

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
	public TransactionLog(Integer userFk, Integer movieFk,
			String transactionType, String transactionLevel,
			String transactionDetails, Long modified, Long created) {
		super(userFk, movieFk, transactionType, transactionLevel,
				transactionDetails, modified, created);
	}

}
