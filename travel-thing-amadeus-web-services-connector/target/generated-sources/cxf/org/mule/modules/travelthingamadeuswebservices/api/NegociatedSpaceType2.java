
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SPECIFY INFORMATION ON A NEGOTIATED SPACE AVAILABILITY
 * 
 * <p>Java class for NegociatedSpaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegociatedSpaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ownerDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OwnerDetailsType"/>
 *         &lt;element name="tourName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *         &lt;element name="tourReference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To40" minOccurs="0"/>
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length6To6" minOccurs="0"/>
 *         &lt;element name="negoStatus" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegociatedSpaceType", propOrder = {
    "ownerDetails",
    "tourName",
    "tourReference",
    "recordLocator",
    "negoStatus"
})
public class NegociatedSpaceType2 {

    @XmlElement(required = true)
    protected OwnerDetailsType ownerDetails;
    protected String tourName;
    protected String tourReference;
    protected String recordLocator;
    protected String negoStatus;

    /**
     * Gets the value of the ownerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerDetailsType }
     *     
     */
    public OwnerDetailsType getOwnerDetails() {
        return ownerDetails;
    }

    /**
     * Sets the value of the ownerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerDetailsType }
     *     
     */
    public void setOwnerDetails(OwnerDetailsType value) {
        this.ownerDetails = value;
    }

    /**
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Gets the value of the tourReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourReference() {
        return tourReference;
    }

    /**
     * Sets the value of the tourReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourReference(String value) {
        this.tourReference = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the negoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegoStatus() {
        return negoStatus;
    }

    /**
     * Sets the value of the negoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegoStatus(String value) {
        this.negoStatus = value;
    }

}
