
package org.mule.modules.travelthingamadeuswebservices.api;

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
 *         &lt;element name="messageActionDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}MessageActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="errorOrWarningSection" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorOrWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
 *                   &lt;element name="textInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="singleCityPairInfo" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locationDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationDetailsTypeI"/>
 *                   &lt;element name="cityPairFreeFlowText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="cityPairErrorOrWarning" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cityPairErrorOrWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
 *                             &lt;element name="cityPairErrorOrWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightInfo" maxOccurs="300" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="basicFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityProductInformationType"/>
 *                             &lt;element name="infoOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
 *                             &lt;element name="cabinClassInfo" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cabinInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinDetailsType"/>
 *                                       &lt;element name="infoByCabinOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="additionalFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="trafficRestrictionList" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TrafficRestrictionTypeI" minOccurs="0"/>
 *                             &lt;element name="flightErrorWarningSection" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="flightErrorWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
 *                                       &lt;element name="flightErrorWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="negoSpaceDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NegociatedSpaceType" minOccurs="0"/>
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
 *         &lt;element name="travelChoiceMessage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="summaryAndAvailabilityLines" type="{http://xml.amadeus.com/SATRSP_07_1_1A}PrefAndPolicySummaryAndAvailLineType"/>
 *                   &lt;element name="preferencesSection" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="profileIdentificationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ReservationControlInformationTypeI"/>
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="associationName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProfileNameType" minOccurs="0"/>
 *                             &lt;element name="originAndDestinationRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationRequestType" minOccurs="0"/>
 *                             &lt;element name="cabinRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinEligibilityRulesType" minOccurs="0"/>
 *                             &lt;element name="availabilityInformationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityInformationType" minOccurs="0"/>
 *                             &lt;element name="itineraryPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ItineraryPreferencesType" minOccurs="0"/>
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
    "messageActionDetails",
    "errorOrWarningSection",
    "singleCityPairInfo",
    "travelChoiceMessage"
})
@XmlRootElement(name = "Air_MultiAvailabilityReply")
public class AirMultiAvailabilityReply {

    protected MessageActionDetailsTypeI messageActionDetails;
    protected List<AirMultiAvailabilityReply.ErrorOrWarningSection> errorOrWarningSection;
    protected List<AirMultiAvailabilityReply.SingleCityPairInfo> singleCityPairInfo;
    protected AirMultiAvailabilityReply.TravelChoiceMessage travelChoiceMessage;

    /**
     * Gets the value of the messageActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMessageActionDetails() {
        return messageActionDetails;
    }

    /**
     * Sets the value of the messageActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMessageActionDetails(MessageActionDetailsTypeI value) {
        this.messageActionDetails = value;
    }

    /**
     * Gets the value of the errorOrWarningSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorOrWarningSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorOrWarningSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirMultiAvailabilityReply.ErrorOrWarningSection }
     * 
     * 
     */
    public List<AirMultiAvailabilityReply.ErrorOrWarningSection> getErrorOrWarningSection() {
        if (errorOrWarningSection == null) {
            errorOrWarningSection = new ArrayList<AirMultiAvailabilityReply.ErrorOrWarningSection>();
        }
        return this.errorOrWarningSection;
    }

    /**
     * Gets the value of the singleCityPairInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleCityPairInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleCityPairInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirMultiAvailabilityReply.SingleCityPairInfo }
     * 
     * 
     */
    public List<AirMultiAvailabilityReply.SingleCityPairInfo> getSingleCityPairInfo() {
        if (singleCityPairInfo == null) {
            singleCityPairInfo = new ArrayList<AirMultiAvailabilityReply.SingleCityPairInfo>();
        }
        return this.singleCityPairInfo;
    }

    /**
     * Gets the value of the travelChoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link AirMultiAvailabilityReply.TravelChoiceMessage }
     *     
     */
    public AirMultiAvailabilityReply.TravelChoiceMessage getTravelChoiceMessage() {
        return travelChoiceMessage;
    }

    /**
     * Sets the value of the travelChoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirMultiAvailabilityReply.TravelChoiceMessage }
     *     
     */
    public void setTravelChoiceMessage(AirMultiAvailabilityReply.TravelChoiceMessage value) {
        this.travelChoiceMessage = value;
    }

    /**
     * Sets the value of the errorOrWarningSection property.
     * 
     * @param errorOrWarningSection
     *     allowed object is
     *     {@link AirMultiAvailabilityReply.ErrorOrWarningSection }
     *     
     */
    public void setErrorOrWarningSection(List<AirMultiAvailabilityReply.ErrorOrWarningSection> errorOrWarningSection) {
        this.errorOrWarningSection = errorOrWarningSection;
    }

    /**
     * Sets the value of the singleCityPairInfo property.
     * 
     * @param singleCityPairInfo
     *     allowed object is
     *     {@link AirMultiAvailabilityReply.SingleCityPairInfo }
     *     
     */
    public void setSingleCityPairInfo(List<AirMultiAvailabilityReply.SingleCityPairInfo> singleCityPairInfo) {
        this.singleCityPairInfo = singleCityPairInfo;
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
     *         &lt;element name="errorOrWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
     *         &lt;element name="textInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
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
        "errorOrWarningInfo",
        "textInformation"
    })
    public static class ErrorOrWarningSection {

        @XmlElement(required = true)
        protected ApplicationErrorInformationTypeI errorOrWarningInfo;
        protected InteractiveFreeTextTypeI textInformation;

        /**
         * Gets the value of the errorOrWarningInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public ApplicationErrorInformationTypeI getErrorOrWarningInfo() {
            return errorOrWarningInfo;
        }

        /**
         * Sets the value of the errorOrWarningInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public void setErrorOrWarningInfo(ApplicationErrorInformationTypeI value) {
            this.errorOrWarningInfo = value;
        }

        /**
         * Gets the value of the textInformation property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getTextInformation() {
            return textInformation;
        }

        /**
         * Sets the value of the textInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setTextInformation(InteractiveFreeTextTypeI value) {
            this.textInformation = value;
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
     *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationDetailsTypeI"/>
     *         &lt;element name="cityPairFreeFlowText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="cityPairErrorOrWarning" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cityPairErrorOrWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
     *                   &lt;element name="cityPairErrorOrWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightInfo" maxOccurs="300" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="basicFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityProductInformationType"/>
     *                   &lt;element name="infoOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
     *                   &lt;element name="cabinClassInfo" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cabinInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinDetailsType"/>
     *                             &lt;element name="infoByCabinOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="additionalFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="trafficRestrictionList" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TrafficRestrictionTypeI" minOccurs="0"/>
     *                   &lt;element name="flightErrorWarningSection" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="flightErrorWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
     *                             &lt;element name="flightErrorWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="negoSpaceDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NegociatedSpaceType" minOccurs="0"/>
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
        "locationDetails",
        "cityPairFreeFlowText",
        "cityPairErrorOrWarning",
        "flightInfo"
    })
    public static class SingleCityPairInfo {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI locationDetails;
        protected List<InteractiveFreeTextTypeI> cityPairFreeFlowText;
        protected List<AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning> cityPairErrorOrWarning;
        protected List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo> flightInfo;

        /**
         * Gets the value of the locationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getLocationDetails() {
            return locationDetails;
        }

        /**
         * Sets the value of the locationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setLocationDetails(OriginAndDestinationDetailsTypeI value) {
            this.locationDetails = value;
        }

        /**
         * Gets the value of the cityPairFreeFlowText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cityPairFreeFlowText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCityPairFreeFlowText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractiveFreeTextTypeI }
         * 
         * 
         */
        public List<InteractiveFreeTextTypeI> getCityPairFreeFlowText() {
            if (cityPairFreeFlowText == null) {
                cityPairFreeFlowText = new ArrayList<InteractiveFreeTextTypeI>();
            }
            return this.cityPairFreeFlowText;
        }

        /**
         * Gets the value of the cityPairErrorOrWarning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cityPairErrorOrWarning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCityPairErrorOrWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning }
         * 
         * 
         */
        public List<AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning> getCityPairErrorOrWarning() {
            if (cityPairErrorOrWarning == null) {
                cityPairErrorOrWarning = new ArrayList<AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning>();
            }
            return this.cityPairErrorOrWarning;
        }

        /**
         * Gets the value of the flightInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo }
         * 
         * 
         */
        public List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo> getFlightInfo() {
            if (flightInfo == null) {
                flightInfo = new ArrayList<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo>();
            }
            return this.flightInfo;
        }

        /**
         * Sets the value of the cityPairFreeFlowText property.
         * 
         * @param cityPairFreeFlowText
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setCityPairFreeFlowText(List<InteractiveFreeTextTypeI> cityPairFreeFlowText) {
            this.cityPairFreeFlowText = cityPairFreeFlowText;
        }

        /**
         * Sets the value of the cityPairErrorOrWarning property.
         * 
         * @param cityPairErrorOrWarning
         *     allowed object is
         *     {@link AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning }
         *     
         */
        public void setCityPairErrorOrWarning(List<AirMultiAvailabilityReply.SingleCityPairInfo.CityPairErrorOrWarning> cityPairErrorOrWarning) {
            this.cityPairErrorOrWarning = cityPairErrorOrWarning;
        }

        /**
         * Sets the value of the flightInfo property.
         * 
         * @param flightInfo
         *     allowed object is
         *     {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo }
         *     
         */
        public void setFlightInfo(List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo> flightInfo) {
            this.flightInfo = flightInfo;
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
         *         &lt;element name="cityPairErrorOrWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
         *         &lt;element name="cityPairErrorOrWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
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
            "cityPairErrorOrWarningInfo",
            "cityPairErrorOrWarningText"
        })
        public static class CityPairErrorOrWarning {

            @XmlElement(required = true)
            protected ApplicationErrorInformationTypeI cityPairErrorOrWarningInfo;
            protected InteractiveFreeTextTypeI cityPairErrorOrWarningText;

            /**
             * Gets the value of the cityPairErrorOrWarningInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformationTypeI }
             *     
             */
            public ApplicationErrorInformationTypeI getCityPairErrorOrWarningInfo() {
                return cityPairErrorOrWarningInfo;
            }

            /**
             * Sets the value of the cityPairErrorOrWarningInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformationTypeI }
             *     
             */
            public void setCityPairErrorOrWarningInfo(ApplicationErrorInformationTypeI value) {
                this.cityPairErrorOrWarningInfo = value;
            }

            /**
             * Gets the value of the cityPairErrorOrWarningText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public InteractiveFreeTextTypeI getCityPairErrorOrWarningText() {
                return cityPairErrorOrWarningText;
            }

            /**
             * Sets the value of the cityPairErrorOrWarningText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public void setCityPairErrorOrWarningText(InteractiveFreeTextTypeI value) {
                this.cityPairErrorOrWarningText = value;
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
         *         &lt;element name="basicFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityProductInformationType"/>
         *         &lt;element name="infoOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
         *         &lt;element name="cabinClassInfo" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cabinInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinDetailsType"/>
         *                   &lt;element name="infoByCabinOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="additionalFlightInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="trafficRestrictionList" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TrafficRestrictionTypeI" minOccurs="0"/>
         *         &lt;element name="flightErrorWarningSection" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="flightErrorWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
         *                   &lt;element name="flightErrorWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="negoSpaceDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NegociatedSpaceType" minOccurs="0"/>
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
            "basicFlightInfo",
            "infoOnClasses",
            "cabinClassInfo",
            "additionalFlightInfo",
            "trafficRestrictionList",
            "flightErrorWarningSection",
            "negoSpaceDetails"
        })
        public static class FlightInfo {

            @XmlElement(required = true)
            protected AvailabilityProductInformationType basicFlightInfo;
            protected List<ClassInformationType> infoOnClasses;
            protected List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo> cabinClassInfo;
            protected AdditionalProductDetailsTypeI additionalFlightInfo;
            protected TrafficRestrictionTypeI trafficRestrictionList;
            protected List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection> flightErrorWarningSection;
            protected NegociatedSpaceType2 negoSpaceDetails;

            /**
             * Gets the value of the basicFlightInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AvailabilityProductInformationType }
             *     
             */
            public AvailabilityProductInformationType getBasicFlightInfo() {
                return basicFlightInfo;
            }

            /**
             * Sets the value of the basicFlightInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailabilityProductInformationType }
             *     
             */
            public void setBasicFlightInfo(AvailabilityProductInformationType value) {
                this.basicFlightInfo = value;
            }

            /**
             * Gets the value of the infoOnClasses property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoOnClasses property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoOnClasses().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ClassInformationType }
             * 
             * 
             */
            public List<ClassInformationType> getInfoOnClasses() {
                if (infoOnClasses == null) {
                    infoOnClasses = new ArrayList<ClassInformationType>();
                }
                return this.infoOnClasses;
            }

            /**
             * Gets the value of the cabinClassInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinClassInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinClassInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo }
             * 
             * 
             */
            public List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo> getCabinClassInfo() {
                if (cabinClassInfo == null) {
                    cabinClassInfo = new ArrayList<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo>();
                }
                return this.cabinClassInfo;
            }

            /**
             * Gets the value of the additionalFlightInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public AdditionalProductDetailsTypeI getAdditionalFlightInfo() {
                return additionalFlightInfo;
            }

            /**
             * Sets the value of the additionalFlightInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public void setAdditionalFlightInfo(AdditionalProductDetailsTypeI value) {
                this.additionalFlightInfo = value;
            }

            /**
             * Gets the value of the trafficRestrictionList property.
             * 
             * @return
             *     possible object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public TrafficRestrictionTypeI getTrafficRestrictionList() {
                return trafficRestrictionList;
            }

            /**
             * Sets the value of the trafficRestrictionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public void setTrafficRestrictionList(TrafficRestrictionTypeI value) {
                this.trafficRestrictionList = value;
            }

            /**
             * Gets the value of the flightErrorWarningSection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightErrorWarningSection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightErrorWarningSection().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection }
             * 
             * 
             */
            public List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection> getFlightErrorWarningSection() {
                if (flightErrorWarningSection == null) {
                    flightErrorWarningSection = new ArrayList<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection>();
                }
                return this.flightErrorWarningSection;
            }

            /**
             * Gets the value of the negoSpaceDetails property.
             * 
             * @return
             *     possible object is
             *     {@link NegociatedSpaceType2 }
             *     
             */
            public NegociatedSpaceType2 getNegoSpaceDetails() {
                return negoSpaceDetails;
            }

            /**
             * Sets the value of the negoSpaceDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link NegociatedSpaceType2 }
             *     
             */
            public void setNegoSpaceDetails(NegociatedSpaceType2 value) {
                this.negoSpaceDetails = value;
            }

            /**
             * Sets the value of the infoOnClasses property.
             * 
             * @param infoOnClasses
             *     allowed object is
             *     {@link ClassInformationType }
             *     
             */
            public void setInfoOnClasses(List<ClassInformationType> infoOnClasses) {
                this.infoOnClasses = infoOnClasses;
            }

            /**
             * Sets the value of the cabinClassInfo property.
             * 
             * @param cabinClassInfo
             *     allowed object is
             *     {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo }
             *     
             */
            public void setCabinClassInfo(List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.CabinClassInfo> cabinClassInfo) {
                this.cabinClassInfo = cabinClassInfo;
            }

            /**
             * Sets the value of the flightErrorWarningSection property.
             * 
             * @param flightErrorWarningSection
             *     allowed object is
             *     {@link AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection }
             *     
             */
            public void setFlightErrorWarningSection(List<AirMultiAvailabilityReply.SingleCityPairInfo.FlightInfo.FlightErrorWarningSection> flightErrorWarningSection) {
                this.flightErrorWarningSection = flightErrorWarningSection;
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
             *         &lt;element name="cabinInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinDetailsType"/>
             *         &lt;element name="infoByCabinOnClasses" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ClassInformationType" maxOccurs="26" minOccurs="0"/>
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
                "cabinInfo",
                "infoByCabinOnClasses"
            })
            public static class CabinClassInfo {

                @XmlElement(required = true)
                protected CabinDetailsType cabinInfo;
                protected List<ClassInformationType> infoByCabinOnClasses;

                /**
                 * Gets the value of the cabinInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CabinDetailsType }
                 *     
                 */
                public CabinDetailsType getCabinInfo() {
                    return cabinInfo;
                }

                /**
                 * Sets the value of the cabinInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CabinDetailsType }
                 *     
                 */
                public void setCabinInfo(CabinDetailsType value) {
                    this.cabinInfo = value;
                }

                /**
                 * Gets the value of the infoByCabinOnClasses property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoByCabinOnClasses property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoByCabinOnClasses().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ClassInformationType }
                 * 
                 * 
                 */
                public List<ClassInformationType> getInfoByCabinOnClasses() {
                    if (infoByCabinOnClasses == null) {
                        infoByCabinOnClasses = new ArrayList<ClassInformationType>();
                    }
                    return this.infoByCabinOnClasses;
                }

                /**
                 * Sets the value of the infoByCabinOnClasses property.
                 * 
                 * @param infoByCabinOnClasses
                 *     allowed object is
                 *     {@link ClassInformationType }
                 *     
                 */
                public void setInfoByCabinOnClasses(List<ClassInformationType> infoByCabinOnClasses) {
                    this.infoByCabinOnClasses = infoByCabinOnClasses;
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
             *         &lt;element name="flightErrorWarningInfo" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorInformationTypeI"/>
             *         &lt;element name="flightErrorWarningText" type="{http://xml.amadeus.com/SATRSP_07_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
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
                "flightErrorWarningInfo",
                "flightErrorWarningText"
            })
            public static class FlightErrorWarningSection {

                @XmlElement(required = true)
                protected ApplicationErrorInformationTypeI flightErrorWarningInfo;
                protected InteractiveFreeTextTypeI flightErrorWarningText;

                /**
                 * Gets the value of the flightErrorWarningInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ApplicationErrorInformationTypeI }
                 *     
                 */
                public ApplicationErrorInformationTypeI getFlightErrorWarningInfo() {
                    return flightErrorWarningInfo;
                }

                /**
                 * Sets the value of the flightErrorWarningInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ApplicationErrorInformationTypeI }
                 *     
                 */
                public void setFlightErrorWarningInfo(ApplicationErrorInformationTypeI value) {
                    this.flightErrorWarningInfo = value;
                }

                /**
                 * Gets the value of the flightErrorWarningText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public InteractiveFreeTextTypeI getFlightErrorWarningText() {
                    return flightErrorWarningText;
                }

                /**
                 * Sets the value of the flightErrorWarningText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public void setFlightErrorWarningText(InteractiveFreeTextTypeI value) {
                    this.flightErrorWarningText = value;
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
     *         &lt;element name="summaryAndAvailabilityLines" type="{http://xml.amadeus.com/SATRSP_07_1_1A}PrefAndPolicySummaryAndAvailLineType"/>
     *         &lt;element name="preferencesSection" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="profileIdentificationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ReservationControlInformationTypeI"/>
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="associationName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProfileNameType" minOccurs="0"/>
     *                   &lt;element name="originAndDestinationRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationRequestType" minOccurs="0"/>
     *                   &lt;element name="cabinRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinEligibilityRulesType" minOccurs="0"/>
     *                   &lt;element name="availabilityInformationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityInformationType" minOccurs="0"/>
     *                   &lt;element name="itineraryPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ItineraryPreferencesType" minOccurs="0"/>
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
        "summaryAndAvailabilityLines",
        "preferencesSection"
    })
    public static class TravelChoiceMessage {

        @XmlElement(required = true)
        protected PrefAndPolicySummaryAndAvailLineType summaryAndAvailabilityLines;
        @XmlElement(required = true)
        protected List<AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection> preferencesSection;

        /**
         * Gets the value of the summaryAndAvailabilityLines property.
         * 
         * @return
         *     possible object is
         *     {@link PrefAndPolicySummaryAndAvailLineType }
         *     
         */
        public PrefAndPolicySummaryAndAvailLineType getSummaryAndAvailabilityLines() {
            return summaryAndAvailabilityLines;
        }

        /**
         * Sets the value of the summaryAndAvailabilityLines property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrefAndPolicySummaryAndAvailLineType }
         *     
         */
        public void setSummaryAndAvailabilityLines(PrefAndPolicySummaryAndAvailLineType value) {
            this.summaryAndAvailabilityLines = value;
        }

        /**
         * Gets the value of the preferencesSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferencesSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferencesSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection }
         * 
         * 
         */
        public List<AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection> getPreferencesSection() {
            if (preferencesSection == null) {
                preferencesSection = new ArrayList<AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection>();
            }
            return this.preferencesSection;
        }

        /**
         * Sets the value of the preferencesSection property.
         * 
         * @param preferencesSection
         *     allowed object is
         *     {@link AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection }
         *     
         */
        public void setPreferencesSection(List<AirMultiAvailabilityReply.TravelChoiceMessage.PreferencesSection> preferencesSection) {
            this.preferencesSection = preferencesSection;
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
         *         &lt;element name="profileIdentificationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ReservationControlInformationTypeI"/>
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerInformationTypeI" minOccurs="0"/>
         *         &lt;element name="associationName" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProfileNameType" minOccurs="0"/>
         *         &lt;element name="originAndDestinationRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}OriginAndDestinationRequestType" minOccurs="0"/>
         *         &lt;element name="cabinRules" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CabinEligibilityRulesType" minOccurs="0"/>
         *         &lt;element name="availabilityInformationSection" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AvailabilityInformationType" minOccurs="0"/>
         *         &lt;element name="itineraryPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ItineraryPreferencesType" minOccurs="0"/>
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
            "profileIdentificationSection",
            "travellerInformation",
            "associationName",
            "originAndDestinationRules",
            "cabinRules",
            "availabilityInformationSection",
            "itineraryPreference"
        })
        public static class PreferencesSection {

            @XmlElement(required = true)
            protected ReservationControlInformationTypeI2 profileIdentificationSection;
            protected TravellerInformationTypeI2 travellerInformation;
            protected ProfileNameType associationName;
            protected OriginAndDestinationRequestType originAndDestinationRules;
            protected CabinEligibilityRulesType cabinRules;
            protected AvailabilityInformationType availabilityInformationSection;
            protected ItineraryPreferencesType itineraryPreference;

            /**
             * Gets the value of the profileIdentificationSection property.
             * 
             * @return
             *     possible object is
             *     {@link ReservationControlInformationTypeI2 }
             *     
             */
            public ReservationControlInformationTypeI2 getProfileIdentificationSection() {
                return profileIdentificationSection;
            }

            /**
             * Sets the value of the profileIdentificationSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationControlInformationTypeI2 }
             *     
             */
            public void setProfileIdentificationSection(ReservationControlInformationTypeI2 value) {
                this.profileIdentificationSection = value;
            }

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationTypeI2 }
             *     
             */
            public TravellerInformationTypeI2 getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationTypeI2 }
             *     
             */
            public void setTravellerInformation(TravellerInformationTypeI2 value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the associationName property.
             * 
             * @return
             *     possible object is
             *     {@link ProfileNameType }
             *     
             */
            public ProfileNameType getAssociationName() {
                return associationName;
            }

            /**
             * Sets the value of the associationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProfileNameType }
             *     
             */
            public void setAssociationName(ProfileNameType value) {
                this.associationName = value;
            }

            /**
             * Gets the value of the originAndDestinationRules property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getOriginAndDestinationRules() {
                return originAndDestinationRules;
            }

            /**
             * Sets the value of the originAndDestinationRules property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setOriginAndDestinationRules(OriginAndDestinationRequestType value) {
                this.originAndDestinationRules = value;
            }

            /**
             * Gets the value of the cabinRules property.
             * 
             * @return
             *     possible object is
             *     {@link CabinEligibilityRulesType }
             *     
             */
            public CabinEligibilityRulesType getCabinRules() {
                return cabinRules;
            }

            /**
             * Sets the value of the cabinRules property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinEligibilityRulesType }
             *     
             */
            public void setCabinRules(CabinEligibilityRulesType value) {
                this.cabinRules = value;
            }

            /**
             * Gets the value of the availabilityInformationSection property.
             * 
             * @return
             *     possible object is
             *     {@link AvailabilityInformationType }
             *     
             */
            public AvailabilityInformationType getAvailabilityInformationSection() {
                return availabilityInformationSection;
            }

            /**
             * Sets the value of the availabilityInformationSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailabilityInformationType }
             *     
             */
            public void setAvailabilityInformationSection(AvailabilityInformationType value) {
                this.availabilityInformationSection = value;
            }

            /**
             * Gets the value of the itineraryPreference property.
             * 
             * @return
             *     possible object is
             *     {@link ItineraryPreferencesType }
             *     
             */
            public ItineraryPreferencesType getItineraryPreference() {
                return itineraryPreference;
            }

            /**
             * Sets the value of the itineraryPreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItineraryPreferencesType }
             *     
             */
            public void setItineraryPreference(ItineraryPreferencesType value) {
                this.itineraryPreference = value;
            }

        }

    }

}
