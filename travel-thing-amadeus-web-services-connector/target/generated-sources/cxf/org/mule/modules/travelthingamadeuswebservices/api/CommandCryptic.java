
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
 *         &lt;element name="messageAction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageFunctionDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="businessFunction" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="messageFunction">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="additionalMessageFunction" maxOccurs="20" minOccurs="0">
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
 *                   &lt;element name="responseType" minOccurs="0">
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
 *         &lt;element name="numberOfUnits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numberOfUnitsDetails1">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="units">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="unitsQualifier" minOccurs="0">
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
 *                   &lt;element name="numberOfUnitsDetails2" maxOccurs="8" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="units" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="unitsQualifier" minOccurs="0">
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
 *         &lt;element name="intelligentWorkstationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="companyIdentification" minOccurs="0">
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
 *         &lt;element name="longTextString">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="textStringDetails">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="9999"/>
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
    "messageAction",
    "numberOfUnits",
    "intelligentWorkstationInfo",
    "longTextString"
})
@XmlRootElement(name = "Command_Cryptic", namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
public class CommandCryptic {

    @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
    protected CommandCryptic.MessageAction messageAction;
    @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
    protected CommandCryptic.NumberOfUnits numberOfUnits;
    @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
    protected CommandCryptic.IntelligentWorkstationInfo intelligentWorkstationInfo;
    @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
    protected CommandCryptic.LongTextString longTextString;

    /**
     * Gets the value of the messageAction property.
     * 
     * @return
     *     possible object is
     *     {@link CommandCryptic.MessageAction }
     *     
     */
    public CommandCryptic.MessageAction getMessageAction() {
        return messageAction;
    }

    /**
     * Sets the value of the messageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandCryptic.MessageAction }
     *     
     */
    public void setMessageAction(CommandCryptic.MessageAction value) {
        this.messageAction = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CommandCryptic.NumberOfUnits }
     *     
     */
    public CommandCryptic.NumberOfUnits getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandCryptic.NumberOfUnits }
     *     
     */
    public void setNumberOfUnits(CommandCryptic.NumberOfUnits value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the intelligentWorkstationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommandCryptic.IntelligentWorkstationInfo }
     *     
     */
    public CommandCryptic.IntelligentWorkstationInfo getIntelligentWorkstationInfo() {
        return intelligentWorkstationInfo;
    }

    /**
     * Sets the value of the intelligentWorkstationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandCryptic.IntelligentWorkstationInfo }
     *     
     */
    public void setIntelligentWorkstationInfo(CommandCryptic.IntelligentWorkstationInfo value) {
        this.intelligentWorkstationInfo = value;
    }

    /**
     * Gets the value of the longTextString property.
     * 
     * @return
     *     possible object is
     *     {@link CommandCryptic.LongTextString }
     *     
     */
    public CommandCryptic.LongTextString getLongTextString() {
        return longTextString;
    }

    /**
     * Sets the value of the longTextString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandCryptic.LongTextString }
     *     
     */
    public void setLongTextString(CommandCryptic.LongTextString value) {
        this.longTextString = value;
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
     *         &lt;element name="companyIdentification" minOccurs="0">
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
        "companyIdentification"
    })
    public static class IntelligentWorkstationInfo {

        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
        protected String companyIdentification;

        /**
         * Gets the value of the companyIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyIdentification() {
            return companyIdentification;
        }

        /**
         * Sets the value of the companyIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyIdentification(String value) {
            this.companyIdentification = value;
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
     *         &lt;element name="textStringDetails">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="9999"/>
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
        "textStringDetails"
    })
    public static class LongTextString {

        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
        protected String textStringDetails;

        /**
         * Gets the value of the textStringDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextStringDetails() {
            return textStringDetails;
        }

        /**
         * Sets the value of the textStringDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextStringDetails(String value) {
            this.textStringDetails = value;
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
     *         &lt;element name="messageFunctionDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="businessFunction" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="messageFunction">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="additionalMessageFunction" maxOccurs="20" minOccurs="0">
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
     *         &lt;element name="responseType" minOccurs="0">
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
        "messageFunctionDetails",
        "responseType"
    })
    public static class MessageAction {

        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
        protected CommandCryptic.MessageAction.MessageFunctionDetails messageFunctionDetails;
        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
        protected String responseType;

        /**
         * Gets the value of the messageFunctionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link CommandCryptic.MessageAction.MessageFunctionDetails }
         *     
         */
        public CommandCryptic.MessageAction.MessageFunctionDetails getMessageFunctionDetails() {
            return messageFunctionDetails;
        }

        /**
         * Sets the value of the messageFunctionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommandCryptic.MessageAction.MessageFunctionDetails }
         *     
         */
        public void setMessageFunctionDetails(CommandCryptic.MessageAction.MessageFunctionDetails value) {
            this.messageFunctionDetails = value;
        }

        /**
         * Gets the value of the responseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseType() {
            return responseType;
        }

        /**
         * Sets the value of the responseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseType(String value) {
            this.responseType = value;
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
         *         &lt;element name="businessFunction" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="messageFunction">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="additionalMessageFunction" maxOccurs="20" minOccurs="0">
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
            "businessFunction",
            "messageFunction",
            "additionalMessageFunction"
        })
        public static class MessageFunctionDetails {

            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
            protected String businessFunction;
            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
            protected String messageFunction;
            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
            protected List<String> additionalMessageFunction;

            /**
             * Gets the value of the businessFunction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessFunction() {
                return businessFunction;
            }

            /**
             * Sets the value of the businessFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessFunction(String value) {
                this.businessFunction = value;
            }

            /**
             * Gets the value of the messageFunction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageFunction() {
                return messageFunction;
            }

            /**
             * Sets the value of the messageFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageFunction(String value) {
                this.messageFunction = value;
            }

            /**
             * Gets the value of the additionalMessageFunction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalMessageFunction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalMessageFunction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAdditionalMessageFunction() {
                if (additionalMessageFunction == null) {
                    additionalMessageFunction = new ArrayList<String>();
                }
                return this.additionalMessageFunction;
            }

            /**
             * Sets the value of the additionalMessageFunction property.
             * 
             * @param additionalMessageFunction
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalMessageFunction(List<String> additionalMessageFunction) {
                this.additionalMessageFunction = additionalMessageFunction;
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
     *         &lt;element name="numberOfUnitsDetails1">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="units">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="unitsQualifier" minOccurs="0">
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
     *         &lt;element name="numberOfUnitsDetails2" maxOccurs="8" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="units" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="unitsQualifier" minOccurs="0">
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
        "numberOfUnitsDetails1",
        "numberOfUnitsDetails2"
    })
    public static class NumberOfUnits {

        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
        protected CommandCryptic.NumberOfUnits.NumberOfUnitsDetails1 numberOfUnitsDetails1;
        @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
        protected List<CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2> numberOfUnitsDetails2;

        /**
         * Gets the value of the numberOfUnitsDetails1 property.
         * 
         * @return
         *     possible object is
         *     {@link CommandCryptic.NumberOfUnits.NumberOfUnitsDetails1 }
         *     
         */
        public CommandCryptic.NumberOfUnits.NumberOfUnitsDetails1 getNumberOfUnitsDetails1() {
            return numberOfUnitsDetails1;
        }

        /**
         * Sets the value of the numberOfUnitsDetails1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommandCryptic.NumberOfUnits.NumberOfUnitsDetails1 }
         *     
         */
        public void setNumberOfUnitsDetails1(CommandCryptic.NumberOfUnits.NumberOfUnitsDetails1 value) {
            this.numberOfUnitsDetails1 = value;
        }

        /**
         * Gets the value of the numberOfUnitsDetails2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numberOfUnitsDetails2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNumberOfUnitsDetails2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2 }
         * 
         * 
         */
        public List<CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2> getNumberOfUnitsDetails2() {
            if (numberOfUnitsDetails2 == null) {
                numberOfUnitsDetails2 = new ArrayList<CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2>();
            }
            return this.numberOfUnitsDetails2;
        }

        /**
         * Sets the value of the numberOfUnitsDetails2 property.
         * 
         * @param numberOfUnitsDetails2
         *     allowed object is
         *     {@link CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2 }
         *     
         */
        public void setNumberOfUnitsDetails2(List<CommandCryptic.NumberOfUnits.NumberOfUnitsDetails2> numberOfUnitsDetails2) {
            this.numberOfUnitsDetails2 = numberOfUnitsDetails2;
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
         *         &lt;element name="units">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="unitsQualifier" minOccurs="0">
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
            "units",
            "unitsQualifier"
        })
        public static class NumberOfUnitsDetails1 {

            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A", required = true)
            protected BigDecimal units;
            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
            protected String unitsQualifier;

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnits() {
                return units;
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnits(BigDecimal value) {
                this.units = value;
            }

            /**
             * Gets the value of the unitsQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitsQualifier() {
                return unitsQualifier;
            }

            /**
             * Sets the value of the unitsQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitsQualifier(String value) {
                this.unitsQualifier = value;
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
         *         &lt;element name="units" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="unitsQualifier" minOccurs="0">
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
            "units",
            "unitsQualifier"
        })
        public static class NumberOfUnitsDetails2 {

            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
            protected BigDecimal units;
            @XmlElement(namespace = "http://xml.amadeus.com/HSFREQ_06_2_1A")
            protected String unitsQualifier;

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnits() {
                return units;
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnits(BigDecimal value) {
                this.units = value;
            }

            /**
             * Gets the value of the unitsQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitsQualifier() {
                return unitsQualifier;
            }

            /**
             * Sets the value of the unitsQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitsQualifier(String value) {
                this.unitsQualifier = value;
            }

        }

    }

}
