package org.ski.dvx.server.hibernate.audio_track_info;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.ski.dvx.server.hibernate.attribute.BaseHibernateDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(targetNamespace = "http://audio_track_info.hibernate.server.dvx.ski.org/", serviceName = "AudioTrackInfoDAOService", portName = "AudioTrackInfoDAOPort")
public class AudioTrackInfoDAODelegate {

	org.ski.dvx.server.hibernate.audio_track_info.AudioTrackInfoDAO audioTrackInfoDAO = new org.ski.dvx.server.hibernate.audio_track_info.AudioTrackInfoDAO();

	public void save(AudioTrackInfo transientInstance) {
		audioTrackInfoDAO.save(transientInstance);
	}

	public void delete(AudioTrackInfo persistentInstance) {
		audioTrackInfoDAO.delete(persistentInstance);
	}

	public AudioTrackInfo findById(java.lang.Integer id) {
		return audioTrackInfoDAO.findById(id);
	}

	public List findByExample(AudioTrackInfo instance) {
		return audioTrackInfoDAO.findByExample(instance);
	}

	public List findByProperty(String propertyName, Object value) {
		return audioTrackInfoDAO.findByProperty(propertyName, value);
	}

	public List findByAudioTrackDescription(Object audioTrackDescription) {
		return audioTrackInfoDAO
				.findByAudioTrackDescription(audioTrackDescription);
	}

	public List findByAudioTrackGain(Object audioTrackGain) {
		return audioTrackInfoDAO.findByAudioTrackGain(audioTrackGain);
	}

	public List findByAudioTrackPan(Object audioTrackPan) {
		return audioTrackInfoDAO.findByAudioTrackPan(audioTrackPan);
	}

	public List findByModified(Object modified) {
		return audioTrackInfoDAO.findByModified(modified);
	}

	public List findByCreated(Object created) {
		return audioTrackInfoDAO.findByCreated(created);
	}

	public List findAll() {
		return audioTrackInfoDAO.findAll();
	}

	public AudioTrackInfo merge(AudioTrackInfo detachedInstance) {
		return audioTrackInfoDAO.merge(detachedInstance);
	}

	public void attachDirty(AudioTrackInfo instance) {
		audioTrackInfoDAO.attachDirty(instance);
	}

	public void attachClean(AudioTrackInfo instance) {
		audioTrackInfoDAO.attachClean(instance);
	}

}