package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.Set;


/**
 * City entity. @author MyEclipse Persistence Tools
 */
public class City extends AbstractCity implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public City() {
    }

    
    /** full constructor */
    public City(Country country, ZipCode zipCode, State state, String cityName, Integer cityGeoCodeFk, Integer cityPopulation, Timestamp modified, Timestamp created, Set zipCodes, Set userDetails) {
        super(country, zipCode, state, cityName, cityGeoCodeFk, cityPopulation, modified, created, zipCodes, userDetails);        
    }
   
}
