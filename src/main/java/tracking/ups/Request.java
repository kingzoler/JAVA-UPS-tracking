//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.25 ʱ�� 10:49:06 AM CST 
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
 *         &lt;element ref="{}TransactionReference"/>
 *         &lt;element ref="{}RequestAction"/>
 *         &lt;element ref="{}RequestOption" maxOccurs="unbounded" minOccurs="0"/>
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
    "requestAction",
    "requestOption"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "TransactionReference", required = true)
    protected TransactionReference transactionReference;
    @XmlElement(name = "RequestAction", required = true)
    protected String requestAction;
    @XmlElement(name = "RequestOption")
    protected List<String> requestOption;

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
     * ��ȡrequestAction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAction() {
        return requestAction;
    }

    /**
     * ����requestAction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAction(String value) {
        this.requestAction = value;
    }

    /**
     * Gets the value of the requestOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestOption() {
        if (requestOption == null) {
            requestOption = new ArrayList<String>();
        }
        return this.requestOption;
    }

}
