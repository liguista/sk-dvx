package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractZipCode entity provides the base persistence definition of the ZipCode entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractZipCode  implements java.io.Serializable {


    // Fields    

     private Integer zipCodeId;
     private State state;
     private Geocode geocode;
     private City city;
     private Integer zipCode;
     private Integer zipCodeExtended;
     private Timestamp created;
     private Timestamp modified;
     private Set cities = new HashSet(0);
     private Set userDetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractZipCode() {
    }

	/** minimal constructor */
    public AbstractZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    
    /** full constructor */
    public AbstractZipCode(State state, Geocode geocode, City city, Integer zipCode, Integer zipCodeExtended, Timestamp created, Timestamp modified, Set cities, Set userDetails) {
        this.state = state;
        this.geocode = geocode;
        this.city = city;
        this.zipCode = zipCode;
        this.zipCodeExtended = zipCodeExtended;
        this.created = created;
        this.modified = modified;
        this.cities = cities;
        this.userDetails = userDetails;
    }

   
    // Property accessors

    public Integer getZipCodeId() {
        return this.zipCodeId;
    }
    
    public void setZipCodeId(Integer zipCodeId) {
        this.zipCodeId = zipCodeId;
    }

    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    public Geocode getGeocode() {
        return this.geocode;
    }
    
    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

    public Integer getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getZipCodeExtended() {
        return this.zipCodeExtended;
    }
    
    public void setZipCodeExtended(Integer zipCodeExtended) {
        this.zipCodeExtended = zipCodeExtended;
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

    public Set getCities() {
        return this.cities;
    }
    
    public void setCities(Set cities) {
        this.cities = cities;
    }

    public Set getUserDetails() {
        return this.userDetails;
    }
    
    public void setUserDetails(Set userDetails) {
        this.userDetails = userDetails;
    }
   








}