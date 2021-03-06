
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of some airline or flight option
 * 
 * <p>Java class for AirlineOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/SATRQT_07_1_1A}FullFlightIdentificationType" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="excludeAirlineIndicator" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineOptionType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "flightIdentification",
    "excludeAirlineIndicator"
})
public class AirlineOptionType {

    protected List<FullFlightIdentificationType> flightIdentification;
    protected String excludeAirlineIndicator;

    /**
     * Gets the value of the flightIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullFlightIdentificationType }
     * 
     * 
     */
    public List<FullFlightIdentificationType> getFlightIdentification() {
        if (flightIdentification == null) {
            flightIdentification = new ArrayList<FullFlightIdentificationType>();
        }
        return this.flightIdentification;
    }

    /**
     * Gets the value of the excludeAirlineIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeAirlineIndicator() {
        return excludeAirlineIndicator;
    }

    /**
     * Sets the value of the excludeAirlineIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeAirlineIndicator(String value) {
        this.excludeAirlineIndicator = value;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param flightIdentification
     *     allowed object is
     *     {@link FullFlightIdentificationType }
     *     
     */
    public void setFlightIdentification(List<FullFlightIdentificationType> flightIdentification) {
        this.flightIdentification = flightIdentification;
    }

}
