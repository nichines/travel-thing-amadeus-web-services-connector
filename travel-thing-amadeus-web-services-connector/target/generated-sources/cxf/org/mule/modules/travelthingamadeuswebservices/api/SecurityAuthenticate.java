
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversationClt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="senderIdentification">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="recipientIdentification">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="senderInterchangeControlReference">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="recipientInterchangeControlReference">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userIdentifier" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originIdentification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sourceOffice">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="originatorTypeCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="originator">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dutyCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dutyCodeDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="referenceQualifier">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="referenceIdentifier">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="systemDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workstationId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="organizationDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="organizationId">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="idQualifier" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="passwordInfo" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataLength">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dataType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="binaryData">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="99999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fullLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workstationPos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="locationType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="locationDescription" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qualifier" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="17"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="firstLocationDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="25"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qualifier" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="17"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="locationInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="facilityDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="identifier" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="applicationId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="internalId">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="seqNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversationClt",
    "userIdentifier",
    "dutyCode",
    "systemDetails",
    "passwordInfo",
    "fullLocation",
    "applicationId"
})
@XmlRootElement(name = "Security_Authenticate", namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
public class SecurityAuthenticate {

    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected SecurityAuthenticate.ConversationClt conversationClt;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
    protected List<SecurityAuthenticate.UserIdentifier> userIdentifier;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected SecurityAuthenticate.DutyCode dutyCode;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected SecurityAuthenticate.SystemDetails systemDetails;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected List<SecurityAuthenticate.PasswordInfo> passwordInfo;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected SecurityAuthenticate.FullLocation fullLocation;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
    protected SecurityAuthenticate.ApplicationId applicationId;

    /**
     * Gets the value of the conversationClt property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.ConversationClt }
     *     
     */
    public SecurityAuthenticate.ConversationClt getConversationClt() {
        return conversationClt;
    }

    /**
     * Sets the value of the conversationClt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.ConversationClt }
     *     
     */
    public void setConversationClt(SecurityAuthenticate.ConversationClt value) {
        this.conversationClt = value;
    }

    /**
     * Gets the value of the userIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityAuthenticate.UserIdentifier }
     * 
     * 
     */
    public List<SecurityAuthenticate.UserIdentifier> getUserIdentifier() {
        if (userIdentifier == null) {
            userIdentifier = new ArrayList<SecurityAuthenticate.UserIdentifier>();
        }
        return this.userIdentifier;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.DutyCode }
     *     
     */
    public SecurityAuthenticate.DutyCode getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.DutyCode }
     *     
     */
    public void setDutyCode(SecurityAuthenticate.DutyCode value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the systemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.SystemDetails }
     *     
     */
    public SecurityAuthenticate.SystemDetails getSystemDetails() {
        return systemDetails;
    }

    /**
     * Sets the value of the systemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.SystemDetails }
     *     
     */
    public void setSystemDetails(SecurityAuthenticate.SystemDetails value) {
        this.systemDetails = value;
    }

    /**
     * Gets the value of the passwordInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityAuthenticate.PasswordInfo }
     * 
     * 
     */
    public List<SecurityAuthenticate.PasswordInfo> getPasswordInfo() {
        if (passwordInfo == null) {
            passwordInfo = new ArrayList<SecurityAuthenticate.PasswordInfo>();
        }
        return this.passwordInfo;
    }

    /**
     * Gets the value of the fullLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.FullLocation }
     *     
     */
    public SecurityAuthenticate.FullLocation getFullLocation() {
        return fullLocation;
    }

    /**
     * Sets the value of the fullLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.FullLocation }
     *     
     */
    public void setFullLocation(SecurityAuthenticate.FullLocation value) {
        this.fullLocation = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuthenticate.ApplicationId }
     *     
     */
    public SecurityAuthenticate.ApplicationId getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuthenticate.ApplicationId }
     *     
     */
    public void setApplicationId(SecurityAuthenticate.ApplicationId value) {
        this.applicationId = value;
    }

    /**
     * Sets the value of the userIdentifier property.
     * 
     * @param userIdentifier
     *     allowed object is
     *     {@link SecurityAuthenticate.UserIdentifier }
     *     
     */
    public void setUserIdentifier(List<SecurityAuthenticate.UserIdentifier> userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    /**
     * Sets the value of the passwordInfo property.
     * 
     * @param passwordInfo
     *     allowed object is
     *     {@link SecurityAuthenticate.PasswordInfo }
     *     
     */
    public void setPasswordInfo(List<SecurityAuthenticate.PasswordInfo> passwordInfo) {
        this.passwordInfo = passwordInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="applicationDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="internalId">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="seqNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicationDetails"
    })
    public static class ApplicationId {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected SecurityAuthenticate.ApplicationId.ApplicationDetails applicationDetails;

        /**
         * Gets the value of the applicationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.ApplicationId.ApplicationDetails }
         *     
         */
        public SecurityAuthenticate.ApplicationId.ApplicationDetails getApplicationDetails() {
            return applicationDetails;
        }

        /**
         * Sets the value of the applicationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.ApplicationId.ApplicationDetails }
         *     
         */
        public void setApplicationDetails(SecurityAuthenticate.ApplicationId.ApplicationDetails value) {
            this.applicationDetails = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="internalId">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="seqNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "internalId",
            "seqNumber"
        })
        public static class ApplicationDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String internalId;
            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
            protected String seqNumber;

            /**
             * Gets the value of the internalId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternalId() {
                return internalId;
            }

            /**
             * Sets the value of the internalId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternalId(String value) {
                this.internalId = value;
            }

            /**
             * Gets the value of the seqNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeqNumber() {
                return seqNumber;
            }

            /**
             * Sets the value of the seqNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeqNumber(String value) {
                this.seqNumber = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="senderIdentification">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="recipientIdentification">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="senderInterchangeControlReference">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="recipientInterchangeControlReference">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "senderIdentification",
        "recipientIdentification",
        "senderInterchangeControlReference",
        "recipientInterchangeControlReference"
    })
    public static class ConversationClt {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String senderIdentification;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String recipientIdentification;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String senderInterchangeControlReference;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String recipientInterchangeControlReference;

        /**
         * Gets the value of the senderIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderIdentification() {
            return senderIdentification;
        }

        /**
         * Sets the value of the senderIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderIdentification(String value) {
            this.senderIdentification = value;
        }

        /**
         * Gets the value of the recipientIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecipientIdentification() {
            return recipientIdentification;
        }

        /**
         * Sets the value of the recipientIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecipientIdentification(String value) {
            this.recipientIdentification = value;
        }

        /**
         * Gets the value of the senderInterchangeControlReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderInterchangeControlReference() {
            return senderInterchangeControlReference;
        }

        /**
         * Sets the value of the senderInterchangeControlReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderInterchangeControlReference(String value) {
            this.senderInterchangeControlReference = value;
        }

        /**
         * Gets the value of the recipientInterchangeControlReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecipientInterchangeControlReference() {
            return recipientInterchangeControlReference;
        }

        /**
         * Sets the value of the recipientInterchangeControlReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecipientInterchangeControlReference(String value) {
            this.recipientInterchangeControlReference = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dutyCodeDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="referenceQualifier">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="referenceIdentifier">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dutyCodeDetails"
    })
    public static class DutyCode {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected SecurityAuthenticate.DutyCode.DutyCodeDetails dutyCodeDetails;

        /**
         * Gets the value of the dutyCodeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.DutyCode.DutyCodeDetails }
         *     
         */
        public SecurityAuthenticate.DutyCode.DutyCodeDetails getDutyCodeDetails() {
            return dutyCodeDetails;
        }

        /**
         * Sets the value of the dutyCodeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.DutyCode.DutyCodeDetails }
         *     
         */
        public void setDutyCodeDetails(SecurityAuthenticate.DutyCode.DutyCodeDetails value) {
            this.dutyCodeDetails = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="referenceQualifier">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="referenceIdentifier">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "referenceQualifier",
            "referenceIdentifier"
        })
        public static class DutyCodeDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String referenceQualifier;
            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String referenceIdentifier;

            /**
             * Gets the value of the referenceQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceQualifier() {
                return referenceQualifier;
            }

            /**
             * Sets the value of the referenceQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceQualifier(String value) {
                this.referenceQualifier = value;
            }

            /**
             * Gets the value of the referenceIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceIdentifier() {
                return referenceIdentifier;
            }

            /**
             * Sets the value of the referenceIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceIdentifier(String value) {
                this.referenceIdentifier = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="workstationPos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="locationType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="locationDescription" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="qualifier" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="17"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="firstLocationDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="25"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="qualifier" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="17"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="locationInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="facilityDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="identifier" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workstationPos",
        "locationInfo"
    })
    public static class FullLocation {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected SecurityAuthenticate.FullLocation.WorkstationPos workstationPos;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
        protected SecurityAuthenticate.FullLocation.LocationInfo locationInfo;

        /**
         * Gets the value of the workstationPos property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.FullLocation.WorkstationPos }
         *     
         */
        public SecurityAuthenticate.FullLocation.WorkstationPos getWorkstationPos() {
            return workstationPos;
        }

        /**
         * Sets the value of the workstationPos property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.FullLocation.WorkstationPos }
         *     
         */
        public void setWorkstationPos(SecurityAuthenticate.FullLocation.WorkstationPos value) {
            this.workstationPos = value;
        }

        /**
         * Gets the value of the locationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.FullLocation.LocationInfo }
         *     
         */
        public SecurityAuthenticate.FullLocation.LocationInfo getLocationInfo() {
            return locationInfo;
        }

        /**
         * Sets the value of the locationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.FullLocation.LocationInfo }
         *     
         */
        public void setLocationInfo(SecurityAuthenticate.FullLocation.LocationInfo value) {
            this.locationInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="facilityDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="identifier" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "facilityDetails"
        })
        public static class LocationInfo {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected SecurityAuthenticate.FullLocation.LocationInfo.FacilityDetails facilityDetails;

            /**
             * Gets the value of the facilityDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SecurityAuthenticate.FullLocation.LocationInfo.FacilityDetails }
             *     
             */
            public SecurityAuthenticate.FullLocation.LocationInfo.FacilityDetails getFacilityDetails() {
                return facilityDetails;
            }

            /**
             * Sets the value of the facilityDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurityAuthenticate.FullLocation.LocationInfo.FacilityDetails }
             *     
             */
            public void setFacilityDetails(SecurityAuthenticate.FullLocation.LocationInfo.FacilityDetails value) {
                this.facilityDetails = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="identifier" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "identifier"
            })
            public static class FacilityDetails {

                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
                protected String type;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
                protected String identifier;

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
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="locationType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="locationDescription" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="qualifier" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="17"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="firstLocationDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="25"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="qualifier" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="17"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "locationType",
            "locationDescription",
            "firstLocationDetails"
        })
        public static class WorkstationPos {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String locationType;
            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
            protected SecurityAuthenticate.FullLocation.WorkstationPos.LocationDescription locationDescription;
            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
            protected SecurityAuthenticate.FullLocation.WorkstationPos.FirstLocationDetails firstLocationDetails;

            /**
             * Gets the value of the locationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationType() {
                return locationType;
            }

            /**
             * Sets the value of the locationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationType(String value) {
                this.locationType = value;
            }

            /**
             * Gets the value of the locationDescription property.
             * 
             * @return
             *     possible object is
             *     {@link SecurityAuthenticate.FullLocation.WorkstationPos.LocationDescription }
             *     
             */
            public SecurityAuthenticate.FullLocation.WorkstationPos.LocationDescription getLocationDescription() {
                return locationDescription;
            }

            /**
             * Sets the value of the locationDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurityAuthenticate.FullLocation.WorkstationPos.LocationDescription }
             *     
             */
            public void setLocationDescription(SecurityAuthenticate.FullLocation.WorkstationPos.LocationDescription value) {
                this.locationDescription = value;
            }

            /**
             * Gets the value of the firstLocationDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SecurityAuthenticate.FullLocation.WorkstationPos.FirstLocationDetails }
             *     
             */
            public SecurityAuthenticate.FullLocation.WorkstationPos.FirstLocationDetails getFirstLocationDetails() {
                return firstLocationDetails;
            }

            /**
             * Sets the value of the firstLocationDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurityAuthenticate.FullLocation.WorkstationPos.FirstLocationDetails }
             *     
             */
            public void setFirstLocationDetails(SecurityAuthenticate.FullLocation.WorkstationPos.FirstLocationDetails value) {
                this.firstLocationDetails = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="25"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qualifier" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="17"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "qualifier"
            })
            public static class FirstLocationDetails {

                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
                protected String code;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
                protected String qualifier;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qualifier" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="17"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "qualifier"
            })
            public static class LocationDescription {

                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
                protected String code;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
                protected String qualifier;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dataLength">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dataType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="binaryData">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="99999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataLength",
        "dataType",
        "binaryData"
    })
    public static class PasswordInfo {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected BigDecimal dataLength;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String dataType;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String binaryData;

        /**
         * Gets the value of the dataLength property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDataLength() {
            return dataLength;
        }

        /**
         * Sets the value of the dataLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDataLength(BigDecimal value) {
            this.dataLength = value;
        }

        /**
         * Gets the value of the dataType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataType() {
            return dataType;
        }

        /**
         * Sets the value of the dataType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataType(String value) {
            this.dataType = value;
        }

        /**
         * Gets the value of the binaryData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinaryData() {
            return binaryData;
        }

        /**
         * Sets the value of the binaryData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinaryData(String value) {
            this.binaryData = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="workstationId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="organizationDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="organizationId">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="idQualifier" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workstationId",
        "organizationDetails",
        "idQualifier"
    })
    public static class SystemDetails {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
        protected String workstationId;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
        protected SecurityAuthenticate.SystemDetails.OrganizationDetails organizationDetails;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
        protected String idQualifier;

        /**
         * Gets the value of the workstationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkstationId() {
            return workstationId;
        }

        /**
         * Sets the value of the workstationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkstationId(String value) {
            this.workstationId = value;
        }

        /**
         * Gets the value of the organizationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.SystemDetails.OrganizationDetails }
         *     
         */
        public SecurityAuthenticate.SystemDetails.OrganizationDetails getOrganizationDetails() {
            return organizationDetails;
        }

        /**
         * Sets the value of the organizationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.SystemDetails.OrganizationDetails }
         *     
         */
        public void setOrganizationDetails(SecurityAuthenticate.SystemDetails.OrganizationDetails value) {
            this.organizationDetails = value;
        }

        /**
         * Gets the value of the idQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdQualifier() {
            return idQualifier;
        }

        /**
         * Sets the value of the idQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdQualifier(String value) {
            this.idQualifier = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="organizationId">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "organizationId"
        })
        public static class OrganizationDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String organizationId;

            /**
             * Gets the value of the organizationId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganizationId() {
                return organizationId;
            }

            /**
             * Sets the value of the organizationId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganizationId(String value) {
                this.organizationId = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="originIdentification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sourceOffice">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="originatorTypeCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="originator">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originIdentification",
        "originatorTypeCode",
        "originator"
    })
    public static class UserIdentifier {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A")
        protected SecurityAuthenticate.UserIdentifier.OriginIdentification originIdentification;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String originatorTypeCode;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
        protected String originator;

        /**
         * Gets the value of the originIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityAuthenticate.UserIdentifier.OriginIdentification }
         *     
         */
        public SecurityAuthenticate.UserIdentifier.OriginIdentification getOriginIdentification() {
            return originIdentification;
        }

        /**
         * Sets the value of the originIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityAuthenticate.UserIdentifier.OriginIdentification }
         *     
         */
        public void setOriginIdentification(SecurityAuthenticate.UserIdentifier.OriginIdentification value) {
            this.originIdentification = value;
        }

        /**
         * Gets the value of the originatorTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginatorTypeCode() {
            return originatorTypeCode;
        }

        /**
         * Sets the value of the originatorTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginatorTypeCode(String value) {
            this.originatorTypeCode = value;
        }

        /**
         * Gets the value of the originator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginator() {
            return originator;
        }

        /**
         * Sets the value of the originator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginator(String value) {
            this.originator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sourceOffice">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sourceOffice"
        })
        public static class OriginIdentification {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSLQ_06_1_1A", required = true)
            protected String sourceOffice;

            /**
             * Gets the value of the sourceOffice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceOffice() {
                return sourceOffice;
            }

            /**
             * Sets the value of the sourceOffice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceOffice(String value) {
                this.sourceOffice = value;
            }

        }

    }

}
