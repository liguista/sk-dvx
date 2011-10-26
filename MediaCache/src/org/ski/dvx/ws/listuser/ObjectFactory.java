package org.ski.dvx.ws.listuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.ws.listuser package.
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

	private final static QName _GetSimpleUserResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getSimpleUserResponse");
	private final static QName _GetUserListResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getUserListResponse");
	private final static QName _MainResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "mainResponse");
	private final static QName _GetSimpleUser_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getSimpleUser");
	private final static QName _GetUserList_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getUserList");
	private final static QName _Main_QNAME = new QName(
			"http://ws.dvx.ski.org/", "main");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.ski.dvx.ws.listuser
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SimpleUser }
	 * 
	 */
	public SimpleUser createSimpleUser() {
		return new SimpleUser();
	}

	/**
	 * Create an instance of {@link Main }
	 * 
	 */
	public Main createMain() {
		return new Main();
	}

	/**
	 * Create an instance of {@link MainResponse }
	 * 
	 */
	public MainResponse createMainResponse() {
		return new MainResponse();
	}

	/**
	 * Create an instance of {@link GetSimpleUser }
	 * 
	 */
	public GetSimpleUser createGetSimpleUser() {
		return new GetSimpleUser();
	}

	/**
	 * Create an instance of {@link GetUserList }
	 * 
	 */
	public GetUserList createGetUserList() {
		return new GetUserList();
	}

	/**
	 * Create an instance of {@link GetUserListResponse }
	 * 
	 */
	public GetUserListResponse createGetUserListResponse() {
		return new GetUserListResponse();
	}

	/**
	 * Create an instance of {@link GetSimpleUserResponse }
	 * 
	 */
	public GetSimpleUserResponse createGetSimpleUserResponse() {
		return new GetSimpleUserResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSimpleUserResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getSimpleUserResponse")
	public JAXBElement<GetSimpleUserResponse> createGetSimpleUserResponse(
			GetSimpleUserResponse value) {
		return new JAXBElement<GetSimpleUserResponse>(
				_GetSimpleUserResponse_QNAME, GetSimpleUserResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetUserListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getUserListResponse")
	public JAXBElement<GetUserListResponse> createGetUserListResponse(
			GetUserListResponse value) {
		return new JAXBElement<GetUserListResponse>(_GetUserListResponse_QNAME,
				GetUserListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MainResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "mainResponse")
	public JAXBElement<MainResponse> createMainResponse(MainResponse value) {
		return new JAXBElement<MainResponse>(_MainResponse_QNAME,
				MainResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleUser }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getSimpleUser")
	public JAXBElement<GetSimpleUser> createGetSimpleUser(GetSimpleUser value) {
		return new JAXBElement<GetSimpleUser>(_GetSimpleUser_QNAME,
				GetSimpleUser.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetUserList }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getUserList")
	public JAXBElement<GetUserList> createGetUserList(GetUserList value) {
		return new JAXBElement<GetUserList>(_GetUserList_QNAME,
				GetUserList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Main }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "main")
	public JAXBElement<Main> createMain(Main value) {
		return new JAXBElement<Main>(_Main_QNAME, Main.class, null, value);
	}

}
