
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation
 * 
 * <p>Java class for ReservationControlInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileRecordLocator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ReservationControlInformationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeI", propOrder = {
    "profileRecordLocator"
})
public class ReservationControlInformationTypeI {

    @XmlElement(required = true)
    protected ReservationControlInformationDetailsTypeI profileRecordLocator;

    /**
     * Gets the value of the profileRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI }
     *     
     */
    public ReservationControlInformationDetailsTypeI getProfileRecordLocator() {
        return profileRecordLocator;
    }

    /**
     * Sets the value of the profileRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI }
     *     
     */
    public void setProfileRecordLocator(ReservationControlInformationDetailsTypeI value) {
        this.profileRecordLocator = value;
    }

}
