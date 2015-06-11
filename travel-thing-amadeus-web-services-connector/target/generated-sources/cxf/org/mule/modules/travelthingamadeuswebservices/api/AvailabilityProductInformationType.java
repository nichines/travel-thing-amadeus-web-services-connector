
package org.mule.modules.travelthingamadeuswebservices.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product
 * 
 * <p>Java class for AvailabilityProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProductDateTimeType"/>
 *         &lt;element name="departureLocation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}LocationType"/>
 *         &lt;element name="departurePreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AssociatedPreferenceType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="arrivalLocation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}LocationType" minOccurs="0"/>
 *         &lt;element name="arrivalPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AssociatedPreferenceType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="marketingCompany" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="markCompanyPreferences" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AssociatedPreferenceType_5091C" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="operatingCompany" type="{http://xml.amadeus.com/SATRSP_07_1_1A}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="operCompanyPreference" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AssociatedPreferenceType_5091C" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProductIdentificationDetailsType" minOccurs="0"/>
 *         &lt;element name="productTypeDetail" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProductTypeDetailsType" minOccurs="0"/>
 *         &lt;element name="lineItemNumber" type="{http://xml.amadeus.com/SATRSP_07_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityProductInformationType", propOrder = {
    "flightDetails",
    "departureLocation",
    "departurePreference",
    "arrivalLocation",
    "arrivalPreference",
    "marketingCompany",
    "markCompanyPreferences",
    "operatingCompany",
    "operCompanyPreference",
    "flightIdentification",
    "productTypeDetail",
    "lineItemNumber"
})
public class AvailabilityProductInformationType {

    @XmlElement(required = true)
    protected ProductDateTimeType2 flightDetails;
    @XmlElement(required = true)
    protected LocationType departureLocation;
    protected List<AssociatedPreferenceType> departurePreference;
    protected LocationType arrivalLocation;
    protected List<AssociatedPreferenceType> arrivalPreference;
    protected CompanyIdentificationType marketingCompany;
    protected List<AssociatedPreferenceType5091C> markCompanyPreferences;
    protected CompanyIdentificationType operatingCompany;
    protected List<AssociatedPreferenceType5091C> operCompanyPreference;
    protected ProductIdentificationDetailsType2 flightIdentification;
    protected ProductTypeDetailsType2 productTypeDetail;
    protected BigInteger lineItemNumber;

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType2 }
     *     
     */
    public ProductDateTimeType2 getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType2 }
     *     
     */
    public void setFlightDetails(ProductDateTimeType2 value) {
        this.flightDetails = value;
    }

    /**
     * Gets the value of the departureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureLocation() {
        return departureLocation;
    }

    /**
     * Sets the value of the departureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureLocation(LocationType value) {
        this.departureLocation = value;
    }

    /**
     * Gets the value of the departurePreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departurePreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeparturePreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPreferenceType }
     * 
     * 
     */
    public List<AssociatedPreferenceType> getDeparturePreference() {
        if (departurePreference == null) {
            departurePreference = new ArrayList<AssociatedPreferenceType>();
        }
        return this.departurePreference;
    }

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    /**
     * Gets the value of the arrivalPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPreferenceType }
     * 
     * 
     */
    public List<AssociatedPreferenceType> getArrivalPreference() {
        if (arrivalPreference == null) {
            arrivalPreference = new ArrayList<AssociatedPreferenceType>();
        }
        return this.arrivalPreference;
    }

    /**
     * Gets the value of the marketingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * Sets the value of the marketingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setMarketingCompany(CompanyIdentificationType value) {
        this.marketingCompany = value;
    }

    /**
     * Gets the value of the markCompanyPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markCompanyPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkCompanyPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPreferenceType5091C }
     * 
     * 
     */
    public List<AssociatedPreferenceType5091C> getMarkCompanyPreferences() {
        if (markCompanyPreferences == null) {
            markCompanyPreferences = new ArrayList<AssociatedPreferenceType5091C>();
        }
        return this.markCompanyPreferences;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setOperatingCompany(CompanyIdentificationType value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the operCompanyPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operCompanyPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperCompanyPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPreferenceType5091C }
     * 
     * 
     */
    public List<AssociatedPreferenceType5091C> getOperCompanyPreference() {
        if (operCompanyPreference == null) {
            operCompanyPreference = new ArrayList<AssociatedPreferenceType5091C>();
        }
        return this.operCompanyPreference;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType2 }
     *     
     */
    public ProductIdentificationDetailsType2 getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType2 }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType2 value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the productTypeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType2 }
     *     
     */
    public ProductTypeDetailsType2 getProductTypeDetail() {
        return productTypeDetail;
    }

    /**
     * Sets the value of the productTypeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType2 }
     *     
     */
    public void setProductTypeDetail(ProductTypeDetailsType2 value) {
        this.productTypeDetail = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemNumber(BigInteger value) {
        this.lineItemNumber = value;
    }

    /**
     * Sets the value of the departurePreference property.
     * 
     * @param departurePreference
     *     allowed object is
     *     {@link AssociatedPreferenceType }
     *     
     */
    public void setDeparturePreference(List<AssociatedPreferenceType> departurePreference) {
        this.departurePreference = departurePreference;
    }

    /**
     * Sets the value of the arrivalPreference property.
     * 
     * @param arrivalPreference
     *     allowed object is
     *     {@link AssociatedPreferenceType }
     *     
     */
    public void setArrivalPreference(List<AssociatedPreferenceType> arrivalPreference) {
        this.arrivalPreference = arrivalPreference;
    }

    /**
     * Sets the value of the markCompanyPreferences property.
     * 
     * @param markCompanyPreferences
     *     allowed object is
     *     {@link AssociatedPreferenceType5091C }
     *     
     */
    public void setMarkCompanyPreferences(List<AssociatedPreferenceType5091C> markCompanyPreferences) {
        this.markCompanyPreferences = markCompanyPreferences;
    }

    /**
     * Sets the value of the operCompanyPreference property.
     * 
     * @param operCompanyPreference
     *     allowed object is
     *     {@link AssociatedPreferenceType5091C }
     *     
     */
    public void setOperCompanyPreference(List<AssociatedPreferenceType5091C> operCompanyPreference) {
        this.operCompanyPreference = operCompanyPreference;
    }

}
