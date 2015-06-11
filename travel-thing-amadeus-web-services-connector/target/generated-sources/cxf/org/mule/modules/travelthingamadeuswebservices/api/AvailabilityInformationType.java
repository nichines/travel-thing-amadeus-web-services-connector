
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify Availability Information.
 * 
 * <p>Java class for AvailabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availabilityInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityInformationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityInformationType", propOrder = {
    "availabilityInformation"
})
public class AvailabilityInformationType {

    @XmlElement(required = true)
    protected AvailabilityInformationDetailsType availabilityInformation;

    /**
     * Gets the value of the availabilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityInformationDetailsType }
     *     
     */
    public AvailabilityInformationDetailsType getAvailabilityInformation() {
        return availabilityInformation;
    }

    /**
     * Sets the value of the availabilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityInformationDetailsType }
     *     
     */
    public void setAvailabilityInformation(AvailabilityInformationDetailsType value) {
        this.availabilityInformation = value;
    }

}
