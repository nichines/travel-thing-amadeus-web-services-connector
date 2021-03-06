
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginAndDestinationPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineCode" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To3"/>
 *         &lt;element name="privilegeIndicator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length6To9" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="originValue" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To5" minOccurs="0"/>
 *         &lt;element name="destinationValue" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To5" minOccurs="0"/>
 *         &lt;element name="travellerCategory" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="tripCategory" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length2To2" minOccurs="0"/>
 *         &lt;element name="cabinClass" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationPrefType", propOrder = {
    "airlineCode",
    "privilegeIndicator",
    "owner",
    "priority",
    "originValue",
    "destinationValue",
    "travellerCategory",
    "tripCategory",
    "cabin",
    "cabinClass"
})
public class OriginAndDestinationPrefType {

    @XmlElement(required = true)
    protected String airlineCode;
    protected String privilegeIndicator;
    protected String owner;
    protected BigInteger priority;
    protected String originValue;
    protected String destinationValue;
    protected String travellerCategory;
    protected String tripCategory;
    protected String cabin;
    protected String cabinClass;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the privilegeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeIndicator() {
        return privilegeIndicator;
    }

    /**
     * Sets the value of the privilegeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeIndicator(String value) {
        this.privilegeIndicator = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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

    /**
     * Gets the value of the originValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginValue() {
        return originValue;
    }

    /**
     * Sets the value of the originValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginValue(String value) {
        this.originValue = value;
    }

    /**
     * Gets the value of the destinationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationValue() {
        return destinationValue;
    }

    /**
     * Sets the value of the destinationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationValue(String value) {
        this.destinationValue = value;
    }

    /**
     * Gets the value of the travellerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerCategory() {
        return travellerCategory;
    }

    /**
     * Sets the value of the travellerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerCategory(String value) {
        this.travellerCategory = value;
    }

    /**
     * Gets the value of the tripCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripCategory() {
        return tripCategory;
    }

    /**
     * Sets the value of the tripCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripCategory(String value) {
        this.tripCategory = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
