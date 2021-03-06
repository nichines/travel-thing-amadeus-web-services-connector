
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
 * <p>Java class for ClassInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productClassDetail" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProductDetailsType"/>
 *         &lt;element name="preferenceForTheClass" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AssociatedPreferenceType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassInformationType", propOrder = {
    "productClassDetail",
    "preferenceForTheClass"
})
public class ClassInformationType {

    @XmlElement(required = true)
    protected ProductDetailsType2 productClassDetail;
    protected List<AssociatedPreferenceType> preferenceForTheClass;

    /**
     * Gets the value of the productClassDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType2 }
     *     
     */
    public ProductDetailsType2 getProductClassDetail() {
        return productClassDetail;
    }

    /**
     * Sets the value of the productClassDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType2 }
     *     
     */
    public void setProductClassDetail(ProductDetailsType2 value) {
        this.productClassDetail = value;
    }

    /**
     * Gets the value of the preferenceForTheClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceForTheClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceForTheClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPreferenceType }
     * 
     * 
     */
    public List<AssociatedPreferenceType> getPreferenceForTheClass() {
        if (preferenceForTheClass == null) {
            preferenceForTheClass = new ArrayList<AssociatedPreferenceType>();
        }
        return this.preferenceForTheClass;
    }

    /**
     * Sets the value of the preferenceForTheClass property.
     * 
     * @param preferenceForTheClass
     *     allowed object is
     *     {@link AssociatedPreferenceType }
     *     
     */
    public void setPreferenceForTheClass(List<AssociatedPreferenceType> preferenceForTheClass) {
        this.preferenceForTheClass = preferenceForTheClass;
    }

}
