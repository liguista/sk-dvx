package org.ski.dvx.server.hibernate.audio_track_info;

/**
 * AbstractAudioTrackInfo entity provides the base persistence definition of the
 * AudioTrackInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAudioTrackInfo implements java.io.Serializable {

	// Fields

	private Integer audioTrackId;
	private String audioTrackDescription;
	private Integer audioTrackGain;
	private Integer audioTrackPan;
	private Long modified;
	private Integer created;

	// Constructors

	/** default constructor */
	public AbstractAudioTrackInfo() {
	}

	/** full constructor */
	public AbstractAudioTrackInfo(String audioTrackDescription,
			Integer audioTrackGain, Integer audioTrackPan, Long modified,
			Integer created) {
		this.audioTrackDescription = audioTrackDescription;
		this.audioTrackGain = audioTrackGain;
		this.audioTrackPan = audioTrackPan;
		this.modified = modified;
		this.created = created;
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

	public Long getModified() {
		return this.modified;
	}

	public void setModified(Long modified) {
		this.modified = modified;
	}

	public Integer getCreated() {
		return this.created;
	}

	public void setCreated(Integer created) {
		this.created = created;
	}

}