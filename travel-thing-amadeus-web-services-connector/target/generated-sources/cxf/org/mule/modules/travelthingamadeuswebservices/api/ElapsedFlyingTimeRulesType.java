
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElapsedFlyingTimeRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElapsedFlyingTimeRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elapsedFlyingTime" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="greaterThanEFTCabin" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length2To2"/>
 *         &lt;element name="lowerThanEFTCabin" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length2To2"/>
 *         &lt;element name="travellerCategory" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="tripCategory" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElapsedFlyingTimeRulesType", propOrder = {
    "elapsedFlyingTime",
    "greaterThanEFTCabin",
    "lowerThanEFTCabin",
    "travellerCategory",
    "tripCategory"
})
public class ElapsedFlyingTimeRulesType {

    @XmlElement(required = true)
    protected BigInteger elapsedFlyingTime;
    @XmlElement(required = true)
    protected String greaterThanEFTCabin;
    @XmlElement(required = true)
    protected String lowerThanEFTCabin;
    protected String travellerCategory;
    protected String tripCategory;

    /**
     * Gets the value of the elapsedFlyingTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElapsedFlyingTime() {
        return elapsedFlyingTime;
    }

    /**
     * Sets the value of the elapsedFlyingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElapsedFlyingTime(BigInteger value) {
        this.elapsedFlyingTime = value;
    }

    /**
     * Gets the value of the greaterThanEFTCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreaterThanEFTCabin() {
        return greaterThanEFTCabin;
    }

    /**
     * Sets the value of the greaterThanEFTCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreaterThanEFTCabin(String value) {
        this.greaterThanEFTCabin = value;
    }

    /**
     * Gets the value of the lowerThanEFTCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerThanEFTCabin() {
        return lowerThanEFTCabin;
    }

    /**
     * Sets the value of the lowerThanEFTCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerThanEFTCabin(String value) {
        this.lowerThanEFTCabin = value;
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

}
