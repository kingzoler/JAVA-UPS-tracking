//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.25 ʱ�� 10:49:06 AM CST 
//


package tracking.ups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Request"/>
 *         &lt;choice>
 *           &lt;element ref="{}TrackingNumber"/>
 *           &lt;element ref="{}ShipmentIdentificationNumber"/>
 *           &lt;element ref="{}CandidateBookmark"/>
 *           &lt;sequence>
 *             &lt;element ref="{}ReferenceNumber"/>
 *             &lt;element ref="{}PickupDateRange" minOccurs="0"/>
 *             &lt;element ref="{}ShipperNumber" minOccurs="0"/>
 *             &lt;element ref="{}DestinationPostalCode" minOccurs="0"/>
 *             &lt;element ref="{}DestinationCountryCode" minOccurs="0"/>
 *             &lt;element ref="{}OriginPostalCode" minOccurs="0"/>
 *             &lt;element ref="{}OriginCountryCode" minOccurs="0"/>
 *             &lt;element name="ShipmentType" type="{}CodeType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="IncludeMailInnovationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSWorldWideExpressFreightShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}IncludeFreight" minOccurs="0"/>
 *         &lt;element ref="{}ShipperAccountInfo" minOccurs="0"/>
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
    "request",
    "trackingNumber",
    "shipmentIdentificationNumber",
    "candidateBookmark",
    "referenceNumber",
    "pickupDateRange",
    "shipperNumber",
    "destinationPostalCode",
    "destinationCountryCode",
    "originPostalCode",
    "originCountryCode",
    "shipmentType",
    "includeMailInnovationIndicator",
    "trackingOption",
    "upsWorldWideExpressFreightShipment",
    "includeFreight",
    "shipperAccountInfo"
})
@XmlRootElement(name = "TrackRequest")
public class TrackRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "CandidateBookmark")
    protected String candidateBookmark;
    @XmlElement(name = "ReferenceNumber")
    protected ReferenceNumber referenceNumber;
    @XmlElement(name = "PickupDateRange")
    protected PickupDateRange pickupDateRange;
    @XmlElement(name = "ShipperNumber")
    protected String shipperNumber;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "OriginPostalCode")
    protected String originPostalCode;
    @XmlElement(name = "OriginCountryCode")
    protected String originCountryCode;
    @XmlElement(name = "ShipmentType")
    protected CodeType shipmentType;
    @XmlElement(name = "IncludeMailInnovationIndicator")
    protected String includeMailInnovationIndicator;
    @XmlElement(name = "TrackingOption")
    protected String trackingOption;
    @XmlElement(name = "UPSWorldWideExpressFreightShipment")
    protected String upsWorldWideExpressFreightShipment;
    @XmlElement(name = "IncludeFreight")
    protected String includeFreight;
    @XmlElement(name = "ShipperAccountInfo")
    protected ShipperAccountInfo shipperAccountInfo;

    /**
     * ��ȡrequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * ����request���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

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
     * ��ȡshipmentIdentificationNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * ����shipmentIdentificationNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * ��ȡcandidateBookmark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCandidateBookmark() {
        return candidateBookmark;
    }

    /**
     * ����candidateBookmark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCandidateBookmark(String value) {
        this.candidateBookmark = value;
    }

    /**
     * ��ȡreferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReferenceNumber }
     *     
     */
    public ReferenceNumber getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * ����referenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceNumber }
     *     
     */
    public void setReferenceNumber(ReferenceNumber value) {
        this.referenceNumber = value;
    }

    /**
     * ��ȡpickupDateRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PickupDateRange }
     *     
     */
    public PickupDateRange getPickupDateRange() {
        return pickupDateRange;
    }

    /**
     * ����pickupDateRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDateRange }
     *     
     */
    public void setPickupDateRange(PickupDateRange value) {
        this.pickupDateRange = value;
    }

    /**
     * ��ȡshipperNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * ����shipperNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

    /**
     * ��ȡdestinationPostalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * ����destinationPostalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * ��ȡdestinationCountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * ����destinationCountryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * ��ȡoriginPostalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPostalCode() {
        return originPostalCode;
    }

    /**
     * ����originPostalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPostalCode(String value) {
        this.originPostalCode = value;
    }

    /**
     * ��ȡoriginCountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * ����originCountryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * ��ȡshipmentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getShipmentType() {
        return shipmentType;
    }

    /**
     * ����shipmentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setShipmentType(CodeType value) {
        this.shipmentType = value;
    }

    /**
     * ��ȡincludeMailInnovationIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeMailInnovationIndicator() {
        return includeMailInnovationIndicator;
    }

    /**
     * ����includeMailInnovationIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeMailInnovationIndicator(String value) {
        this.includeMailInnovationIndicator = value;
    }

    /**
     * ��ȡtrackingOption���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingOption() {
        return trackingOption;
    }

    /**
     * ����trackingOption���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingOption(String value) {
        this.trackingOption = value;
    }

    /**
     * ��ȡupsWorldWideExpressFreightShipment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSWorldWideExpressFreightShipment() {
        return upsWorldWideExpressFreightShipment;
    }

    /**
     * ����upsWorldWideExpressFreightShipment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSWorldWideExpressFreightShipment(String value) {
        this.upsWorldWideExpressFreightShipment = value;
    }

    /**
     * ��ȡincludeFreight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFreight() {
        return includeFreight;
    }

    /**
     * ����includeFreight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFreight(String value) {
        this.includeFreight = value;
    }

    /**
     * ��ȡshipperAccountInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShipperAccountInfo }
     *     
     */
    public ShipperAccountInfo getShipperAccountInfo() {
        return shipperAccountInfo;
    }

    /**
     * ����shipperAccountInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperAccountInfo }
     *     
     */
    public void setShipperAccountInfo(ShipperAccountInfo value) {
        this.shipperAccountInfo = value;
    }

}
