
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the options of an availability request
 * 
 * <p>Java class for AvailabilityOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productTypeDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ProductTypeDetailsType"/>
 *         &lt;element name="optionInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsInformationType" maxOccurs="13" minOccurs="0"/>
 *         &lt;element name="productAvailability" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ProductIdentificationDetailsType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="typeOfAircraft" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityOptionsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "productTypeDetails",
    "optionInfo",
    "productAvailability",
    "typeOfAircraft"
})
public class AvailabilityOptionsType {

    @XmlElement(required = true)
    protected ProductTypeDetailsType2 productTypeDetails;
    protected List<SelectionDetailsInformationType> optionInfo;
    protected List<ProductIdentificationDetailsType2> productAvailability;
    protected String typeOfAircraft;

    /**
     * Gets the value of the productTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType2 }
     *     
     */
    public ProductTypeDetailsType2 getProductTypeDetails() {
        return productTypeDetails;
    }

    /**
     * Sets the value of the productTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType2 }
     *     
     */
    public void setProductTypeDetails(ProductTypeDetailsType2 value) {
        this.productTypeDetails = value;
    }

    /**
     * Gets the value of the optionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionDetailsInformationType }
     * 
     * 
     */
    public List<SelectionDetailsInformationType> getOptionInfo() {
        if (optionInfo == null) {
            optionInfo = new ArrayList<SelectionDetailsInformationType>();
        }
        return this.optionInfo;
    }

    /**
     * Gets the value of the productAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationDetailsType2 }
     * 
     * 
     */
    public List<ProductIdentificationDetailsType2> getProductAvailability() {
        if (productAvailability == null) {
            productAvailability = new ArrayList<ProductIdentificationDetailsType2>();
        }
        return this.productAvailability;
    }

    /**
     * Gets the value of the typeOfAircraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    /**
     * Sets the value of the typeOfAircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfAircraft(String value) {
        this.typeOfAircraft = value;
    }

    /**
     * Sets the value of the optionInfo property.
     * 
     * @param optionInfo
     *     allowed object is
     *     {@link SelectionDetailsInformationType }
     *     
     */
    public void setOptionInfo(List<SelectionDetailsInformationType> optionInfo) {
        this.optionInfo = optionInfo;
    }

    /**
     * Sets the value of the productAvailability property.
     * 
     * @param productAvailability
     *     allowed object is
     *     {@link ProductIdentificationDetailsType2 }
     *     
     */
    public void setProductAvailability(List<ProductIdentificationDetailsType2> productAvailability) {
        this.productAvailability = productAvailability;
    }

}
