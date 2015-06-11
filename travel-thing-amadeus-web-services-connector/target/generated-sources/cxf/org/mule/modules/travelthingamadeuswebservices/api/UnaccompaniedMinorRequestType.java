
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Availability request for unaccompanied minors
 * 
 * <p>Java class for UnaccompaniedMinorRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnaccompaniedMinorRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="umAge" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NumericInteger_Length1To2" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnaccompaniedMinorRequestType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "umAge"
})
public class UnaccompaniedMinorRequestType {

    @XmlElement(required = true)
    protected List<BigInteger> umAge;

    /**
     * Gets the value of the umAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getUmAge() {
        if (umAge == null) {
            umAge = new ArrayList<BigInteger>();
        }
        return this.umAge;
    }

    /**
     * Sets the value of the umAge property.
     * 
     * @param umAge
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmAge(List<BigInteger> umAge) {
        this.umAge = umAge;
    }

}
