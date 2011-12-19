package org.ski.dvx.server.hibernate.transaction_log;

/**
 * AbstractTransactionLog entity provides the base persistence definition of the
 * TransactionLog entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTransactionLog implements java.io.Serializable {

	// Fields

	private Integer idKey;
	private Integer userFk;
	private Integer movieFk;
	private String transactionType;
	private String transactionLevel;
	private String transactionDetails;
	private Long modified;
	private Long created;

	// Constructors

	/** default constructor */
	public AbstractTransactionLog() {
	}

	/** full constructor */
	public AbstractTransactionLog(Integer userFk, Integer movieFk,
			String transactionType, String transactionLevel,
			String transactionDetails, Long modified, Long created) {
		this.userFk = userFk;
		this.movieFk = movieFk;
		this.transactionType = transactionType;
		this.transactionLevel = transactionLevel;
		this.transactionDetails = transactionDetails;
		this.modified = modified;
		this.created = created;
	}

	// Property accessors

	public Integer getIdKey() {
		return this.idKey;
	}

	public void setIdKey(Integer idKey) {
		this.idKey = idKey;
	}

	public Integer getUserFk() {
		return this.userFk;
	}

	public void setUserFk(Integer userFk) {
		this.userFk = userFk;
	}

	public Integer getMovieFk() {
		return this.movieFk;
	}

	public void setMovieFk(Integer movieFk) {
		this.movieFk = movieFk;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionLevel() {
		return this.transactionLevel;
	}

	public void setTransactionLevel(String transactionLevel) {
		this.transactionLevel = transactionLevel;
	}

	public String getTransactionDetails() {
		return this.transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

}