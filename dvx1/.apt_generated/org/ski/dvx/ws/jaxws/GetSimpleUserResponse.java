
package org.ski.dvx.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getSimpleUserResponse", namespace = "http://ws.dvx.ski.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleUserResponse", namespace = "http://ws.dvx.ski.org/")
public class GetSimpleUserResponse {

    @XmlElement(name = "return", namespace = "")
    private org.ski.dvx.ws.SimpleUser _return;

    /**
     * 
     * @return
     *     returns SimpleUser
     */
    public org.ski.dvx.ws.SimpleUser getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(org.ski.dvx.ws.SimpleUser _return) {
        this._return = _return;
    }

}
