
package org.mule.modules.travelthingamadeuswebservices.api;

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
    "conversationClt"
})
@XmlRootElement(name = "Security_SignOut", namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A")
public class SecuritySignOut {

    @XmlElement(namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A")
    protected SecuritySignOut.ConversationClt conversationClt;

    /**
     * Gets the value of the conversationClt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritySignOut.ConversationClt }
     *     
     */
    public SecuritySignOut.ConversationClt getConversationClt() {
        return conversationClt;
    }

    /**
     * Sets the value of the conversationClt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritySignOut.ConversationClt }
     *     
     */
    public void setConversationClt(SecuritySignOut.ConversationClt value) {
        this.conversationClt = value;
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

        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A", required = true)
        protected String senderIdentification;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A", required = true)
        protected String recipientIdentification;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A", required = true)
        protected String senderInterchangeControlReference;
        @XmlElement(namespace = "http://xml.amadeus.com/VLSSOQ_04_1_1A", required = true)
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

}
