package org.ski.dvx.ws.moviedescriptionlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.ws.moviedescriptionlist
 * package.
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

	private final static QName _GetSbnNumber_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getSbnNumber");
	private final static QName _GetSbnNumberResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getSbnNumberResponse");
	private final static QName _SetSbnNumberResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "setSbnNumberResponse");
	private final static QName _GetDescriptionList_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getDescriptionList");
	private final static QName _GetDescriptionListResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getDescriptionListResponse");
	private final static QName _SetSbnNumber_QNAME = new QName(
			"http://ws.dvx.ski.org/", "setSbnNumber");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.ski.dvx.ws.moviedescriptionlist
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SetSbnNumber }
	 * 
	 */
	public SetSbnNumber createSetSbnNumber() {
		return new SetSbnNumber();
	}

	/**
	 * Create an instance of {@link GetSbnNumber }
	 * 
	 */
	public GetSbnNumber createGetSbnNumber() {
		return new GetSbnNumber();
	}

	/**
	 * Create an instance of {@link SetSbnNumberResponse }
	 * 
	 */
	public SetSbnNumberResponse createSetSbnNumberResponse() {
		return new SetSbnNumberResponse();
	}

	/**
	 * Create an instance of {@link GetSbnNumberResponse }
	 * 
	 */
	public GetSbnNumberResponse createGetSbnNumberResponse() {
		return new GetSbnNumberResponse();
	}

	/**
	 * Create an instance of {@link GetDescriptionList }
	 * 
	 */
	public GetDescriptionList createGetDescriptionList() {
		return new GetDescriptionList();
	}

	/**
	 * Create an instance of {@link MovieDescription }
	 * 
	 */
	public MovieDescription createMovieDescription() {
		return new MovieDescription();
	}

	/**
	 * Create an instance of {@link GetDescriptionListResponse }
	 * 
	 */
	public GetDescriptionListResponse createGetDescriptionListResponse() {
		return new GetDescriptionListResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetSbnNumber }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getSbnNumber")
	public JAXBElement<GetSbnNumber> createGetSbnNumber(GetSbnNumber value) {
		return new JAXBElement<GetSbnNumber>(_GetSbnNumber_QNAME,
				GetSbnNumber.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSbnNumberResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getSbnNumberResponse")
	public JAXBElement<GetSbnNumberResponse> createGetSbnNumberResponse(
			GetSbnNumberResponse value) {
		return new JAXBElement<GetSbnNumberResponse>(
				_GetSbnNumberResponse_QNAME, GetSbnNumberResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SetSbnNumberResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "setSbnNumberResponse")
	public JAXBElement<SetSbnNumberResponse> createSetSbnNumberResponse(
			SetSbnNumberResponse value) {
		return new JAXBElement<SetSbnNumberResponse>(
				_SetSbnNumberResponse_QNAME, SetSbnNumberResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDescriptionList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getDescriptionList")
	public JAXBElement<GetDescriptionList> createGetDescriptionList(
			GetDescriptionList value) {
		return new JAXBElement<GetDescriptionList>(_GetDescriptionList_QNAME,
				GetDescriptionList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDescriptionListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getDescriptionListResponse")
	public JAXBElement<GetDescriptionListResponse> createGetDescriptionListResponse(
			GetDescriptionListResponse value) {
		return new JAXBElement<GetDescriptionListResponse>(
				_GetDescriptionListResponse_QNAME,
				GetDescriptionListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SetSbnNumber }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "setSbnNumber")
	public JAXBElement<SetSbnNumber> createSetSbnNumber(SetSbnNumber value) {
		return new JAXBElement<SetSbnNumber>(_SetSbnNumber_QNAME,
				SetSbnNumber.class, null, value);
	}

}
