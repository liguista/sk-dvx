package org.ski.dvx.client.hibernate.geocode;

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
 * GeocodeDAOService service = new GeocodeDAOService();
 * GeocodeDAODelegate portType = service.getGeocodeDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "GeocodeDAOService", targetNamespace = "http://geocode.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/GeocodeDAOPort?wsdl")
public class GeocodeDAOService extends Service {

	private final static URL GEOCODEDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.geocode.GeocodeDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.geocode.GeocodeDAOService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/GeocodeDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/GeocodeDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		GEOCODEDAOSERVICE_WSDL_LOCATION = url;
	}

	public GeocodeDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public GeocodeDAOService() {
		super(GEOCODEDAOSERVICE_WSDL_LOCATION, new QName(
				"http://geocode.hibernate.server.dvx.ski.org/",
				"GeocodeDAOService"));
	}

	/**
	 * 
	 * @return returns GeocodeDAODelegate
	 */
	@WebEndpoint(name = "GeocodeDAOPort")
	public GeocodeDAODelegate getGeocodeDAOPort() {
		return super.getPort(new QName(
				"http://geocode.hibernate.server.dvx.ski.org/",
				"GeocodeDAOPort"), GeocodeDAODelegate.class);
	}

}
