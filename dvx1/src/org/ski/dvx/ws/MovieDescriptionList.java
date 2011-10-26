/**
 * 
 */
package org.ski.dvx.ws;

import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Description;
import org.ski.dvx.hibernate.DescriptionDAO;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.Path;
import org.ski.dvx.hibernate.User;

import java.util.*;

/**
 * @author Greg
 *
 */


public class MovieDescriptionList  implements java.io.Serializable{
	
	public String getSbnNumber() {
		return sbnNumber;
	}

	public void setSbnNumber(String sbnNumber) {
		this.sbnNumber = sbnNumber;
	}

	String sbnNumber = "";
	String serverPrefix = "http://dvx.ski.org:8080/WEB_DAV/";

	final Comparator<Description> COMPARE_START_TIME =
        new Comparator<Description>() {
			public int compare(Description e1, Description e2) {
				return e1.getDescriptionStartTimeInt().compareTo(e2.getDescriptionStartTimeInt());
			}
		};
		
	public MovieDescriptionList() {
	  }
		
	public MovieDescriptionList(String sbnNumber)
	{
		this.sbnNumber = sbnNumber;
	}
	
	public List<MovieDescription> getDescriptionList()
	{
		
		 List<MovieDescription> theList = new ArrayList<MovieDescription>();
		 DescriptionDAO descriptionDao = new DescriptionDAO();
    	
    	List <Description> descriptionList = descriptionDao.findAll();
    	
    	Collections.sort(descriptionList, COMPARE_START_TIME);
    	
    	for (int i = 0 ;i<descriptionList.size();i++)
    	{
    		Description description = descriptionList.get(i);
    		String sbn = "";
    		String movieName = "";
    		Movie movie = description.getMovie();
    		if (movie!=null)
    		{
    			sbn = movie.getMovieSbnNumber();
    			movieName = movie.getMovieName();
    		}
    		String languageName = "";
    		Language language = description.getLanguage();
    		if (language != null)
    		{
    			languageName = language.getLanguageName();
    		}
    		
    		String authorName = "";
    		
    		Author author = description.getAuthor();
    		
    		if (author!=null)
    		{
    			User user = author.getUser();
    			
    			if (user!=null)
    			{
    				authorName = user.getUserHandle();
    			}
    		}
    		String filePath = "";
    		Path path1 = description.getPath();
    		if (path1!=null)
    		{
    			filePath = path1.getPathPrefix();
    		}
    		
    		
    		if (sbn.equals(sbnNumber)||sbnNumber.equals(""))
    		{
    			
    			MovieDescription md = new MovieDescription(	i, 
									    					sbn, 
									    					movieName, 
									    					languageName, 
									    					authorName, 
									    					description.getDescriptionVersion(),
									    					description.getDescriptionStartTimeInt(),
									    					description.getDescriptionStartFrame(),
									    					serverPrefix + filePath + description.getDescriptionUri()
									    					);
    			theList.add(md);
									    		
    		}
    	}
    	
    	return theList;
		
	}

}
