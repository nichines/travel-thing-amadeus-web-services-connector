
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * <p>Java class for TravellerDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="uniqueCustomerIdentifier" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="title" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To70" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsTypeI", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "givenName",
    "type",
    "uniqueCustomerIdentifier",
    "infantIndicator",
    "title"
})
public class TravellerDetailsTypeI {

    protected String givenName;
    protected String type;
    protected String uniqueCustomerIdentifier;
    protected String infantIndicator;
    protected List<String> title;

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the uniqueCustomerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /**
     * Sets the value of the uniqueCustomerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCustomerIdentifier(String value) {
        this.uniqueCustomerIdentifier = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<String>();
        }
        return this.title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param title
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(List<String> title) {
        this.title = title;
    }

}
