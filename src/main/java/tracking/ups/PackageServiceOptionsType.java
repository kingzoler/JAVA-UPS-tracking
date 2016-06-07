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
 * <p>PackageServiceOptionsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PackageServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD" type="{}PackageCOD" minOccurs="0"/>
 *         &lt;element name="SignatureRequired" type="{}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="ImportControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialInvoiceRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPScarbonneutral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USPSPICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeBased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackAndCollect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsType", propOrder = {
    "cod",
    "signatureRequired",
    "importControl",
    "commercialInvoiceRemoval",
    "upScarbonneutral",
    "uspspicNumber",
    "exchangeBased",
    "packAndCollect"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "COD")
    protected PackageCOD cod;
    @XmlElement(name = "SignatureRequired")
    protected CodeDescriptionType signatureRequired;
    @XmlElement(name = "ImportControl")
    protected String importControl;
    @XmlElement(name = "CommercialInvoiceRemoval")
    protected String commercialInvoiceRemoval;
    @XmlElement(name = "UPScarbonneutral")
    protected String upScarbonneutral;
    @XmlElement(name = "USPSPICNumber")
    protected String uspspicNumber;
    @XmlElement(name = "ExchangeBased")
    protected String exchangeBased;
    @XmlElement(name = "PackAndCollect")
    protected String packAndCollect;

    /**
     * ��ȡcod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackageCOD }
     *     
     */
    public PackageCOD getCOD() {
        return cod;
    }

    /**
     * ����cod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackageCOD }
     *     
     */
    public void setCOD(PackageCOD value) {
        this.cod = value;
    }

    /**
     * ��ȡsignatureRequired���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getSignatureRequired() {
        return signatureRequired;
    }

    /**
     * ����signatureRequired���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setSignatureRequired(CodeDescriptionType value) {
        this.signatureRequired = value;
    }

    /**
     * ��ȡimportControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportControl() {
        return importControl;
    }

    /**
     * ����importControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportControl(String value) {
        this.importControl = value;
    }

    /**
     * ��ȡcommercialInvoiceRemoval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialInvoiceRemoval() {
        return commercialInvoiceRemoval;
    }

    /**
     * ����commercialInvoiceRemoval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialInvoiceRemoval(String value) {
        this.commercialInvoiceRemoval = value;
    }

    /**
     * ��ȡupScarbonneutral���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPScarbonneutral() {
        return upScarbonneutral;
    }

    /**
     * ����upScarbonneutral���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPScarbonneutral(String value) {
        this.upScarbonneutral = value;
    }

    /**
     * ��ȡuspspicNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSPICNumber() {
        return uspspicNumber;
    }

    /**
     * ����uspspicNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSPICNumber(String value) {
        this.uspspicNumber = value;
    }

    /**
     * ��ȡexchangeBased���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeBased() {
        return exchangeBased;
    }

    /**
     * ����exchangeBased���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeBased(String value) {
        this.exchangeBased = value;
    }

    /**
     * ��ȡpackAndCollect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackAndCollect() {
        return packAndCollect;
    }

    /**
     * ����packAndCollect���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackAndCollect(String value) {
        this.packAndCollect = value;
    }

}
