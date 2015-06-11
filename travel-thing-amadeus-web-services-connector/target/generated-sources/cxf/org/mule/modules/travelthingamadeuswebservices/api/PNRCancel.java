
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
 *         &lt;element name="reservationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservation">
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
 *         &lt;element name="pnrActions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="optionCode" maxOccurs="40">
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
 *         &lt;element name="cancelElements" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entryType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="element" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identifier" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="number" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="subElement" minOccurs="0">
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
    "reservationInfo",
    "pnrActions",
    "cancelElements"
})
@XmlRootElement(name = "PNR_Cancel", namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
public class PNRCancel {

    @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
    protected PNRCancel.ReservationInfo reservationInfo;
    @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A", required = true)
    protected PNRCancel.PnrActions pnrActions;
    @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
    protected List<PNRCancel.CancelElements> cancelElements;

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PNRCancel.ReservationInfo }
     *     
     */
    public PNRCancel.ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRCancel.ReservationInfo }
     *     
     */
    public void setReservationInfo(PNRCancel.ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the pnrActions property.
     * 
     * @return
     *     possible object is
     *     {@link PNRCancel.PnrActions }
     *     
     */
    public PNRCancel.PnrActions getPnrActions() {
        return pnrActions;
    }

    /**
     * Sets the value of the pnrActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRCancel.PnrActions }
     *     
     */
    public void setPnrActions(PNRCancel.PnrActions value) {
        this.pnrActions = value;
    }

    /**
     * Gets the value of the cancelElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRCancel.CancelElements }
     * 
     * 
     */
    public List<PNRCancel.CancelElements> getCancelElements() {
        if (cancelElements == null) {
            cancelElements = new ArrayList<PNRCancel.CancelElements>();
        }
        return this.cancelElements;
    }

    /**
     * Sets the value of the cancelElements property.
     * 
     * @param cancelElements
     *     allowed object is
     *     {@link PNRCancel.CancelElements }
     *     
     */
    public void setCancelElements(List<PNRCancel.CancelElements> cancelElements) {
        this.cancelElements = cancelElements;
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
     *         &lt;element name="entryType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="element" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identifier" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="number" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="subElement" minOccurs="0">
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
        "entryType",
        "element"
    })
    public static class CancelElements {

        @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A", required = true)
        protected String entryType;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
        protected List<PNRCancel.CancelElements.Element> element;

        /**
         * Gets the value of the entryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryType() {
            return entryType;
        }

        /**
         * Sets the value of the entryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryType(String value) {
            this.entryType = value;
        }

        /**
         * Gets the value of the element property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRCancel.CancelElements.Element }
         * 
         * 
         */
        public List<PNRCancel.CancelElements.Element> getElement() {
            if (element == null) {
                element = new ArrayList<PNRCancel.CancelElements.Element>();
            }
            return this.element;
        }

        /**
         * Sets the value of the element property.
         * 
         * @param element
         *     allowed object is
         *     {@link PNRCancel.CancelElements.Element }
         *     
         */
        public void setElement(List<PNRCancel.CancelElements.Element> element) {
            this.element = element;
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
         *         &lt;element name="identifier" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="number" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="subElement" minOccurs="0">
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
            "identifier",
            "number",
            "subElement"
        })
        public static class Element {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
            protected String identifier;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
            protected BigDecimal number;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A")
            protected BigDecimal subElement;

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

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumber(BigDecimal value) {
                this.number = value;
            }

            /**
             * Gets the value of the subElement property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubElement() {
                return subElement;
            }

            /**
             * Sets the value of the subElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubElement(BigDecimal value) {
                this.subElement = value;
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
     *         &lt;element name="optionCode" maxOccurs="40">
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
        "optionCode"
    })
    public static class PnrActions {

        @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A", required = true)
        protected List<BigDecimal> optionCode;

        /**
         * Gets the value of the optionCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the optionCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOptionCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getOptionCode() {
            if (optionCode == null) {
                optionCode = new ArrayList<BigDecimal>();
            }
            return this.optionCode;
        }

        /**
         * Sets the value of the optionCode property.
         * 
         * @param optionCode
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOptionCode(List<BigDecimal> optionCode) {
            this.optionCode = optionCode;
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
     *         &lt;element name="reservation">
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
        "reservation"
    })
    public static class ReservationInfo {

        @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A", required = true)
        protected PNRCancel.ReservationInfo.Reservation reservation;

        /**
         * Gets the value of the reservation property.
         * 
         * @return
         *     possible object is
         *     {@link PNRCancel.ReservationInfo.Reservation }
         *     
         */
        public PNRCancel.ReservationInfo.Reservation getReservation() {
            return reservation;
        }

        /**
         * Sets the value of the reservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRCancel.ReservationInfo.Reservation }
         *     
         */
        public void setReservation(PNRCancel.ReservationInfo.Reservation value) {
            this.reservation = value;
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
        public static class Reservation {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRXCL_08_2_1A", required = true)
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

}
