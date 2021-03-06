
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityAirport" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length3To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "cityAirport"
})
public class LocationType {

    @XmlElement(required = true)
    protected String cityAirport;

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

}
