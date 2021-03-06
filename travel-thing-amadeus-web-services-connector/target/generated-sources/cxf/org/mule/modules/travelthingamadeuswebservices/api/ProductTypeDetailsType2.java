
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product type details
 * 
 * <p>Java class for ProductTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productIndicators" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AlphaNumericString_Length1To3" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsType", propOrder = {
    "productIndicators"
})
public class ProductTypeDetailsType2 {

    @XmlElement(required = true)
    protected List<String> productIndicators;

    /**
     * Gets the value of the productIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductIndicators() {
        if (productIndicators == null) {
            productIndicators = new ArrayList<String>();
        }
        return this.productIndicators;
    }

    /**
     * Sets the value of the productIndicators property.
     * 
     * @param productIndicators
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIndicators(List<String> productIndicators) {
        this.productIndicators = productIndicators;
    }

}
