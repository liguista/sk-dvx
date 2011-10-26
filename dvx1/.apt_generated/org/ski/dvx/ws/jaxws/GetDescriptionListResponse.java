
package org.ski.dvx.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getDescriptionListResponse", namespace = "http://ws.dvx.ski.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDescriptionListResponse", namespace = "http://ws.dvx.ski.org/")
public class GetDescriptionListResponse {

    @XmlElement(name = "return", namespace = "")
    private List<org.ski.dvx.ws.MovieDescription> _return;

    /**
     * 
     * @return
     *     returns List<MovieDescription>
     */
    public List<org.ski.dvx.ws.MovieDescription> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<org.ski.dvx.ws.MovieDescription> _return) {
        this._return = _return;
    }

}
