package org.ski.dvx.client.hibernate.version;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.client.hibernate.version
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

	private final static QName _FindByVersionDescription_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByVersionDescription");
	private final static QName _FindByCreatedResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByCreatedResponse");
	private final static QName _Merge_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "merge");
	private final static QName _FindByExampleResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByExampleResponse");
	private final static QName _Save_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "save");
	private final static QName _MergeResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "mergeResponse");
	private final static QName _FindAllResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findAllResponse");
	private final static QName _FindByMovieFk_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByMovieFk");
	private final static QName _FindByAuthorFkResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByAuthorFkResponse");
	private final static QName _FindByLanguageFkResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByLanguageFkResponse");
	private final static QName _Delete_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "delete");
	private final static QName _FindById_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findById");
	private final static QName _SaveResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "saveResponse");
	private final static QName _FindByMovieFkResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByMovieFkResponse");
	private final static QName _FindByAuthorFk_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByAuthorFk");
	private final static QName _AttachClean_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "attachClean");
	private final static QName _FindByVersionDescriptionResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByVersionDescriptionResponse");
	private final static QName _FindByModified_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByModified");
	private final static QName _FindByPropertyResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByPropertyResponse");
	private final static QName _FindByModifiedResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"findByModifiedResponse");
	private final static QName _FindAll_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findAll");
	private final static QName _AttachDirtyResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"attachDirtyResponse");
	private final static QName _FindByIdResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByIdResponse");
	private final static QName _FindByProperty_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByProperty");
	private final static QName _AttachDirty_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "attachDirty");
	private final static QName _FindByCreated_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByCreated");
	private final static QName _FindByLanguageFk_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByLanguageFk");
	private final static QName _AttachCleanResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/",
			"attachCleanResponse");
	private final static QName _FindByExample_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "findByExample");
	private final static QName _DeleteResponse_QNAME = new QName(
			"http://version.hibernate.server.dvx.ski.org/", "deleteResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.ski.dvx.client.hibernate.version
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link AttachDirty }
	 * 
	 */
	public AttachDirty createAttachDirty() {
		return new AttachDirty();
	}

	/**
	 * Create an instance of {@link FindByLanguageFkResponse }
	 * 
	 */
	public FindByLanguageFkResponse createFindByLanguageFkResponse() {
		return new FindByLanguageFkResponse();
	}

	/**
	 * Create an instance of {@link FindByCreatedResponse }
	 * 
	 */
	public FindByCreatedResponse createFindByCreatedResponse() {
		return new FindByCreatedResponse();
	}

	/**
	 * Create an instance of {@link FindByVersionDescription }
	 * 
	 */
	public FindByVersionDescription createFindByVersionDescription() {
		return new FindByVersionDescription();
	}

	/**
	 * Create an instance of {@link MergeResponse }
	 * 
	 */
	public MergeResponse createMergeResponse() {
		return new MergeResponse();
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
	 * Create an instance of {@link FindByVersionDescriptionResponse }
	 * 
	 */
	public FindByVersionDescriptionResponse createFindByVersionDescriptionResponse() {
		return new FindByVersionDescriptionResponse();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link FindAllResponse }
	 * 
	 */
	public FindAllResponse createFindAllResponse() {
		return new FindAllResponse();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieFkResponse }
	 * 
	 */
	public FindByMovieFkResponse createFindByMovieFkResponse() {
		return new FindByMovieFkResponse();
	}

	/**
	 * Create an instance of {@link FindByExampleResponse }
	 * 
	 */
	public FindByExampleResponse createFindByExampleResponse() {
		return new FindByExampleResponse();
	}

	/**
	 * Create an instance of {@link FindByModifiedResponse }
	 * 
	 */
	public FindByModifiedResponse createFindByModifiedResponse() {
		return new FindByModifiedResponse();
	}

	/**
	 * Create an instance of {@link FindByAuthorFk }
	 * 
	 */
	public FindByAuthorFk createFindByAuthorFk() {
		return new FindByAuthorFk();
	}

	/**
	 * Create an instance of {@link FindByMovieFk }
	 * 
	 */
	public FindByMovieFk createFindByMovieFk() {
		return new FindByMovieFk();
	}

	/**
	 * Create an instance of {@link FindByExample }
	 * 
	 */
	public FindByExample createFindByExample() {
		return new FindByExample();
	}

	/**
	 * Create an instance of {@link FindById }
	 * 
	 */
	public FindById createFindById() {
		return new FindById();
	}

	/**
	 * Create an instance of {@link FindByIdResponse }
	 * 
	 */
	public FindByIdResponse createFindByIdResponse() {
		return new FindByIdResponse();
	}

	/**
	 * Create an instance of {@link Merge }
	 * 
	 */
	public Merge createMerge() {
		return new Merge();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link FindByProperty }
	 * 
	 */
	public FindByProperty createFindByProperty() {
		return new FindByProperty();
	}

	/**
	 * Create an instance of {@link Version }
	 * 
	 */
	public Version createVersion() {
		return new Version();
	}

	/**
	 * Create an instance of {@link FindAll }
	 * 
	 */
	public FindAll createFindAll() {
		return new FindAll();
	}

	/**
	 * Create an instance of {@link FindByPropertyResponse }
	 * 
	 */
	public FindByPropertyResponse createFindByPropertyResponse() {
		return new FindByPropertyResponse();
	}

	/**
	 * Create an instance of {@link AttachClean }
	 * 
	 */
	public AttachClean createAttachClean() {
		return new AttachClean();
	}

	/**
	 * Create an instance of {@link FindByAuthorFkResponse }
	 * 
	 */
	public FindByAuthorFkResponse createFindByAuthorFkResponse() {
		return new FindByAuthorFkResponse();
	}

	/**
	 * Create an instance of {@link AttachDirtyResponse }
	 * 
	 */
	public AttachDirtyResponse createAttachDirtyResponse() {
		return new AttachDirtyResponse();
	}

	/**
	 * Create an instance of {@link FindByLanguageFk }
	 * 
	 */
	public FindByLanguageFk createFindByLanguageFk() {
		return new FindByLanguageFk();
	}

	/**
	 * Create an instance of {@link FindByModified }
	 * 
	 */
	public FindByModified createFindByModified() {
		return new FindByModified();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByVersionDescription }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByVersionDescription")
	public JAXBElement<FindByVersionDescription> createFindByVersionDescription(
			FindByVersionDescription value) {
		return new JAXBElement<FindByVersionDescription>(
				_FindByVersionDescription_QNAME,
				FindByVersionDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByCreatedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByCreatedResponse")
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
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "merge")
	public JAXBElement<Merge> createMerge(Merge value) {
		return new JAXBElement<Merge>(_Merge_QNAME, Merge.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByExampleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByExampleResponse")
	public JAXBElement<FindByExampleResponse> createFindByExampleResponse(
			FindByExampleResponse value) {
		return new JAXBElement<FindByExampleResponse>(
				_FindByExampleResponse_QNAME, FindByExampleResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MergeResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "mergeResponse")
	public JAXBElement<MergeResponse> createMergeResponse(MergeResponse value) {
		return new JAXBElement<MergeResponse>(_MergeResponse_QNAME,
				MergeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findAllResponse")
	public JAXBElement<FindAllResponse> createFindAllResponse(
			FindAllResponse value) {
		return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME,
				FindAllResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByMovieFk }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByMovieFk")
	public JAXBElement<FindByMovieFk> createFindByMovieFk(FindByMovieFk value) {
		return new JAXBElement<FindByMovieFk>(_FindByMovieFk_QNAME,
				FindByMovieFk.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAuthorFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByAuthorFkResponse")
	public JAXBElement<FindByAuthorFkResponse> createFindByAuthorFkResponse(
			FindByAuthorFkResponse value) {
		return new JAXBElement<FindByAuthorFkResponse>(
				_FindByAuthorFkResponse_QNAME, FindByAuthorFkResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByLanguageFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByLanguageFkResponse")
	public JAXBElement<FindByLanguageFkResponse> createFindByLanguageFkResponse(
			FindByLanguageFkResponse value) {
		return new JAXBElement<FindByLanguageFkResponse>(
				_FindByLanguageFkResponse_QNAME,
				FindByLanguageFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findById")
	public JAXBElement<FindById> createFindById(FindById value) {
		return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME,
				SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByMovieFkResponse")
	public JAXBElement<FindByMovieFkResponse> createFindByMovieFkResponse(
			FindByMovieFkResponse value) {
		return new JAXBElement<FindByMovieFkResponse>(
				_FindByMovieFkResponse_QNAME, FindByMovieFkResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByAuthorFk }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByAuthorFk")
	public JAXBElement<FindByAuthorFk> createFindByAuthorFk(FindByAuthorFk value) {
		return new JAXBElement<FindByAuthorFk>(_FindByAuthorFk_QNAME,
				FindByAuthorFk.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachClean }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "attachClean")
	public JAXBElement<AttachClean> createAttachClean(AttachClean value) {
		return new JAXBElement<AttachClean>(_AttachClean_QNAME,
				AttachClean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByVersionDescriptionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByVersionDescriptionResponse")
	public JAXBElement<FindByVersionDescriptionResponse> createFindByVersionDescriptionResponse(
			FindByVersionDescriptionResponse value) {
		return new JAXBElement<FindByVersionDescriptionResponse>(
				_FindByVersionDescriptionResponse_QNAME,
				FindByVersionDescriptionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByModified }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByModified")
	public JAXBElement<FindByModified> createFindByModified(FindByModified value) {
		return new JAXBElement<FindByModified>(_FindByModified_QNAME,
				FindByModified.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByPropertyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByPropertyResponse")
	public JAXBElement<FindByPropertyResponse> createFindByPropertyResponse(
			FindByPropertyResponse value) {
		return new JAXBElement<FindByPropertyResponse>(
				_FindByPropertyResponse_QNAME, FindByPropertyResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByModifiedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByModifiedResponse")
	public JAXBElement<FindByModifiedResponse> createFindByModifiedResponse(
			FindByModifiedResponse value) {
		return new JAXBElement<FindByModifiedResponse>(
				_FindByModifiedResponse_QNAME, FindByModifiedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findAll")
	public JAXBElement<FindAll> createFindAll(FindAll value) {
		return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachDirtyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "attachDirtyResponse")
	public JAXBElement<AttachDirtyResponse> createAttachDirtyResponse(
			AttachDirtyResponse value) {
		return new JAXBElement<AttachDirtyResponse>(_AttachDirtyResponse_QNAME,
				AttachDirtyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByIdResponse")
	public JAXBElement<FindByIdResponse> createFindByIdResponse(
			FindByIdResponse value) {
		return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME,
				FindByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByProperty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByProperty")
	public JAXBElement<FindByProperty> createFindByProperty(FindByProperty value) {
		return new JAXBElement<FindByProperty>(_FindByProperty_QNAME,
				FindByProperty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachDirty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "attachDirty")
	public JAXBElement<AttachDirty> createAttachDirty(AttachDirty value) {
		return new JAXBElement<AttachDirty>(_AttachDirty_QNAME,
				AttachDirty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByCreated }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByCreated")
	public JAXBElement<FindByCreated> createFindByCreated(FindByCreated value) {
		return new JAXBElement<FindByCreated>(_FindByCreated_QNAME,
				FindByCreated.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByLanguageFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByLanguageFk")
	public JAXBElement<FindByLanguageFk> createFindByLanguageFk(
			FindByLanguageFk value) {
		return new JAXBElement<FindByLanguageFk>(_FindByLanguageFk_QNAME,
				FindByLanguageFk.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachCleanResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "attachCleanResponse")
	public JAXBElement<AttachCleanResponse> createAttachCleanResponse(
			AttachCleanResponse value) {
		return new JAXBElement<AttachCleanResponse>(_AttachCleanResponse_QNAME,
				AttachCleanResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByExample }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "findByExample")
	public JAXBElement<FindByExample> createFindByExample(FindByExample value) {
		return new JAXBElement<FindByExample>(_FindByExample_QNAME,
				FindByExample.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://version.hibernate.server.dvx.ski.org/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME,
				DeleteResponse.class, null, value);
	}

}
