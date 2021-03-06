
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection
 * 
 * <p>Java class for SelectionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsInformationType_26805C"/>
 *         &lt;element name="passengerReferenceInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsInformationType_26806C" minOccurs="0"/>
 *         &lt;element name="highlightingInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "generalInfo",
    "passengerReferenceInfo",
    "highlightingInfo"
})
public class SelectionDetailsTypeI {

    @XmlElement(required = true)
    protected SelectionDetailsInformationType26805C generalInfo;
    protected SelectionDetailsInformationType26806C passengerReferenceInfo;
    protected SelectionDetailsInformationTypeI highlightingInfo;

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationType26805C }
     *     
     */
    public SelectionDetailsInformationType26805C getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationType26805C }
     *     
     */
    public void setGeneralInfo(SelectionDetailsInformationType26805C value) {
        this.generalInfo = value;
    }

    /**
     * Gets the value of the passengerReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationType26806C }
     *     
     */
    public SelectionDetailsInformationType26806C getPassengerReferenceInfo() {
        return passengerReferenceInfo;
    }

    /**
     * Sets the value of the passengerReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationType26806C }
     *     
     */
    public void setPassengerReferenceInfo(SelectionDetailsInformationType26806C value) {
        this.passengerReferenceInfo = value;
    }

    /**
     * Gets the value of the highlightingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationTypeI }
     *     
     */
    public SelectionDetailsInformationTypeI getHighlightingInfo() {
        return highlightingInfo;
    }

    /**
     * Sets the value of the highlightingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationTypeI }
     *     
     */
    public void setHighlightingInfo(SelectionDetailsInformationTypeI value) {
        this.highlightingInfo = value;
    }

}
