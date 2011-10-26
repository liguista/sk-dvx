package org.ski.dvx.ws.moviePort;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "MovieListDelegate", targetNamespace = "http://ws.dvx.ski.org/")
public interface MovieListDelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "main", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.Main")
	@ResponseWrapper(localName = "mainResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.MainResponse")
	public void main(
			@WebParam(name = "arg0", targetNamespace = "") List<String> arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns org.ski.dvx.ws.moviePort.SimpleMovie
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getMovie", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.GetMovie")
	@ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.GetMovieResponse")
	public SimpleMovie getMovie(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @return returns java.util.List<org.ski.dvx.ws.moviePort.SimpleMovie>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getMovieList", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.GetMovieList")
	@ResponseWrapper(localName = "getMovieListResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviePort.GetMovieListResponse")
	public List<SimpleMovie> getMovieList();

}
