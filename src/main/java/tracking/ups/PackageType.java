//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.25 ʱ�� 10:49:15 AM CST 
//


package tracking.ups;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PackageType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RescheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RescheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect" type="{}RedirectType" minOccurs="0"/>
 *         &lt;element name="Reroute" type="{}ReRouteType" minOccurs="0"/>
 *         &lt;element name="ReturnTo" type="{}ReturnToType" minOccurs="0"/>
 *         &lt;element name="PackageServiceOptions" type="{}PackageServiceOptionsType" minOccurs="0"/>
 *         &lt;element ref="{}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackageWeight" type="{}WeightType" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{}ReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{}ProductCodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="LocationAssured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AlternateTrackingInfo" type="{}AlternateTrackingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accessorial" type="{}AccessorialCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimensionalWeightScanIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "trackingNumber",
    "rescheduledDeliveryDate",
    "rescheduledDeliveryTime",
    "redirect",
    "reroute",
    "returnTo",
    "packageServiceOptions",
    "activity",
    "message",
    "packageWeight",
    "referenceNumber",
    "productType",
    "locationAssured",
    "alternateTrackingNumber",
    "alternateTrackingInfo",
    "accessorial",
    "dimensionalWeightScanIndicator"
})
public class PackageType {

    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "RescheduledDeliveryDate")
    protected String rescheduledDeliveryDate;
    @XmlElement(name = "RescheduledDeliveryTime")
    protected String rescheduledDeliveryTime;
    @XmlElement(name = "Redirect")
    protected RedirectType redirect;
    @XmlElement(name = "Reroute")
    protected ReRouteType reroute;
    @XmlElement(name = "ReturnTo")
    protected ReturnToType returnTo;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "Activity")
    protected List<Activity> activity;
    @XmlElement(name = "Message")
    protected List<CodeType> message;
    @XmlElement(name = "PackageWeight")
    protected WeightType packageWeight;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "ProductType")
    protected ProductCodeDescriptionType productType;
    @XmlElement(name = "LocationAssured")
    protected String locationAssured;
    @XmlElement(name = "AlternateTrackingNumber")
    protected List<String> alternateTrackingNumber;
    @XmlElement(name = "AlternateTrackingInfo")
    protected List<AlternateTrackingInfoType> alternateTrackingInfo;
    @XmlElement(name = "Accessorial")
    protected List<AccessorialCodeDescriptionType> accessorial;
    @XmlElement(name = "DimensionalWeightScanIndicator")
    protected String dimensionalWeightScanIndicator;

    /**
     * ��ȡtrackingNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * ����trackingNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * ��ȡrescheduledDeliveryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescheduledDeliveryDate() {
        return rescheduledDeliveryDate;
    }

    /**
     * ����rescheduledDeliveryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescheduledDeliveryDate(String value) {
        this.rescheduledDeliveryDate = value;
    }

    /**
     * ��ȡrescheduledDeliveryTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescheduledDeliveryTime() {
        return rescheduledDeliveryTime;
    }

    /**
     * ����rescheduledDeliveryTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescheduledDeliveryTime(String value) {
        this.rescheduledDeliveryTime = value;
    }

    /**
     * ��ȡredirect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RedirectType }
     *     
     */
    public RedirectType getRedirect() {
        return redirect;
    }

    /**
     * ����redirect���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectType }
     *     
     */
    public void setRedirect(RedirectType value) {
        this.redirect = value;
    }

    /**
     * ��ȡreroute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReRouteType }
     *     
     */
    public ReRouteType getReroute() {
        return reroute;
    }

    /**
     * ����reroute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReRouteType }
     *     
     */
    public void setReroute(ReRouteType value) {
        this.reroute = value;
    }

    /**
     * ��ȡreturnTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReturnToType }
     *     
     */
    public ReturnToType getReturnTo() {
        return returnTo;
    }

    /**
     * ����returnTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnToType }
     *     
     */
    public void setReturnTo(ReturnToType value) {
        this.returnTo = value;
    }

    /**
     * ��ȡpackageServiceOptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public PackageServiceOptionsType getPackageServiceOptions() {
        return packageServiceOptions;
    }

    /**
     * ����packageServiceOptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public void setPackageServiceOptions(PackageServiceOptionsType value) {
        this.packageServiceOptions = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<Activity>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getMessage() {
        if (message == null) {
            message = new ArrayList<CodeType>();
        }
        return this.message;
    }

    /**
     * ��ȡpackageWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * ����packageWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setPackageWeight(WeightType value) {
        this.packageWeight = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNumberType }
     * 
     * 
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * ��ȡproductType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeDescriptionType }
     *     
     */
    public ProductCodeDescriptionType getProductType() {
        return productType;
    }

    /**
     * ����productType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeDescriptionType }
     *     
     */
    public void setProductType(ProductCodeDescriptionType value) {
        this.productType = value;
    }

    /**
     * ��ȡlocationAssured���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAssured() {
        return locationAssured;
    }

    /**
     * ����locationAssured���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAssured(String value) {
        this.locationAssured = value;
    }

    /**
     * Gets the value of the alternateTrackingNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateTrackingNumber() {
        if (alternateTrackingNumber == null) {
            alternateTrackingNumber = new ArrayList<String>();
        }
        return this.alternateTrackingNumber;
    }

    /**
     * Gets the value of the alternateTrackingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTrackingInfoType }
     * 
     * 
     */
    public List<AlternateTrackingInfoType> getAlternateTrackingInfo() {
        if (alternateTrackingInfo == null) {
            alternateTrackingInfo = new ArrayList<AlternateTrackingInfoType>();
        }
        return this.alternateTrackingInfo;
    }

    /**
     * Gets the value of the accessorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessorialCodeDescriptionType }
     * 
     * 
     */
    public List<AccessorialCodeDescriptionType> getAccessorial() {
        if (accessorial == null) {
            accessorial = new ArrayList<AccessorialCodeDescriptionType>();
        }
        return this.accessorial;
    }

    /**
     * ��ȡdimensionalWeightScanIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionalWeightScanIndicator() {
        return dimensionalWeightScanIndicator;
    }

    /**
     * ����dimensionalWeightScanIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionalWeightScanIndicator(String value) {
        this.dimensionalWeightScanIndicator = value;
    }

}
