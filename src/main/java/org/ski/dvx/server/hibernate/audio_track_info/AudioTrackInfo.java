package org.ski.dvx.server.hibernate.audio_track_info;

/**
 * AudioTrackInfo entity. @author MyEclipse Persistence Tools
 */
public class AudioTrackInfo extends AbstractAudioTrackInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AudioTrackInfo() {
	}

	/** full constructor */
	public AudioTrackInfo(String audioTrackDescription, Integer audioTrackGain,
			Integer audioTrackPan, Long modified, Integer created) {
		super(audioTrackDescription, audioTrackGain, audioTrackPan, modified,
				created);
	}

}
