
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of a class type
 * 
 * <p>Java class for ProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceClass" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="nightModifierOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "serviceClass",
    "nightModifierOption"
})
public class ProductDetailsType {

    @XmlElement(required = true)
    protected String serviceClass;
    protected String nightModifierOption;

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the nightModifierOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNightModifierOption() {
        return nightModifierOption;
    }

    /**
     * Sets the value of the nightModifierOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNightModifierOption(String value) {
        this.nightModifierOption = value;
    }

}
