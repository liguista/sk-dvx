package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;


/**
 * Author entity. @author MyEclipse Persistence Tools
 */
public class Author extends AbstractAuthor implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Author() {
    }

    
    /** full constructor */
    public Author(User user, Timestamp created, Timestamp modified, Set movieMenus, Set descriptions, Set versions, Set paths, Set crewCasts) {
        super(user, created, modified, movieMenus, descriptions, versions, paths, crewCasts);        
    }
   
}
