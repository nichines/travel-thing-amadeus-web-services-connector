
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a travellers and personal details relating to the taravellers
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
 *         &lt;element name="nameInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerSurnameInformationTypeI"/>
 *         &lt;element name="otherInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerDetailsTypeI" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationTypeI", propOrder = {
    "nameInformation",
    "otherInformation"
})
public class TravellerInformationTypeI2 {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI2 nameInformation;
    protected List<TravellerDetailsTypeI2> otherInformation;

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI2 }
     *     
     */
    public TravellerSurnameInformationTypeI2 getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI2 }
     *     
     */
    public void setNameInformation(TravellerSurnameInformationTypeI2 value) {
        this.nameInformation = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsTypeI2 }
     * 
     * 
     */
    public List<TravellerDetailsTypeI2> getOtherInformation() {
        if (otherInformation == null) {
            otherInformation = new ArrayList<TravellerDetailsTypeI2>();
        }
        return this.otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param otherInformation
     *     allowed object is
     *     {@link TravellerDetailsTypeI2 }
     *     
     */
    public void setOtherInformation(List<TravellerDetailsTypeI2> otherInformation) {
        this.otherInformation = otherInformation;
    }

}
