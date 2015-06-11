
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
 *         &lt;element name="errorSection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationError">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="errorDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="errorCode">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="errorCategory" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="errorCodeOwner" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
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
 *                   &lt;element name="interactiveFreeText" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="freeTextQualification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="textSubjectQualifier">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="informationType" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="language" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="freeText" maxOccurs="99" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="70"/>
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
 *         &lt;element name="processStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="statusCode">
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
    "errorSection",
    "processStatus"
})
@XmlRootElement(name = "Security_SignOutReply", namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
public class SecuritySignOutReply {

    @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
    protected SecuritySignOutReply.ErrorSection errorSection;
    @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
    protected SecuritySignOutReply.ProcessStatus processStatus;

    /**
     * Gets the value of the errorSection property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritySignOutReply.ErrorSection }
     *     
     */
    public SecuritySignOutReply.ErrorSection getErrorSection() {
        return errorSection;
    }

    /**
     * Sets the value of the errorSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritySignOutReply.ErrorSection }
     *     
     */
    public void setErrorSection(SecuritySignOutReply.ErrorSection value) {
        this.errorSection = value;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritySignOutReply.ProcessStatus }
     *     
     */
    public SecuritySignOutReply.ProcessStatus getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritySignOutReply.ProcessStatus }
     *     
     */
    public void setProcessStatus(SecuritySignOutReply.ProcessStatus value) {
        this.processStatus = value;
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
     *         &lt;element name="applicationError">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="errorDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="errorCode">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="errorCategory" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="errorCodeOwner" minOccurs="0">
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
     *         &lt;element name="interactiveFreeText" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="freeTextQualification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="textSubjectQualifier">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="informationType" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="language" minOccurs="0">
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
     *                   &lt;element name="freeText" maxOccurs="99" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="70"/>
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
        "applicationError",
        "interactiveFreeText"
    })
    public static class ErrorSection {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A", required = true)
        protected SecuritySignOutReply.ErrorSection.ApplicationError applicationError;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
        protected SecuritySignOutReply.ErrorSection.InteractiveFreeText interactiveFreeText;

        /**
         * Gets the value of the applicationError property.
         * 
         * @return
         *     possible object is
         *     {@link SecuritySignOutReply.ErrorSection.ApplicationError }
         *     
         */
        public SecuritySignOutReply.ErrorSection.ApplicationError getApplicationError() {
            return applicationError;
        }

        /**
         * Sets the value of the applicationError property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecuritySignOutReply.ErrorSection.ApplicationError }
         *     
         */
        public void setApplicationError(SecuritySignOutReply.ErrorSection.ApplicationError value) {
            this.applicationError = value;
        }

        /**
         * Gets the value of the interactiveFreeText property.
         * 
         * @return
         *     possible object is
         *     {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText }
         *     
         */
        public SecuritySignOutReply.ErrorSection.InteractiveFreeText getInteractiveFreeText() {
            return interactiveFreeText;
        }

        /**
         * Sets the value of the interactiveFreeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText }
         *     
         */
        public void setInteractiveFreeText(SecuritySignOutReply.ErrorSection.InteractiveFreeText value) {
            this.interactiveFreeText = value;
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
         *         &lt;element name="errorDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="errorCode">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="errorCategory" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="errorCodeOwner" minOccurs="0">
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
            "errorDetails"
        })
        public static class ApplicationError {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A", required = true)
            protected SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails errorDetails;

            /**
             * Gets the value of the errorDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails }
             *     
             */
            public SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails getErrorDetails() {
                return errorDetails;
            }

            /**
             * Sets the value of the errorDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails }
             *     
             */
            public void setErrorDetails(SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails value) {
                this.errorDetails = value;
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
             *         &lt;element name="errorCode">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="errorCategory" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="errorCodeOwner" minOccurs="0">
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
                "errorCode",
                "errorCategory",
                "errorCodeOwner"
            })
            public static class ErrorDetails {

                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A", required = true)
                protected String errorCode;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
                protected String errorCategory;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
                protected String errorCodeOwner;

                /**
                 * Gets the value of the errorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getErrorCode() {
                    return errorCode;
                }

                /**
                 * Sets the value of the errorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setErrorCode(String value) {
                    this.errorCode = value;
                }

                /**
                 * Gets the value of the errorCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getErrorCategory() {
                    return errorCategory;
                }

                /**
                 * Sets the value of the errorCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setErrorCategory(String value) {
                    this.errorCategory = value;
                }

                /**
                 * Gets the value of the errorCodeOwner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getErrorCodeOwner() {
                    return errorCodeOwner;
                }

                /**
                 * Sets the value of the errorCodeOwner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setErrorCodeOwner(String value) {
                    this.errorCodeOwner = value;
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
         *         &lt;element name="freeTextQualification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="textSubjectQualifier">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="informationType" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="language" minOccurs="0">
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
         *         &lt;element name="freeText" maxOccurs="99" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="70"/>
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
            "freeTextQualification",
            "freeText"
        })
        public static class InteractiveFreeText {

            @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
            protected SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification freeTextQualification;
            @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
            protected List<String> freeText;

            /**
             * Gets the value of the freeTextQualification property.
             * 
             * @return
             *     possible object is
             *     {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification }
             *     
             */
            public SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification getFreeTextQualification() {
                return freeTextQualification;
            }

            /**
             * Sets the value of the freeTextQualification property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification }
             *     
             */
            public void setFreeTextQualification(SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification value) {
                this.freeTextQualification = value;
            }

            /**
             * Gets the value of the freeText property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the freeText property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFreeText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFreeText() {
                if (freeText == null) {
                    freeText = new ArrayList<String>();
                }
                return this.freeText;
            }

            /**
             * Sets the value of the freeText property.
             * 
             * @param freeText
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFreeText(List<String> freeText) {
                this.freeText = freeText;
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
             *         &lt;element name="textSubjectQualifier">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="informationType" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="language" minOccurs="0">
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
                "textSubjectQualifier",
                "informationType",
                "language"
            })
            public static class FreeTextQualification {

                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A", required = true)
                protected String textSubjectQualifier;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
                protected String informationType;
                @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A")
                protected String language;

                /**
                 * Gets the value of the textSubjectQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTextSubjectQualifier() {
                    return textSubjectQualifier;
                }

                /**
                 * Sets the value of the textSubjectQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTextSubjectQualifier(String value) {
                    this.textSubjectQualifier = value;
                }

                /**
                 * Gets the value of the informationType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInformationType() {
                    return informationType;
                }

                /**
                 * Sets the value of the informationType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInformationType(String value) {
                    this.informationType = value;
                }

                /**
                 * Gets the value of the language property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguage() {
                    return language;
                }

                /**
                 * Sets the value of the language property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguage(String value) {
                    this.language = value;
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
     *         &lt;element name="statusCode">
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
        "statusCode"
    })
    public static class ProcessStatus {

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOR_04_1_1A", required = true)
        protected String statusCode;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

    }

}
