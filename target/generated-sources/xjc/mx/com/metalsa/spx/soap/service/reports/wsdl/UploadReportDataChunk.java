//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.21 a las 01:10:52 PM CDT 
//


package mx.com.metalsa.spx.soap.service.reports.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportDataChunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportRawDataChunk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileID",
    "reportDataChunk",
    "reportRawDataChunk",
    "userID",
    "password"
})
@XmlRootElement(name = "uploadReportDataChunk")
public class UploadReportDataChunk {

    @XmlElement(required = true)
    protected String fileID;
    @XmlElement(required = true)
    protected byte[] reportDataChunk;
    @XmlElement(required = true)
    protected String reportRawDataChunk;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

    /**
     * Obtiene el valor de la propiedad fileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Define el valor de la propiedad fileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

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
     * Obtiene el valor de la propiedad reportRawDataChunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRawDataChunk() {
        return reportRawDataChunk;
    }

    /**
     * Define el valor de la propiedad reportRawDataChunk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRawDataChunk(String value) {
        this.reportRawDataChunk = value;
    }

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
