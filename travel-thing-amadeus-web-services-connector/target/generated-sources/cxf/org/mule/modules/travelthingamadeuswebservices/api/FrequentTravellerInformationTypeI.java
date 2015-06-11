
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information.
 * 
 * <p>Java class for FrequentTravellerInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}FrequentTravellerIdentificationTypeI"/>
 *         &lt;element name="otherFrequentTravellerDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}FrequentTravellerIdentificationTypeI" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerInformationTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "frequentTravellerDetails",
    "otherFrequentTravellerDetails"
})
public class FrequentTravellerInformationTypeI {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeI frequentTravellerDetails;
    protected List<FrequentTravellerIdentificationTypeI> otherFrequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public FrequentTravellerIdentificationTypeI getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setFrequentTravellerDetails(FrequentTravellerIdentificationTypeI value) {
        this.frequentTravellerDetails = value;
    }

    /**
     * Gets the value of the otherFrequentTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFrequentTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFrequentTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTravellerIdentificationTypeI }
     * 
     * 
     */
    public List<FrequentTravellerIdentificationTypeI> getOtherFrequentTravellerDetails() {
        if (otherFrequentTravellerDetails == null) {
            otherFrequentTravellerDetails = new ArrayList<FrequentTravellerIdentificationTypeI>();
        }
        return this.otherFrequentTravellerDetails;
    }

    /**
     * Sets the value of the otherFrequentTravellerDetails property.
     * 
     * @param otherFrequentTravellerDetails
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setOtherFrequentTravellerDetails(List<FrequentTravellerIdentificationTypeI> otherFrequentTravellerDetails) {
        this.otherFrequentTravellerDetails = otherFrequentTravellerDetails;
    }

}
