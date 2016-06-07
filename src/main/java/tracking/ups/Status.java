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
 *         &lt;element name="StatusType" type="{}CodeType"/>
 *         &lt;element name="StatusCode" type="{}CodeNoDescriptionType" minOccurs="0"/>
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
    "statusType",
    "statusCode"
})
@XmlRootElement(name = "Status")
public class Status {

    @XmlElement(name = "StatusType", required = true)
    protected CodeType statusType;
    @XmlElement(name = "StatusCode")
    protected CodeNoDescriptionType statusCode;

    /**
     * ��ȡstatusType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatusType() {
        return statusType;
    }

    /**
     * ����statusType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatusType(CodeType value) {
        this.statusType = value;
    }

    /**
     * ��ȡstatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeNoDescriptionType }
     *     
     */
    public CodeNoDescriptionType getStatusCode() {
        return statusCode;
    }

    /**
     * ����statusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNoDescriptionType }
     *     
     */
    public void setStatusCode(CodeNoDescriptionType value) {
        this.statusCode = value;
    }

}
