
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the action code of the request
 * 
 * <p>Java class for MessageActionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageActionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="functionDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}MessageFunctionBusinessDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageActionDetailsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "functionDetails"
})
public class MessageActionDetailsType {

    @XmlElement(required = true)
    protected MessageFunctionBusinessDetailsType functionDetails;

    /**
     * Gets the value of the functionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionBusinessDetailsType }
     *     
     */
    public MessageFunctionBusinessDetailsType getFunctionDetails() {
        return functionDetails;
    }

    /**
     * Sets the value of the functionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionBusinessDetailsType }
     *     
     */
    public void setFunctionDetails(MessageFunctionBusinessDetailsType value) {
        this.functionDetails = value;
    }

}
