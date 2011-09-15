package org.ski.dvx.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractRating entity provides the base persistence definition of the Rating entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRating  implements java.io.Serializable {


    // Fields    

     private Integer ratingId;
     private User user;
     private Movie movie;
     private Description description;
     private Language language;
     private Version version;
     private String ratingNameShort;
     private Integer rating;
     private Timestamp created;
     private Timestamp modified;
     private Set movies = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractRating() {
    }

	/** minimal constructor */
    public AbstractRating(Integer rating) {
        this.rating = rating;
    }
    
    /** full constructor */
    public AbstractRating(User user, Movie movie, Description description, Language language, Version version, String ratingNameShort, Integer rating, Timestamp created, Timestamp modified, Set movies) {
        this.user = user;
        this.movie = movie;
        this.description = description;
        this.language = language;
        this.version = version;
        this.ratingNameShort = ratingNameShort;
        this.rating = rating;
        this.created = created;
        this.modified = modified;
        this.movies = movies;
    }

   
    // Property accessors

    public Integer getRatingId() {
        return this.ratingId;
    }
    
    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Description getDescription() {
        return this.description;
    }
    
    public void setDescription(Description description) {
        this.description = description;
    }

    public Language getLanguage() {
        return this.language;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }

    public Version getVersion() {
        return this.version;
    }
    
    public void setVersion(Version version) {
        this.version = version;
    }

    public String getRatingNameShort() {
        return this.ratingNameShort;
    }
    
    public void setRatingNameShort(String ratingNameShort) {
        this.ratingNameShort = ratingNameShort;
    }

    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
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

    public Set getMovies() {
        return this.movies;
    }
    
    public void setMovies(Set movies) {
        this.movies = movies;
    }
   








}