
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of connections option
 * 
 * <p>Java class for ConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstConnection" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ConnectPointDetailsType"/>
 *         &lt;element name="secondConnection" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ConnectPointDetailsType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "firstConnection",
    "secondConnection"
})
public class ConnectionType {

    @XmlElement(required = true)
    protected ConnectPointDetailsType firstConnection;
    protected List<ConnectPointDetailsType> secondConnection;

    /**
     * Gets the value of the firstConnection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectPointDetailsType }
     *     
     */
    public ConnectPointDetailsType getFirstConnection() {
        return firstConnection;
    }

    /**
     * Sets the value of the firstConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectPointDetailsType }
     *     
     */
    public void setFirstConnection(ConnectPointDetailsType value) {
        this.firstConnection = value;
    }

    /**
     * Gets the value of the secondConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectPointDetailsType }
     * 
     * 
     */
    public List<ConnectPointDetailsType> getSecondConnection() {
        if (secondConnection == null) {
            secondConnection = new ArrayList<ConnectPointDetailsType>();
        }
        return this.secondConnection;
    }

    /**
     * Sets the value of the secondConnection property.
     * 
     * @param secondConnection
     *     allowed object is
     *     {@link ConnectPointDetailsType }
     *     
     */
    public void setSecondConnection(List<ConnectPointDetailsType> secondConnection) {
        this.secondConnection = secondConnection;
    }

}
