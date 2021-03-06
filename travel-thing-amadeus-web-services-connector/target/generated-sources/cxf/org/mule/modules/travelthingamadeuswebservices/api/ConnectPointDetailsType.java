
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the first connection point and time
 * 
 * <p>Java class for ConnectPointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectPointDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *         &lt;element name="time" type="{http://xml.amadeus.com/SATRQT_07_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="indicatorList" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectPointDetailsType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "location",
    "time",
    "indicatorList"
})
public class ConnectPointDetailsType {

    protected String location;
    protected String time;
    protected List<String> indicatorList;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the indicatorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicatorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicatorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndicatorList() {
        if (indicatorList == null) {
            indicatorList = new ArrayList<String>();
        }
        return this.indicatorList;
    }

    /**
     * Sets the value of the indicatorList property.
     * 
     * @param indicatorList
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorList(List<String> indicatorList) {
        this.indicatorList = indicatorList;
    }

}
