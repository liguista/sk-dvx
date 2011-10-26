
package org.ski.dvx.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getUserListResponse", namespace = "http://ws.dvx.ski.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserListResponse", namespace = "http://ws.dvx.ski.org/")
public class GetUserListResponse {

    @XmlElement(name = "return", namespace = "")
    private List<org.ski.dvx.ws.SimpleUser> _return;

    /**
     * 
     * @return
     *     returns List<SimpleUser>
     */
    public List<org.ski.dvx.ws.SimpleUser> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<org.ski.dvx.ws.SimpleUser> _return) {
        this._return = _return;
    }

}
