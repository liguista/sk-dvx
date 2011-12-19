package org.ski.dvx.client.hibernate.poster;

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
 * PosterDAOService service = new PosterDAOService();
 * PosterDAODelegate portType = service.getPosterDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "PosterDAOService", targetNamespace = "http://poster.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/PosterDAOPort?wsdl")
public class PosterDAOService extends Service {

	private final static URL POSTERDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.poster.PosterDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.poster.PosterDAOService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/PosterDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/PosterDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		POSTERDAOSERVICE_WSDL_LOCATION = url;
	}

	public PosterDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public PosterDAOService() {
		super(POSTERDAOSERVICE_WSDL_LOCATION, new QName(
				"http://poster.hibernate.server.dvx.ski.org/",
				"PosterDAOService"));
	}

	/**
	 * 
	 * @return returns PosterDAODelegate
	 */
	@WebEndpoint(name = "PosterDAOPort")
	public PosterDAODelegate getPosterDAOPort() {
		return super.getPort(
				new QName("http://poster.hibernate.server.dvx.ski.org/",
						"PosterDAOPort"), PosterDAODelegate.class);
	}

}
