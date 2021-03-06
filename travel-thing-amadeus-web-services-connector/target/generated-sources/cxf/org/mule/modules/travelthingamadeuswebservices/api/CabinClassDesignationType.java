
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product class, number and designator which defines a cabin in a means of transport.
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
 *         &lt;element name="expandCabinIndicator" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cabinClassOfServiceList" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NumericInteger_Length1To1" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassDesignationType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "expandCabinIndicator",
    "cabinClassOfServiceList"
})
public class CabinClassDesignationType {

    protected String expandCabinIndicator;
    @XmlElement(required = true)
    protected List<BigInteger> cabinClassOfServiceList;

    /**
     * Gets the value of the expandCabinIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpandCabinIndicator() {
        return expandCabinIndicator;
    }

    /**
     * Sets the value of the expandCabinIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpandCabinIndicator(String value) {
        this.expandCabinIndicator = value;
    }

    /**
     * Gets the value of the cabinClassOfServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinClassOfServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinClassOfServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getCabinClassOfServiceList() {
        if (cabinClassOfServiceList == null) {
            cabinClassOfServiceList = new ArrayList<BigInteger>();
        }
        return this.cabinClassOfServiceList;
    }

    /**
     * Sets the value of the cabinClassOfServiceList property.
     * 
     * @param cabinClassOfServiceList
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinClassOfServiceList(List<BigInteger> cabinClassOfServiceList) {
        this.cabinClassOfServiceList = cabinClassOfServiceList;
    }

}
