//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.21 a las 07:43:14 PM CDT 
//


package mx.com.metalsa.spx.soap.service.reports.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportDataChunk complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportDataChunk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportDataChunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportDataFileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportDataOffset" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDataChunk", propOrder = {
    "reportDataChunk",
    "reportDataFileID",
    "reportDataOffset"
})
public class ReportDataChunk {

    @XmlElement(required = true, nillable = true)
    protected byte[] reportDataChunk;
    @XmlElement(required = true, nillable = true)
    protected String reportDataFileID;
    protected long reportDataOffset;

    /**
     * Obtiene el valor de la propiedad reportDataChunk.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportDataChunk() {
        return reportDataChunk;
    }

    /**
     * Define el valor de la propiedad reportDataChunk.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportDataChunk(byte[] value) {
        this.reportDataChunk = value;
    }

    /**
     * Obtiene el valor de la propiedad reportDataFileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDataFileID() {
        return reportDataFileID;
    }

    /**
     * Define el valor de la propiedad reportDataFileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDataFileID(String value) {
        this.reportDataFileID = value;
    }

    /**
     * Obtiene el valor de la propiedad reportDataOffset.
     * 
     */
    public long getReportDataOffset() {
        return reportDataOffset;
    }

    /**
     * Define el valor de la propiedad reportDataOffset.
     * 
     */
    public void setReportDataOffset(long value) {
        this.reportDataOffset = value;
    }

}
