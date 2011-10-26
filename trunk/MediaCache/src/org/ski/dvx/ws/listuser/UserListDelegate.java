package org.ski.dvx.ws.listuser;

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
@WebService(name = "UserListDelegate", targetNamespace = "http://ws.dvx.ski.org/")
public interface UserListDelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "main", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.Main")
	@ResponseWrapper(localName = "mainResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.MainResponse")
	public void main(
			@WebParam(name = "arg0", targetNamespace = "") List<String> arg0);

	/**
	 * 
	 * @return returns java.util.List<org.ski.dvx.ws.listuser.SimpleUser>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getUserList", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.GetUserList")
	@ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.GetUserListResponse")
	public List<SimpleUser> getUserList();

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns org.ski.dvx.ws.listuser.SimpleUser
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getSimpleUser", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.GetSimpleUser")
	@ResponseWrapper(localName = "getSimpleUserResponse", targetNamespace = "http://ws.dvx.ski.org/", className = "org.ski.dvx.ws.listuser.GetSimpleUserResponse")
	public SimpleUser getSimpleUser(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

}
