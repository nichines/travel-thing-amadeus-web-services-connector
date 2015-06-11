
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
 *         &lt;element name="settings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="options">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="optionCode" maxOccurs="40">
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
 *                   &lt;element name="printer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identifierDetail" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="network" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="office" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="9"/>
 *                                   &lt;maxLength value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="teletypeAddress" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="7"/>
 *                                   &lt;maxLength value="7"/>
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
 *         &lt;element name="retrievalFacts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="retrieve">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="service" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="3"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tattoo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="office" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="9"/>
 *                                   &lt;maxLength value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="targetSystem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="option1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="option2" minOccurs="0">
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
 *                   &lt;element name="reservationOrProfileIdentifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reservation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
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
 *                   &lt;element name="personalFacts" minOccurs="0">
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
 *                                       &lt;element name="passenger" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="firstName">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="56"/>
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
 *                             &lt;element name="productInformation" minOccurs="0">
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
 *                                                 &lt;element name="depTime" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="4"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="arrDate" minOccurs="0">
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
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="3"/>
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
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="company" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="code">
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
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
 *                             &lt;element name="ticket" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="airline">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ticketNumber">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="10"/>
 *                                             &lt;maxLength value="10"/>
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
 *                   &lt;element name="frequentFlyer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="frequentTraveller">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="companyId">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="membershipNumber">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="27"/>
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
 *                   &lt;element name="accounting" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="number">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="30"/>
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
    "settings",
    "retrievalFacts"
})
@XmlRootElement(name = "PNR_Retrieve", namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
public class PNRRetrieve {

    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
    protected PNRRetrieve.Settings settings;
    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
    protected PNRRetrieve.RetrievalFacts retrievalFacts;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link PNRRetrieve.Settings }
     *     
     */
    public PNRRetrieve.Settings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRRetrieve.Settings }
     *     
     */
    public void setSettings(PNRRetrieve.Settings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the retrievalFacts property.
     * 
     * @return
     *     possible object is
     *     {@link PNRRetrieve.RetrievalFacts }
     *     
     */
    public PNRRetrieve.RetrievalFacts getRetrievalFacts() {
        return retrievalFacts;
    }

    /**
     * Sets the value of the retrievalFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRRetrieve.RetrievalFacts }
     *     
     */
    public void setRetrievalFacts(PNRRetrieve.RetrievalFacts value) {
        this.retrievalFacts = value;
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
     *         &lt;element name="retrieve">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="service" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="3"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tattoo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="5"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="office" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="9"/>
     *                         &lt;maxLength value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="targetSystem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="option1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="option2" minOccurs="0">
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
     *         &lt;element name="reservationOrProfileIdentifier" minOccurs="0">
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
     *         &lt;element name="personalFacts" minOccurs="0">
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
     *                             &lt;element name="passenger" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="firstName">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="56"/>
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
     *                   &lt;element name="productInformation" minOccurs="0">
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
     *                                       &lt;element name="depTime" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="4"/>
     *                                             &lt;maxLength value="4"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="arrDate" minOccurs="0">
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
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="3"/>
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
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="company" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="code">
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
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
     *                   &lt;element name="ticket" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="airline">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ticketNumber">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="10"/>
     *                                   &lt;maxLength value="10"/>
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
     *         &lt;element name="frequentFlyer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="frequentTraveller">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="companyId">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="membershipNumber">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="27"/>
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
     *         &lt;element name="accounting" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="account">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="number">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="30"/>
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
        "retrieve",
        "reservationOrProfileIdentifier",
        "personalFacts",
        "frequentFlyer",
        "accounting"
    })
    public static class RetrievalFacts {

        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
        protected PNRRetrieve.RetrievalFacts.Retrieve retrieve;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
        protected PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier reservationOrProfileIdentifier;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
        protected PNRRetrieve.RetrievalFacts.PersonalFacts personalFacts;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
        protected PNRRetrieve.RetrievalFacts.FrequentFlyer frequentFlyer;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
        protected PNRRetrieve.RetrievalFacts.Accounting accounting;

        /**
         * Gets the value of the retrieve property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.Retrieve }
         *     
         */
        public PNRRetrieve.RetrievalFacts.Retrieve getRetrieve() {
            return retrieve;
        }

        /**
         * Sets the value of the retrieve property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.Retrieve }
         *     
         */
        public void setRetrieve(PNRRetrieve.RetrievalFacts.Retrieve value) {
            this.retrieve = value;
        }

        /**
         * Gets the value of the reservationOrProfileIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier }
         *     
         */
        public PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier getReservationOrProfileIdentifier() {
            return reservationOrProfileIdentifier;
        }

        /**
         * Sets the value of the reservationOrProfileIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier }
         *     
         */
        public void setReservationOrProfileIdentifier(PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier value) {
            this.reservationOrProfileIdentifier = value;
        }

        /**
         * Gets the value of the personalFacts property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts }
         *     
         */
        public PNRRetrieve.RetrievalFacts.PersonalFacts getPersonalFacts() {
            return personalFacts;
        }

        /**
         * Sets the value of the personalFacts property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts }
         *     
         */
        public void setPersonalFacts(PNRRetrieve.RetrievalFacts.PersonalFacts value) {
            this.personalFacts = value;
        }

        /**
         * Gets the value of the frequentFlyer property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.FrequentFlyer }
         *     
         */
        public PNRRetrieve.RetrievalFacts.FrequentFlyer getFrequentFlyer() {
            return frequentFlyer;
        }

        /**
         * Sets the value of the frequentFlyer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.FrequentFlyer }
         *     
         */
        public void setFrequentFlyer(PNRRetrieve.RetrievalFacts.FrequentFlyer value) {
            this.frequentFlyer = value;
        }

        /**
         * Gets the value of the accounting property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.Accounting }
         *     
         */
        public PNRRetrieve.RetrievalFacts.Accounting getAccounting() {
            return accounting;
        }

        /**
         * Sets the value of the accounting property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.Accounting }
         *     
         */
        public void setAccounting(PNRRetrieve.RetrievalFacts.Accounting value) {
            this.accounting = value;
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
         *         &lt;element name="account">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="number">
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
            "account"
        })
        public static class Accounting {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
            protected PNRRetrieve.RetrievalFacts.Accounting.Account account;

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.Accounting.Account }
             *     
             */
            public PNRRetrieve.RetrievalFacts.Accounting.Account getAccount() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.Accounting.Account }
             *     
             */
            public void setAccount(PNRRetrieve.RetrievalFacts.Accounting.Account value) {
                this.account = value;
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
             *         &lt;element name="number">
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
                "number"
            })
            public static class Account {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String number;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(String value) {
                    this.number = value;
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
         *         &lt;element name="frequentTraveller">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="companyId">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="membershipNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="27"/>
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
            "frequentTraveller"
        })
        public static class FrequentFlyer {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
            protected PNRRetrieve.RetrievalFacts.FrequentFlyer.FrequentTraveller frequentTraveller;

            /**
             * Gets the value of the frequentTraveller property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.FrequentFlyer.FrequentTraveller }
             *     
             */
            public PNRRetrieve.RetrievalFacts.FrequentFlyer.FrequentTraveller getFrequentTraveller() {
                return frequentTraveller;
            }

            /**
             * Sets the value of the frequentTraveller property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.FrequentFlyer.FrequentTraveller }
             *     
             */
            public void setFrequentTraveller(PNRRetrieve.RetrievalFacts.FrequentFlyer.FrequentTraveller value) {
                this.frequentTraveller = value;
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
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="membershipNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="27"/>
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
                "membershipNumber"
            })
            public static class FrequentTraveller {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String companyId;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String membershipNumber;

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
                 * Gets the value of the membershipNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMembershipNumber() {
                    return membershipNumber;
                }

                /**
                 * Sets the value of the membershipNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMembershipNumber(String value) {
                    this.membershipNumber = value;
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
         *                   &lt;element name="passenger" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="firstName">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="56"/>
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
         *         &lt;element name="productInformation" minOccurs="0">
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
         *                             &lt;element name="depTime" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="4"/>
         *                                   &lt;maxLength value="4"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="arrDate" minOccurs="0">
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
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="3"/>
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
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="company" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="code">
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
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
         *         &lt;element name="ticket" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="airline">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ticketNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="10"/>
         *                         &lt;maxLength value="10"/>
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
            "travellerInformation",
            "productInformation",
            "ticket"
        })
        public static class PersonalFacts {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
            protected PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation travellerInformation;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation productInformation;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected PNRRetrieve.RetrievalFacts.PersonalFacts.Ticket ticket;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation }
             *     
             */
            public PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation }
             *     
             */
            public void setTravellerInformation(PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the productInformation property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation }
             *     
             */
            public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation getProductInformation() {
                return productInformation;
            }

            /**
             * Sets the value of the productInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation }
             *     
             */
            public void setProductInformation(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation value) {
                this.productInformation = value;
            }

            /**
             * Gets the value of the ticket property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.Ticket }
             *     
             */
            public PNRRetrieve.RetrievalFacts.PersonalFacts.Ticket getTicket() {
                return ticket;
            }

            /**
             * Sets the value of the ticket property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.Ticket }
             *     
             */
            public void setTicket(PNRRetrieve.RetrievalFacts.PersonalFacts.Ticket value) {
                this.ticket = value;
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
             *                   &lt;element name="depTime" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="4"/>
             *                         &lt;maxLength value="4"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="arrDate" minOccurs="0">
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
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="3"/>
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
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="company" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="code">
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
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
                "company",
                "productDetails"
            })
            public static class ProductInformation {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Product product;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.BoardpointDetail boardpointDetail;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.OffpointDetail offpointDetail;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Company company;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.ProductDetails productDetails;

                /**
                 * Gets the value of the product property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Product }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Product getProduct() {
                    return product;
                }

                /**
                 * Sets the value of the product property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Product }
                 *     
                 */
                public void setProduct(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Product value) {
                    this.product = value;
                }

                /**
                 * Gets the value of the boardpointDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.BoardpointDetail }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.BoardpointDetail getBoardpointDetail() {
                    return boardpointDetail;
                }

                /**
                 * Sets the value of the boardpointDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.BoardpointDetail }
                 *     
                 */
                public void setBoardpointDetail(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.BoardpointDetail value) {
                    this.boardpointDetail = value;
                }

                /**
                 * Gets the value of the offpointDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.OffpointDetail }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.OffpointDetail getOffpointDetail() {
                    return offpointDetail;
                }

                /**
                 * Sets the value of the offpointDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.OffpointDetail }
                 *     
                 */
                public void setOffpointDetail(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.OffpointDetail value) {
                    this.offpointDetail = value;
                }

                /**
                 * Gets the value of the company property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Company }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Company getCompany() {
                    return company;
                }

                /**
                 * Sets the value of the company property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Company }
                 *     
                 */
                public void setCompany(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.Company value) {
                    this.company = value;
                }

                /**
                 * Gets the value of the productDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.ProductDetails }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.ProductDetails getProductDetails() {
                    return productDetails;
                }

                /**
                 * Sets the value of the productDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.ProductDetails }
                 *     
                 */
                public void setProductDetails(PNRRetrieve.RetrievalFacts.PersonalFacts.ProductInformation.ProductDetails value) {
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
                 *               &lt;minLength value="3"/>
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
                    "cityCode"
                })
                public static class BoardpointDetail {

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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
                 *         &lt;element name="code">
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
                    "code"
                })
                public static class Company {

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                    protected String code;

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
                 *               &lt;minLength value="3"/>
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
                    "cityCode"
                })
                public static class OffpointDetail {

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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
                 *         &lt;element name="depTime" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="4"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="arrDate" minOccurs="0">
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
                    "depDate",
                    "depTime",
                    "arrDate"
                })
                public static class Product {

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                    protected String depDate;
                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                    protected String depTime;
                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                    protected String arrDate;

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

                    /**
                     * Gets the value of the depTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDepTime() {
                        return depTime;
                    }

                    /**
                     * Sets the value of the depTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepTime(String value) {
                        this.depTime = value;
                    }

                    /**
                     * Gets the value of the arrDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getArrDate() {
                        return arrDate;
                    }

                    /**
                     * Sets the value of the arrDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setArrDate(String value) {
                        this.arrDate = value;
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
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                    protected BigDecimal identification;
                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                    protected String subtype;

                    /**
                     * Gets the value of the identification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getIdentification() {
                        return identification;
                    }

                    /**
                     * Sets the value of the identification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setIdentification(BigDecimal value) {
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
             *         &lt;element name="airline">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ticketNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="10"/>
             *               &lt;maxLength value="10"/>
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
                "airline",
                "ticketNumber"
            })
            public static class Ticket {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String airline;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String ticketNumber;

                /**
                 * Gets the value of the airline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirline() {
                    return airline;
                }

                /**
                 * Sets the value of the airline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirline(String value) {
                    this.airline = value;
                }

                /**
                 * Gets the value of the ticketNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketNumber() {
                    return ticketNumber;
                }

                /**
                 * Sets the value of the ticketNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketNumber(String value) {
                    this.ticketNumber = value;
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
             *         &lt;element name="passenger" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="firstName">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="56"/>
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
                "traveller",
                "passenger"
            })
            public static class TravellerInformation {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Traveller traveller;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Passenger passenger;

                /**
                 * Gets the value of the traveller property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Traveller }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Traveller getTraveller() {
                    return traveller;
                }

                /**
                 * Sets the value of the traveller property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Traveller }
                 *     
                 */
                public void setTraveller(PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Traveller value) {
                    this.traveller = value;
                }

                /**
                 * Gets the value of the passenger property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Passenger }
                 *     
                 */
                public PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Passenger getPassenger() {
                    return passenger;
                }

                /**
                 * Sets the value of the passenger property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Passenger }
                 *     
                 */
                public void setPassenger(PNRRetrieve.RetrievalFacts.PersonalFacts.TravellerInformation.Passenger value) {
                    this.passenger = value;
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
                 *         &lt;element name="firstName">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="56"/>
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
                    "firstName"
                })
                public static class Passenger {

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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

                    @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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
        public static class ReservationOrProfileIdentifier {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
            protected PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation reservation;

            /**
             * Gets the value of the reservation property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation }
             *     
             */
            public PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation getReservation() {
                return reservation;
            }

            /**
             * Sets the value of the reservation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation }
             *     
             */
            public void setReservation(PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation value) {
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

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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
         *         &lt;element name="type">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="service" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="3"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tattoo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="office" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="9"/>
         *               &lt;maxLength value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="targetSystem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="option1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="option2" minOccurs="0">
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
            "type",
            "service",
            "tattoo",
            "office",
            "targetSystem",
            "option1",
            "option2"
        })
        public static class Retrieve {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
            protected String type;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String service;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String tattoo;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String office;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String targetSystem;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String option1;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String option2;

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
             * Gets the value of the service property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getService() {
                return service;
            }

            /**
             * Sets the value of the service property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setService(String value) {
                this.service = value;
            }

            /**
             * Gets the value of the tattoo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTattoo() {
                return tattoo;
            }

            /**
             * Sets the value of the tattoo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTattoo(String value) {
                this.tattoo = value;
            }

            /**
             * Gets the value of the office property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffice() {
                return office;
            }

            /**
             * Sets the value of the office property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffice(String value) {
                this.office = value;
            }

            /**
             * Gets the value of the targetSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetSystem() {
                return targetSystem;
            }

            /**
             * Sets the value of the targetSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetSystem(String value) {
                this.targetSystem = value;
            }

            /**
             * Gets the value of the option1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOption1() {
                return option1;
            }

            /**
             * Sets the value of the option1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOption1(String value) {
                this.option1 = value;
            }

            /**
             * Gets the value of the option2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOption2() {
                return option2;
            }

            /**
             * Sets the value of the option2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOption2(String value) {
                this.option2 = value;
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
     *         &lt;element name="options">
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
     *         &lt;element name="printer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identifierDetail" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="5"/>
     *                                   &lt;maxLength value="6"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="network" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="office" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="9"/>
     *                         &lt;maxLength value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="teletypeAddress" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="7"/>
     *                         &lt;maxLength value="7"/>
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
        "options",
        "printer"
    })
    public static class Settings {

        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
        protected PNRRetrieve.Settings.Options options;
        @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
        protected PNRRetrieve.Settings.Printer printer;

        /**
         * Gets the value of the options property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.Settings.Options }
         *     
         */
        public PNRRetrieve.Settings.Options getOptions() {
            return options;
        }

        /**
         * Sets the value of the options property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.Settings.Options }
         *     
         */
        public void setOptions(PNRRetrieve.Settings.Options value) {
            this.options = value;
        }

        /**
         * Gets the value of the printer property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.Settings.Printer }
         *     
         */
        public PNRRetrieve.Settings.Printer getPrinter() {
            return printer;
        }

        /**
         * Sets the value of the printer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.Settings.Printer }
         *     
         */
        public void setPrinter(PNRRetrieve.Settings.Printer value) {
            this.printer = value;
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
        public static class Options {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
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
         *         &lt;element name="identifierDetail" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="5"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="network" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="office" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="9"/>
         *               &lt;maxLength value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="teletypeAddress" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="7"/>
         *               &lt;maxLength value="7"/>
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
            "identifierDetail",
            "office",
            "teletypeAddress"
        })
        public static class Printer {

            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected PNRRetrieve.Settings.Printer.IdentifierDetail identifierDetail;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String office;
            @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
            protected String teletypeAddress;

            /**
             * Gets the value of the identifierDetail property.
             * 
             * @return
             *     possible object is
             *     {@link PNRRetrieve.Settings.Printer.IdentifierDetail }
             *     
             */
            public PNRRetrieve.Settings.Printer.IdentifierDetail getIdentifierDetail() {
                return identifierDetail;
            }

            /**
             * Sets the value of the identifierDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRRetrieve.Settings.Printer.IdentifierDetail }
             *     
             */
            public void setIdentifierDetail(PNRRetrieve.Settings.Printer.IdentifierDetail value) {
                this.identifierDetail = value;
            }

            /**
             * Gets the value of the office property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffice() {
                return office;
            }

            /**
             * Sets the value of the office property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffice(String value) {
                this.office = value;
            }

            /**
             * Gets the value of the teletypeAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTeletypeAddress() {
                return teletypeAddress;
            }

            /**
             * Sets the value of the teletypeAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTeletypeAddress(String value) {
                this.teletypeAddress = value;
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
             *         &lt;element name="name">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="5"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="network" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="2"/>
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
                "name",
                "network"
            })
            public static class IdentifierDetail {

                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A", required = true)
                protected String name;
                @XmlElement(namespace = "http://xml.amadeus.com/PNRRET_09_1_1A")
                protected String network;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the network property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNetwork() {
                    return network;
                }

                /**
                 * Sets the value of the network property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNetwork(String value) {
                    this.network = value;
                }

            }

        }

    }

}
