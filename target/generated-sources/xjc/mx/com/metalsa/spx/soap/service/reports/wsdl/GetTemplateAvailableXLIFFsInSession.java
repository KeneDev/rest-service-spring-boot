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
 *         &lt;element name="reportAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "reportAbsolutePath",
    "templateID",
    "bipSessionToken"
})
@XmlRootElement(name = "getTemplateAvailableXLIFFsInSession")
public class GetTemplateAvailableXLIFFsInSession {

    @XmlElement(required = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true)
    protected String templateID;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Obtiene el valor de la propiedad reportAbsolutePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAbsolutePath() {
        return reportAbsolutePath;
    }

    /**
     * Define el valor de la propiedad reportAbsolutePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAbsolutePath(String value) {
        this.reportAbsolutePath = value;
    }

    /**
     * Obtiene el valor de la propiedad templateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Define el valor de la propiedad templateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Obtiene el valor de la propiedad bipSessionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Define el valor de la propiedad bipSessionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
