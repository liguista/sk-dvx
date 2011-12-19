package org.ski.dvx.server.hibernate.movie_menu;



/**
 * AbstractMovieMenu entity provides the base persistence definition of the MovieMenu entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieMenu  implements java.io.Serializable {


    // Fields    

     private Integer idKey;
     private Integer authorFk;
     private Integer languageFk;
     private Integer movieIdFk;
     private Integer menuActive;
     private Integer menuNumber;
     private Integer menuItem;
     private String description;
     private Integer menuPathFk;
     private Integer menuVersion;
     private String menuUri;
     private Long modified;
     private Long created;


    // Constructors

    /** default constructor */
    public AbstractMovieMenu() {
    }

    
    /** full constructor */
    public AbstractMovieMenu(Integer authorFk, Integer languageFk, Integer movieIdFk, Integer menuActive, Integer menuNumber, Integer menuItem, String description, Integer menuPathFk, Integer menuVersion, String menuUri, Long modified, Long created) {
        this.authorFk = authorFk;
        this.languageFk = languageFk;
        this.movieIdFk = movieIdFk;
        this.menuActive = menuActive;
        this.menuNumber = menuNumber;
        this.menuItem = menuItem;
        this.description = description;
        this.menuPathFk = menuPathFk;
        this.menuVersion = menuVersion;
        this.menuUri = menuUri;
        this.modified = modified;
        this.created = created;
    }

   
    // Property accessors

    public Integer getIdKey() {
        return this.idKey;
    }
    
    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    public Integer getAuthorFk() {
        return this.authorFk;
    }
    
    public void setAuthorFk(Integer authorFk) {
        this.authorFk = authorFk;
    }

    public Integer getLanguageFk() {
        return this.languageFk;
    }
    
    public void setLanguageFk(Integer languageFk) {
        this.languageFk = languageFk;
    }

    public Integer getMovieIdFk() {
        return this.movieIdFk;
    }
    
    public void setMovieIdFk(Integer movieIdFk) {
        this.movieIdFk = movieIdFk;
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

    public Integer getMenuPathFk() {
        return this.menuPathFk;
    }
    
    public void setMenuPathFk(Integer menuPathFk) {
        this.menuPathFk = menuPathFk;
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

    public Long getModified() {
        return this.modified;
    }
    
    public void setModified(Long modified) {
        this.modified = modified;
    }

    public Long getCreated() {
        return this.created;
    }
    
    public void setCreated(Long created) {
        this.created = created;
    }
   








}