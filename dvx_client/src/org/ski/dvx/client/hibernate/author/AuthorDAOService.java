package org.ski.dvx.client.hibernate.author;

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
 * AuthorDAOService service = new AuthorDAOService();
 * AuthorDAODelegate portType = service.getAuthorDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "AuthorDAOService", targetNamespace = "http://author.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/AuthorDAOPort?wsdl")
public class AuthorDAOService extends Service {

	private final static URL AUTHORDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.author.AuthorDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.author.AuthorDAOService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/AuthorDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/AuthorDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		AUTHORDAOSERVICE_WSDL_LOCATION = url;
	}

	public AuthorDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public AuthorDAOService() {
		super(AUTHORDAOSERVICE_WSDL_LOCATION, new QName(
				"http://author.hibernate.server.dvx.ski.org/",
				"AuthorDAOService"));
	}

	/**
	 * 
	 * @return returns AuthorDAODelegate
	 */
	@WebEndpoint(name = "AuthorDAOPort")
	public AuthorDAODelegate getAuthorDAOPort() {
		return super.getPort(
				new QName("http://author.hibernate.server.dvx.ski.org/",
						"AuthorDAOPort"), AuthorDAODelegate.class);
	}

}
