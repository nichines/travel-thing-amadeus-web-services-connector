
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional product details
 * 
 * <p>Java class for AdditionalProductTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfAircraft" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfStops" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="legDuration" type="{http://xml.amadeus.com/SATRSP_07_1_1A}Duration99_HHMM" minOccurs="0"/>
 *         &lt;element name="onTimePercentage" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dayOfOperation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To7" minOccurs="0"/>
 *         &lt;element name="effectivePeriod" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="complexingFlightIndicator" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="firstChangeOfGauge" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *         &lt;element name="secondChangeOfGauge" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *         &lt;element name="thirdChangeOfGauge" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductTypeI", propOrder = {
    "typeOfAircraft",
    "numberOfStops",
    "legDuration",
    "onTimePercentage",
    "dayOfOperation",
    "effectivePeriod",
    "complexingFlightIndicator",
    "firstChangeOfGauge",
    "secondChangeOfGauge",
    "thirdChangeOfGauge"
})
public class AdditionalProductTypeI {

    protected String typeOfAircraft;
    protected BigInteger numberOfStops;
    protected String legDuration;
    protected String onTimePercentage;
    protected BigInteger dayOfOperation;
    protected String effectivePeriod;
    protected String complexingFlightIndicator;
    protected String firstChangeOfGauge;
    protected String secondChangeOfGauge;
    protected String thirdChangeOfGauge;

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
     * Gets the value of the numberOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Sets the value of the numberOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStops(BigInteger value) {
        this.numberOfStops = value;
    }

    /**
     * Gets the value of the legDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegDuration() {
        return legDuration;
    }

    /**
     * Sets the value of the legDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegDuration(String value) {
        this.legDuration = value;
    }

    /**
     * Gets the value of the onTimePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnTimePercentage() {
        return onTimePercentage;
    }

    /**
     * Sets the value of the onTimePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnTimePercentage(String value) {
        this.onTimePercentage = value;
    }

    /**
     * Gets the value of the dayOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOfOperation() {
        return dayOfOperation;
    }

    /**
     * Sets the value of the dayOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOfOperation(BigInteger value) {
        this.dayOfOperation = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectivePeriod(String value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the complexingFlightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexingFlightIndicator() {
        return complexingFlightIndicator;
    }

    /**
     * Sets the value of the complexingFlightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexingFlightIndicator(String value) {
        this.complexingFlightIndicator = value;
    }

    /**
     * Gets the value of the firstChangeOfGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstChangeOfGauge() {
        return firstChangeOfGauge;
    }

    /**
     * Sets the value of the firstChangeOfGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstChangeOfGauge(String value) {
        this.firstChangeOfGauge = value;
    }

    /**
     * Gets the value of the secondChangeOfGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondChangeOfGauge() {
        return secondChangeOfGauge;
    }

    /**
     * Sets the value of the secondChangeOfGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondChangeOfGauge(String value) {
        this.secondChangeOfGauge = value;
    }

    /**
     * Gets the value of the thirdChangeOfGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdChangeOfGauge() {
        return thirdChangeOfGauge;
    }

    /**
     * Sets the value of the thirdChangeOfGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdChangeOfGauge(String value) {
        this.thirdChangeOfGauge = value;
    }

}
