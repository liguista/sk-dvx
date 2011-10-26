package org.ski.dvx.ws.moviePort;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.ws.moviePort package.
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

	private final static QName _GetMovieList_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getMovieList");
	private final static QName _GetMovie_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getMovie");
	private final static QName _MainResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "mainResponse");
	private final static QName _GetMovieResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getMovieResponse");
	private final static QName _GetMovieListResponse_QNAME = new QName(
			"http://ws.dvx.ski.org/", "getMovieListResponse");
	private final static QName _Main_QNAME = new QName(
			"http://ws.dvx.ski.org/", "main");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.ski.dvx.ws.moviePort
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Main }
	 * 
	 */
	public Main createMain() {
		return new Main();
	}

	/**
	 * Create an instance of {@link GetMovieList }
	 * 
	 */
	public GetMovieList createGetMovieList() {
		return new GetMovieList();
	}

	/**
	 * Create an instance of {@link SimpleMovie }
	 * 
	 */
	public SimpleMovie createSimpleMovie() {
		return new SimpleMovie();
	}

	/**
	 * Create an instance of {@link GetMovieListResponse }
	 * 
	 */
	public GetMovieListResponse createGetMovieListResponse() {
		return new GetMovieListResponse();
	}

	/**
	 * Create an instance of {@link GetMovieResponse }
	 * 
	 */
	public GetMovieResponse createGetMovieResponse() {
		return new GetMovieResponse();
	}

	/**
	 * Create an instance of {@link MainResponse }
	 * 
	 */
	public MainResponse createMainResponse() {
		return new MainResponse();
	}

	/**
	 * Create an instance of {@link GetMovie }
	 * 
	 */
	public GetMovie createGetMovie() {
		return new GetMovie();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieList }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getMovieList")
	public JAXBElement<GetMovieList> createGetMovieList(GetMovieList value) {
		return new JAXBElement<GetMovieList>(_GetMovieList_QNAME,
				GetMovieList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetMovie }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getMovie")
	public JAXBElement<GetMovie> createGetMovie(GetMovie value) {
		return new JAXBElement<GetMovie>(_GetMovie_QNAME, GetMovie.class, null,
				value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMovieResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getMovieResponse")
	public JAXBElement<GetMovieResponse> createGetMovieResponse(
			GetMovieResponse value) {
		return new JAXBElement<GetMovieResponse>(_GetMovieResponse_QNAME,
				GetMovieResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMovieListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.dvx.ski.org/", name = "getMovieListResponse")
	public JAXBElement<GetMovieListResponse> createGetMovieListResponse(
			GetMovieListResponse value) {
		return new JAXBElement<GetMovieListResponse>(
				_GetMovieListResponse_QNAME, GetMovieListResponse.class, null,
				value);
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
