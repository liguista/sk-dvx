package org.ski.dvx.client.hibernate.movie_cast;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.client.hibernate.movie_cast
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

	private final static QName _FindByCreated_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findByCreated");
	private final static QName _FindByMovieCastRoleNameResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleNameResponse");
	private final static QName _AttachDirty_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "attachDirty");
	private final static QName _FindByMovieCastMovieIdFkResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastMovieIdFkResponse");
	private final static QName _DeleteResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "deleteResponse");
	private final static QName _FindByExample_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findByExample");
	private final static QName _AttachCleanResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"attachCleanResponse");
	private final static QName _FindByPropertyResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByPropertyResponse");
	private final static QName _FindByModified_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findByModified");
	private final static QName _AttachClean_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "attachClean");
	private final static QName _FindByModifiedResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByModifiedResponse");
	private final static QName _AttachDirtyResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"attachDirtyResponse");
	private final static QName _FindAll_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findAll");
	private final static QName _FindByMovieCastCrewCastIdFkResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastCrewCastIdFkResponse");
	private final static QName _FindByMovieCastMovieIdFk_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastMovieIdFk");
	private final static QName _FindByProperty_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findByProperty");
	private final static QName _FindByIdResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByIdResponse");
	private final static QName _FindByMovieCastRoleDescription_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleDescription");
	private final static QName _FindByMovieCastRoleName_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleName");
	private final static QName _FindAllResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findAllResponse");
	private final static QName _Delete_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "delete");
	private final static QName _SaveResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "saveResponse");
	private final static QName _FindById_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "findById");
	private final static QName _FindByMovieCastRoleOrder_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleOrder");
	private final static QName _FindByMovieCastRoleDescriptionResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleDescriptionResponse");
	private final static QName _Save_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "save");
	private final static QName _FindByExampleResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByExampleResponse");
	private final static QName _FindByMovieCastRoleOrderResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastRoleOrderResponse");
	private final static QName _FindByCreatedResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByCreatedResponse");
	private final static QName _Merge_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "merge");
	private final static QName _MergeResponse_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/", "mergeResponse");
	private final static QName _FindByMovieCastCrewCastIdFk_QNAME = new QName(
			"http://movie_cast.hibernate.server.dvx.ski.org/",
			"findByMovieCastCrewCastIdFk");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * org.ski.dvx.client.hibernate.movie_cast
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link FindByMovieCastCrewCastIdFkResponse }
	 * 
	 */
	public FindByMovieCastCrewCastIdFkResponse createFindByMovieCastCrewCastIdFkResponse() {
		return new FindByMovieCastCrewCastIdFkResponse();
	}

	/**
	 * Create an instance of {@link FindByModified }
	 * 
	 */
	public FindByModified createFindByModified() {
		return new FindByModified();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link FindByExampleResponse }
	 * 
	 */
	public FindByExampleResponse createFindByExampleResponse() {
		return new FindByExampleResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastCrewCastIdFk }
	 * 
	 */
	public FindByMovieCastCrewCastIdFk createFindByMovieCastCrewCastIdFk() {
		return new FindByMovieCastCrewCastIdFk();
	}

	/**
	 * Create an instance of {@link AttachDirtyResponse }
	 * 
	 */
	public AttachDirtyResponse createAttachDirtyResponse() {
		return new AttachDirtyResponse();
	}

	/**
	 * Create an instance of {@link FindByModifiedResponse }
	 * 
	 */
	public FindByModifiedResponse createFindByModifiedResponse() {
		return new FindByModifiedResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastMovieIdFkResponse }
	 * 
	 */
	public FindByMovieCastMovieIdFkResponse createFindByMovieCastMovieIdFkResponse() {
		return new FindByMovieCastMovieIdFkResponse();
	}

	/**
	 * Create an instance of {@link Merge }
	 * 
	 */
	public Merge createMerge() {
		return new Merge();
	}

	/**
	 * Create an instance of {@link AttachDirty }
	 * 
	 */
	public AttachDirty createAttachDirty() {
		return new AttachDirty();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleName }
	 * 
	 */
	public FindByMovieCastRoleName createFindByMovieCastRoleName() {
		return new FindByMovieCastRoleName();
	}

	/**
	 * Create an instance of {@link MergeResponse }
	 * 
	 */
	public MergeResponse createMergeResponse() {
		return new MergeResponse();
	}

	/**
	 * Create an instance of {@link FindByPropertyResponse }
	 * 
	 */
	public FindByPropertyResponse createFindByPropertyResponse() {
		return new FindByPropertyResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleOrder }
	 * 
	 */
	public FindByMovieCastRoleOrder createFindByMovieCastRoleOrder() {
		return new FindByMovieCastRoleOrder();
	}

	/**
	 * Create an instance of {@link FindAllResponse }
	 * 
	 */
	public FindAllResponse createFindAllResponse() {
		return new FindAllResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleOrderResponse }
	 * 
	 */
	public FindByMovieCastRoleOrderResponse createFindByMovieCastRoleOrderResponse() {
		return new FindByMovieCastRoleOrderResponse();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link FindAll }
	 * 
	 */
	public FindAll createFindAll() {
		return new FindAll();
	}

	/**
	 * Create an instance of {@link FindByIdResponse }
	 * 
	 */
	public FindByIdResponse createFindByIdResponse() {
		return new FindByIdResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleNameResponse }
	 * 
	 */
	public FindByMovieCastRoleNameResponse createFindByMovieCastRoleNameResponse() {
		return new FindByMovieCastRoleNameResponse();
	}

	/**
	 * Create an instance of {@link FindByExample }
	 * 
	 */
	public FindByExample createFindByExample() {
		return new FindByExample();
	}

	/**
	 * Create an instance of {@link FindByCreatedResponse }
	 * 
	 */
	public FindByCreatedResponse createFindByCreatedResponse() {
		return new FindByCreatedResponse();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link FindByCreated }
	 * 
	 */
	public FindByCreated createFindByCreated() {
		return new FindByCreated();
	}

	/**
	 * Create an instance of {@link AttachCleanResponse }
	 * 
	 */
	public AttachCleanResponse createAttachCleanResponse() {
		return new AttachCleanResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleDescription }
	 * 
	 */
	public FindByMovieCastRoleDescription createFindByMovieCastRoleDescription() {
		return new FindByMovieCastRoleDescription();
	}

	/**
	 * Create an instance of {@link MovieCast }
	 * 
	 */
	public MovieCast createMovieCast() {
		return new MovieCast();
	}

	/**
	 * Create an instance of {@link FindByMovieCastRoleDescriptionResponse }
	 * 
	 */
	public FindByMovieCastRoleDescriptionResponse createFindByMovieCastRoleDescriptionResponse() {
		return new FindByMovieCastRoleDescriptionResponse();
	}

	/**
	 * Create an instance of {@link AttachClean }
	 * 
	 */
	public AttachClean createAttachClean() {
		return new AttachClean();
	}

	/**
	 * Create an instance of {@link FindByProperty }
	 * 
	 */
	public FindByProperty createFindByProperty() {
		return new FindByProperty();
	}

	/**
	 * Create an instance of {@link FindById }
	 * 
	 */
	public FindById createFindById() {
		return new FindById();
	}

	/**
	 * Create an instance of {@link FindByMovieCastMovieIdFk }
	 * 
	 */
	public FindByMovieCastMovieIdFk createFindByMovieCastMovieIdFk() {
		return new FindByMovieCastMovieIdFk();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByCreated }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByCreated")
	public JAXBElement<FindByCreated> createFindByCreated(FindByCreated value) {
		return new JAXBElement<FindByCreated>(_FindByCreated_QNAME,
				FindByCreated.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleNameResponse")
	public JAXBElement<FindByMovieCastRoleNameResponse> createFindByMovieCastRoleNameResponse(
			FindByMovieCastRoleNameResponse value) {
		return new JAXBElement<FindByMovieCastRoleNameResponse>(
				_FindByMovieCastRoleNameResponse_QNAME,
				FindByMovieCastRoleNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachDirty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "attachDirty")
	public JAXBElement<AttachDirty> createAttachDirty(AttachDirty value) {
		return new JAXBElement<AttachDirty>(_AttachDirty_QNAME,
				AttachDirty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastMovieIdFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastMovieIdFkResponse")
	public JAXBElement<FindByMovieCastMovieIdFkResponse> createFindByMovieCastMovieIdFkResponse(
			FindByMovieCastMovieIdFkResponse value) {
		return new JAXBElement<FindByMovieCastMovieIdFkResponse>(
				_FindByMovieCastMovieIdFkResponse_QNAME,
				FindByMovieCastMovieIdFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME,
				DeleteResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByExample }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByExample")
	public JAXBElement<FindByExample> createFindByExample(FindByExample value) {
		return new JAXBElement<FindByExample>(_FindByExample_QNAME,
				FindByExample.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachCleanResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "attachCleanResponse")
	public JAXBElement<AttachCleanResponse> createAttachCleanResponse(
			AttachCleanResponse value) {
		return new JAXBElement<AttachCleanResponse>(_AttachCleanResponse_QNAME,
				AttachCleanResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByPropertyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByPropertyResponse")
	public JAXBElement<FindByPropertyResponse> createFindByPropertyResponse(
			FindByPropertyResponse value) {
		return new JAXBElement<FindByPropertyResponse>(
				_FindByPropertyResponse_QNAME, FindByPropertyResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByModified }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByModified")
	public JAXBElement<FindByModified> createFindByModified(FindByModified value) {
		return new JAXBElement<FindByModified>(_FindByModified_QNAME,
				FindByModified.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachClean }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "attachClean")
	public JAXBElement<AttachClean> createAttachClean(AttachClean value) {
		return new JAXBElement<AttachClean>(_AttachClean_QNAME,
				AttachClean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByModifiedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByModifiedResponse")
	public JAXBElement<FindByModifiedResponse> createFindByModifiedResponse(
			FindByModifiedResponse value) {
		return new JAXBElement<FindByModifiedResponse>(
				_FindByModifiedResponse_QNAME, FindByModifiedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachDirtyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "attachDirtyResponse")
	public JAXBElement<AttachDirtyResponse> createAttachDirtyResponse(
			AttachDirtyResponse value) {
		return new JAXBElement<AttachDirtyResponse>(_AttachDirtyResponse_QNAME,
				AttachDirtyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findAll")
	public JAXBElement<FindAll> createFindAll(FindAll value) {
		return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastCrewCastIdFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastCrewCastIdFkResponse")
	public JAXBElement<FindByMovieCastCrewCastIdFkResponse> createFindByMovieCastCrewCastIdFkResponse(
			FindByMovieCastCrewCastIdFkResponse value) {
		return new JAXBElement<FindByMovieCastCrewCastIdFkResponse>(
				_FindByMovieCastCrewCastIdFkResponse_QNAME,
				FindByMovieCastCrewCastIdFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastMovieIdFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastMovieIdFk")
	public JAXBElement<FindByMovieCastMovieIdFk> createFindByMovieCastMovieIdFk(
			FindByMovieCastMovieIdFk value) {
		return new JAXBElement<FindByMovieCastMovieIdFk>(
				_FindByMovieCastMovieIdFk_QNAME,
				FindByMovieCastMovieIdFk.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByProperty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByProperty")
	public JAXBElement<FindByProperty> createFindByProperty(FindByProperty value) {
		return new JAXBElement<FindByProperty>(_FindByProperty_QNAME,
				FindByProperty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByIdResponse")
	public JAXBElement<FindByIdResponse> createFindByIdResponse(
			FindByIdResponse value) {
		return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME,
				FindByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleDescription }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleDescription")
	public JAXBElement<FindByMovieCastRoleDescription> createFindByMovieCastRoleDescription(
			FindByMovieCastRoleDescription value) {
		return new JAXBElement<FindByMovieCastRoleDescription>(
				_FindByMovieCastRoleDescription_QNAME,
				FindByMovieCastRoleDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleName }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleName")
	public JAXBElement<FindByMovieCastRoleName> createFindByMovieCastRoleName(
			FindByMovieCastRoleName value) {
		return new JAXBElement<FindByMovieCastRoleName>(
				_FindByMovieCastRoleName_QNAME, FindByMovieCastRoleName.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findAllResponse")
	public JAXBElement<FindAllResponse> createFindAllResponse(
			FindAllResponse value) {
		return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME,
				FindAllResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME,
				SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findById")
	public JAXBElement<FindById> createFindById(FindById value) {
		return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleOrder }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleOrder")
	public JAXBElement<FindByMovieCastRoleOrder> createFindByMovieCastRoleOrder(
			FindByMovieCastRoleOrder value) {
		return new JAXBElement<FindByMovieCastRoleOrder>(
				_FindByMovieCastRoleOrder_QNAME,
				FindByMovieCastRoleOrder.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleDescriptionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleDescriptionResponse")
	public JAXBElement<FindByMovieCastRoleDescriptionResponse> createFindByMovieCastRoleDescriptionResponse(
			FindByMovieCastRoleDescriptionResponse value) {
		return new JAXBElement<FindByMovieCastRoleDescriptionResponse>(
				_FindByMovieCastRoleDescriptionResponse_QNAME,
				FindByMovieCastRoleDescriptionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByExampleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByExampleResponse")
	public JAXBElement<FindByExampleResponse> createFindByExampleResponse(
			FindByExampleResponse value) {
		return new JAXBElement<FindByExampleResponse>(
				_FindByExampleResponse_QNAME, FindByExampleResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastRoleOrderResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastRoleOrderResponse")
	public JAXBElement<FindByMovieCastRoleOrderResponse> createFindByMovieCastRoleOrderResponse(
			FindByMovieCastRoleOrderResponse value) {
		return new JAXBElement<FindByMovieCastRoleOrderResponse>(
				_FindByMovieCastRoleOrderResponse_QNAME,
				FindByMovieCastRoleOrderResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByCreatedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByCreatedResponse")
	public JAXBElement<FindByCreatedResponse> createFindByCreatedResponse(
			FindByCreatedResponse value) {
		return new JAXBElement<FindByCreatedResponse>(
				_FindByCreatedResponse_QNAME, FindByCreatedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Merge }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "merge")
	public JAXBElement<Merge> createMerge(Merge value) {
		return new JAXBElement<Merge>(_Merge_QNAME, Merge.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MergeResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "mergeResponse")
	public JAXBElement<MergeResponse> createMergeResponse(MergeResponse value) {
		return new JAXBElement<MergeResponse>(_MergeResponse_QNAME,
				MergeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieCastCrewCastIdFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://movie_cast.hibernate.server.dvx.ski.org/", name = "findByMovieCastCrewCastIdFk")
	public JAXBElement<FindByMovieCastCrewCastIdFk> createFindByMovieCastCrewCastIdFk(
			FindByMovieCastCrewCastIdFk value) {
		return new JAXBElement<FindByMovieCastCrewCastIdFk>(
				_FindByMovieCastCrewCastIdFk_QNAME,
				FindByMovieCastCrewCastIdFk.class, null, value);
	}

}
