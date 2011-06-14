import com.netflix.api.client.*;
import com.netflix.api.*;

public class NetFlix_Test {

	/**
	 * @param args
	 */
		
	void Doit()
	{
		
		String myConsumerKey = "gq3uydv2qc6qea2r7b3fjxj8";
		String myConsumerSecret = "3hFWTu26Sj";
		  try
		  {
		  NetflixAPIClient apiClient = new NetflixAPIClient(myConsumerKey, myConsumerSecret);
		  String uri = APIEndpoints.MOVIE_URI + "/512381";
		  String details = null;
		    details = apiClient.makeConsumerSignedApiCall(uri, null, NetflixAPIClient.GET_METHOD_TYPE).getResponseBody();
		    details = details.replace(">",">\r\n");
		    details = details.replace("<","\r\n<");
		    System.out.println("Details = " + details);
		    
		    uri =  "http://api.netflix.com/categories/mpaa_ratings/";
		    details = apiClient.makeConsumerSignedApiCall(uri, null, NetflixAPIClient.GET_METHOD_TYPE).getResponseBody();
		    System.out.println("mpaa_ratings = " + details);
		    
		  }
		  catch (NetflixAPIException nae)
		  {
		    // handle the error...
			  System.out.println("NetflixAPIException : " + nae);
		  }
		  catch (Exception ex)
		  {
			  System.out.println("NetflixAPIException : " + ex);		  
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NetFlix_Test().Doit();
	}

}
