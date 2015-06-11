
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of cabins option
 * 
 * <p>Java class for CabinDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDesignation" type="{http://xml.amadeus.com/SATRQT_07_1_1A}CabinClassDesignationType" minOccurs="0"/>
 *         &lt;element name="orderClassesByCabin" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDescriptionType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "cabinDesignation",
    "orderClassesByCabin"
})
public class CabinDescriptionType {

    protected CabinClassDesignationType2 cabinDesignation;
    protected String orderClassesByCabin;

    /**
     * Gets the value of the cabinDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationType2 }
     *     
     */
    public CabinClassDesignationType2 getCabinDesignation() {
        return cabinDesignation;
    }

    /**
     * Sets the value of the cabinDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationType2 }
     *     
     */
    public void setCabinDesignation(CabinClassDesignationType2 value) {
        this.cabinDesignation = value;
    }

    /**
     * Gets the value of the orderClassesByCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderClassesByCabin() {
        return orderClassesByCabin;
    }

    /**
     * Sets the value of the orderClassesByCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderClassesByCabin(String value) {
        this.orderClassesByCabin = value;
    }

}
