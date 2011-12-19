package org.ski.dvx.client.hibernate.audio_track_info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * org.ski.dvx.client.hibernate.audio_track_info package.
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

	private final static QName _FindByExample_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByExample");
	private final static QName _DeleteResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"deleteResponse");
	private final static QName _AttachCleanResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"attachCleanResponse");
	private final static QName _FindByCreated_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByCreated");
	private final static QName _AttachDirty_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"attachDirty");
	private final static QName _FindByAudioTrackPanResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackPanResponse");
	private final static QName _FindByAudioTrackDescription_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackDescription");
	private final static QName _FindByIdResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByIdResponse");
	private final static QName _FindByProperty_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByProperty");
	private final static QName _AttachDirtyResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"attachDirtyResponse");
	private final static QName _FindByAudioTrackGainResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackGainResponse");
	private final static QName _FindAll_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/", "findAll");
	private final static QName _FindByModifiedResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByModifiedResponse");
	private final static QName _FindByModified_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByModified");
	private final static QName _FindByPropertyResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByPropertyResponse");
	private final static QName _FindByAudioTrackDescriptionResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackDescriptionResponse");
	private final static QName _AttachClean_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"attachClean");
	private final static QName _SaveResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"saveResponse");
	private final static QName _FindByAudioTrackGain_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackGain");
	private final static QName _FindById_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/", "findById");
	private final static QName _Delete_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/", "delete");
	private final static QName _FindAllResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findAllResponse");
	private final static QName _MergeResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"mergeResponse");
	private final static QName _Save_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/", "save");
	private final static QName _Merge_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/", "merge");
	private final static QName _FindByCreatedResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByCreatedResponse");
	private final static QName _FindByAudioTrackPan_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByAudioTrackPan");
	private final static QName _FindByExampleResponse_QNAME = new QName(
			"http://audio_track_info.hibernate.server.dvx.ski.org/",
			"findByExampleResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * org.ski.dvx.client.hibernate.audio_track_info
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link FindAllResponse }
	 * 
	 */
	public FindAllResponse createFindAllResponse() {
		return new FindAllResponse();
	}

	/**
	 * Create an instance of {@link FindByPropertyResponse }
	 * 
	 */
	public FindByPropertyResponse createFindByPropertyResponse() {
		return new FindByPropertyResponse();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackGainResponse }
	 * 
	 */
	public FindByAudioTrackGainResponse createFindByAudioTrackGainResponse() {
		return new FindByAudioTrackGainResponse();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link FindByIdResponse }
	 * 
	 */
	public FindByIdResponse createFindByIdResponse() {
		return new FindByIdResponse();
	}

	/**
	 * Create an instance of {@link MergeResponse }
	 * 
	 */
	public MergeResponse createMergeResponse() {
		return new MergeResponse();
	}

	/**
	 * Create an instance of {@link FindByModifiedResponse }
	 * 
	 */
	public FindByModifiedResponse createFindByModifiedResponse() {
		return new FindByModifiedResponse();
	}

	/**
	 * Create an instance of {@link AttachCleanResponse }
	 * 
	 */
	public AttachCleanResponse createAttachCleanResponse() {
		return new AttachCleanResponse();
	}

	/**
	 * Create an instance of {@link AudioTrackInfo }
	 * 
	 */
	public AudioTrackInfo createAudioTrackInfo() {
		return new AudioTrackInfo();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackPan }
	 * 
	 */
	public FindByAudioTrackPan createFindByAudioTrackPan() {
		return new FindByAudioTrackPan();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link FindById }
	 * 
	 */
	public FindById createFindById() {
		return new FindById();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackPanResponse }
	 * 
	 */
	public FindByAudioTrackPanResponse createFindByAudioTrackPanResponse() {
		return new FindByAudioTrackPanResponse();
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
	 * Create an instance of {@link FindByCreatedResponse }
	 * 
	 */
	public FindByCreatedResponse createFindByCreatedResponse() {
		return new FindByCreatedResponse();
	}

	/**
	 * Create an instance of {@link FindAll }
	 * 
	 */
	public FindAll createFindAll() {
		return new FindAll();
	}

	/**
	 * Create an instance of {@link AttachDirty }
	 * 
	 */
	public AttachDirty createAttachDirty() {
		return new AttachDirty();
	}

	/**
	 * Create an instance of {@link FindByExample }
	 * 
	 */
	public FindByExample createFindByExample() {
		return new FindByExample();
	}

	/**
	 * Create an instance of {@link AttachDirtyResponse }
	 * 
	 */
	public AttachDirtyResponse createAttachDirtyResponse() {
		return new AttachDirtyResponse();
	}

	/**
	 * Create an instance of {@link FindByProperty }
	 * 
	 */
	public FindByProperty createFindByProperty() {
		return new FindByProperty();
	}

	/**
	 * Create an instance of {@link Merge }
	 * 
	 */
	public Merge createMerge() {
		return new Merge();
	}

	/**
	 * Create an instance of {@link FindByModified }
	 * 
	 */
	public FindByModified createFindByModified() {
		return new FindByModified();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackDescription }
	 * 
	 */
	public FindByAudioTrackDescription createFindByAudioTrackDescription() {
		return new FindByAudioTrackDescription();
	}

	/**
	 * Create an instance of {@link AttachClean }
	 * 
	 */
	public AttachClean createAttachClean() {
		return new AttachClean();
	}

	/**
	 * Create an instance of {@link FindByCreated }
	 * 
	 */
	public FindByCreated createFindByCreated() {
		return new FindByCreated();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackDescriptionResponse }
	 * 
	 */
	public FindByAudioTrackDescriptionResponse createFindByAudioTrackDescriptionResponse() {
		return new FindByAudioTrackDescriptionResponse();
	}

	/**
	 * Create an instance of {@link FindByAudioTrackGain }
	 * 
	 */
	public FindByAudioTrackGain createFindByAudioTrackGain() {
		return new FindByAudioTrackGain();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByExample }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByExample")
	public JAXBElement<FindByExample> createFindByExample(FindByExample value) {
		return new JAXBElement<FindByExample>(_FindByExample_QNAME,
				FindByExample.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME,
				DeleteResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachCleanResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "attachCleanResponse")
	public JAXBElement<AttachCleanResponse> createAttachCleanResponse(
			AttachCleanResponse value) {
		return new JAXBElement<AttachCleanResponse>(_AttachCleanResponse_QNAME,
				AttachCleanResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByCreated }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByCreated")
	public JAXBElement<FindByCreated> createFindByCreated(FindByCreated value) {
		return new JAXBElement<FindByCreated>(_FindByCreated_QNAME,
				FindByCreated.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachDirty }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "attachDirty")
	public JAXBElement<AttachDirty> createAttachDirty(AttachDirty value) {
		return new JAXBElement<AttachDirty>(_AttachDirty_QNAME,
				AttachDirty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackPanResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackPanResponse")
	public JAXBElement<FindByAudioTrackPanResponse> createFindByAudioTrackPanResponse(
			FindByAudioTrackPanResponse value) {
		return new JAXBElement<FindByAudioTrackPanResponse>(
				_FindByAudioTrackPanResponse_QNAME,
				FindByAudioTrackPanResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackDescription }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackDescription")
	public JAXBElement<FindByAudioTrackDescription> createFindByAudioTrackDescription(
			FindByAudioTrackDescription value) {
		return new JAXBElement<FindByAudioTrackDescription>(
				_FindByAudioTrackDescription_QNAME,
				FindByAudioTrackDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByIdResponse")
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
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByProperty")
	public JAXBElement<FindByProperty> createFindByProperty(FindByProperty value) {
		return new JAXBElement<FindByProperty>(_FindByProperty_QNAME,
				FindByProperty.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AttachDirtyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "attachDirtyResponse")
	public JAXBElement<AttachDirtyResponse> createAttachDirtyResponse(
			AttachDirtyResponse value) {
		return new JAXBElement<AttachDirtyResponse>(_AttachDirtyResponse_QNAME,
				AttachDirtyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackGainResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackGainResponse")
	public JAXBElement<FindByAudioTrackGainResponse> createFindByAudioTrackGainResponse(
			FindByAudioTrackGainResponse value) {
		return new JAXBElement<FindByAudioTrackGainResponse>(
				_FindByAudioTrackGainResponse_QNAME,
				FindByAudioTrackGainResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findAll")
	public JAXBElement<FindAll> createFindAll(FindAll value) {
		return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByModifiedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByModifiedResponse")
	public JAXBElement<FindByModifiedResponse> createFindByModifiedResponse(
			FindByModifiedResponse value) {
		return new JAXBElement<FindByModifiedResponse>(
				_FindByModifiedResponse_QNAME, FindByModifiedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindByModified }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByModified")
	public JAXBElement<FindByModified> createFindByModified(FindByModified value) {
		return new JAXBElement<FindByModified>(_FindByModified_QNAME,
				FindByModified.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByPropertyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByPropertyResponse")
	public JAXBElement<FindByPropertyResponse> createFindByPropertyResponse(
			FindByPropertyResponse value) {
		return new JAXBElement<FindByPropertyResponse>(
				_FindByPropertyResponse_QNAME, FindByPropertyResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackDescriptionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackDescriptionResponse")
	public JAXBElement<FindByAudioTrackDescriptionResponse> createFindByAudioTrackDescriptionResponse(
			FindByAudioTrackDescriptionResponse value) {
		return new JAXBElement<FindByAudioTrackDescriptionResponse>(
				_FindByAudioTrackDescriptionResponse_QNAME,
				FindByAudioTrackDescriptionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttachClean }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "attachClean")
	public JAXBElement<AttachClean> createAttachClean(AttachClean value) {
		return new JAXBElement<AttachClean>(_AttachClean_QNAME,
				AttachClean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME,
				SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackGain }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackGain")
	public JAXBElement<FindByAudioTrackGain> createFindByAudioTrackGain(
			FindByAudioTrackGain value) {
		return new JAXBElement<FindByAudioTrackGain>(
				_FindByAudioTrackGain_QNAME, FindByAudioTrackGain.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findById")
	public JAXBElement<FindById> createFindById(FindById value) {
		return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findAllResponse")
	public JAXBElement<FindAllResponse> createFindAllResponse(
			FindAllResponse value) {
		return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME,
				FindAllResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MergeResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "mergeResponse")
	public JAXBElement<MergeResponse> createMergeResponse(MergeResponse value) {
		return new JAXBElement<MergeResponse>(_MergeResponse_QNAME,
				MergeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Merge }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "merge")
	public JAXBElement<Merge> createMerge(Merge value) {
		return new JAXBElement<Merge>(_Merge_QNAME, Merge.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByCreatedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByCreatedResponse")
	public JAXBElement<FindByCreatedResponse> createFindByCreatedResponse(
			FindByCreatedResponse value) {
		return new JAXBElement<FindByCreatedResponse>(
				_FindByCreatedResponse_QNAME, FindByCreatedResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByAudioTrackPan }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByAudioTrackPan")
	public JAXBElement<FindByAudioTrackPan> createFindByAudioTrackPan(
			FindByAudioTrackPan value) {
		return new JAXBElement<FindByAudioTrackPan>(_FindByAudioTrackPan_QNAME,
				FindByAudioTrackPan.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FindByExampleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", name = "findByExampleResponse")
	public JAXBElement<FindByExampleResponse> createFindByExampleResponse(
			FindByExampleResponse value) {
		return new JAXBElement<FindByExampleResponse>(
				_FindByExampleResponse_QNAME, FindByExampleResponse.class,
				null, value);
	}

}
