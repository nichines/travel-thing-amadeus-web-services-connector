
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify origins and destinations rules.
 * 
 * <p>Java class for OriginAndDestinationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originAndDestinationPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationPrefType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="originAndDestinationExclusions" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationExclusionsType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationRequestType", propOrder = {
    "originAndDestinationPreference",
    "originAndDestinationExclusions"
})
public class OriginAndDestinationRequestType {

    protected List<OriginAndDestinationPrefType> originAndDestinationPreference;
    protected List<OriginAndDestinationExclusionsType> originAndDestinationExclusions;

    /**
     * Gets the value of the originAndDestinationPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAndDestinationPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAndDestinationPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginAndDestinationPrefType }
     * 
     * 
     */
    public List<OriginAndDestinationPrefType> getOriginAndDestinationPreference() {
        if (originAndDestinationPreference == null) {
            originAndDestinationPreference = new ArrayList<OriginAndDestinationPrefType>();
        }
        return this.originAndDestinationPreference;
    }

    /**
     * Gets the value of the originAndDestinationExclusions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAndDestinationExclusions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAndDestinationExclusions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginAndDestinationExclusionsType }
     * 
     * 
     */
    public List<OriginAndDestinationExclusionsType> getOriginAndDestinationExclusions() {
        if (originAndDestinationExclusions == null) {
            originAndDestinationExclusions = new ArrayList<OriginAndDestinationExclusionsType>();
        }
        return this.originAndDestinationExclusions;
    }

    /**
     * Sets the value of the originAndDestinationPreference property.
     * 
     * @param originAndDestinationPreference
     *     allowed object is
     *     {@link OriginAndDestinationPrefType }
     *     
     */
    public void setOriginAndDestinationPreference(List<OriginAndDestinationPrefType> originAndDestinationPreference) {
        this.originAndDestinationPreference = originAndDestinationPreference;
    }

    /**
     * Sets the value of the originAndDestinationExclusions property.
     * 
     * @param originAndDestinationExclusions
     *     allowed object is
     *     {@link OriginAndDestinationExclusionsType }
     *     
     */
    public void setOriginAndDestinationExclusions(List<OriginAndDestinationExclusionsType> originAndDestinationExclusions) {
        this.originAndDestinationExclusions = originAndDestinationExclusions;
    }

}
