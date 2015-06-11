
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Free text qualification
 * 
 * <p>Java class for FreeTextQualificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextQualificationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codedIndicator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="typeOfInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="isoLanguageCode" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextQualificationTypeI", propOrder = {
    "codedIndicator",
    "typeOfInfo",
    "isoLanguageCode"
})
public class FreeTextQualificationTypeI {

    @XmlElement(required = true)
    protected String codedIndicator;
    protected String typeOfInfo;
    protected String isoLanguageCode;

    /**
     * Gets the value of the codedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedIndicator() {
        return codedIndicator;
    }

    /**
     * Sets the value of the codedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedIndicator(String value) {
        this.codedIndicator = value;
    }

    /**
     * Gets the value of the typeOfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfInfo() {
        return typeOfInfo;
    }

    /**
     * Sets the value of the typeOfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfInfo(String value) {
        this.typeOfInfo = value;
    }

    /**
     * Gets the value of the isoLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoLanguageCode() {
        return isoLanguageCode;
    }

    /**
     * Sets the value of the isoLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoLanguageCode(String value) {
        this.isoLanguageCode = value;
    }

}
