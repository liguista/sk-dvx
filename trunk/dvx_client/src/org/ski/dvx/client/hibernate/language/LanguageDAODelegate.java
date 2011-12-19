package org.ski.dvx.client.hibernate.language;

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
@WebService(name = "LanguageDAODelegate", targetNamespace = "http://language.hibernate.server.dvx.ski.org/")
public interface LanguageDAODelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "save", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.SaveResponse")
	public void save(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "delete", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.Delete")
	@ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.DeleteResponse")
	public void delete(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns org.ski.dvx.client.hibernate.language.Language
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "merge", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.Merge")
	@ResponseWrapper(localName = "mergeResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.MergeResponse")
	public Language merge(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns org.ski.dvx.client.hibernate.language.Language
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findById", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindById")
	@ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByIdResponse")
	public Language findById(
			@WebParam(name = "arg0", targetNamespace = "") Integer arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByExample", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByExample")
	@ResponseWrapper(localName = "findByExampleResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByExampleResponse")
	public List<Object> findByExample(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByProperty", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByProperty")
	@ResponseWrapper(localName = "findByPropertyResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByPropertyResponse")
	public List<Object> findByProperty(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") Object arg1);

	/**
	 * 
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findAll", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindAll")
	@ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindAllResponse")
	public List<Object> findAll();

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "attachDirty", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.AttachDirty")
	@ResponseWrapper(localName = "attachDirtyResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.AttachDirtyResponse")
	public void attachDirty(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "attachClean", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.AttachClean")
	@ResponseWrapper(localName = "attachCleanResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.AttachCleanResponse")
	public void attachClean(
			@WebParam(name = "arg0", targetNamespace = "") Language arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByLanguageName", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByLanguageName")
	@ResponseWrapper(localName = "findByLanguageNameResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByLanguageNameResponse")
	public List<Object> findByLanguageName(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByModified", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByModified")
	@ResponseWrapper(localName = "findByModifiedResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByModifiedResponse")
	public List<Object> findByModified(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByCreated", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByCreated")
	@ResponseWrapper(localName = "findByCreatedResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByCreatedResponse")
	public List<Object> findByCreated(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.Object>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "findByLanguageNameShort", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByLanguageNameShort")
	@ResponseWrapper(localName = "findByLanguageNameShortResponse", targetNamespace = "http://language.hibernate.server.dvx.ski.org/", className = "org.ski.dvx.client.hibernate.language.FindByLanguageNameShortResponse")
	public List<Object> findByLanguageNameShort(
			@WebParam(name = "arg0", targetNamespace = "") Object arg0);

}
