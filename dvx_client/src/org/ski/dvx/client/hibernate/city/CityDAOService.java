package org.ski.dvx.client.hibernate.city;

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
 * CityDAOService service = new CityDAOService();
 * CityDAODelegate portType = service.getCityDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "CityDAOService", targetNamespace = "http://city.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/CityDAOPort?wsdl")
public class CityDAOService extends Service {

	private final static URL CITYDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.city.CityDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.city.CityDAOService.class
					.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/dvx/CityDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/CityDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		CITYDAOSERVICE_WSDL_LOCATION = url;
	}

	public CityDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public CityDAOService() {
		super(CITYDAOSERVICE_WSDL_LOCATION, new QName(
				"http://city.hibernate.server.dvx.ski.org/", "CityDAOService"));
	}

	/**
	 * 
	 * @return returns CityDAODelegate
	 */
	@WebEndpoint(name = "CityDAOPort")
	public CityDAODelegate getCityDAOPort() {
		return super.getPort(new QName(
				"http://city.hibernate.server.dvx.ski.org/", "CityDAOPort"),
				CityDAODelegate.class);
	}

}
