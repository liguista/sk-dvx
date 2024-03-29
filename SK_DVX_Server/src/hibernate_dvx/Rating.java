package hibernate_dvx;

import java.sql.Timestamp;
import java.util.Set;


/**
 * Rating entity. @author MyEclipse Persistence Tools
 */
public class Rating extends AbstractRating implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Rating() {
    }

	/** minimal constructor */
    public Rating(Integer ratingId, Integer rating) {
        super(ratingId, rating);        
    }
    
    /** full constructor */
    public Rating(Integer ratingId, String ratingName, String ratingNameShort, Integer rating, Integer descriptionFk, Integer userFk, Timestamp created, Timestamp modified, Set movies) {
        super(ratingId, ratingName, ratingNameShort, rating, descriptionFk, userFk, created, modified, movies);        
    }
   
}
