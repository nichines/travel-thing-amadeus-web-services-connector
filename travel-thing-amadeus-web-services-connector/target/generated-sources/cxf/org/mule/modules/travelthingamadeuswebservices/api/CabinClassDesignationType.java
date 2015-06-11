
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Cabin class designation
 * 
 * <p>Java class for CabinClassDesignationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassDesignationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinClassOfService" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassDesignationType", propOrder = {
    "cabinClassOfService"
})
public class CabinClassDesignationType {

    protected BigInteger cabinClassOfService;

    /**
     * Gets the value of the cabinClassOfService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinClassOfService() {
        return cabinClassOfService;
    }

    /**
     * Sets the value of the cabinClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinClassOfService(BigInteger value) {
        this.cabinClassOfService = value;
    }

}
