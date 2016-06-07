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
 *         &lt;element name="AlternateTrackingInfo" type="{}AlternateTrackingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActivityLocation" type="{}ActivityLocationType" minOccurs="0"/>
 *         &lt;element ref="{}Status" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDateFromManifestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}NextScheduleActivity" minOccurs="0"/>
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
    "alternateTrackingInfo",
    "activityLocation",
    "status",
    "date",
    "time",
    "deliveryDateFromManifestIndicator",
    "nextScheduleActivity"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "AlternateTrackingInfo")
    protected List<AlternateTrackingInfoType> alternateTrackingInfo;
    @XmlElement(name = "ActivityLocation")
    protected ActivityLocationType activityLocation;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "DeliveryDateFromManifestIndicator")
    protected String deliveryDateFromManifestIndicator;
    @XmlElement(name = "NextScheduleActivity")
    protected NextScheduleActivity nextScheduleActivity;

    /**
     * Gets the value of the alternateTrackingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTrackingInfoType }
     * 
     * 
     */
    public List<AlternateTrackingInfoType> getAlternateTrackingInfo() {
        if (alternateTrackingInfo == null) {
            alternateTrackingInfo = new ArrayList<AlternateTrackingInfoType>();
        }
        return this.alternateTrackingInfo;
    }

    /**
     * ��ȡactivityLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActivityLocationType }
     *     
     */
    public ActivityLocationType getActivityLocation() {
        return activityLocation;
    }

    /**
     * ����activityLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLocationType }
     *     
     */
    public void setActivityLocation(ActivityLocationType value) {
        this.activityLocation = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * ��ȡdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * ��ȡdeliveryDateFromManifestIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDateFromManifestIndicator() {
        return deliveryDateFromManifestIndicator;
    }

    /**
     * ����deliveryDateFromManifestIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDateFromManifestIndicator(String value) {
        this.deliveryDateFromManifestIndicator = value;
    }

    /**
     * ��ȡnextScheduleActivity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NextScheduleActivity }
     *     
     */
    public NextScheduleActivity getNextScheduleActivity() {
        return nextScheduleActivity;
    }

    /**
     * ����nextScheduleActivity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NextScheduleActivity }
     *     
     */
    public void setNextScheduleActivity(NextScheduleActivity value) {
        this.nextScheduleActivity = value;
    }

}
