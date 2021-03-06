
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellerSurnameInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerSurnameInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To57"/>
 *         &lt;element name="groupIndicator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfTravellers" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerSurnameInformationTypeI", propOrder = {
    "name",
    "groupIndicator",
    "numberOfTravellers"
})
public class TravellerSurnameInformationTypeI2 {

    @XmlElement(required = true)
    protected String name;
    protected String groupIndicator;
    protected BigInteger numberOfTravellers;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the groupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIndicator() {
        return groupIndicator;
    }

    /**
     * Sets the value of the groupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIndicator(String value) {
        this.groupIndicator = value;
    }

    /**
     * Gets the value of the numberOfTravellers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTravellers() {
        return numberOfTravellers;
    }

    /**
     * Sets the value of the numberOfTravellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTravellers(BigInteger value) {
        this.numberOfTravellers = value;
    }

}
