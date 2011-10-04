package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractVersion entity provides the base persistence definition of the Version entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVersion  implements java.io.Serializable {


    // Fields    

     private Integer versionId;
     private Movie movie;
     private Author author;
     private Language language;
     private String versionDescription;
     private Timestamp created;
     private Timestamp modified;
     private Set ratings = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractVersion() {
    }

    
    /** full constructor */
    public AbstractVersion(Movie movie, Author author, Language language, String versionDescription, Timestamp created, Timestamp modified, Set ratings) {
        this.movie = movie;
        this.author = author;
        this.language = language;
        this.versionDescription = versionDescription;
        this.created = created;
        this.modified = modified;
        this.ratings = ratings;
    }

   
    // Property accessors

    public Integer getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Author getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Language getLanguage() {
        return this.language;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getVersionDescription() {
        return this.versionDescription;
    }
    
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
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

    public Set getRatings() {
        return this.ratings;
    }
    
    public void setRatings(Set ratings) {
        this.ratings = ratings;
    }
   








}