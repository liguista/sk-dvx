package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;


/**
 * Version entity. @author MyEclipse Persistence Tools
 */
public class Version extends AbstractVersion implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Version() {
    }

    
    /** full constructor */
    public Version(Movie movie, Author author, Language language, String versionDescription, Timestamp created, Timestamp modified, Set ratings) {
        super(movie, author, language, versionDescription, created, modified, ratings);        
    }
   
}
