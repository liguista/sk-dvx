package org.ski.dvx.client.hibernate.audio_track_info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abstractAudioTrackInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abstractAudioTrackInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioTrackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audioTrackGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="audioTrackId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="audioTrackPan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractAudioTrackInfo", propOrder = {
		"audioTrackDescription", "audioTrackGain", "audioTrackId",
		"audioTrackPan", "created", "modified" })
public abstract class AbstractAudioTrackInfo {

	protected String audioTrackDescription;
	protected Integer audioTrackGain;
	protected Integer audioTrackId;
	protected Integer audioTrackPan;
	protected Integer created;
	protected Long modified;

	/**
	 * Gets the value of the audioTrackDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAudioTrackDescription() {
		return audioTrackDescription;
	}

	/**
	 * Sets the value of the audioTrackDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAudioTrackDescription(String value) {
		this.audioTrackDescription = value;
	}

	/**
	 * Gets the value of the audioTrackGain property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAudioTrackGain() {
		return audioTrackGain;
	}

	/**
	 * Sets the value of the audioTrackGain property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAudioTrackGain(Integer value) {
		this.audioTrackGain = value;
	}

	/**
	 * Gets the value of the audioTrackId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAudioTrackId() {
		return audioTrackId;
	}

	/**
	 * Sets the value of the audioTrackId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAudioTrackId(Integer value) {
		this.audioTrackId = value;
	}

	/**
	 * Gets the value of the audioTrackPan property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAudioTrackPan() {
		return audioTrackPan;
	}

	/**
	 * Sets the value of the audioTrackPan property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAudioTrackPan(Integer value) {
		this.audioTrackPan = value;
	}

	/**
	 * Gets the value of the created property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCreated() {
		return created;
	}

	/**
	 * Sets the value of the created property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCreated(Integer value) {
		this.created = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setModified(Long value) {
		this.modified = value;
	}

}
