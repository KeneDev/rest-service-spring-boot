//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.14 a las 11:02:22 AM CDT 
//


package mx.com.metalsa.spx.soap.service.reports.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaDataList" type="{http://xmlns.oracle.com/oxp/service/v2}MetaDataList"/&gt;
 *         &lt;element name="reportBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportContentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportFileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResponse", propOrder = {
    "metaDataList",
    "reportBytes",
    "reportContentType",
    "reportFileID",
    "reportLocale"
})
public class ReportResponse {

    @XmlElement(required = true, nillable = true)
    protected MetaDataList metaDataList;
    @XmlElement(required = true, nillable = true)
    protected byte[] reportBytes;
    @XmlElement(required = true, nillable = true)
    protected String reportContentType;
    @XmlElement(required = true, nillable = true)
    protected String reportFileID;
    @XmlElement(required = true, nillable = true)
    protected String reportLocale;

    /**
     * Obtiene el valor de la propiedad metaDataList.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataList }
     *     
     */
    public MetaDataList getMetaDataList() {
        return metaDataList;
    }

    /**
     * Define el valor de la propiedad metaDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataList }
     *     
     */
    public void setMetaDataList(MetaDataList value) {
        this.metaDataList = value;
    }

    /**
     * Obtiene el valor de la propiedad reportBytes.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportBytes() {
        return reportBytes;
    }

    /**
     * Define el valor de la propiedad reportBytes.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportBytes(byte[] value) {
        this.reportBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad reportContentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportContentType() {
        return reportContentType;
    }

    /**
     * Define el valor de la propiedad reportContentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportContentType(String value) {
        this.reportContentType = value;
    }

    /**
     * Obtiene el valor de la propiedad reportFileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFileID() {
        return reportFileID;
    }

    /**
     * Define el valor de la propiedad reportFileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFileID(String value) {
        this.reportFileID = value;
    }

    /**
     * Obtiene el valor de la propiedad reportLocale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportLocale() {
        return reportLocale;
    }

    /**
     * Define el valor de la propiedad reportLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportLocale(String value) {
        this.reportLocale = value;
    }

}
