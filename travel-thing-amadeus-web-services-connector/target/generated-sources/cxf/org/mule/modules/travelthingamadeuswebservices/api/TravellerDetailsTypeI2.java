
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellerDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To56" minOccurs="0"/>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="travellerAccompaniedByInfant" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="passengerID" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsTypeI", propOrder = {
    "firstName",
    "passengerType",
    "travellerAccompaniedByInfant",
    "passengerID"
})
public class TravellerDetailsTypeI2 {

    protected String firstName;
    protected String passengerType;
    protected String travellerAccompaniedByInfant;
    protected String passengerID;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the travellerAccompaniedByInfant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerAccompaniedByInfant() {
        return travellerAccompaniedByInfant;
    }

    /**
     * Sets the value of the travellerAccompaniedByInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerAccompaniedByInfant(String value) {
        this.travellerAccompaniedByInfant = value;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

}
