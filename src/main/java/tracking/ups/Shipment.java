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
 *         &lt;element name="InquiryNumber" type="{}InquiryNumberType" minOccurs="0"/>
 *         &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentType" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="CandidateBookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{}ShipperType" minOccurs="0"/>
 *         &lt;element name="ShipTo" type="{}ShipToType" minOccurs="0"/>
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/>
 *         &lt;element name="Service" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{}ShipmentReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentStatus" type="{}CurrentStatusType" minOccurs="0"/>
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDetails" type="{}DeliveryDetailsType" minOccurs="0"/>
 *         &lt;element name="DeliveryDateTime" type="{}DeliveryDateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Volume" type="{}VolumeType" minOccurs="0"/>
 *         &lt;element name="BillToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpServiceCenter" type="{}ServiceCenterType" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPallets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentServiceOptions" type="{}ShipmentServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryDetails" type="{}EstimatedDeliveryDetailsType" minOccurs="0"/>
 *         &lt;element name="SignedForByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{}ShipmentActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginPortDetails" type="{}OriginPortDetailsType" minOccurs="0"/>
 *         &lt;element name="DestinationPortDetails" type="{}DestinationPortDetailsType" minOccurs="0"/>
 *         &lt;element name="DescriptionOfGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargoReady" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="Manifest" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="CarrierActivityInformation" type="{}CarrierActivityInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Document" type="{}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDateUnavailable" type="{}DeliveryDateUnavailableType" minOccurs="0"/>
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{}AppointmentType" minOccurs="0"/>
 *         &lt;element name="Package" type="{}PackageType" maxOccurs="unbounded" minOccurs="0"/>
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
    "inquiryNumber",
    "shipmentIdentificationNumber",
    "shipmentType",
    "candidateBookmark",
    "shipper",
    "shipTo",
    "shipmentWeight",
    "service",
    "referenceNumber",
    "currentStatus",
    "pickupDate",
    "deliveryDetails",
    "deliveryDateTime",
    "volume",
    "billToName",
    "pickUpServiceCenter",
    "numberOfPieces",
    "numberOfPallets",
    "shipmentServiceOptions",
    "estimatedDeliveryDetails",
    "signedForByName",
    "activity",
    "originPortDetails",
    "destinationPortDetails",
    "descriptionOfGoods",
    "cargoReady",
    "manifest",
    "carrierActivityInformation",
    "document",
    "scheduledDeliveryDate",
    "scheduledDeliveryTime",
    "deliveryDateUnavailable",
    "fileNumber",
    "appointment",
    "_package"
})
@XmlRootElement(name = "Shipment")
public class Shipment {

    @XmlElement(name = "InquiryNumber")
    protected InquiryNumberType inquiryNumber;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "ShipmentType")
    protected CodeType shipmentType;
    @XmlElement(name = "CandidateBookmark")
    protected String candidateBookmark;
    @XmlElement(name = "Shipper")
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo")
    protected ShipToType shipTo;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "Service")
    protected CodeType service;
    @XmlElement(name = "ReferenceNumber")
    protected List<ShipmentReferenceNumberType> referenceNumber;
    @XmlElement(name = "CurrentStatus")
    protected CurrentStatusType currentStatus;
    @XmlElement(name = "PickupDate")
    protected String pickupDate;
    @XmlElement(name = "DeliveryDetails")
    protected DeliveryDetailsType deliveryDetails;
    @XmlElement(name = "DeliveryDateTime")
    protected List<DeliveryDateTimeType> deliveryDateTime;
    @XmlElement(name = "Volume")
    protected VolumeType volume;
    @XmlElement(name = "BillToName")
    protected String billToName;
    @XmlElement(name = "PickUpServiceCenter")
    protected ServiceCenterType pickUpServiceCenter;
    @XmlElement(name = "NumberOfPieces")
    protected String numberOfPieces;
    @XmlElement(name = "NumberOfPallets")
    protected String numberOfPallets;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "EstimatedDeliveryDetails")
    protected EstimatedDeliveryDetailsType estimatedDeliveryDetails;
    @XmlElement(name = "SignedForByName")
    protected String signedForByName;
    @XmlElement(name = "Activity")
    protected List<ShipmentActivityType> activity;
    @XmlElement(name = "OriginPortDetails")
    protected OriginPortDetailsType originPortDetails;
    @XmlElement(name = "DestinationPortDetails")
    protected DestinationPortDetailsType destinationPortDetails;
    @XmlElement(name = "DescriptionOfGoods")
    protected String descriptionOfGoods;
    @XmlElement(name = "CargoReady")
    protected DateTime cargoReady;
    @XmlElement(name = "Manifest")
    protected DateTime manifest;
    @XmlElement(name = "CarrierActivityInformation")
    protected List<CarrierActivityInformationType> carrierActivityInformation;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected String scheduledDeliveryDate;
    @XmlElement(name = "ScheduledDeliveryTime")
    protected String scheduledDeliveryTime;
    @XmlElement(name = "DeliveryDateUnavailable")
    protected DeliveryDateUnavailableType deliveryDateUnavailable;
    @XmlElement(name = "FileNumber")
    protected String fileNumber;
    @XmlElement(name = "Appointment")
    protected AppointmentType appointment;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;

    /**
     * ��ȡinquiryNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InquiryNumberType }
     *     
     */
    public InquiryNumberType getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * ����inquiryNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryNumberType }
     *     
     */
    public void setInquiryNumber(InquiryNumberType value) {
        this.inquiryNumber = value;
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
     * ��ȡshipper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * ����shipper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * ��ȡshipTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * ����shipTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * ��ȡshipmentWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * ����shipmentWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * ��ȡservice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getService() {
        return service;
    }

    /**
     * ����service���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setService(CodeType value) {
        this.service = value;
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
     * {@link ShipmentReferenceNumberType }
     * 
     * 
     */
    public List<ShipmentReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ShipmentReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * ��ȡcurrentStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatusType }
     *     
     */
    public CurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * ����currentStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatusType }
     *     
     */
    public void setCurrentStatus(CurrentStatusType value) {
        this.currentStatus = value;
    }

    /**
     * ��ȡpickupDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * ����pickupDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * ��ȡdeliveryDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public DeliveryDetailsType getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * ����deliveryDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public void setDeliveryDetails(DeliveryDetailsType value) {
        this.deliveryDetails = value;
    }

    /**
     * Gets the value of the deliveryDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryDateTimeType }
     * 
     * 
     */
    public List<DeliveryDateTimeType> getDeliveryDateTime() {
        if (deliveryDateTime == null) {
            deliveryDateTime = new ArrayList<DeliveryDateTimeType>();
        }
        return this.deliveryDateTime;
    }

    /**
     * ��ȡvolume���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * ����volume���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    /**
     * ��ȡbillToName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * ����billToName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * ��ȡpickUpServiceCenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterType }
     *     
     */
    public ServiceCenterType getPickUpServiceCenter() {
        return pickUpServiceCenter;
    }

    /**
     * ����pickUpServiceCenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterType }
     *     
     */
    public void setPickUpServiceCenter(ServiceCenterType value) {
        this.pickUpServiceCenter = value;
    }

    /**
     * ��ȡnumberOfPieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * ����numberOfPieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPieces(String value) {
        this.numberOfPieces = value;
    }

    /**
     * ��ȡnumberOfPallets���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPallets() {
        return numberOfPallets;
    }

    /**
     * ����numberOfPallets���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPallets(String value) {
        this.numberOfPallets = value;
    }

    /**
     * ��ȡshipmentServiceOptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public ShipmentServiceOptionsType getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * ����shipmentServiceOptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public void setShipmentServiceOptions(ShipmentServiceOptionsType value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * ��ȡestimatedDeliveryDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDetailsType }
     *     
     */
    public EstimatedDeliveryDetailsType getEstimatedDeliveryDetails() {
        return estimatedDeliveryDetails;
    }

    /**
     * ����estimatedDeliveryDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDetailsType }
     *     
     */
    public void setEstimatedDeliveryDetails(EstimatedDeliveryDetailsType value) {
        this.estimatedDeliveryDetails = value;
    }

    /**
     * ��ȡsignedForByName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedForByName() {
        return signedForByName;
    }

    /**
     * ����signedForByName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedForByName(String value) {
        this.signedForByName = value;
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
     * {@link ShipmentActivityType }
     * 
     * 
     */
    public List<ShipmentActivityType> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ShipmentActivityType>();
        }
        return this.activity;
    }

    /**
     * ��ȡoriginPortDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginPortDetailsType }
     *     
     */
    public OriginPortDetailsType getOriginPortDetails() {
        return originPortDetails;
    }

    /**
     * ����originPortDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginPortDetailsType }
     *     
     */
    public void setOriginPortDetails(OriginPortDetailsType value) {
        this.originPortDetails = value;
    }

    /**
     * ��ȡdestinationPortDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DestinationPortDetailsType }
     *     
     */
    public DestinationPortDetailsType getDestinationPortDetails() {
        return destinationPortDetails;
    }

    /**
     * ����destinationPortDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPortDetailsType }
     *     
     */
    public void setDestinationPortDetails(DestinationPortDetailsType value) {
        this.destinationPortDetails = value;
    }

    /**
     * ��ȡdescriptionOfGoods���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfGoods() {
        return descriptionOfGoods;
    }

    /**
     * ����descriptionOfGoods���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfGoods(String value) {
        this.descriptionOfGoods = value;
    }

    /**
     * ��ȡcargoReady���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCargoReady() {
        return cargoReady;
    }

    /**
     * ����cargoReady���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCargoReady(DateTime value) {
        this.cargoReady = value;
    }

    /**
     * ��ȡmanifest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getManifest() {
        return manifest;
    }

    /**
     * ����manifest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setManifest(DateTime value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the carrierActivityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierActivityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierActivityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierActivityInformationType }
     * 
     * 
     */
    public List<CarrierActivityInformationType> getCarrierActivityInformation() {
        if (carrierActivityInformation == null) {
            carrierActivityInformation = new ArrayList<CarrierActivityInformationType>();
        }
        return this.carrierActivityInformation;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * ��ȡscheduledDeliveryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * ����scheduledDeliveryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryDate(String value) {
        this.scheduledDeliveryDate = value;
    }

    /**
     * ��ȡscheduledDeliveryTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    /**
     * ����scheduledDeliveryTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTime(String value) {
        this.scheduledDeliveryTime = value;
    }

    /**
     * ��ȡdeliveryDateUnavailable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDateUnavailableType }
     *     
     */
    public DeliveryDateUnavailableType getDeliveryDateUnavailable() {
        return deliveryDateUnavailable;
    }

    /**
     * ����deliveryDateUnavailable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDateUnavailableType }
     *     
     */
    public void setDeliveryDateUnavailable(DeliveryDateUnavailableType value) {
        this.deliveryDateUnavailable = value;
    }

    /**
     * ��ȡfileNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * ����fileNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * ��ȡappointment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppointmentType }
     *     
     */
    public AppointmentType getAppointment() {
        return appointment;
    }

    /**
     * ����appointment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentType }
     *     
     */
    public void setAppointment(AppointmentType value) {
        this.appointment = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

}
