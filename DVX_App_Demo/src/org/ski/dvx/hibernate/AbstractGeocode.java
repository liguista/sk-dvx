package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractGeocode entity provides the base persistence definition of the Geocode entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGeocode  implements java.io.Serializable {


    // Fields    

     private Integer geocodeId;
     private Float geocodeLatitude;
     private Float geocodeLongitude;
     private Float geocodeRadius;
     private Timestamp created;
     private Timestamp modified;
     private Set zipCodes = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractGeocode() {
    }

    
    /** full constructor */
    public AbstractGeocode(Float geocodeLatitude, Float geocodeLongitude, Float geocodeRadius, Timestamp created, Timestamp modified, Set zipCodes) {
        this.geocodeLatitude = geocodeLatitude;
        this.geocodeLongitude = geocodeLongitude;
        this.geocodeRadius = geocodeRadius;
        this.created = created;
        this.modified = modified;
        this.zipCodes = zipCodes;
    }

   
    // Property accessors

    public Integer getGeocodeId() {
        return this.geocodeId;
    }
    
    public void setGeocodeId(Integer geocodeId) {
        this.geocodeId = geocodeId;
    }

    public Float getGeocodeLatitude() {
        return this.geocodeLatitude;
    }
    
    public void setGeocodeLatitude(Float geocodeLatitude) {
        this.geocodeLatitude = geocodeLatitude;
    }

    public Float getGeocodeLongitude() {
        return this.geocodeLongitude;
    }
    
    public void setGeocodeLongitude(Float geocodeLongitude) {
        this.geocodeLongitude = geocodeLongitude;
    }

    public Float getGeocodeRadius() {
        return this.geocodeRadius;
    }
    
    public void setGeocodeRadius(Float geocodeRadius) {
        this.geocodeRadius = geocodeRadius;
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

    public Set getZipCodes() {
        return this.zipCodes;
    }
    
    public void setZipCodes(Set zipCodes) {
        this.zipCodes = zipCodes;
    }
   








}