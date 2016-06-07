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
 *         &lt;element ref="{}TransactionReference" minOccurs="0"/>
 *         &lt;element ref="{}ResponseStatusCode"/>
 *         &lt;element ref="{}ResponseStatusDescription" minOccurs="0"/>
 *         &lt;element ref="{}Error" maxOccurs="unbounded" minOccurs="0"/>
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
    "transactionReference",
    "responseStatusCode",
    "responseStatusDescription",
    "error"
})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(name = "TransactionReference")
    protected TransactionReference transactionReference;
    @XmlElement(name = "ResponseStatusCode", required = true)
    protected String responseStatusCode;
    @XmlElement(name = "ResponseStatusDescription")
    protected String responseStatusDescription;
    @XmlElement(name = "Error")
    protected List<Error> error;

    /**
     * ��ȡtransactionReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionReference }
     *     
     */
    public TransactionReference getTransactionReference() {
        return transactionReference;
    }

    /**
     * ����transactionReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReference }
     *     
     */
    public void setTransactionReference(TransactionReference value) {
        this.transactionReference = value;
    }

    /**
     * ��ȡresponseStatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * ����responseStatusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatusCode(String value) {
        this.responseStatusCode = value;
    }

    /**
     * ��ȡresponseStatusDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatusDescription() {
        return responseStatusDescription;
    }

    /**
     * ����responseStatusDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatusDescription(String value) {
        this.responseStatusDescription = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

}
