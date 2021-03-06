
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify Cabin Eligibility rules.
 * 
 * <p>Java class for CabinEligibilityRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinEligibilityRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalCabinPreferences" type="{http://xml.amadeus.com/SATRSP_07_1_1A}GeneralCabinPrefRulesType" minOccurs="0"/>
 *         &lt;element name="cabinExclusion" type="{http://xml.amadeus.com/SATRSP_07_1_1A}GeneralCabinExclusionsRulesType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="domesticFlightCabin" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length2To2" minOccurs="0"/>
 *         &lt;element name="eftCabinPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ElapsedFlyingTimeRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinEligibilityRulesType", propOrder = {
    "generalCabinPreferences",
    "cabinExclusion",
    "domesticFlightCabin",
    "eftCabinPreference"
})
public class CabinEligibilityRulesType {

    protected GeneralCabinPrefRulesType generalCabinPreferences;
    protected List<GeneralCabinExclusionsRulesType> cabinExclusion;
    protected String domesticFlightCabin;
    protected ElapsedFlyingTimeRulesType eftCabinPreference;

    /**
     * Gets the value of the generalCabinPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCabinPrefRulesType }
     *     
     */
    public GeneralCabinPrefRulesType getGeneralCabinPreferences() {
        return generalCabinPreferences;
    }

    /**
     * Sets the value of the generalCabinPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCabinPrefRulesType }
     *     
     */
    public void setGeneralCabinPreferences(GeneralCabinPrefRulesType value) {
        this.generalCabinPreferences = value;
    }

    /**
     * Gets the value of the cabinExclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinExclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinExclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralCabinExclusionsRulesType }
     * 
     * 
     */
    public List<GeneralCabinExclusionsRulesType> getCabinExclusion() {
        if (cabinExclusion == null) {
            cabinExclusion = new ArrayList<GeneralCabinExclusionsRulesType>();
        }
        return this.cabinExclusion;
    }

    /**
     * Gets the value of the domesticFlightCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticFlightCabin() {
        return domesticFlightCabin;
    }

    /**
     * Sets the value of the domesticFlightCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticFlightCabin(String value) {
        this.domesticFlightCabin = value;
    }

    /**
     * Gets the value of the eftCabinPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ElapsedFlyingTimeRulesType }
     *     
     */
    public ElapsedFlyingTimeRulesType getEftCabinPreference() {
        return eftCabinPreference;
    }

    /**
     * Sets the value of the eftCabinPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElapsedFlyingTimeRulesType }
     *     
     */
    public void setEftCabinPreference(ElapsedFlyingTimeRulesType value) {
        this.eftCabinPreference = value;
    }

    /**
     * Sets the value of the cabinExclusion property.
     * 
     * @param cabinExclusion
     *     allowed object is
     *     {@link GeneralCabinExclusionsRulesType }
     *     
     */
    public void setCabinExclusion(List<GeneralCabinExclusionsRulesType> cabinExclusion) {
        this.cabinExclusion = cabinExclusion;
    }

}
