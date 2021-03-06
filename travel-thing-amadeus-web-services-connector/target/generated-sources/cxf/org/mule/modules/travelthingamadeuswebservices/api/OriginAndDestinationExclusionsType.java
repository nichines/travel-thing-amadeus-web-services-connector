
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginAndDestinationExclusionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationExclusionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineCode" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length2To3"/>
 *         &lt;element name="privilegeIndicator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length6To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationExclusionsType", propOrder = {
    "airlineCode",
    "privilegeIndicator",
    "owner"
})
public class OriginAndDestinationExclusionsType {

    @XmlElement(required = true)
    protected String airlineCode;
    protected String privilegeIndicator;
    protected String owner;

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

}
