package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;


/**
 * ZipCode entity. @author MyEclipse Persistence Tools
 */
public class ZipCode extends AbstractZipCode implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public ZipCode() {
    }

	/** minimal constructor */
    public ZipCode(Integer zipCode) {
        super(zipCode);        
    }
    
    /** full constructor */
    public ZipCode(State state, Geocode geocode, City city, Integer zipCode, Integer zipCodeExtended, Timestamp created, Timestamp modified, Set cities, Set userDetails) {
        super(state, geocode, city, zipCode, zipCodeExtended, created, modified, cities, userDetails);        
    }
   
}
