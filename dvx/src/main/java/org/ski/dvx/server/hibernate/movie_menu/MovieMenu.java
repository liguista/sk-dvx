package org.ski.dvx.server.hibernate.movie_menu;



/**
 * MovieMenu entity. @author MyEclipse Persistence Tools
 */
public class MovieMenu extends AbstractMovieMenu implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public MovieMenu() {
    }

    
    /** full constructor */
    public MovieMenu(Integer authorFk, Integer languageFk, Integer movieIdFk, Integer menuActive, Integer menuNumber, Integer menuItem, String description, Integer menuPathFk, Integer menuVersion, String menuUri, Long modified, Long created) {
        super(authorFk, languageFk, movieIdFk, menuActive, menuNumber, menuItem, description, menuPathFk, menuVersion, menuUri, modified, created);        
    }
   
}
