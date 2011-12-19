package org.ski.dvx.client.hibernate.review;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.ski.dvx.client.hibernate.review
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

	private final static QName _FindByProperty_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByProperty");
	private final static QName _FindByIdResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByIdResponse");
	private final static QName _FindByReviewActiveResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewActiveResponse");
	private final static QName _FindByReviewLanguageFk_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewLanguageFk");
	private final static QName _FindAll_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findAll");
	private final static QName _FindByReviewUserFkResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewUserFkResponse");
	private final static QName _AttachDirtyResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"attachDirtyResponse");
	private final static QName _FindByModifiedResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByModifiedResponse");
	private final static QName _FindByReviewVersionFkResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewVersionFkResponse");
	private final static QName _AttachClean_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "attachClean");
	private final static QName _FindByPropertyResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByPropertyResponse");
	private final static QName _FindByModified_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByModified");
	private final static QName _FindByReviewLanguageFkResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewLanguageFkResponse");
	private final static QName _AttachCleanResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"attachCleanResponse");
	private final static QName _DeleteResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "deleteResponse");
	private final static QName _FindByExample_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByExample");
	private final static QName _FindByReviewLong_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByReviewLong");
	private final static QName _AttachDirty_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "attachDirty");
	private final static QName _FindByCreated_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByCreated");
	private final static QName _FindByReviewSummary_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewSummary");
	private final static QName _FindByReviewUserFk_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByReviewUserFk");
	private final static QName _MergeResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "mergeResponse");
	private final static QName _FindByExampleResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByExampleResponse");
	private final static QName _FindByCreatedResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByCreatedResponse");
	private final static QName _Merge_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "merge");
	private final static QName _Save_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "save");
	private final static QName _FindByReviewVersionFk_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewVersionFk");
	private final static QName _FindByReviewActive_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByReviewActive");
	private final static QName _FindById_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findById");
	private final static QName _FindByReviewLongResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewLongResponse");
	private final static QName _FindByMovieFkResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByMovieFkResponse");
	private final static QName _SaveResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "saveResponse");
	private final static QName _Delete_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "delete");
	private final static QName _FindByReviewSummaryResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/",
			"findByReviewSummaryResponse");
	private final static QName _FindAllResponse_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findAllResponse");
	private final static QName _FindByMovieFk_QNAME = new QName(
			"http://review.hibernate.server.dvx.ski.org/", "findByMovieFk");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.ski.dvx.client.hibernate.review
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link FindByPropertyResponse }
	 * 
	 */
	public FindByPropertyResponse createFindByPropertyResponse() {
		return new FindByPropertyResponse();
	}

	/**
	 * Create an instance of {@link AttachDirty }
	 * 
	 */
	public AttachDirty createAttachDirty() {
		return new AttachDirty();
	}

	/**
	 * Create an instance of {@link FindByReviewActive }
	 * 
	 */
	public FindByReviewActive createFindByReviewActive() {
		return new FindByReviewActive();
	}

	/**
	 * Create an instance of {@link FindByModified }
	 * 
	 */
	public FindByModified createFindByModified() {
		return new FindByModified();
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
	 * Create an instance of {@link FindByCreatedResponse }
	 * 
	 */
	public FindByCreatedResponse createFindByCreatedResponse() {
		return new FindByCreatedResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewSummaryResponse }
	 * 
	 */
	public FindByReviewSummaryResponse createFindByReviewSummaryResponse() {
		return new FindByReviewSummaryResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewLong }
	 * 
	 */
	public FindByReviewLong createFindByReviewLong() {
		return new FindByReviewLong();
	}

	/**
	 * Create an instance of {@link FindByExampleResponse }
	 * 
	 */
	public FindByExampleResponse createFindByExampleResponse() {
		return new FindByExampleResponse();
	}

	/**
	 * Create an instance of {@link FindByIdResponse }
	 * 
	 */
	public FindByIdResponse createFindByIdResponse() {
		return new FindByIdResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewUserFk }
	 * 
	 */
	public FindByReviewUserFk createFindByReviewUserFk() {
		return new FindByReviewUserFk();
	}

	/**
	 * Create an instance of {@link AttachDirtyResponse }
	 * 
	 */
	public AttachDirtyResponse createAttachDirtyResponse() {
		return new AttachDirtyResponse();
	}

	/**
	 * Create an instance of {@link FindAll }
	 * 
	 */
	public FindAll createFindAll() {
		return new FindAll();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link FindByReviewLongResponse }
	 * 
	 */
	public FindByReviewLongResponse createFindByReviewLongResponse() {
		return new FindByReviewLongResponse();
	}

	/**
	 * Create an instance of {@link MergeResponse }
	 * 
	 */
	public MergeResponse createMergeResponse() {
		return new MergeResponse();
	}

	/**
	 * Create an instance of {@link Merge }
	 * 
	 */
	public Merge createMerge() {
		return new Merge();
	}

	/**
	 * Create an instance of {@link FindByProperty }
	 * 
	 */
	public FindByProperty createFindByProperty() {
		return new FindByProperty();
	}

	/**
	 * Create an instance of {@link FindByReviewLanguageFkResponse }
	 * 
	 */
	public FindByReviewLanguageFkResponse createFindByReviewLanguageFkResponse() {
		return new FindByReviewLanguageFkResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieFkResponse }
	 * 
	 */
	public FindByMovieFkResponse createFindByMovieFkResponse() {
		return new FindByMovieFkResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewVersionFkResponse }
	 * 
	 */
	public FindByReviewVersionFkResponse createFindByReviewVersionFkResponse() {
		return new FindByReviewVersionFkResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewUserFkResponse }
	 * 
	 */
	public FindByReviewUserFkResponse createFindByReviewUserFkResponse() {
		return new FindByReviewUserFkResponse();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link FindByMovieFk }
	 * 
	 */
	public FindByMovieFk createFindByMovieFk() {
		return new FindByMovieFk();
	}

	/**
	 * Create an instance of {@link FindByCreated }
	 * 
	 */
	public FindByCreated createFindByCreated() {
		return new FindByCreated();
	}

	/**
	 * Create an instance of {@link FindByReviewLanguageFk }
	 * 
	 */
	public FindByReviewLanguageFk createFindByReviewLanguageFk() {
		return new FindByReviewLanguageFk();
	}

	/**
	 * Create an instance of {@link FindByReviewActiveResponse }
	 * 
	 */
	public FindByReviewActiveResponse createFindByReviewActiveResponse() {
		return new FindByReviewActiveResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewSummary }
	 * 
	 */
	public FindByReviewSummary createFindByReviewSummary() {
		return new FindByReviewSummary();
	}

	/**
	 * Create an instance of {@link FindByModifiedResponse }
	 * 
	 */
	public FindByModifiedResponse createFindByModifiedResponse() {
		return new FindByModifiedResponse();
	}

	/**
	 * Create an instance of {@link AttachClean }
	 * 
	 */
	public AttachClean createAttachClean() {
		return new AttachClean();
	}

	/**
	 * Create an instance of {@link Review }
	 * 
	 */
	public Review createReview() {
		return new Review();
	}

	/**
	 * Create an instance of {@link AttachCleanResponse }
	 * 
	 */
	public AttachCleanResponse createAttachCleanResponse() {
		return new AttachCleanResponse();
	}

	/**
	 * Create an instance of {@link FindByReviewVersionFk }
	 * 
	 */
	public FindByReviewVersionFk createFindByReviewVersionFk() {
		return new FindByReviewVersionFk();
	}

	/**
	 * Create an instance of {@link FindAllResponse }
	 * 
	 */
	public FindAllResponse createFindAllResponse() {
		return new FindAllResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByProperty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByProperty")
	public JAXBElement<FindByProperty> createFindByProperty(FindByProperty value) {
		return new JAXBElement<FindByProperty>(_FindByProperty_QNAME,
				FindByProperty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByIdResponse")
	public JAXBElement<FindByIdResponse> createFindByIdResponse(
			FindByIdResponse value) {
		return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME,
				FindByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewActiveResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewActiveResponse")
	public JAXBElement<FindByReviewActiveResponse> createFindByReviewActiveResponse(
			FindByReviewActiveResponse value) {
		return new JAXBElement<FindByReviewActiveResponse>(
				_FindByReviewActiveResponse_QNAME,
				FindByReviewActiveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewLanguageFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewLanguageFk")
	public JAXBElement<FindByReviewLanguageFk> createFindByReviewLanguageFk(
			FindByReviewLanguageFk value) {
		return new JAXBElement<FindByReviewLanguageFk>(
				_FindByReviewLanguageFk_QNAME, FindByReviewLanguageFk.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findAll")
	public JAXBElement<FindAll> createFindAll(FindAll value) {
		return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewUserFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewUserFkResponse")
	public JAXBElement<FindByReviewUserFkResponse> createFindByReviewUserFkResponse(
			FindByReviewUserFkResponse value) {
		return new JAXBElement<FindByReviewUserFkResponse>(
				_FindByReviewUserFkResponse_QNAME,
				FindByReviewUserFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachDirtyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "attachDirtyResponse")
	public JAXBElement<AttachDirtyResponse> createAttachDirtyResponse(
			AttachDirtyResponse value) {
		return new JAXBElement<AttachDirtyResponse>(_AttachDirtyResponse_QNAME,
				AttachDirtyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByModifiedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByModifiedResponse")
	public JAXBElement<FindByModifiedResponse> createFindByModifiedResponse(
			FindByModifiedResponse value) {
		return new JAXBElement<FindByModifiedResponse>(
				_FindByModifiedResponse_QNAME, FindByModifiedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewVersionFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewVersionFkResponse")
	public JAXBElement<FindByReviewVersionFkResponse> createFindByReviewVersionFkResponse(
			FindByReviewVersionFkResponse value) {
		return new JAXBElement<FindByReviewVersionFkResponse>(
				_FindByReviewVersionFkResponse_QNAME,
				FindByReviewVersionFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachClean }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "attachClean")
	public JAXBElement<AttachClean> createAttachClean(AttachClean value) {
		return new JAXBElement<AttachClean>(_AttachClean_QNAME,
				AttachClean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByPropertyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByPropertyResponse")
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
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByModified")
	public JAXBElement<FindByModified> createFindByModified(FindByModified value) {
		return new JAXBElement<FindByModified>(_FindByModified_QNAME,
				FindByModified.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewLanguageFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewLanguageFkResponse")
	public JAXBElement<FindByReviewLanguageFkResponse> createFindByReviewLanguageFkResponse(
			FindByReviewLanguageFkResponse value) {
		return new JAXBElement<FindByReviewLanguageFkResponse>(
				_FindByReviewLanguageFkResponse_QNAME,
				FindByReviewLanguageFkResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachCleanResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "attachCleanResponse")
	public JAXBElement<AttachCleanResponse> createAttachCleanResponse(
			AttachCleanResponse value) {
		return new JAXBElement<AttachCleanResponse>(_AttachCleanResponse_QNAME,
				AttachCleanResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME,
				DeleteResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByExample }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByExample")
	public JAXBElement<FindByExample> createFindByExample(FindByExample value) {
		return new JAXBElement<FindByExample>(_FindByExample_QNAME,
				FindByExample.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewLong }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewLong")
	public JAXBElement<FindByReviewLong> createFindByReviewLong(
			FindByReviewLong value) {
		return new JAXBElement<FindByReviewLong>(_FindByReviewLong_QNAME,
				FindByReviewLong.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachDirty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "attachDirty")
	public JAXBElement<AttachDirty> createAttachDirty(AttachDirty value) {
		return new JAXBElement<AttachDirty>(_AttachDirty_QNAME,
				AttachDirty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByCreated }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByCreated")
	public JAXBElement<FindByCreated> createFindByCreated(FindByCreated value) {
		return new JAXBElement<FindByCreated>(_FindByCreated_QNAME,
				FindByCreated.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewSummary }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewSummary")
	public JAXBElement<FindByReviewSummary> createFindByReviewSummary(
			FindByReviewSummary value) {
		return new JAXBElement<FindByReviewSummary>(_FindByReviewSummary_QNAME,
				FindByReviewSummary.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewUserFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewUserFk")
	public JAXBElement<FindByReviewUserFk> createFindByReviewUserFk(
			FindByReviewUserFk value) {
		return new JAXBElement<FindByReviewUserFk>(_FindByReviewUserFk_QNAME,
				FindByReviewUserFk.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MergeResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "mergeResponse")
	public JAXBElement<MergeResponse> createMergeResponse(MergeResponse value) {
		return new JAXBElement<MergeResponse>(_MergeResponse_QNAME,
				MergeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByExampleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByExampleResponse")
	public JAXBElement<FindByExampleResponse> createFindByExampleResponse(
			FindByExampleResponse value) {
		return new JAXBElement<FindByExampleResponse>(
				_FindByExampleResponse_QNAME, FindByExampleResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByCreatedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByCreatedResponse")
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
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "merge")
	public JAXBElement<Merge> createMerge(Merge value) {
		return new JAXBElement<Merge>(_Merge_QNAME, Merge.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewVersionFk }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewVersionFk")
	public JAXBElement<FindByReviewVersionFk> createFindByReviewVersionFk(
			FindByReviewVersionFk value) {
		return new JAXBElement<FindByReviewVersionFk>(
				_FindByReviewVersionFk_QNAME, FindByReviewVersionFk.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewActive }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewActive")
	public JAXBElement<FindByReviewActive> createFindByReviewActive(
			FindByReviewActive value) {
		return new JAXBElement<FindByReviewActive>(_FindByReviewActive_QNAME,
				FindByReviewActive.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findById")
	public JAXBElement<FindById> createFindById(FindById value) {
		return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewLongResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewLongResponse")
	public JAXBElement<FindByReviewLongResponse> createFindByReviewLongResponse(
			FindByReviewLongResponse value) {
		return new JAXBElement<FindByReviewLongResponse>(
				_FindByReviewLongResponse_QNAME,
				FindByReviewLongResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByMovieFkResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByMovieFkResponse")
	public JAXBElement<FindByMovieFkResponse> createFindByMovieFkResponse(
			FindByMovieFkResponse value) {
		return new JAXBElement<FindByMovieFkResponse>(
				_FindByMovieFkResponse_QNAME, FindByMovieFkResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME,
				SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByReviewSummaryResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByReviewSummaryResponse")
	public JAXBElement<FindByReviewSummaryResponse> createFindByReviewSummaryResponse(
			FindByReviewSummaryResponse value) {
		return new JAXBElement<FindByReviewSummaryResponse>(
				_FindByReviewSummaryResponse_QNAME,
				FindByReviewSummaryResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findAllResponse")
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
	@XmlElementDecl(namespace = "http://review.hibernate.server.dvx.ski.org/", name = "findByMovieFk")
	public JAXBElement<FindByMovieFk> createFindByMovieFk(FindByMovieFk value) {
		return new JAXBElement<FindByMovieFk>(_FindByMovieFk_QNAME,
				FindByMovieFk.class, null, value);
	}

}
