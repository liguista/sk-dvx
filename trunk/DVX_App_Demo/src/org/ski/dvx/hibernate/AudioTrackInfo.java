package org.ski.dvx.hibernate;

import java.sql.Timestamp;


/**
 * AudioTrackInfo entity. @author MyEclipse Persistence Tools
 */
public class AudioTrackInfo extends AbstractAudioTrackInfo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public AudioTrackInfo() {
    }

	/** minimal constructor */
    public AudioTrackInfo(Timestamp created) {
        super(created);        
    }
    
    /** full constructor */
    public AudioTrackInfo(String audioTrackDescription, Integer audioTrackGain, Integer audioTrackPan, Timestamp created, Timestamp modified) {
        super(audioTrackDescription, audioTrackGain, audioTrackPan, created, modified);        
    }
   
}
