
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveller time details
 * 
 * <p>Java class for TravellerTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerTimeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureTime" type="{http://xml.amadeus.com/SATRSP_07_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://xml.amadeus.com/SATRSP_07_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="checkInDateAndTime" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length10To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerTimeDetailsTypeI", propOrder = {
    "departureTime",
    "arrivalTime",
    "checkInDateAndTime"
})
public class TravellerTimeDetailsTypeI {

    protected String departureTime;
    protected String arrivalTime;
    protected BigInteger checkInDateAndTime;

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the checkInDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckInDateAndTime() {
        return checkInDateAndTime;
    }

    /**
     * Sets the value of the checkInDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckInDateAndTime(BigInteger value) {
        this.checkInDateAndTime = value;
    }

}
