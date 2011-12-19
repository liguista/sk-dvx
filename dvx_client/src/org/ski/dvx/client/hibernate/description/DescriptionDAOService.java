package org.ski.dvx.client.hibernate.description;

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
 * DescriptionDAOService service = new DescriptionDAOService();
 * DescriptionDAODelegate portType = service.getDescriptionDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "DescriptionDAOService", targetNamespace = "http://description.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/DescriptionDAOPort?wsdl")
public class DescriptionDAOService extends Service {

	private final static URL DESCRIPTIONDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.description.DescriptionDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.description.DescriptionDAOService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/DescriptionDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/DescriptionDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		DESCRIPTIONDAOSERVICE_WSDL_LOCATION = url;
	}

	public DescriptionDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public DescriptionDAOService() {
		super(DESCRIPTIONDAOSERVICE_WSDL_LOCATION, new QName(
				"http://description.hibernate.server.dvx.ski.org/",
				"DescriptionDAOService"));
	}

	/**
	 * 
	 * @return returns DescriptionDAODelegate
	 */
	@WebEndpoint(name = "DescriptionDAOPort")
	public DescriptionDAODelegate getDescriptionDAOPort() {
		return super.getPort(new QName(
				"http://description.hibernate.server.dvx.ski.org/",
				"DescriptionDAOPort"), DescriptionDAODelegate.class);
	}

}
