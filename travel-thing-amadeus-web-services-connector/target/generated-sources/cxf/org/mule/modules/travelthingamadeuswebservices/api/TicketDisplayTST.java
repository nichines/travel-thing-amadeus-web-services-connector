
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
 *         &lt;element name="displayMode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attributeType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
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
 *         &lt;element name="pnrLocatorData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservationInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="controlNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
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
 *         &lt;element name="scrollingInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nextListInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="remainingInformation" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="remainingReference" minOccurs="0">
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
 *         &lt;element name="tstReference" maxOccurs="1980" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="referenceType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="uniqueReference" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="iDDescription" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iDSequenceNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
 *         &lt;element name="psaInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="refDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refQualifier" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="refNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
    "displayMode",
    "pnrLocatorData",
    "scrollingInformation",
    "tstReference",
    "psaInformation"
})
@XmlRootElement(name = "Ticket_DisplayTST", namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
public class TicketDisplayTST {

    @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
    protected TicketDisplayTST.DisplayMode displayMode;
    @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
    protected TicketDisplayTST.PnrLocatorData pnrLocatorData;
    @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
    protected TicketDisplayTST.ScrollingInformation scrollingInformation;
    @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
    protected List<TicketDisplayTST.TstReference> tstReference;
    @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
    protected TicketDisplayTST.PsaInformation psaInformation;

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDisplayTST.DisplayMode }
     *     
     */
    public TicketDisplayTST.DisplayMode getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDisplayTST.DisplayMode }
     *     
     */
    public void setDisplayMode(TicketDisplayTST.DisplayMode value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the pnrLocatorData property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDisplayTST.PnrLocatorData }
     *     
     */
    public TicketDisplayTST.PnrLocatorData getPnrLocatorData() {
        return pnrLocatorData;
    }

    /**
     * Sets the value of the pnrLocatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDisplayTST.PnrLocatorData }
     *     
     */
    public void setPnrLocatorData(TicketDisplayTST.PnrLocatorData value) {
        this.pnrLocatorData = value;
    }

    /**
     * Gets the value of the scrollingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDisplayTST.ScrollingInformation }
     *     
     */
    public TicketDisplayTST.ScrollingInformation getScrollingInformation() {
        return scrollingInformation;
    }

    /**
     * Sets the value of the scrollingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDisplayTST.ScrollingInformation }
     *     
     */
    public void setScrollingInformation(TicketDisplayTST.ScrollingInformation value) {
        this.scrollingInformation = value;
    }

    /**
     * Gets the value of the tstReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tstReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTstReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDisplayTST.TstReference }
     * 
     * 
     */
    public List<TicketDisplayTST.TstReference> getTstReference() {
        if (tstReference == null) {
            tstReference = new ArrayList<TicketDisplayTST.TstReference>();
        }
        return this.tstReference;
    }

    /**
     * Gets the value of the psaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDisplayTST.PsaInformation }
     *     
     */
    public TicketDisplayTST.PsaInformation getPsaInformation() {
        return psaInformation;
    }

    /**
     * Sets the value of the psaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDisplayTST.PsaInformation }
     *     
     */
    public void setPsaInformation(TicketDisplayTST.PsaInformation value) {
        this.psaInformation = value;
    }

    /**
     * Sets the value of the tstReference property.
     * 
     * @param tstReference
     *     allowed object is
     *     {@link TicketDisplayTST.TstReference }
     *     
     */
    public void setTstReference(List<TicketDisplayTST.TstReference> tstReference) {
        this.tstReference = tstReference;
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
     *         &lt;element name="attributeDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attributeType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
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
        "attributeDetails"
    })
    public static class DisplayMode {

        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
        protected TicketDisplayTST.DisplayMode.AttributeDetails attributeDetails;

        /**
         * Gets the value of the attributeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TicketDisplayTST.DisplayMode.AttributeDetails }
         *     
         */
        public TicketDisplayTST.DisplayMode.AttributeDetails getAttributeDetails() {
            return attributeDetails;
        }

        /**
         * Sets the value of the attributeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketDisplayTST.DisplayMode.AttributeDetails }
         *     
         */
        public void setAttributeDetails(TicketDisplayTST.DisplayMode.AttributeDetails value) {
            this.attributeDetails = value;
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
         *         &lt;element name="attributeType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
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
            "attributeType"
        })
        public static class AttributeDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
            protected String attributeType;

            /**
             * Gets the value of the attributeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeType() {
                return attributeType;
            }

            /**
             * Sets the value of the attributeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeType(String value) {
                this.attributeType = value;
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
     *         &lt;element name="reservationInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="controlNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
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
        "reservationInformation"
    })
    public static class PnrLocatorData {

        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
        protected TicketDisplayTST.PnrLocatorData.ReservationInformation reservationInformation;

        /**
         * Gets the value of the reservationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketDisplayTST.PnrLocatorData.ReservationInformation }
         *     
         */
        public TicketDisplayTST.PnrLocatorData.ReservationInformation getReservationInformation() {
            return reservationInformation;
        }

        /**
         * Sets the value of the reservationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketDisplayTST.PnrLocatorData.ReservationInformation }
         *     
         */
        public void setReservationInformation(TicketDisplayTST.PnrLocatorData.ReservationInformation value) {
            this.reservationInformation = value;
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
         *         &lt;element name="controlNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
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
            "controlNumber"
        })
        public static class ReservationInformation {

            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
            protected String controlNumber;

            /**
             * Gets the value of the controlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlNumber() {
                return controlNumber;
            }

            /**
             * Sets the value of the controlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlNumber(String value) {
                this.controlNumber = value;
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
     *         &lt;element name="refDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refQualifier" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="refNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
        "refDetails"
    })
    public static class PsaInformation {

        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
        protected List<TicketDisplayTST.PsaInformation.RefDetails> refDetails;

        /**
         * Gets the value of the refDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDisplayTST.PsaInformation.RefDetails }
         * 
         * 
         */
        public List<TicketDisplayTST.PsaInformation.RefDetails> getRefDetails() {
            if (refDetails == null) {
                refDetails = new ArrayList<TicketDisplayTST.PsaInformation.RefDetails>();
            }
            return this.refDetails;
        }

        /**
         * Sets the value of the refDetails property.
         * 
         * @param refDetails
         *     allowed object is
         *     {@link TicketDisplayTST.PsaInformation.RefDetails }
         *     
         */
        public void setRefDetails(List<TicketDisplayTST.PsaInformation.RefDetails> refDetails) {
            this.refDetails = refDetails;
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
         *         &lt;element name="refQualifier" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="refNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
            "refQualifier",
            "refNumber"
        })
        public static class RefDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
            protected String refQualifier;
            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
            protected BigDecimal refNumber;

            /**
             * Gets the value of the refQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefQualifier() {
                return refQualifier;
            }

            /**
             * Sets the value of the refQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefQualifier(String value) {
                this.refQualifier = value;
            }

            /**
             * Gets the value of the refNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRefNumber() {
                return refNumber;
            }

            /**
             * Sets the value of the refNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRefNumber(BigDecimal value) {
                this.refNumber = value;
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
     *         &lt;element name="nextListInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="remainingInformation" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="remainingReference" minOccurs="0">
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
        "nextListInformation"
    })
    public static class ScrollingInformation {

        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
        protected TicketDisplayTST.ScrollingInformation.NextListInformation nextListInformation;

        /**
         * Gets the value of the nextListInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketDisplayTST.ScrollingInformation.NextListInformation }
         *     
         */
        public TicketDisplayTST.ScrollingInformation.NextListInformation getNextListInformation() {
            return nextListInformation;
        }

        /**
         * Sets the value of the nextListInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketDisplayTST.ScrollingInformation.NextListInformation }
         *     
         */
        public void setNextListInformation(TicketDisplayTST.ScrollingInformation.NextListInformation value) {
            this.nextListInformation = value;
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
         *         &lt;element name="remainingInformation" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="remainingReference" minOccurs="0">
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
            "remainingInformation",
            "remainingReference"
        })
        public static class NextListInformation {

            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
            protected BigDecimal remainingInformation;
            @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
            protected String remainingReference;

            /**
             * Gets the value of the remainingInformation property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRemainingInformation() {
                return remainingInformation;
            }

            /**
             * Sets the value of the remainingInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRemainingInformation(BigDecimal value) {
                this.remainingInformation = value;
            }

            /**
             * Gets the value of the remainingReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemainingReference() {
                return remainingReference;
            }

            /**
             * Sets the value of the remainingReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemainingReference(String value) {
                this.remainingReference = value;
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
     *         &lt;element name="referenceType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="uniqueReference" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="iDDescription" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iDSequenceNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
        "referenceType",
        "uniqueReference",
        "idDescription"
    })
    public static class TstReference {

        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
        protected String referenceType;
        @XmlElement(namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
        protected BigDecimal uniqueReference;
        @XmlElement(name = "iDDescription", namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A")
        protected TicketDisplayTST.TstReference.IDDescription idDescription;

        /**
         * Gets the value of the referenceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceType() {
            return referenceType;
        }

        /**
         * Sets the value of the referenceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceType(String value) {
            this.referenceType = value;
        }

        /**
         * Gets the value of the uniqueReference property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUniqueReference() {
            return uniqueReference;
        }

        /**
         * Sets the value of the uniqueReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUniqueReference(BigDecimal value) {
            this.uniqueReference = value;
        }

        /**
         * Gets the value of the idDescription property.
         * 
         * @return
         *     possible object is
         *     {@link TicketDisplayTST.TstReference.IDDescription }
         *     
         */
        public TicketDisplayTST.TstReference.IDDescription getIDDescription() {
            return idDescription;
        }

        /**
         * Sets the value of the idDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketDisplayTST.TstReference.IDDescription }
         *     
         */
        public void setIDDescription(TicketDisplayTST.TstReference.IDDescription value) {
            this.idDescription = value;
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
         *         &lt;element name="iDSequenceNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
            "idSequenceNumber"
        })
        public static class IDDescription {

            @XmlElement(name = "iDSequenceNumber", namespace = "http://xml.amadeus.com/TTSTRQ_05_1_1A", required = true)
            protected BigDecimal idSequenceNumber;

            /**
             * Gets the value of the idSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIDSequenceNumber() {
                return idSequenceNumber;
            }

            /**
             * Sets the value of the idSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIDSequenceNumber(BigDecimal value) {
                this.idSequenceNumber = value;
            }

        }

    }

}
