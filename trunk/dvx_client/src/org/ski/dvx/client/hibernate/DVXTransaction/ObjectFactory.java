package org.ski.dvx.client.hibernate.DVXTransaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * org.ski.dvx.client.hibernate.DVXTransaction package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _EndTransaction_QNAME = new QName(
			"http://hibernate.server.dvx.ski.org/", "EndTransaction");
	private final static QName _BeginTransaction_QNAME = new QName(
			"http://hibernate.server.dvx.ski.org/", "BeginTransaction");
	private final static QName _BeginTransactionResponse_QNAME = new QName(
			"http://hibernate.server.dvx.ski.org/", "BeginTransactionResponse");
	private final static QName _EndTransactionResponse_QNAME = new QName(
			"http://hibernate.server.dvx.ski.org/", "EndTransactionResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * org.ski.dvx.client.hibernate.DVXTransaction
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link BeginTransactionResponse }
	 * 
	 */
	public BeginTransactionResponse createBeginTransactionResponse() {
		return new BeginTransactionResponse();
	}

	/**
	 * Create an instance of {@link EndTransactionResponse }
	 * 
	 */
	public EndTransactionResponse createEndTransactionResponse() {
		return new EndTransactionResponse();
	}

	/**
	 * Create an instance of {@link EndTransaction }
	 * 
	 */
	public EndTransaction createEndTransaction() {
		return new EndTransaction();
	}

	/**
	 * Create an instance of {@link BeginTransaction }
	 * 
	 */
	public BeginTransaction createBeginTransaction() {
		return new BeginTransaction();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndTransaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://hibernate.server.dvx.ski.org/", name = "EndTransaction")
	public JAXBElement<EndTransaction> createEndTransaction(EndTransaction value) {
		return new JAXBElement<EndTransaction>(_EndTransaction_QNAME,
				EndTransaction.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BeginTransaction }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://hibernate.server.dvx.ski.org/", name = "BeginTransaction")
	public JAXBElement<BeginTransaction> createBeginTransaction(
			BeginTransaction value) {
		return new JAXBElement<BeginTransaction>(_BeginTransaction_QNAME,
				BeginTransaction.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BeginTransactionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://hibernate.server.dvx.ski.org/", name = "BeginTransactionResponse")
	public JAXBElement<BeginTransactionResponse> createBeginTransactionResponse(
			BeginTransactionResponse value) {
		return new JAXBElement<BeginTransactionResponse>(
				_BeginTransactionResponse_QNAME,
				BeginTransactionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link EndTransactionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://hibernate.server.dvx.ski.org/", name = "EndTransactionResponse")
	public JAXBElement<EndTransactionResponse> createEndTransactionResponse(
			EndTransactionResponse value) {
		return new JAXBElement<EndTransactionResponse>(
				_EndTransactionResponse_QNAME, EndTransactionResponse.class,
				null, value);
	}

}
