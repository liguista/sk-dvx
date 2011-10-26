import java.util.Iterator;
import java.util.List;

import org.ski.dvx.ws.listuser.SimpleUser;
import org.ski.dvx.ws.listuser.UserListDelegate;
import org.ski.dvx.ws.listuser.UserListService;
import org.ski.dvx.ws.moviePort.MovieListDelegate;
import org.ski.dvx.ws.moviePort.MovieListService;
import org.ski.dvx.ws.moviePort.SimpleMovie;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescription;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListDelegate;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListService;

public class Client {

	/**
	 * @param args
	 */
	void doIt()
	{
		UserListService hs = new UserListService();
		
		UserListDelegate hd = hs.getUserListPort();
		
		List<SimpleUser> userList = hd.getUserList();
//		System.out.println(userList.size());
		
		Iterator itr = userList.iterator();
		
		SimpleUser simpleUser;
		while (itr.hasNext())
		{
			simpleUser = (SimpleUser)itr.next();
			System.out.println(simpleUser.getUserEmail() + " - " + simpleUser.getUserHandle());
		}
		System.out.println();
		simpleUser = hd.getSimpleUser("greg@ac44.com", "abc");
		System.out.println(simpleUser.getUserEmail() + " - " + simpleUser.getUserHandle());
		
// end user list test
		
		MovieDescriptionListService mdls = new MovieDescriptionListService();
		
		MovieDescriptionListDelegate mdld = mdls.getMovieDescriptionListPort();
		
		mdld.setSbnNumber("e7cf6917");
		
		List<MovieDescription> movieDescriptionList = mdld.getDescriptionList();
		
		itr = movieDescriptionList.iterator();
		MovieDescription movieDescription;
		while (itr.hasNext())
		{
			movieDescription = (MovieDescription)itr.next();
			System.out.println( movieDescription.getSbn() 	+  ", " +
					movieDescription.getMovieName() 		+  ", " +
					movieDescription.getAuthor() 		+  ", " +
					movieDescription.getLanguage() +  ", " +
					movieDescription.getStartTime() +  ", " + 
					movieDescription.getStartFrame() +  ", " +
					movieDescription.getUri()
			
			);
		}	
		System.out.println();
		
		// end descriptionlist
		
		MovieListService mls = new MovieListService();
		
		MovieListDelegate mld = mls.getMovieListPort();
		
		List<SimpleMovie> movieList = mld.getMovieList();
		itr = movieList.iterator();
		SimpleMovie movie;
		while (itr.hasNext())
		{
			movie = (SimpleMovie)itr.next();
			System.out.println(movie.getSbnNumber() + " - " + movie.getMovieName());
		}
		
		System.out.println();
		
		movie = mld.getMovie("e7cf6917");
		System.out.println(movie.getSbnNumber() + " - " + movie.getMovieName());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client();
		
		client.doIt();
		
	}
}
