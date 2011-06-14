package hibernate_dvx;

import java.sql.Timestamp;

/**
 * AbstractAudioTrackInfo entity provides the base persistence definition of the
 * AudioTrackInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAudioTrackInfo extends HibernateBaseClass
		implements java.io.Serializable {

	// Fields

	private Integer audioTrackId;
	private String audioTrackDescription;
	private Integer audioTrackGain;
	private Integer audioTrackPan;
	private Timestamp created;
	private Timestamp modified;

	// Constructors

	/** default constructor */
	public AbstractAudioTrackInfo() {
	}

	/** minimal constructor */
	public AbstractAudioTrackInfo(Timestamp created) {
		this.created = created;
	}

	/** full constructor */
	public AbstractAudioTrackInfo(String audioTrackDescription,
			Integer audioTrackGain, Integer audioTrackPan, Timestamp created,
			Timestamp modified) {
		this.audioTrackDescription = audioTrackDescription;
		this.audioTrackGain = audioTrackGain;
		this.audioTrackPan = audioTrackPan;
		this.created = created;
		this.modified = modified;
	}

	// Property accessors

	public Integer getAudioTrackId() {
		return this.audioTrackId;
	}

	public void setAudioTrackId(Integer audioTrackId) {
		this.audioTrackId = audioTrackId;
	}

	public String getAudioTrackDescription() {
		return this.audioTrackDescription;
	}

	public void setAudioTrackDescription(String audioTrackDescription) {
		this.audioTrackDescription = audioTrackDescription;
	}

	public Integer getAudioTrackGain() {
		return this.audioTrackGain;
	}

	public void setAudioTrackGain(Integer audioTrackGain) {
		this.audioTrackGain = audioTrackGain;
	}

	public Integer getAudioTrackPan() {
		return this.audioTrackPan;
	}

	public void setAudioTrackPan(Integer audioTrackPan) {
		this.audioTrackPan = audioTrackPan;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

}