
package org.mule.modules.travelthingamadeuswebservices.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight
 * 
 * <p>Java class for AdditionalProductDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}AdditionalProductTypeI" minOccurs="0"/>
 *         &lt;element name="departureStation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalStation" type="{http://xml.amadeus.com/SATRSP_07_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="milageDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}MileageTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="travellerTimeDetails" type="{http://xml.amadeus.com/SATRSP_07_1_1A}TravellerTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="productFacilities" type="{http://xml.amadeus.com/SATRSP_07_1_1A}ProductFacilitiesTypeI" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI", propOrder = {
    "flightDetails",
    "departureStation",
    "arrivalStation",
    "milageDetails",
    "travellerTimeDetails",
    "productFacilities"
})
public class AdditionalProductDetailsTypeI {

    protected AdditionalProductTypeI flightDetails;
    protected StationInformationTypeI departureStation;
    protected StationInformationTypeI arrivalStation;
    protected MileageTimeDetailsTypeI milageDetails;
    protected TravellerTimeDetailsTypeI travellerTimeDetails;
    protected List<ProductFacilitiesTypeI> productFacilities;

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setFlightDetails(AdditionalProductTypeI value) {
        this.flightDetails = value;
    }

    /**
     * Gets the value of the departureStation property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getDepartureStation() {
        return departureStation;
    }

    /**
     * Sets the value of the departureStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setDepartureStation(StationInformationTypeI value) {
        this.departureStation = value;
    }

    /**
     * Gets the value of the arrivalStation property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getArrivalStation() {
        return arrivalStation;
    }

    /**
     * Sets the value of the arrivalStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setArrivalStation(StationInformationTypeI value) {
        this.arrivalStation = value;
    }

    /**
     * Gets the value of the milageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public MileageTimeDetailsTypeI getMilageDetails() {
        return milageDetails;
    }

    /**
     * Sets the value of the milageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public void setMilageDetails(MileageTimeDetailsTypeI value) {
        this.milageDetails = value;
    }

    /**
     * Gets the value of the travellerTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public TravellerTimeDetailsTypeI getTravellerTimeDetails() {
        return travellerTimeDetails;
    }

    /**
     * Sets the value of the travellerTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public void setTravellerTimeDetails(TravellerTimeDetailsTypeI value) {
        this.travellerTimeDetails = value;
    }

    /**
     * Gets the value of the productFacilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFacilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFacilitiesTypeI }
     * 
     * 
     */
    public List<ProductFacilitiesTypeI> getProductFacilities() {
        if (productFacilities == null) {
            productFacilities = new ArrayList<ProductFacilitiesTypeI>();
        }
        return this.productFacilities;
    }

    /**
     * Sets the value of the productFacilities property.
     * 
     * @param productFacilities
     *     allowed object is
     *     {@link ProductFacilitiesTypeI }
     *     
     */
    public void setProductFacilities(List<ProductFacilitiesTypeI> productFacilities) {
        this.productFacilities = productFacilities;
    }

}
