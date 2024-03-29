package org.ski.dvx.client.hibernate.movie_cast;

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
 * MovieCastDAOService service = new MovieCastDAOService();
 * MovieCastDAODelegate portType = service.getMovieCastDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "MovieCastDAOService", targetNamespace = "http://movie_cast.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/MovieCastDAOPort?wsdl")
public class MovieCastDAOService extends Service {

	private final static URL MOVIECASTDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.movie_cast.MovieCastDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.movie_cast.MovieCastDAOService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/MovieCastDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/MovieCastDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		MOVIECASTDAOSERVICE_WSDL_LOCATION = url;
	}

	public MovieCastDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public MovieCastDAOService() {
		super(MOVIECASTDAOSERVICE_WSDL_LOCATION, new QName(
				"http://movie_cast.hibernate.server.dvx.ski.org/",
				"MovieCastDAOService"));
	}

	/**
	 * 
	 * @return returns MovieCastDAODelegate
	 */
	@WebEndpoint(name = "MovieCastDAOPort")
	public MovieCastDAODelegate getMovieCastDAOPort() {
		return super.getPort(new QName(
				"http://movie_cast.hibernate.server.dvx.ski.org/",
				"MovieCastDAOPort"), MovieCastDAODelegate.class);
	}

}
