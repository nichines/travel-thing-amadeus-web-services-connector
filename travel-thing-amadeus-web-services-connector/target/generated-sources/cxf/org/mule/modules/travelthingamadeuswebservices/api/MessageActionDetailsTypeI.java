
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type and business function
 * 
 * <p>Java class for MessageActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageActionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="functionDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}MessageFunctionBusinessDetailsTypeI"/>
 *         &lt;element name="responseType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageActionDetailsTypeI", propOrder = {
    "functionDetails",
    "responseType"
})
public class MessageActionDetailsTypeI {

    @XmlElement(required = true)
    protected MessageFunctionBusinessDetailsTypeI functionDetails;
    protected String responseType;

    /**
     * Gets the value of the functionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public MessageFunctionBusinessDetailsTypeI getFunctionDetails() {
        return functionDetails;
    }

    /**
     * Sets the value of the functionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public void setFunctionDetails(MessageFunctionBusinessDetailsTypeI value) {
        this.functionDetails = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
