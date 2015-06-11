
package org.mule.modules.travelthingamadeuswebservices.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message
 * 
 * <p>Java class for ApplicationErrorInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ApplicationErrorDetailTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationTypeI", propOrder = {
    "error"
})
public class ApplicationErrorInformationTypeI {

    @XmlElement(required = true)
    protected ApplicationErrorDetailTypeI error;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public ApplicationErrorDetailTypeI getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public void setError(ApplicationErrorDetailTypeI value) {
        this.error = value;
    }

}
