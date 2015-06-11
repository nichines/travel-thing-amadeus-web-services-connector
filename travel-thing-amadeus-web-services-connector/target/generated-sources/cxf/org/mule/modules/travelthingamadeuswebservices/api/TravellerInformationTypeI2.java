
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * <p>Java class for TravellerInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}TravellerSurnameInformationTypeI"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}TravellerDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationTypeI2 {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI2 paxDetails;
    protected List<TravellerDetailsTypeI2> otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI2 }
     *     
     */
    public TravellerSurnameInformationTypeI2 getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI2 }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationTypeI2 value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsTypeI2 }
     * 
     * 
     */
    public List<TravellerDetailsTypeI2> getOtherPaxDetails() {
        if (otherPaxDetails == null) {
            otherPaxDetails = new ArrayList<TravellerDetailsTypeI2>();
        }
        return this.otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param otherPaxDetails
     *     allowed object is
     *     {@link TravellerDetailsTypeI2 }
     *     
     */
    public void setOtherPaxDetails(List<TravellerDetailsTypeI2> otherPaxDetails) {
        this.otherPaxDetails = otherPaxDetails;
    }

}
