package hibernate_dvx;

import java.sql.Timestamp;


/**
 * AttributeId entity. @author MyEclipse Persistence Tools
 */
public class AttributeId extends AbstractAttributeId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public AttributeId() {
    }

    
    /** full constructor */
    public AttributeId(Integer attributeId, String attibuteName, String attributeValue, Timestamp modified, Timestamp created) {
        super(attributeId, attibuteName, attributeValue, modified, created);        
    }
   
}
