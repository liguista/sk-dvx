package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractPath entity provides the base persistence definition of the Path entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPath  implements java.io.Serializable {


    // Fields    

     private Integer idKey;
     private Author author;
     private String pathPrefix;
     private Timestamp modified;
     private Timestamp created;
     private Set movieMenus = new HashSet(0);
     private Set descriptions = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractPath() {
    }

    
    /** full constructor */
    public AbstractPath(Author author, String pathPrefix, Timestamp modified, Timestamp created, Set movieMenus, Set descriptions) {
        this.author = author;
        this.pathPrefix = pathPrefix;
        this.modified = modified;
        this.created = created;
        this.movieMenus = movieMenus;
        this.descriptions = descriptions;
    }

   
    // Property accessors

    public Integer getIdKey() {
        return this.idKey;
    }
    
    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    public Author getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPathPrefix() {
        return this.pathPrefix;
    }
    
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public Timestamp getModified() {
        return this.modified;
    }
    
    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public Timestamp getCreated() {
        return this.created;
    }
    
    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Set getMovieMenus() {
        return this.movieMenus;
    }
    
    public void setMovieMenus(Set movieMenus) {
        this.movieMenus = movieMenus;
    }

    public Set getDescriptions() {
        return this.descriptions;
    }
    
    public void setDescriptions(Set descriptions) {
        this.descriptions = descriptions;
    }
   








}