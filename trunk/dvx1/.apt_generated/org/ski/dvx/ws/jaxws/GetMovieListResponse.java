
package org.ski.dvx.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMovieListResponse", namespace = "http://ws.dvx.ski.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMovieListResponse", namespace = "http://ws.dvx.ski.org/")
public class GetMovieListResponse {

    @XmlElement(name = "return", namespace = "")
    private List<org.ski.dvx.ws.SimpleMovie> _return;

    /**
     * 
     * @return
     *     returns List<SimpleMovie>
     */
    public List<org.ski.dvx.ws.SimpleMovie> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<org.ski.dvx.ws.SimpleMovie> _return) {
        this._return = _return;
    }

}
