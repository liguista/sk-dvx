package org.ski.dvx.client.hibernate.user;

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
@WebService(name = "UserDAODelegate", targetNamespace = "http://user.hibernate.server.dvx.ski.org/")
public interface UserDAODelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "save", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.SaveResponse")
	public void save(@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "delete", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.Delete")
	@ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.DeleteResponse")
	public void delete(@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns org.ski.dvx.client.hibernate.user.User
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "merge", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.Merge")
	@ResponseWrapper(localName = "mergeResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.MergeResponse")
	public User merge(@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns org.ski.dvx.client.hibernate.user.User
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findById", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindById")
	@ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByIdResponse")
	public User findById(
			@WebParam(name = "arg0", targetNamespace = "") Integer arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByExample", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByExample")
	@ResponseWrapper(localName = "findByExampleResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByExampleResponse")
	public List<Object> findByExample(
			@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByProperty", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByProperty")
	@ResponseWrapper(localName = "findByPropertyResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByPropertyResponse")
	public List<Object> findByProperty(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") Object arg1);

	/**
	 * 
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findAll", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindAll")
	@ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindAllResponse")
	public List<Object> findAll();

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "attachDirty", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.AttachDirty")
	@ResponseWrapper(localName = "attachDirtyResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.AttachDirtyResponse")
	public void attachDirty(
			@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "attachClean", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.AttachClean")
	@ResponseWrapper(localName = "attachCleanResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.AttachCleanResponse")
	public void attachClean(
			@WebParam(name = "arg0", targetNamespace = "") User arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByModified", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByModified")
	@ResponseWrapper(localName = "findByModifiedResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByModifiedResponse")
	public List<Object> findByModified(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByCreated", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByCreated")
	@ResponseWrapper(localName = "findByCreatedResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByCreatedResponse")
	public List<Object> findByCreated(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserEmail", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserEmail")
	@ResponseWrapper(localName = "findByUserEmailResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserEmailResponse")
	public List<Object> findByUserEmail(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserPassword", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserPassword")
	@ResponseWrapper(localName = "findByUserPasswordResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserPasswordResponse")
	public List<Object> findByUserPassword(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserHandle", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserHandle")
	@ResponseWrapper(localName = "findByUserHandleResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserHandleResponse")
	public List<Object> findByUserHandle(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserLastLogin", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserLastLogin")
	@ResponseWrapper(localName = "findByUserLastLoginResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserLastLoginResponse")
	public List<Object> findByUserLastLogin(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserActive", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserActive")
	@ResponseWrapper(localName = "findByUserActiveResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserActiveResponse")
	public List<Object> findByUserActive(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByUserType", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserType")
	@ResponseWrapper(localName = "findByUserTypeResponse", targetNamespace = "http://user.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.user.FindByUserTypeResponse")
	public List<Object> findByUserType(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

}
