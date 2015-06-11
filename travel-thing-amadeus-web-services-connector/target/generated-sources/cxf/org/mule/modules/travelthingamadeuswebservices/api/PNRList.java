
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
 *         &lt;element name="freeFormText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="freetextDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subjectQualifier">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="type" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="text" minOccurs="0">
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
 *         &lt;element name="citypair">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestinationMarker">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="travellerInformationSection" maxOccurs="300">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travellerInformation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="traveller">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="surname">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="57"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="passenger" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;sequence>
 *                                                   &lt;element name="firstName">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="56"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="relatedProduct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="quantity" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="status" minOccurs="0">
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
 *                             &lt;element name="travelProduct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="product" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="depDate">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="6"/>
 *                                                       &lt;maxLength value="6"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="boardpointDetail" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cityCode">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="offpointDetail" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cityCode">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="companyDetail" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="identification">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="productDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="identification">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="4"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="subtype" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reservationInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="reservation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="companyId">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="controlNumber">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="productInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="product" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="identification">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="messageAction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="business">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="function" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
 *         &lt;element name="errorInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorDetail">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="errorCode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="qualifier">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="responsibleAgency">
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
    "freeFormText",
    "citypair",
    "errorInformation"
})
@XmlRootElement(name = "PNR_List", namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
public class PNRList {

    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
    protected PNRList.FreeFormText freeFormText;
    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
    protected PNRList.Citypair citypair;
    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
    protected PNRList.ErrorInformation errorInformation;

    /**
     * Gets the value of the freeFormText property.
     * 
     * @return
     *     possible object is
     *     {@link PNRList.FreeFormText }
     *     
     */
    public PNRList.FreeFormText getFreeFormText() {
        return freeFormText;
    }

    /**
     * Sets the value of the freeFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRList.FreeFormText }
     *     
     */
    public void setFreeFormText(PNRList.FreeFormText value) {
        this.freeFormText = value;
    }

    /**
     * Gets the value of the citypair property.
     * 
     * @return
     *     possible object is
     *     {@link PNRList.Citypair }
     *     
     */
    public PNRList.Citypair getCitypair() {
        return citypair;
    }

    /**
     * Sets the value of the citypair property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRList.Citypair }
     *     
     */
    public void setCitypair(PNRList.Citypair value) {
        this.citypair = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PNRList.ErrorInformation }
     *     
     */
    public PNRList.ErrorInformation getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRList.ErrorInformation }
     *     
     */
    public void setErrorInformation(PNRList.ErrorInformation value) {
        this.errorInformation = value;
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
     *         &lt;element name="originDestinationMarker">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="travellerInformationSection" maxOccurs="300">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travellerInformation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="traveller">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="surname">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="57"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="passenger" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;sequence>
     *                                         &lt;element name="firstName">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="56"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
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
     *                   &lt;element name="relatedProduct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="quantity" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="status" minOccurs="0">
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
     *                   &lt;element name="travelProduct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="product" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="depDate">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="6"/>
     *                                             &lt;maxLength value="6"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="boardpointDetail" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cityCode">
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
     *                             &lt;element name="offpointDetail" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cityCode">
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
     *                             &lt;element name="companyDetail" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="identification">
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
     *                             &lt;element name="productDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="identification">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="4"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="subtype" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="1"/>
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
     *                   &lt;element name="reservationInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="reservation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="companyId">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="controlNumber">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="20"/>
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
     *                   &lt;element name="productInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="product" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="identification">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="description" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="1"/>
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
     *                   &lt;element name="messageAction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="business">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="function" minOccurs="0">
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
        "originDestinationMarker",
        "travellerInformationSection"
    })
    public static class Citypair {

        @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
        protected PNRList.Citypair.OriginDestinationMarker originDestinationMarker;
        @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
        protected List<PNRList.Citypair.TravellerInformationSection> travellerInformationSection;

        /**
         * Gets the value of the originDestinationMarker property.
         * 
         * @return
         *     possible object is
         *     {@link PNRList.Citypair.OriginDestinationMarker }
         *     
         */
        public PNRList.Citypair.OriginDestinationMarker getOriginDestinationMarker() {
            return originDestinationMarker;
        }

        /**
         * Sets the value of the originDestinationMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRList.Citypair.OriginDestinationMarker }
         *     
         */
        public void setOriginDestinationMarker(PNRList.Citypair.OriginDestinationMarker value) {
            this.originDestinationMarker = value;
        }

        /**
         * Gets the value of the travellerInformationSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travellerInformationSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravellerInformationSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRList.Citypair.TravellerInformationSection }
         * 
         * 
         */
        public List<PNRList.Citypair.TravellerInformationSection> getTravellerInformationSection() {
            if (travellerInformationSection == null) {
                travellerInformationSection = new ArrayList<PNRList.Citypair.TravellerInformationSection>();
            }
            return this.travellerInformationSection;
        }

        /**
         * Sets the value of the travellerInformationSection property.
         * 
         * @param travellerInformationSection
         *     allowed object is
         *     {@link PNRList.Citypair.TravellerInformationSection }
         *     
         */
        public void setTravellerInformationSection(List<PNRList.Citypair.TravellerInformationSection> travellerInformationSection) {
            this.travellerInformationSection = travellerInformationSection;
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
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OriginDestinationMarker {


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
         *         &lt;element name="travellerInformation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="traveller">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="surname">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="57"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="passenger" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;sequence>
         *                               &lt;element name="firstName">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="56"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
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
         *         &lt;element name="relatedProduct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="quantity" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="status" minOccurs="0">
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
         *         &lt;element name="travelProduct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="product" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="depDate">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="6"/>
         *                                   &lt;maxLength value="6"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="boardpointDetail" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cityCode">
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
         *                   &lt;element name="offpointDetail" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cityCode">
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
         *                   &lt;element name="companyDetail" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="identification">
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
         *                   &lt;element name="productDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="identification">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="4"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="subtype" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="1"/>
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
         *         &lt;element name="reservationInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="reservation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="companyId">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
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
         *         &lt;element name="productInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="product" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="identification">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="description" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="1"/>
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
         *         &lt;element name="messageAction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="business">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="function" minOccurs="0">
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
            "travellerInformation",
            "relatedProduct",
            "travelProduct",
            "reservationInfo",
            "productInfo",
            "messageAction"
        })
        public static class TravellerInformationSection {

            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected PNRList.Citypair.TravellerInformationSection.TravellerInformation travellerInformation;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
            protected PNRList.Citypair.TravellerInformationSection.RelatedProduct relatedProduct;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
            protected PNRList.Citypair.TravellerInformationSection.TravelProduct travelProduct;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected PNRList.Citypair.TravellerInformationSection.ReservationInfo reservationInfo;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
            protected PNRList.Citypair.TravellerInformationSection.ProductInfo productInfo;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
            protected PNRList.Citypair.TravellerInformationSection.MessageAction messageAction;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.TravellerInformation getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation }
             *     
             */
            public void setTravellerInformation(PNRList.Citypair.TravellerInformationSection.TravellerInformation value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the relatedProduct property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.RelatedProduct }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.RelatedProduct getRelatedProduct() {
                return relatedProduct;
            }

            /**
             * Sets the value of the relatedProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.RelatedProduct }
             *     
             */
            public void setRelatedProduct(PNRList.Citypair.TravellerInformationSection.RelatedProduct value) {
                this.relatedProduct = value;
            }

            /**
             * Gets the value of the travelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.TravelProduct getTravelProduct() {
                return travelProduct;
            }

            /**
             * Sets the value of the travelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct }
             *     
             */
            public void setTravelProduct(PNRList.Citypair.TravellerInformationSection.TravelProduct value) {
                this.travelProduct = value;
            }

            /**
             * Gets the value of the reservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.ReservationInfo }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.ReservationInfo getReservationInfo() {
                return reservationInfo;
            }

            /**
             * Sets the value of the reservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.ReservationInfo }
             *     
             */
            public void setReservationInfo(PNRList.Citypair.TravellerInformationSection.ReservationInfo value) {
                this.reservationInfo = value;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.ProductInfo }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.ProductInfo getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.ProductInfo }
             *     
             */
            public void setProductInfo(PNRList.Citypair.TravellerInformationSection.ProductInfo value) {
                this.productInfo = value;
            }

            /**
             * Gets the value of the messageAction property.
             * 
             * @return
             *     possible object is
             *     {@link PNRList.Citypair.TravellerInformationSection.MessageAction }
             *     
             */
            public PNRList.Citypair.TravellerInformationSection.MessageAction getMessageAction() {
                return messageAction;
            }

            /**
             * Sets the value of the messageAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRList.Citypair.TravellerInformationSection.MessageAction }
             *     
             */
            public void setMessageAction(PNRList.Citypair.TravellerInformationSection.MessageAction value) {
                this.messageAction = value;
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
             *         &lt;element name="business">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="function" minOccurs="0">
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
                "business"
            })
            public static class MessageAction {

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                protected PNRList.Citypair.TravellerInformationSection.MessageAction.Business business;

                /**
                 * Gets the value of the business property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.MessageAction.Business }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.MessageAction.Business getBusiness() {
                    return business;
                }

                /**
                 * Sets the value of the business property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.MessageAction.Business }
                 *     
                 */
                public void setBusiness(PNRList.Citypair.TravellerInformationSection.MessageAction.Business value) {
                    this.business = value;
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
                 *         &lt;element name="function" minOccurs="0">
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
                    "function"
                })
                public static class Business {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                    protected String function;

                    /**
                     * Gets the value of the function property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFunction() {
                        return function;
                    }

                    /**
                     * Sets the value of the function property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFunction(String value) {
                        this.function = value;
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
             *         &lt;element name="product" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="identification">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="description" minOccurs="0">
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
                "product"
            })
            public static class ProductInfo {

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.ProductInfo.Product product;

                /**
                 * Gets the value of the product property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.ProductInfo.Product }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.ProductInfo.Product getProduct() {
                    return product;
                }

                /**
                 * Sets the value of the product property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.ProductInfo.Product }
                 *     
                 */
                public void setProduct(PNRList.Citypair.TravellerInformationSection.ProductInfo.Product value) {
                    this.product = value;
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
                 *         &lt;element name="identification">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="description" minOccurs="0">
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
                    "identification",
                    "description"
                })
                public static class Product {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String identification;
                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                    protected String description;

                    /**
                     * Gets the value of the identification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentification() {
                        return identification;
                    }

                    /**
                     * Sets the value of the identification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentification(String value) {
                        this.identification = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
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
             *         &lt;element name="quantity" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="status" minOccurs="0">
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
                "quantity",
                "status"
            })
            public static class RelatedProduct {

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected BigDecimal quantity;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected String status;

                /**
                 * Gets the value of the quantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setQuantity(BigDecimal value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
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
             *         &lt;element name="reservation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="companyId">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
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

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.ReservationInfo.Reservation reservation;

                /**
                 * Gets the value of the reservation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.ReservationInfo.Reservation }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.ReservationInfo.Reservation getReservation() {
                    return reservation;
                }

                /**
                 * Sets the value of the reservation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.ReservationInfo.Reservation }
                 *     
                 */
                public void setReservation(PNRList.Citypair.TravellerInformationSection.ReservationInfo.Reservation value) {
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
                 *         &lt;element name="companyId">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
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
                    "companyId",
                    "controlNumber"
                })
                public static class Reservation {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String companyId;
                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String controlNumber;

                    /**
                     * Gets the value of the companyId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCompanyId() {
                        return companyId;
                    }

                    /**
                     * Sets the value of the companyId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCompanyId(String value) {
                        this.companyId = value;
                    }

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
             *         &lt;element name="product" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="depDate">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="6"/>
             *                         &lt;maxLength value="6"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="boardpointDetail" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cityCode">
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
             *         &lt;element name="offpointDetail" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cityCode">
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
             *         &lt;element name="companyDetail" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="identification">
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
             *         &lt;element name="productDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="identification">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="4"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="subtype" minOccurs="0">
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
                "product",
                "boardpointDetail",
                "offpointDetail",
                "companyDetail",
                "productDetails"
            })
            public static class TravelProduct {

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.TravelProduct.Product product;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.TravelProduct.BoardpointDetail boardpointDetail;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.TravelProduct.OffpointDetail offpointDetail;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.TravelProduct.CompanyDetail companyDetail;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected PNRList.Citypair.TravellerInformationSection.TravelProduct.ProductDetails productDetails;

                /**
                 * Gets the value of the product property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.Product }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravelProduct.Product getProduct() {
                    return product;
                }

                /**
                 * Sets the value of the product property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.Product }
                 *     
                 */
                public void setProduct(PNRList.Citypair.TravellerInformationSection.TravelProduct.Product value) {
                    this.product = value;
                }

                /**
                 * Gets the value of the boardpointDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.BoardpointDetail }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravelProduct.BoardpointDetail getBoardpointDetail() {
                    return boardpointDetail;
                }

                /**
                 * Sets the value of the boardpointDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.BoardpointDetail }
                 *     
                 */
                public void setBoardpointDetail(PNRList.Citypair.TravellerInformationSection.TravelProduct.BoardpointDetail value) {
                    this.boardpointDetail = value;
                }

                /**
                 * Gets the value of the offpointDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.OffpointDetail }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravelProduct.OffpointDetail getOffpointDetail() {
                    return offpointDetail;
                }

                /**
                 * Sets the value of the offpointDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.OffpointDetail }
                 *     
                 */
                public void setOffpointDetail(PNRList.Citypair.TravellerInformationSection.TravelProduct.OffpointDetail value) {
                    this.offpointDetail = value;
                }

                /**
                 * Gets the value of the companyDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.CompanyDetail }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravelProduct.CompanyDetail getCompanyDetail() {
                    return companyDetail;
                }

                /**
                 * Sets the value of the companyDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.CompanyDetail }
                 *     
                 */
                public void setCompanyDetail(PNRList.Citypair.TravellerInformationSection.TravelProduct.CompanyDetail value) {
                    this.companyDetail = value;
                }

                /**
                 * Gets the value of the productDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.ProductDetails }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravelProduct.ProductDetails getProductDetails() {
                    return productDetails;
                }

                /**
                 * Sets the value of the productDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravelProduct.ProductDetails }
                 *     
                 */
                public void setProductDetails(PNRList.Citypair.TravellerInformationSection.TravelProduct.ProductDetails value) {
                    this.productDetails = value;
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
                 *         &lt;element name="cityCode">
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
                    "cityCode"
                })
                public static class BoardpointDetail {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String cityCode;

                    /**
                     * Gets the value of the cityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityCode() {
                        return cityCode;
                    }

                    /**
                     * Sets the value of the cityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityCode(String value) {
                        this.cityCode = value;
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
                 *         &lt;element name="identification">
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
                    "identification"
                })
                public static class CompanyDetail {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String identification;

                    /**
                     * Gets the value of the identification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentification() {
                        return identification;
                    }

                    /**
                     * Sets the value of the identification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentification(String value) {
                        this.identification = value;
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
                 *         &lt;element name="cityCode">
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
                    "cityCode"
                })
                public static class OffpointDetail {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String cityCode;

                    /**
                     * Gets the value of the cityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityCode() {
                        return cityCode;
                    }

                    /**
                     * Sets the value of the cityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityCode(String value) {
                        this.cityCode = value;
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
                 *         &lt;element name="depDate">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="6"/>
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
                    "depDate"
                })
                public static class Product {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String depDate;

                    /**
                     * Gets the value of the depDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDepDate() {
                        return depDate;
                    }

                    /**
                     * Sets the value of the depDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepDate(String value) {
                        this.depDate = value;
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
                 *         &lt;element name="identification">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="subtype" minOccurs="0">
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
                    "identification",
                    "subtype"
                })
                public static class ProductDetails {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String identification;
                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                    protected String subtype;

                    /**
                     * Gets the value of the identification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentification() {
                        return identification;
                    }

                    /**
                     * Sets the value of the identification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentification(String value) {
                        this.identification = value;
                    }

                    /**
                     * Gets the value of the subtype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubtype() {
                        return subtype;
                    }

                    /**
                     * Sets the value of the subtype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubtype(String value) {
                        this.subtype = value;
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
             *         &lt;element name="traveller">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="surname">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="57"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="passenger" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;sequence>
             *                     &lt;element name="firstName">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="56"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
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
                "traveller",
                "passenger"
            })
            public static class TravellerInformation {

                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                protected PNRList.Citypair.TravellerInformationSection.TravellerInformation.Traveller traveller;
                @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
                protected List<PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger> passenger;

                /**
                 * Gets the value of the traveller property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation.Traveller }
                 *     
                 */
                public PNRList.Citypair.TravellerInformationSection.TravellerInformation.Traveller getTraveller() {
                    return traveller;
                }

                /**
                 * Sets the value of the traveller property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation.Traveller }
                 *     
                 */
                public void setTraveller(PNRList.Citypair.TravellerInformationSection.TravellerInformation.Traveller value) {
                    this.traveller = value;
                }

                /**
                 * Gets the value of the passenger property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the passenger property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPassenger().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger }
                 * 
                 * 
                 */
                public List<PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger> getPassenger() {
                    if (passenger == null) {
                        passenger = new ArrayList<PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger>();
                    }
                    return this.passenger;
                }

                /**
                 * Sets the value of the passenger property.
                 * 
                 * @param passenger
                 *     allowed object is
                 *     {@link PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger }
                 *     
                 */
                public void setPassenger(List<PNRList.Citypair.TravellerInformationSection.TravellerInformation.Passenger> passenger) {
                    this.passenger = passenger;
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
                 *         &lt;sequence>
                 *           &lt;element name="firstName">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                 &lt;minLength value="1"/>
                 *                 &lt;maxLength value="56"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *         &lt;/sequence>
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
                    "firstName"
                })
                public static class Passenger {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String firstName;

                    /**
                     * Gets the value of the firstName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFirstName() {
                        return firstName;
                    }

                    /**
                     * Sets the value of the firstName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFirstName(String value) {
                        this.firstName = value;
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
                 *         &lt;element name="surname">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="57"/>
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
                    "surname"
                })
                public static class Traveller {

                    @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
                    protected String surname;

                    /**
                     * Gets the value of the surname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSurname() {
                        return surname;
                    }

                    /**
                     * Sets the value of the surname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSurname(String value) {
                        this.surname = value;
                    }

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
     *         &lt;element name="errorDetail">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="errorCode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="qualifier">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="responsibleAgency">
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
        "errorDetail"
    })
    public static class ErrorInformation {

        @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
        protected PNRList.ErrorInformation.ErrorDetail errorDetail;

        /**
         * Gets the value of the errorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link PNRList.ErrorInformation.ErrorDetail }
         *     
         */
        public PNRList.ErrorInformation.ErrorDetail getErrorDetail() {
            return errorDetail;
        }

        /**
         * Sets the value of the errorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRList.ErrorInformation.ErrorDetail }
         *     
         */
        public void setErrorDetail(PNRList.ErrorInformation.ErrorDetail value) {
            this.errorDetail = value;
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
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="qualifier">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="responsibleAgency">
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
            "qualifier",
            "responsibleAgency"
        })
        public static class ErrorDetail {

            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected String errorCode;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected String qualifier;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected String responsibleAgency;

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

            /**
             * Gets the value of the responsibleAgency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsibleAgency() {
                return responsibleAgency;
            }

            /**
             * Sets the value of the responsibleAgency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsibleAgency(String value) {
                this.responsibleAgency = value;
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
     *         &lt;element name="freetextDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subjectQualifier">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="type" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="text" minOccurs="0">
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
        "freetextDetail",
        "text"
    })
    public static class FreeFormText {

        @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
        protected PNRList.FreeFormText.FreetextDetail freetextDetail;
        @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
        protected String text;

        /**
         * Gets the value of the freetextDetail property.
         * 
         * @return
         *     possible object is
         *     {@link PNRList.FreeFormText.FreetextDetail }
         *     
         */
        public PNRList.FreeFormText.FreetextDetail getFreetextDetail() {
            return freetextDetail;
        }

        /**
         * Sets the value of the freetextDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRList.FreeFormText.FreetextDetail }
         *     
         */
        public void setFreetextDetail(PNRList.FreeFormText.FreetextDetail value) {
            this.freetextDetail = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
         *         &lt;element name="subjectQualifier">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="type" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4"/>
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
            "subjectQualifier",
            "type"
        })
        public static class FreetextDetail {

            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A", required = true)
            protected String subjectQualifier;
            @XmlElement(namespace = "http://xml.amadeus.com/TNLRES_00_1_1A")
            protected String type;

            /**
             * Gets the value of the subjectQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubjectQualifier() {
                return subjectQualifier;
            }

            /**
             * Sets the value of the subjectQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubjectQualifier(String value) {
                this.subjectQualifier = value;
            }

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

        }

    }

}
