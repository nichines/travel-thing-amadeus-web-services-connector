
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurement value and relevant minimum and maximum tolerances in that order.
 * 
 * <p>Java class for ValueRangeTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueRangeTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NumericInteger_Length1To18"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueRangeTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "unit",
    "value"
})
public class ValueRangeTypeI {

    @XmlElement(required = true)
    protected String unit;
    @XmlElement(required = true)
    protected BigInteger value;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

}
