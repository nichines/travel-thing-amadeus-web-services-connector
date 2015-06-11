
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Preference associated
 * 
 * <p>Java class for AssociatedPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rcType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="highlight" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedPreferenceType", propOrder = {
    "rcType",
    "highlight"
})
public class AssociatedPreferenceType {

    @XmlElement(required = true)
    protected String rcType;
    @XmlElement(required = true)
    protected String highlight;

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

}
