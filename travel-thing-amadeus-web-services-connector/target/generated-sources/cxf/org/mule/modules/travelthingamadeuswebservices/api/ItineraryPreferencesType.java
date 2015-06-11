
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify itinerary preferences.
 * 
 * <p>Java class for ItineraryPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferredAirport" type="{http://xml.amadeus.com/SATRSP_07_1_1A}PreferredAirportsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="embargoedTransit" type="{http://xml.amadeus.com/SATRSP_07_1_1A}EmbargoedTransitsType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPreferencesType", propOrder = {
    "preferredAirport",
    "embargoedTransit"
})
public class ItineraryPreferencesType {

    protected List<PreferredAirportsType> preferredAirport;
    protected List<EmbargoedTransitsType> embargoedTransit;

    /**
     * Gets the value of the preferredAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferredAirportsType }
     * 
     * 
     */
    public List<PreferredAirportsType> getPreferredAirport() {
        if (preferredAirport == null) {
            preferredAirport = new ArrayList<PreferredAirportsType>();
        }
        return this.preferredAirport;
    }

    /**
     * Gets the value of the embargoedTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embargoedTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbargoedTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmbargoedTransitsType }
     * 
     * 
     */
    public List<EmbargoedTransitsType> getEmbargoedTransit() {
        if (embargoedTransit == null) {
            embargoedTransit = new ArrayList<EmbargoedTransitsType>();
        }
        return this.embargoedTransit;
    }

    /**
     * Sets the value of the preferredAirport property.
     * 
     * @param preferredAirport
     *     allowed object is
     *     {@link PreferredAirportsType }
     *     
     */
    public void setPreferredAirport(List<PreferredAirportsType> preferredAirport) {
        this.preferredAirport = preferredAirport;
    }

    /**
     * Sets the value of the embargoedTransit property.
     * 
     * @param embargoedTransit
     *     allowed object is
     *     {@link EmbargoedTransitsType }
     *     
     */
    public void setEmbargoedTransit(List<EmbargoedTransitsType> embargoedTransit) {
        this.embargoedTransit = embargoedTransit;
    }

}
