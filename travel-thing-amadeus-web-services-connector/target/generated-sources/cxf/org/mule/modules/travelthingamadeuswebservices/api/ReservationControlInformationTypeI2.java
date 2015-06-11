
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the travel choice profile used in the request
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
 *         &lt;element name="profileRecordLocator" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ReservationControlInformationDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "profileRecordLocator"
})
public class ReservationControlInformationTypeI2 {

    protected ReservationControlInformationDetailsTypeI2 profileRecordLocator;

    /**
     * Gets the value of the profileRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI2 }
     *     
     */
    public ReservationControlInformationDetailsTypeI2 getProfileRecordLocator() {
        return profileRecordLocator;
    }

    /**
     * Sets the value of the profileRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI2 }
     *     
     */
    public void setProfileRecordLocator(ReservationControlInformationDetailsTypeI2 value) {
        this.profileRecordLocator = value;
    }

}
