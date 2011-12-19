package org.ski.dvx.client.hibernate.DVXTransaction;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "DVXTransactionDelegate", targetNamespace = "http://hibernate.server.dvx.ski.org/")
public interface DVXTransactionDelegate {

	/**
     * 
     */
	@WebMethod(operationName = "BeginTransaction")
	@RequestWrapper(localName = "BeginTransaction", targetNamespace = "http://hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.DVXTransaction.BeginTransaction")
	@ResponseWrapper(localName = "BeginTransactionResponse", targetNamespace = "http://hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.DVXTransaction.BeginTransactionResponse")
	public void beginTransaction();

	/**
     * 
     */
	@WebMethod(operationName = "EndTransaction")
	@RequestWrapper(localName = "EndTransaction", targetNamespace = "http://hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.DVXTransaction.EndTransaction")
	@ResponseWrapper(localName = "EndTransactionResponse", targetNamespace = "http://hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.DVXTransaction.EndTransactionResponse")
	public void endTransaction();

}
