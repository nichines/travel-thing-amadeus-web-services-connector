
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the availability type
 * 
 * <p>Java class for ProductTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfRequest" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length2To2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "typeOfRequest"
})
public class ProductTypeDetailsType {

    @XmlElement(required = true)
    protected String typeOfRequest;

    /**
     * Gets the value of the typeOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    /**
     * Sets the value of the typeOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfRequest(String value) {
        this.typeOfRequest = value;
    }

}
