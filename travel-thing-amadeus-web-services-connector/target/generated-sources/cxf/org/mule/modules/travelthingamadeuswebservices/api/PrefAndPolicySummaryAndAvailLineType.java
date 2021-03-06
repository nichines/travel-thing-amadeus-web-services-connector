
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To summarise the preferences and policies that have been selected and the availability line.
 * 
 * <p>Java class for PrefAndPolicySummaryAndAvailLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefAndPolicySummaryAndAvailLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summaryLine" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To250"/>
 *         &lt;element name="activeProfileType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="availabilityComponent" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityComponentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefAndPolicySummaryAndAvailLineType", propOrder = {
    "summaryLine",
    "activeProfileType",
    "availabilityComponent"
})
public class PrefAndPolicySummaryAndAvailLineType {

    @XmlElement(required = true)
    protected String summaryLine;
    protected String activeProfileType;
    protected AvailabilityComponentType availabilityComponent;

    /**
     * Gets the value of the summaryLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryLine() {
        return summaryLine;
    }

    /**
     * Sets the value of the summaryLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryLine(String value) {
        this.summaryLine = value;
    }

    /**
     * Gets the value of the activeProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveProfileType() {
        return activeProfileType;
    }

    /**
     * Sets the value of the activeProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveProfileType(String value) {
        this.activeProfileType = value;
    }

    /**
     * Gets the value of the availabilityComponent property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityComponentType }
     *     
     */
    public AvailabilityComponentType getAvailabilityComponent() {
        return availabilityComponent;
    }

    /**
     * Sets the value of the availabilityComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityComponentType }
     *     
     */
    public void setAvailabilityComponent(AvailabilityComponentType value) {
        this.availabilityComponent = value;
    }

}
