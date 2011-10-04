package org.ski.dvx.hibernate;

import java.sql.Timestamp;


/**
 * AbstractMovieMenu entity provides the base persistence definition of the MovieMenu entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieMenu  implements java.io.Serializable {


    // Fields    

     private Integer idKey;
     private Movie movie;
     private Author author;
     private Path path;
     private Language language;
     private Integer menuActive;
     private Integer menuNumber;
     private Integer menuItem;
     private String description;
     private Integer menuVersion;
     private String menuUri;
     private Timestamp created;
     private Timestamp modified;


    // Constructors

    /** default constructor */
    public AbstractMovieMenu() {
    }

    
    /** full constructor */
    public AbstractMovieMenu(Movie movie, Author author, Path path, Language language, Integer menuActive, Integer menuNumber, Integer menuItem, String description, Integer menuVersion, String menuUri, Timestamp created, Timestamp modified) {
        this.movie = movie;
        this.author = author;
        this.path = path;
        this.language = language;
        this.menuActive = menuActive;
        this.menuNumber = menuNumber;
        this.menuItem = menuItem;
        this.description = description;
        this.menuVersion = menuVersion;
        this.menuUri = menuUri;
        this.created = created;
        this.modified = modified;
    }

   
    // Property accessors

    public Integer getIdKey() {
        return this.idKey;
    }
    
    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
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

    public Path getPath() {
        return this.path;
    }
    
    public void setPath(Path path) {
        this.path = path;
    }

    public Language getLanguage() {
        return this.language;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getMenuActive() {
        return this.menuActive;
    }
    
    public void setMenuActive(Integer menuActive) {
        this.menuActive = menuActive;
    }

    public Integer getMenuNumber() {
        return this.menuNumber;
    }
    
    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }

    public Integer getMenuItem() {
        return this.menuItem;
    }
    
    public void setMenuItem(Integer menuItem) {
        this.menuItem = menuItem;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMenuVersion() {
        return this.menuVersion;
    }
    
    public void setMenuVersion(Integer menuVersion) {
        this.menuVersion = menuVersion;
    }

    public String getMenuUri() {
        return this.menuUri;
    }
    
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
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
   








}