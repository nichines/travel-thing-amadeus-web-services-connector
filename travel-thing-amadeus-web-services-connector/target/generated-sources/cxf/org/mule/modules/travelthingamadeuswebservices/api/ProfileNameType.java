
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a profile name for groups, corporates and agencies.
 * 
 * <p>Java class for ProfileNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correspondingProfileType" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaString_Length1To1"/>
 *         &lt;element name="profileName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length3To60"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileNameType", propOrder = {
    "correspondingProfileType",
    "profileName"
})
public class ProfileNameType {

    @XmlElement(required = true)
    protected String correspondingProfileType;
    @XmlElement(required = true)
    protected String profileName;

    /**
     * Gets the value of the correspondingProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondingProfileType() {
        return correspondingProfileType;
    }

    /**
     * Sets the value of the correspondingProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondingProfileType(String value) {
        this.correspondingProfileType = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

}
