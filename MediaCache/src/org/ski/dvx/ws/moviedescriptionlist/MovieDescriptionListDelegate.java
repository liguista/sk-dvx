package org.ski.dvx.ws.moviedescriptionlist;

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
@WebService(name = "MovieDescriptionListDelegate", targetNamespace = "http://ws.dvx.ski.org/")
public interface MovieDescriptionListDelegate {

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getSbnNumber", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.GetSbnNumber")
	@ResponseWrapper(localName = "getSbnNumberResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.GetSbnNumberResponse")
	public String getSbnNumber();

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "setSbnNumber", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.SetSbnNumber")
	@ResponseWrapper(localName = "setSbnNumberResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.SetSbnNumberResponse")
	public void setSbnNumber(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @return returns
	 *         java.util.List<org.ski.dvx.ws.moviedescriptionlist.MovieDescription
	 *         >
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getDescriptionList", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.GetDescriptionList")
	@ResponseWrapper(localName = "getDescriptionListResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.moviedescriptionlist.GetDescriptionListResponse")
	public List<MovieDescription> getDescriptionList();

}
