
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Message function or business details
 * 
 * <p>Java class for MessageFunctionBusinessDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageFunctionBusinessDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessFunction" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="subActionCode" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageFunctionBusinessDetailsTypeI", propOrder = {
    "businessFunction",
    "actionCode",
    "subActionCode"
})
public class MessageFunctionBusinessDetailsTypeI {

    protected String businessFunction;
    @XmlElement(required = true)
    protected String actionCode;
    protected String subActionCode;

    /**
     * Gets the value of the businessFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessFunction() {
        return businessFunction;
    }

    /**
     * Sets the value of the businessFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessFunction(String value) {
        this.businessFunction = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the subActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubActionCode() {
        return subActionCode;
    }

    /**
     * Sets the value of the subActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubActionCode(String value) {
        this.subActionCode = value;
    }

}
