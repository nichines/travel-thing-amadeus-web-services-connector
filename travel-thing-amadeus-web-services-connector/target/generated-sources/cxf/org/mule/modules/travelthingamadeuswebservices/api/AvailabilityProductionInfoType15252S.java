
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of dates and locations of an availability request
 * 
 * <p>Java class for AvailabilityProductionInfoType_15252S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityProductionInfoType_15252S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureLocationInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="arrivalLocationInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}LocationDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityProductionInfoType_15252S", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "departureLocationInfo",
    "arrivalLocationInfo"
})
public class AvailabilityProductionInfoType15252S {

    protected LocationDetailsType departureLocationInfo;
    protected LocationDetailsType arrivalLocationInfo;

    /**
     * Gets the value of the departureLocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getDepartureLocationInfo() {
        return departureLocationInfo;
    }

    /**
     * Sets the value of the departureLocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setDepartureLocationInfo(LocationDetailsType value) {
        this.departureLocationInfo = value;
    }

    /**
     * Gets the value of the arrivalLocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getArrivalLocationInfo() {
        return arrivalLocationInfo;
    }

    /**
     * Sets the value of the arrivalLocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setArrivalLocationInfo(LocationDetailsType value) {
        this.arrivalLocationInfo = value;
    }

}
