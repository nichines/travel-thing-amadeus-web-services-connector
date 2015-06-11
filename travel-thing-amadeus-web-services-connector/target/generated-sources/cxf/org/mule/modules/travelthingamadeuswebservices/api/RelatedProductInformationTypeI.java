
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate quantity and action required in relation to a product
 * 
 * <p>Java class for RelatedProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedProductInformationTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "numberOfPassengers"
})
public class RelatedProductInformationTypeI {

    protected BigInteger numberOfPassengers;

    /**
     * Gets the value of the numberOfPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Sets the value of the numberOfPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPassengers(BigInteger value) {
        this.numberOfPassengers = value;
    }

}
