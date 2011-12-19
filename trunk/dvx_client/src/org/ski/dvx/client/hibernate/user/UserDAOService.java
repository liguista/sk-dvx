package org.ski.dvx.client.hibernate.user;

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
 * UserDAOService service = new UserDAOService();
 * UserDAODelegate portType = service.getUserDAOPort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "UserDAOService", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/UserDAOPort?wsdl")
public class UserDAOService extends Service {

	private final static URL USERDAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.user.UserDAOService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.user.UserDAOService.class
					.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/dvx/UserDAOPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/UserDAOPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		USERDAOSERVICE_WSDL_LOCATION = url;
	}

	public UserDAOService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public UserDAOService() {
		super(USERDAOSERVICE_WSDL_LOCATION, new QName(
				"http://user.hibernate.server.dvx.ski.org/", "UserDAOService"));
	}

	/**
	 * 
	 * @return returns UserDAODelegate
	 */
	@WebEndpoint(name = "UserDAOPort")
	public UserDAODelegate getUserDAOPort() {
		return super.getPort(new QName(
				"http://user.hibernate.server.dvx.ski.org/", "UserDAOPort"),
				UserDAODelegate.class);
	}

}
