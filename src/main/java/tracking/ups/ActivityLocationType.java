//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.25 ʱ�� 10:49:15 AM CST 
//


package tracking.ups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActivityLocationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ActivityLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Address" minOccurs="0"/>
 *         &lt;element ref="{}AddressArtifactFormat" minOccurs="0"/>
 *         &lt;element name="TransportFacility" type="{}TransportFacilityType" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedForByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}SignatureImage" minOccurs="0"/>
 *         &lt;element name="PODLetter" type="{}PODLetterType" minOccurs="0"/>
 *         &lt;element name="ElectronicDeliveryNotification" type="{}ElectronicDeliveryNotificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLocationType", propOrder = {
    "address",
    "addressArtifactFormat",
    "transportFacility",
    "code",
    "description",
    "signedForByName",
    "signatureImage",
    "podLetter",
    "electronicDeliveryNotification"
})
public class ActivityLocationType {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AddressArtifactFormat")
    protected AddressArtifactType addressArtifactFormat;
    @XmlElement(name = "TransportFacility")
    protected TransportFacilityType transportFacility;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SignedForByName")
    protected String signedForByName;
    @XmlElement(name = "SignatureImage")
    protected SignatureImage signatureImage;
    @XmlElement(name = "PODLetter")
    protected PODLetterType podLetter;
    @XmlElement(name = "ElectronicDeliveryNotification")
    protected ElectronicDeliveryNotificationType electronicDeliveryNotification;

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * ��ȡaddressArtifactFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressArtifactType }
     *     
     */
    public AddressArtifactType getAddressArtifactFormat() {
        return addressArtifactFormat;
    }

    /**
     * ����addressArtifactFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressArtifactType }
     *     
     */
    public void setAddressArtifactFormat(AddressArtifactType value) {
        this.addressArtifactFormat = value;
    }

    /**
     * ��ȡtransportFacility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransportFacilityType }
     *     
     */
    public TransportFacilityType getTransportFacility() {
        return transportFacility;
    }

    /**
     * ����transportFacility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransportFacilityType }
     *     
     */
    public void setTransportFacility(TransportFacilityType value) {
        this.transportFacility = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * ��ȡsignatureImage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SignatureImage }
     *     
     */
    public SignatureImage getSignatureImage() {
        return signatureImage;
    }

    /**
     * ����signatureImage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureImage }
     *     
     */
    public void setSignatureImage(SignatureImage value) {
        this.signatureImage = value;
    }

    /**
     * ��ȡpodLetter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PODLetterType }
     *     
     */
    public PODLetterType getPODLetter() {
        return podLetter;
    }

    /**
     * ����podLetter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PODLetterType }
     *     
     */
    public void setPODLetter(PODLetterType value) {
        this.podLetter = value;
    }

    /**
     * ��ȡelectronicDeliveryNotification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ElectronicDeliveryNotificationType }
     *     
     */
    public ElectronicDeliveryNotificationType getElectronicDeliveryNotification() {
        return electronicDeliveryNotification;
    }

    /**
     * ����electronicDeliveryNotification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicDeliveryNotificationType }
     *     
     */
    public void setElectronicDeliveryNotification(ElectronicDeliveryNotificationType value) {
        this.electronicDeliveryNotification = value;
    }

}
