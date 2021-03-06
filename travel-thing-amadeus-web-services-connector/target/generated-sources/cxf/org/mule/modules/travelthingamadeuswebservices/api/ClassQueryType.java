
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of classes option
 * 
 * <p>Java class for ClassQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productClassDetails" type="{http://xml.amadeus.com/SATRQT_07_1_1A}ProductDetailsType" maxOccurs="3"/>
 *         &lt;element name="expandClassRequest" type="{http://xml.amadeus.com/SATRQT_07_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassQueryType", namespace = "http://xml.amadeus.com/SATRQT_07_1_1A", propOrder = {
    "productClassDetails",
    "expandClassRequest"
})
public class ClassQueryType {

    @XmlElement(required = true)
    protected List<ProductDetailsType> productClassDetails;
    protected String expandClassRequest;

    /**
     * Gets the value of the productClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetailsType }
     * 
     * 
     */
    public List<ProductDetailsType> getProductClassDetails() {
        if (productClassDetails == null) {
            productClassDetails = new ArrayList<ProductDetailsType>();
        }
        return this.productClassDetails;
    }

    /**
     * Gets the value of the expandClassRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpandClassRequest() {
        return expandClassRequest;
    }

    /**
     * Sets the value of the expandClassRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpandClassRequest(String value) {
        this.expandClassRequest = value;
    }

    /**
     * Sets the value of the productClassDetails property.
     * 
     * @param productClassDetails
     *     allowed object is
     *     {@link ProductDetailsType }
     *     
     */
    public void setProductClassDetails(List<ProductDetailsType> productClassDetails) {
        this.productClassDetails = productClassDetails;
    }

}
