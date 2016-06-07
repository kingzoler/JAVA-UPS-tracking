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
 * <p>DeliveryDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryDate" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="ServiceCenter" type="{}ServiceCenterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsType", propOrder = {
    "deliveryDate",
    "serviceCenter"
})
public class DeliveryDetailsType {

    @XmlElement(name = "DeliveryDate")
    protected DateTime deliveryDate;
    @XmlElement(name = "ServiceCenter")
    protected ServiceCenterType serviceCenter;

    /**
     * ��ȡdeliveryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * ����deliveryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDeliveryDate(DateTime value) {
        this.deliveryDate = value;
    }

    /**
     * ��ȡserviceCenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterType }
     *     
     */
    public ServiceCenterType getServiceCenter() {
        return serviceCenter;
    }

    /**
     * ����serviceCenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterType }
     *     
     */
    public void setServiceCenter(ServiceCenterType value) {
        this.serviceCenter = value;
    }

}
