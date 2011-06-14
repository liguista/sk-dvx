package hibernate_dvx;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractCity entity provides the base persistence definition of the City entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCity extends HibernateBaseClass implements java.io.Serializable {


    // Fields    

     private Integer cityId;
     private Country country;
     private ZipCode zipCode;
     private State state;
     private String cityName;
     private Integer cityGeoCodeFk;
     private Integer cityPopulation;
     private Timestamp modified;
     private Timestamp created;
     private Set zipCodes = new HashSet(0);
     private Set userDetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractCity() {
    }

    
    /** full constructor */
    public AbstractCity(Country country, ZipCode zipCode, State state, String cityName, Integer cityGeoCodeFk, Integer cityPopulation, Timestamp modified, Timestamp created, Set zipCodes, Set userDetails) {
        this.country = country;
        this.zipCode = zipCode;
        this.state = state;
        this.cityName = cityName;
        this.cityGeoCodeFk = cityGeoCodeFk;
        this.cityPopulation = cityPopulation;
        this.modified = modified;
        this.created = created;
        this.zipCodes = zipCodes;
        this.userDetails = userDetails;
    }

   
    // Property accessors

    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    public ZipCode getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityGeoCodeFk() {
        return this.cityGeoCodeFk;
    }
    
    public void setCityGeoCodeFk(Integer cityGeoCodeFk) {
        this.cityGeoCodeFk = cityGeoCodeFk;
    }

    public Integer getCityPopulation() {
        return this.cityPopulation;
    }
    
    public void setCityPopulation(Integer cityPopulation) {
        this.cityPopulation = cityPopulation;
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

    public Set getZipCodes() {
        return this.zipCodes;
    }
    
    public void setZipCodes(Set zipCodes) {
        this.zipCodes = zipCodes;
    }

    public Set getUserDetails() {
        return this.userDetails;
    }
    
    public void setUserDetails(Set userDetails) {
        this.userDetails = userDetails;
    }
   








}