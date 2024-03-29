package org.ski.dvx.client.hibernate.DVXTransaction;

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
 * DVXTransactionService service = new DVXTransactionService();
 * DVXTransactionDelegate portType = service.getDVXTransactionPort();
 * portType.beginTransaction(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "DVXTransactionService", targetNamespace = "http://hibernate.server.dvx.ski.org/", wsdlLocation = "http://localhost:8080/dvx/DVXTransactionPort?wsdl")
public class DVXTransactionService extends Service {

	private final static URL DVXTRANSACTIONSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(org.ski.dvx.client.hibernate.DVXTransaction.DVXTransactionService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = org.ski.dvx.client.hibernate.DVXTransaction.DVXTransactionService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/dvx/DVXTransactionPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/dvx/DVXTransactionPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		DVXTRANSACTIONSERVICE_WSDL_LOCATION = url;
	}

	public DVXTransactionService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public DVXTransactionService() {
		super(DVXTRANSACTIONSERVICE_WSDL_LOCATION,
				new QName("http://hibernate.server.dvx.ski.org/",
						"DVXTransactionService"));
	}

	/**
	 * 
	 * @return returns DVXTransactionDelegate
	 */
	@WebEndpoint(name = "DVXTransactionPort")
	public DVXTransactionDelegate getDVXTransactionPort() {
		return super.getPort(new QName("http://hibernate.server.dvx.ski.org/",
				"DVXTransactionPort"), DVXTransactionDelegate.class);
	}

}
