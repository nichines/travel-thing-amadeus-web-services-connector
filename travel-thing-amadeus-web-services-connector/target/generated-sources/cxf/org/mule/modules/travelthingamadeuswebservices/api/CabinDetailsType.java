
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the physical layout of a cabin class or compartment for seating
 * 
 * <p>Java class for CabinDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDesignation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinClassDesignationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsType", propOrder = {
    "cabinDesignation"
})
public class CabinDetailsType {

    @XmlElement(required = true)
    protected CabinClassDesignationType cabinDesignation;

    /**
     * Gets the value of the cabinDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public CabinClassDesignationType getCabinDesignation() {
        return cabinDesignation;
    }

    /**
     * Sets the value of the cabinDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public void setCabinDesignation(CabinClassDesignationType value) {
        this.cabinDesignation = value;
    }

}
