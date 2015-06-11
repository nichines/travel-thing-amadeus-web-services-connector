
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of availability options
 * 
 * <p>Java class for SelectionDetailsInformationType_26805C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsInformationType_26805C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfDisplay" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="tripCategory" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsInformationType_26805C", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "typeOfDisplay",
    "tripCategory"
})
public class SelectionDetailsInformationType26805C {

    @XmlElement(required = true)
    protected String typeOfDisplay;
    protected String tripCategory;

    /**
     * Gets the value of the typeOfDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfDisplay() {
        return typeOfDisplay;
    }

    /**
     * Sets the value of the typeOfDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfDisplay(String value) {
        this.typeOfDisplay = value;
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
