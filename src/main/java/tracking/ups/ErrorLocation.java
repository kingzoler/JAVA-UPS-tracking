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
 *         &lt;element ref="{}ErrorLocationElementName" minOccurs="0"/>
 *         &lt;element ref="{}ErrorLocationElementReference" minOccurs="0"/>
 *         &lt;element ref="{}ErrorLocationAttributeName" minOccurs="0"/>
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
    "errorLocationElementName",
    "errorLocationElementReference",
    "errorLocationAttributeName"
})
@XmlRootElement(name = "ErrorLocation")
public class ErrorLocation {

    @XmlElement(name = "ErrorLocationElementName")
    protected String errorLocationElementName;
    @XmlElement(name = "ErrorLocationElementReference")
    protected String errorLocationElementReference;
    @XmlElement(name = "ErrorLocationAttributeName")
    protected String errorLocationAttributeName;

    /**
     * ��ȡerrorLocationElementName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocationElementName() {
        return errorLocationElementName;
    }

    /**
     * ����errorLocationElementName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocationElementName(String value) {
        this.errorLocationElementName = value;
    }

    /**
     * ��ȡerrorLocationElementReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocationElementReference() {
        return errorLocationElementReference;
    }

    /**
     * ����errorLocationElementReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocationElementReference(String value) {
        this.errorLocationElementReference = value;
    }

    /**
     * ��ȡerrorLocationAttributeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocationAttributeName() {
        return errorLocationAttributeName;
    }

    /**
     * ����errorLocationAttributeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocationAttributeName(String value) {
        this.errorLocationAttributeName = value;
    }

}
