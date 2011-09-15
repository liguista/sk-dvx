package org.ski.dvx.hibernate;

import java.sql.Timestamp;


/**
 * AbstractTransactionLog entity provides the base persistence definition of the TransactionLog entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTransactionLog  implements java.io.Serializable {


    // Fields    

     private Integer idKey;
     private Movie movie;
     private User user;
     private String transactionType;
     private String transactionLevel;
     private String transactionDetails;
     private Timestamp created;
     private Timestamp modified;


    // Constructors

    /** default constructor */
    public AbstractTransactionLog() {
    }

    
    /** full constructor */
    public AbstractTransactionLog(Movie movie, User user, String transactionType, String transactionLevel, String transactionDetails, Timestamp created, Timestamp modified) {
        this.movie = movie;
        this.user = user;
        this.transactionType = transactionType;
        this.transactionLevel = transactionLevel;
        this.transactionDetails = transactionDetails;
        this.created = created;
        this.modified = modified;
    }

   
    // Property accessors

    public Integer getIdKey() {
        return this.idKey;
    }
    
    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
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

    public Timestamp getCreated() {
        return this.created;
    }
    
    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getModified() {
        return this.modified;
    }
    
    public void setModified(Timestamp modified) {
        this.modified = modified;
    }
   








}