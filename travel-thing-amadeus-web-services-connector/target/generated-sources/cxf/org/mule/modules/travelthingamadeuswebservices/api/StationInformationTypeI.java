
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Station information
 * 
 * <p>Java class for StationInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gate" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="terminal" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="concourseTerminal" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationInformationTypeI", propOrder = {
    "gate",
    "terminal",
    "concourseTerminal"
})
public class StationInformationTypeI {

    protected String gate;
    protected String terminal;
    protected String concourseTerminal;

    /**
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGate(String value) {
        this.gate = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the concourseTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcourseTerminal() {
        return concourseTerminal;
    }

    /**
     * Sets the value of the concourseTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcourseTerminal(String value) {
        this.concourseTerminal = value;
    }

}
