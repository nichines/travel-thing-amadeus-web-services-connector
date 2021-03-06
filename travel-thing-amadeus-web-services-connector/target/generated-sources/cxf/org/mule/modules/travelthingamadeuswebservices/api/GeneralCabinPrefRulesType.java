
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralCabinPrefRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralCabinPrefRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length2To2"/>
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
@XmlType(name = "GeneralCabinPrefRulesType", propOrder = {
    "cabin",
    "travellerCategory",
    "tripCategory"
})
public class GeneralCabinPrefRulesType {

    @XmlElement(required = true)
    protected String cabin;
    protected String travellerCategory;
    protected String tripCategory;

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
