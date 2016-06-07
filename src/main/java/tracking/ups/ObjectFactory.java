//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.25 ʱ�� 10:49:15 AM CST 
//


package tracking.ups;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.parcelive.tracking.ups package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ErrorDescription_QNAME = new QName("", "ErrorDescription");
    private final static QName _ErrorDigest_QNAME = new QName("", "ErrorDigest");
    private final static QName _ErrorLocationElementName_QNAME = new QName("", "ErrorLocationElementName");
    private final static QName _ErrorLocationAttributeName_QNAME = new QName("", "ErrorLocationAttributeName");
    private final static QName _ResponseStatusCode_QNAME = new QName("", "ResponseStatusCode");
    private final static QName _ErrorLocationElementReference_QNAME = new QName("", "ErrorLocationElementReference");
    private final static QName _ErrorSeverity_QNAME = new QName("", "ErrorSeverity");
    private final static QName _ResponseStatusDescription_QNAME = new QName("", "ResponseStatusDescription");
    private final static QName _MinimumRetrySeconds_QNAME = new QName("", "MinimumRetrySeconds");
    private final static QName _ErrorCode_QNAME = new QName("", "ErrorCode");
    private final static QName _CODAmount_QNAME = new QName("", "CODAmount");
    private final static QName _AddressArtifactFormat_QNAME = new QName("", "AddressArtifactFormat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.parcelive.tracking.ups
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link CodeNoDescriptionType }
     * 
     */
    public CodeNoDescriptionType createCodeNoDescriptionType() {
        return new CodeNoDescriptionType();
    }

    /**
     * Create an instance of {@link ErrorLocation }
     * 
     */
    public ErrorLocation createErrorLocation() {
        return new ErrorLocation();
    }

    /**
     * Create an instance of {@link TransactionReference }
     * 
     */
    public TransactionReference createTransactionReference() {
        return new TransactionReference();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link NextScheduleActivity }
     * 
     */
    public NextScheduleActivity createNextScheduleActivity() {
        return new NextScheduleActivity();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link InquiryNumberType }
     * 
     */
    public InquiryNumberType createInquiryNumberType() {
        return new InquiryNumberType();
    }

    /**
     * Create an instance of {@link ShipperType }
     * 
     */
    public ShipperType createShipperType() {
        return new ShipperType();
    }

    /**
     * Create an instance of {@link ShipToType }
     * 
     */
    public ShipToType createShipToType() {
        return new ShipToType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link ShipmentReferenceNumberType }
     * 
     */
    public ShipmentReferenceNumberType createShipmentReferenceNumberType() {
        return new ShipmentReferenceNumberType();
    }

    /**
     * Create an instance of {@link CurrentStatusType }
     * 
     */
    public CurrentStatusType createCurrentStatusType() {
        return new CurrentStatusType();
    }

    /**
     * Create an instance of {@link DeliveryDetailsType }
     * 
     */
    public DeliveryDetailsType createDeliveryDetailsType() {
        return new DeliveryDetailsType();
    }

    /**
     * Create an instance of {@link DeliveryDateTimeType }
     * 
     */
    public DeliveryDateTimeType createDeliveryDateTimeType() {
        return new DeliveryDateTimeType();
    }

    /**
     * Create an instance of {@link VolumeType }
     * 
     */
    public VolumeType createVolumeType() {
        return new VolumeType();
    }

    /**
     * Create an instance of {@link ServiceCenterType }
     * 
     */
    public ServiceCenterType createServiceCenterType() {
        return new ServiceCenterType();
    }

    /**
     * Create an instance of {@link ShipmentServiceOptionsType }
     * 
     */
    public ShipmentServiceOptionsType createShipmentServiceOptionsType() {
        return new ShipmentServiceOptionsType();
    }

    /**
     * Create an instance of {@link EstimatedDeliveryDetailsType }
     * 
     */
    public EstimatedDeliveryDetailsType createEstimatedDeliveryDetailsType() {
        return new EstimatedDeliveryDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentActivityType }
     * 
     */
    public ShipmentActivityType createShipmentActivityType() {
        return new ShipmentActivityType();
    }

    /**
     * Create an instance of {@link OriginPortDetailsType }
     * 
     */
    public OriginPortDetailsType createOriginPortDetailsType() {
        return new OriginPortDetailsType();
    }

    /**
     * Create an instance of {@link DestinationPortDetailsType }
     * 
     */
    public DestinationPortDetailsType createDestinationPortDetailsType() {
        return new DestinationPortDetailsType();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link CarrierActivityInformationType }
     * 
     */
    public CarrierActivityInformationType createCarrierActivityInformationType() {
        return new CarrierActivityInformationType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DeliveryDateUnavailableType }
     * 
     */
    public DeliveryDateUnavailableType createDeliveryDateUnavailableType() {
        return new DeliveryDateUnavailableType();
    }

    /**
     * Create an instance of {@link AppointmentType }
     * 
     */
    public AppointmentType createAppointmentType() {
        return new AppointmentType();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link AlternateTrackingInfoType }
     * 
     */
    public AlternateTrackingInfoType createAlternateTrackingInfoType() {
        return new AlternateTrackingInfoType();
    }

    /**
     * Create an instance of {@link ActivityLocationType }
     * 
     */
    public ActivityLocationType createActivityLocationType() {
        return new ActivityLocationType();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link TrackResponse }
     * 
     */
    public TrackResponse createTrackResponse() {
        return new TrackResponse();
    }

    /**
     * Create an instance of {@link SignatureImage }
     * 
     */
    public SignatureImage createSignatureImage() {
        return new SignatureImage();
    }

    /**
     * Create an instance of {@link CodeDescriptionType }
     * 
     */
    public CodeDescriptionType createCodeDescriptionType() {
        return new CodeDescriptionType();
    }

    /**
     * Create an instance of {@link COD }
     * 
     */
    public COD createCOD() {
        return new COD();
    }

    /**
     * Create an instance of {@link MonetaryType }
     * 
     */
    public MonetaryType createMonetaryType() {
        return new MonetaryType();
    }

    /**
     * Create an instance of {@link AddressArtifactType }
     * 
     */
    public AddressArtifactType createAddressArtifactType() {
        return new AddressArtifactType();
    }

    /**
     * Create an instance of {@link UnitOfMeasurement }
     * 
     */
    public UnitOfMeasurement createUnitOfMeasurement() {
        return new UnitOfMeasurement();
    }

    /**
     * Create an instance of {@link UPSAPAddressType }
     * 
     */
    public UPSAPAddressType createUPSAPAddressType() {
        return new UPSAPAddressType();
    }

    /**
     * Create an instance of {@link CommonCodeDescriptionType }
     * 
     */
    public CommonCodeDescriptionType createCommonCodeDescriptionType() {
        return new CommonCodeDescriptionType();
    }

    /**
     * Create an instance of {@link PackageServiceOptionsType }
     * 
     */
    public PackageServiceOptionsType createPackageServiceOptionsType() {
        return new PackageServiceOptionsType();
    }

    /**
     * Create an instance of {@link ReferenceNumberType }
     * 
     */
    public ReferenceNumberType createReferenceNumberType() {
        return new ReferenceNumberType();
    }

    /**
     * Create an instance of {@link AccessorialCodeDescriptionType }
     * 
     */
    public AccessorialCodeDescriptionType createAccessorialCodeDescriptionType() {
        return new AccessorialCodeDescriptionType();
    }

    /**
     * Create an instance of {@link ElectronicDeliveryNotificationType }
     * 
     */
    public ElectronicDeliveryNotificationType createElectronicDeliveryNotificationType() {
        return new ElectronicDeliveryNotificationType();
    }

    /**
     * Create an instance of {@link PackageCOD }
     * 
     */
    public PackageCOD createPackageCOD() {
        return new PackageCOD();
    }

    /**
     * Create an instance of {@link ShipmentLocationType }
     * 
     */
    public ShipmentLocationType createShipmentLocationType() {
        return new ShipmentLocationType();
    }

    /**
     * Create an instance of {@link RedirectType }
     * 
     */
    public RedirectType createRedirectType() {
        return new RedirectType();
    }

    /**
     * Create an instance of {@link TransportFacilityType }
     * 
     */
    public TransportFacilityType createTransportFacilityType() {
        return new TransportFacilityType();
    }

    /**
     * Create an instance of {@link PODLetterType }
     * 
     */
    public PODLetterType createPODLetterType() {
        return new PODLetterType();
    }

    /**
     * Create an instance of {@link ProductCodeDescriptionType }
     * 
     */
    public ProductCodeDescriptionType createProductCodeDescriptionType() {
        return new ProductCodeDescriptionType();
    }

    /**
     * Create an instance of {@link ReRouteType }
     * 
     */
    public ReRouteType createReRouteType() {
        return new ReRouteType();
    }

    /**
     * Create an instance of {@link ReturnToType }
     * 
     */
    public ReturnToType createReturnToType() {
        return new ReturnToType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorDescription")
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorDigest")
    public JAXBElement<String> createErrorDigest(String value) {
        return new JAXBElement<String>(_ErrorDigest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationElementName")
    public JAXBElement<String> createErrorLocationElementName(String value) {
        return new JAXBElement<String>(_ErrorLocationElementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationAttributeName")
    public JAXBElement<String> createErrorLocationAttributeName(String value) {
        return new JAXBElement<String>(_ErrorLocationAttributeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseStatusCode")
    public JAXBElement<String> createResponseStatusCode(String value) {
        return new JAXBElement<String>(_ResponseStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorLocationElementReference")
    public JAXBElement<String> createErrorLocationElementReference(String value) {
        return new JAXBElement<String>(_ErrorLocationElementReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorSeverity")
    public JAXBElement<String> createErrorSeverity(String value) {
        return new JAXBElement<String>(_ErrorSeverity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseStatusDescription")
    public JAXBElement<String> createResponseStatusDescription(String value) {
        return new JAXBElement<String>(_ResponseStatusDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumRetrySeconds")
    public JAXBElement<String> createMinimumRetrySeconds(String value) {
        return new JAXBElement<String>(_MinimumRetrySeconds_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErrorCode")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CODAmount")
    public JAXBElement<MonetaryType> createCODAmount(MonetaryType value) {
        return new JAXBElement<MonetaryType>(_CODAmount_QNAME, MonetaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressArtifactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AddressArtifactFormat")
    public JAXBElement<AddressArtifactType> createAddressArtifactFormat(AddressArtifactType value) {
        return new JAXBElement<AddressArtifactType>(_AddressArtifactFormat_QNAME, AddressArtifactType.class, null, value);
    }

}
