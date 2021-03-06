
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of dates and locations of an availability request
 * 
 * <p>Java class for AvailabilityProductionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityProductionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availabilityDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ProductDateTimeType" maxOccurs="31"/>
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
@XmlType(name = "AvailabilityProductionInfoType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "availabilityDetails",
    "departureLocationInfo",
    "arrivalLocationInfo"
})
public class AvailabilityProductionInfoType {

    @XmlElement(required = true)
    protected List<ProductDateTimeType> availabilityDetails;
    protected LocationDetailsType departureLocationInfo;
    protected LocationDetailsType arrivalLocationInfo;

    /**
     * Gets the value of the availabilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDateTimeType }
     * 
     * 
     */
    public List<ProductDateTimeType> getAvailabilityDetails() {
        if (availabilityDetails == null) {
            availabilityDetails = new ArrayList<ProductDateTimeType>();
        }
        return this.availabilityDetails;
    }

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

    /**
     * Sets the value of the availabilityDetails property.
     * 
     * @param availabilityDetails
     *     allowed object is
     *     {@link ProductDateTimeType }
     *     
     */
    public void setAvailabilityDetails(List<ProductDateTimeType> availabilityDetails) {
        this.availabilityDetails = availabilityDetails;
    }

}
