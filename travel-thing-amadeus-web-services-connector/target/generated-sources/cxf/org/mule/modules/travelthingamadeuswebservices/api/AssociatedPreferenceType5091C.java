
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Preference associated
 * 
 * <p>Java class for AssociatedPreferenceType_5091C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedPreferenceType_5091C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rcType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="highlight" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To2"/>
 *         &lt;element name="priority" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedPreferenceType_5091C", propOrder = {
    "rcType",
    "highlight",
    "priority"
})
public class AssociatedPreferenceType5091C {

    @XmlElement(required = true)
    protected String rcType;
    @XmlElement(required = true)
    protected String highlight;
    protected BigInteger priority;

    /**
     * Gets the value of the rcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcType() {
        return rcType;
    }

    /**
     * Sets the value of the rcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcType(String value) {
        this.rcType = value;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlight() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlight(String value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

}
