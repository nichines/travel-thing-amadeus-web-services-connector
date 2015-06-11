
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
 *         &lt;element name="messageActionDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}MessageActionDetailsType"/>
 *         &lt;element name="frequentTraveller" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="travellerDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}TravellerInformationTypeI"/>
 *                   &lt;element name="travelleridentification" type="{http://xml.amadeus.com/SATRQT_07_1_1A}FrequentTravellerInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requestSection" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="availabilityProductInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityProductionInfoType"/>
 *                   &lt;element name="boardOffDetails" maxOccurs="12" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="boardOffPoints" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityProductionInfoType_15252S"/>
 *                             &lt;element name="cityRadius" type="{http://xml.amadeus.com/SATRQT_07_1_1A}MeasurementsTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="travelChoiceInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travelChoiceDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsTypeI"/>
 *                             &lt;element name="profileInformation" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="optionClass" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ClassQueryType" minOccurs="0"/>
 *                   &lt;element name="connectionOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ConnectionType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="numberOfSeatsInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="airlineOrFlightOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AirlineOptionType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="cabinOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}CabinDescriptionType" minOccurs="0"/>
 *                   &lt;element name="negoSpaceDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NegociatedSpaceType" minOccurs="0"/>
 *                   &lt;element name="availabilityOptions" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityOptionsType"/>
 *                   &lt;element name="umRequest" type="{http://xml.amadeus.com/SATRQT_07_1_1A}UnaccompaniedMinorRequestType" minOccurs="0"/>
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
    "frequentTraveller",
    "requestSection"
})
@XmlRootElement(name = "Air_MultiAvailability", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
public class AirMultiAvailability {

    @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
    protected MessageActionDetailsType messageActionDetails;
    @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
    protected AirMultiAvailability.FrequentTraveller frequentTraveller;
    @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
    protected List<AirMultiAvailability.RequestSection> requestSection;

    /**
     * Gets the value of the messageActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsType }
     *     
     */
    public MessageActionDetailsType getMessageActionDetails() {
        return messageActionDetails;
    }

    /**
     * Sets the value of the messageActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsType }
     *     
     */
    public void setMessageActionDetails(MessageActionDetailsType value) {
        this.messageActionDetails = value;
    }

    /**
     * Gets the value of the frequentTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link AirMultiAvailability.FrequentTraveller }
     *     
     */
    public AirMultiAvailability.FrequentTraveller getFrequentTraveller() {
        return frequentTraveller;
    }

    /**
     * Sets the value of the frequentTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirMultiAvailability.FrequentTraveller }
     *     
     */
    public void setFrequentTraveller(AirMultiAvailability.FrequentTraveller value) {
        this.frequentTraveller = value;
    }

    /**
     * Gets the value of the requestSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirMultiAvailability.RequestSection }
     * 
     * 
     */
    public List<AirMultiAvailability.RequestSection> getRequestSection() {
        if (requestSection == null) {
            requestSection = new ArrayList<AirMultiAvailability.RequestSection>();
        }
        return this.requestSection;
    }

    /**
     * Sets the value of the requestSection property.
     * 
     * @param requestSection
     *     allowed object is
     *     {@link AirMultiAvailability.RequestSection }
     *     
     */
    public void setRequestSection(List<AirMultiAvailability.RequestSection> requestSection) {
        this.requestSection = requestSection;
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
     *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}TravellerInformationTypeI"/>
     *         &lt;element name="travelleridentification" type="{http://xml.amadeus.com/SATRQT_07_1_1A}FrequentTravellerInformationTypeI" minOccurs="0"/>
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
        "travellerDetails",
        "travelleridentification"
    })
    public static class FrequentTraveller {

        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
        protected TravellerInformationTypeI travellerDetails;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected FrequentTravellerInformationTypeI travelleridentification;

        /**
         * Gets the value of the travellerDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public TravellerInformationTypeI getTravellerDetails() {
            return travellerDetails;
        }

        /**
         * Sets the value of the travellerDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public void setTravellerDetails(TravellerInformationTypeI value) {
            this.travellerDetails = value;
        }

        /**
         * Gets the value of the travelleridentification property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public FrequentTravellerInformationTypeI getTravelleridentification() {
            return travelleridentification;
        }

        /**
         * Sets the value of the travelleridentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public void setTravelleridentification(FrequentTravellerInformationTypeI value) {
            this.travelleridentification = value;
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
     *         &lt;element name="availabilityProductInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityProductionInfoType"/>
     *         &lt;element name="boardOffDetails" maxOccurs="12" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="boardOffPoints" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityProductionInfoType_15252S"/>
     *                   &lt;element name="cityRadius" type="{http://xml.amadeus.com/SATRQT_07_1_1A}MeasurementsTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="travelChoiceInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travelChoiceDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsTypeI"/>
     *                   &lt;element name="profileInformation" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="optionClass" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ClassQueryType" minOccurs="0"/>
     *         &lt;element name="connectionOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ConnectionType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="numberOfSeatsInfo" type="{http://xml.amadeus.com/SATRQT_07_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
     *         &lt;element name="airlineOrFlightOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AirlineOptionType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="cabinOption" type="{http://xml.amadeus.com/SATRQT_07_1_1A}CabinDescriptionType" minOccurs="0"/>
     *         &lt;element name="negoSpaceDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}NegociatedSpaceType" minOccurs="0"/>
     *         &lt;element name="availabilityOptions" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityOptionsType"/>
     *         &lt;element name="umRequest" type="{http://xml.amadeus.com/SATRQT_07_1_1A}UnaccompaniedMinorRequestType" minOccurs="0"/>
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
        "availabilityProductInfo",
        "boardOffDetails",
        "travelChoiceInfo",
        "optionClass",
        "connectionOption",
        "numberOfSeatsInfo",
        "airlineOrFlightOption",
        "cabinOption",
        "negoSpaceDetails",
        "availabilityOptions",
        "umRequest"
    })
    public static class RequestSection {

        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
        protected AvailabilityProductionInfoType availabilityProductInfo;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected List<AirMultiAvailability.RequestSection.BoardOffDetails> boardOffDetails;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected AirMultiAvailability.RequestSection.TravelChoiceInfo travelChoiceInfo;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected ClassQueryType optionClass;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected List<ConnectionType> connectionOption;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected RelatedProductInformationTypeI numberOfSeatsInfo;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected List<AirlineOptionType> airlineOrFlightOption;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected CabinDescriptionType cabinOption;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected NegociatedSpaceType negoSpaceDetails;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
        protected AvailabilityOptionsType availabilityOptions;
        @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
        protected UnaccompaniedMinorRequestType umRequest;

        /**
         * Gets the value of the availabilityProductInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityProductionInfoType }
         *     
         */
        public AvailabilityProductionInfoType getAvailabilityProductInfo() {
            return availabilityProductInfo;
        }

        /**
         * Sets the value of the availabilityProductInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityProductionInfoType }
         *     
         */
        public void setAvailabilityProductInfo(AvailabilityProductionInfoType value) {
            this.availabilityProductInfo = value;
        }

        /**
         * Gets the value of the boardOffDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boardOffDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoardOffDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirMultiAvailability.RequestSection.BoardOffDetails }
         * 
         * 
         */
        public List<AirMultiAvailability.RequestSection.BoardOffDetails> getBoardOffDetails() {
            if (boardOffDetails == null) {
                boardOffDetails = new ArrayList<AirMultiAvailability.RequestSection.BoardOffDetails>();
            }
            return this.boardOffDetails;
        }

        /**
         * Gets the value of the travelChoiceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AirMultiAvailability.RequestSection.TravelChoiceInfo }
         *     
         */
        public AirMultiAvailability.RequestSection.TravelChoiceInfo getTravelChoiceInfo() {
            return travelChoiceInfo;
        }

        /**
         * Sets the value of the travelChoiceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirMultiAvailability.RequestSection.TravelChoiceInfo }
         *     
         */
        public void setTravelChoiceInfo(AirMultiAvailability.RequestSection.TravelChoiceInfo value) {
            this.travelChoiceInfo = value;
        }

        /**
         * Gets the value of the optionClass property.
         * 
         * @return
         *     possible object is
         *     {@link ClassQueryType }
         *     
         */
        public ClassQueryType getOptionClass() {
            return optionClass;
        }

        /**
         * Sets the value of the optionClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassQueryType }
         *     
         */
        public void setOptionClass(ClassQueryType value) {
            this.optionClass = value;
        }

        /**
         * Gets the value of the connectionOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConnectionType }
         * 
         * 
         */
        public List<ConnectionType> getConnectionOption() {
            if (connectionOption == null) {
                connectionOption = new ArrayList<ConnectionType>();
            }
            return this.connectionOption;
        }

        /**
         * Gets the value of the numberOfSeatsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RelatedProductInformationTypeI }
         *     
         */
        public RelatedProductInformationTypeI getNumberOfSeatsInfo() {
            return numberOfSeatsInfo;
        }

        /**
         * Sets the value of the numberOfSeatsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RelatedProductInformationTypeI }
         *     
         */
        public void setNumberOfSeatsInfo(RelatedProductInformationTypeI value) {
            this.numberOfSeatsInfo = value;
        }

        /**
         * Gets the value of the airlineOrFlightOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineOrFlightOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineOrFlightOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlineOptionType }
         * 
         * 
         */
        public List<AirlineOptionType> getAirlineOrFlightOption() {
            if (airlineOrFlightOption == null) {
                airlineOrFlightOption = new ArrayList<AirlineOptionType>();
            }
            return this.airlineOrFlightOption;
        }

        /**
         * Gets the value of the cabinOption property.
         * 
         * @return
         *     possible object is
         *     {@link CabinDescriptionType }
         *     
         */
        public CabinDescriptionType getCabinOption() {
            return cabinOption;
        }

        /**
         * Sets the value of the cabinOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinDescriptionType }
         *     
         */
        public void setCabinOption(CabinDescriptionType value) {
            this.cabinOption = value;
        }

        /**
         * Gets the value of the negoSpaceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link NegociatedSpaceType }
         *     
         */
        public NegociatedSpaceType getNegoSpaceDetails() {
            return negoSpaceDetails;
        }

        /**
         * Sets the value of the negoSpaceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link NegociatedSpaceType }
         *     
         */
        public void setNegoSpaceDetails(NegociatedSpaceType value) {
            this.negoSpaceDetails = value;
        }

        /**
         * Gets the value of the availabilityOptions property.
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityOptionsType }
         *     
         */
        public AvailabilityOptionsType getAvailabilityOptions() {
            return availabilityOptions;
        }

        /**
         * Sets the value of the availabilityOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityOptionsType }
         *     
         */
        public void setAvailabilityOptions(AvailabilityOptionsType value) {
            this.availabilityOptions = value;
        }

        /**
         * Gets the value of the umRequest property.
         * 
         * @return
         *     possible object is
         *     {@link UnaccompaniedMinorRequestType }
         *     
         */
        public UnaccompaniedMinorRequestType getUmRequest() {
            return umRequest;
        }

        /**
         * Sets the value of the umRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnaccompaniedMinorRequestType }
         *     
         */
        public void setUmRequest(UnaccompaniedMinorRequestType value) {
            this.umRequest = value;
        }

        /**
         * Sets the value of the boardOffDetails property.
         * 
         * @param boardOffDetails
         *     allowed object is
         *     {@link AirMultiAvailability.RequestSection.BoardOffDetails }
         *     
         */
        public void setBoardOffDetails(List<AirMultiAvailability.RequestSection.BoardOffDetails> boardOffDetails) {
            this.boardOffDetails = boardOffDetails;
        }

        /**
         * Sets the value of the connectionOption property.
         * 
         * @param connectionOption
         *     allowed object is
         *     {@link ConnectionType }
         *     
         */
        public void setConnectionOption(List<ConnectionType> connectionOption) {
            this.connectionOption = connectionOption;
        }

        /**
         * Sets the value of the airlineOrFlightOption property.
         * 
         * @param airlineOrFlightOption
         *     allowed object is
         *     {@link AirlineOptionType }
         *     
         */
        public void setAirlineOrFlightOption(List<AirlineOptionType> airlineOrFlightOption) {
            this.airlineOrFlightOption = airlineOrFlightOption;
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
         *         &lt;element name="boardOffPoints" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AvailabilityProductionInfoType_15252S"/>
         *         &lt;element name="cityRadius" type="{http://xml.amadeus.com/SATRQT_07_1_1A}MeasurementsTypeI" minOccurs="0"/>
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
            "boardOffPoints",
            "cityRadius"
        })
        public static class BoardOffDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
            protected AvailabilityProductionInfoType15252S boardOffPoints;
            @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
            protected MeasurementsTypeI cityRadius;

            /**
             * Gets the value of the boardOffPoints property.
             * 
             * @return
             *     possible object is
             *     {@link AvailabilityProductionInfoType15252S }
             *     
             */
            public AvailabilityProductionInfoType15252S getBoardOffPoints() {
                return boardOffPoints;
            }

            /**
             * Sets the value of the boardOffPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailabilityProductionInfoType15252S }
             *     
             */
            public void setBoardOffPoints(AvailabilityProductionInfoType15252S value) {
                this.boardOffPoints = value;
            }

            /**
             * Gets the value of the cityRadius property.
             * 
             * @return
             *     possible object is
             *     {@link MeasurementsTypeI }
             *     
             */
            public MeasurementsTypeI getCityRadius() {
                return cityRadius;
            }

            /**
             * Sets the value of the cityRadius property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeasurementsTypeI }
             *     
             */
            public void setCityRadius(MeasurementsTypeI value) {
                this.cityRadius = value;
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
         *         &lt;element name="travelChoiceDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}SelectionDetailsTypeI"/>
         *         &lt;element name="profileInformation" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
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
            "travelChoiceDetails",
            "profileInformation"
        })
        public static class TravelChoiceInfo {

            @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", required = true)
            protected SelectionDetailsTypeI travelChoiceDetails;
            @XmlElement(namespace = "http://xml.amadeus.com/SATRQT_07_1_1A")
            protected ReservationControlInformationTypeI profileInformation;

            /**
             * Gets the value of the travelChoiceDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public SelectionDetailsTypeI getTravelChoiceDetails() {
                return travelChoiceDetails;
            }

            /**
             * Sets the value of the travelChoiceDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsTypeI }
             *     
             */
            public void setTravelChoiceDetails(SelectionDetailsTypeI value) {
                this.travelChoiceDetails = value;
            }

            /**
             * Gets the value of the profileInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ReservationControlInformationTypeI }
             *     
             */
            public ReservationControlInformationTypeI getProfileInformation() {
                return profileInformation;
            }

            /**
             * Sets the value of the profileInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationControlInformationTypeI }
             *     
             */
            public void setProfileInformation(ReservationControlInformationTypeI value) {
                this.profileInformation = value;
            }

        }

    }

}
