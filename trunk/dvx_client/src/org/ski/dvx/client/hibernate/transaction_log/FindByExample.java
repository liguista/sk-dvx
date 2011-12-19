package org.ski.dvx.client.hibernate.transaction_log;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findByExample complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findByExample">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://transaction_log.hibernate.server.dvx.ski.org/}transactionLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByExample", propOrder = { "arg0" })
public class FindByExample {

	protected TransactionLog arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link TransactionLog }
	 * 
	 */
	public TransactionLog getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link TransactionLog }
	 * 
	 */
	public void setArg0(TransactionLog value) {
		this.arg0 = value;
	}

}
