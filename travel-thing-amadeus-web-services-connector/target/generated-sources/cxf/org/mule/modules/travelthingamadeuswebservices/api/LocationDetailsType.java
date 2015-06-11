
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Departure Location
 * 
 * <p>Java class for LocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityAirport" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaString_Length3To3"/>
 *         &lt;element name="modifier" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "cityAirport",
    "modifier"
})
public class LocationDetailsType {

    @XmlElement(required = true)
    protected String cityAirport;
    protected String modifier;

    /**
     * Gets the value of the cityAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAirport() {
        return cityAirport;
    }

    /**
     * Sets the value of the cityAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAirport(String value) {
        this.cityAirport = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

}
