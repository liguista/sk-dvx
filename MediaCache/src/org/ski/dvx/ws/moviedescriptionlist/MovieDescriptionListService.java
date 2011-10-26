package org.ski.dvx.ws.moviedescriptionlist;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * MovieDescriptionListService service = new MovieDescriptionListService();
 * MovieDescriptionListDelegate portType = service.getMovieDescriptionListPort();
 * portType.getSbnNumber(...);
 * </pre>
 * 
 * </p>
 * 
 */


@WebServiceClient(name = "MovieDescriptionListService", targetNamespace = "http://ws.dvx.ski.org/", wsdlLocation = "http://jeff-pc:8080/dvx1/MovieDescriptionListPort?wsdl")
public class MovieDescriptionListService extends Service {

	private final static String SERVER_BASE = "http://dvx.ski.org:8080/";
//	private final static String SERVER_BASE = "http://jeff-pc:8080/";

	private final static URL MOVIEDESCRIPTIONLISTSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListService.class
					.getResource(".");
			url = new URL(baseUrl,
					SERVER_BASE + "dvx1/MovieDescriptionListPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: '"+ SERVER_BASE + "dvx1/MovieDescriptionListPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		MOVIEDESCRIPTIONLISTSERVICE_WSDL_LOCATION = url;
	}

	public MovieDescriptionListService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public MovieDescriptionListService() {
		super(MOVIEDESCRIPTIONLISTSERVICE_WSDL_LOCATION, new QName(
				"http://ws.dvx.ski.org/", "MovieDescriptionListService"));
	}

	/**
	 * 
	 * @return returns MovieDescriptionListDelegate
	 */
	@WebEndpoint(name = "MovieDescriptionListPort")
	public MovieDescriptionListDelegate getMovieDescriptionListPort() {
		return super
				.getPort(new QName("http://ws.dvx.ski.org/",
						"MovieDescriptionListPort"),
						MovieDescriptionListDelegate.class);
	}

}
