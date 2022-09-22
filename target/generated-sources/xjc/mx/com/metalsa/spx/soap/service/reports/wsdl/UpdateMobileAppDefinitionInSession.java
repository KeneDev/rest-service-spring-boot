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
 *         &lt;element name="reportAbsPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newMobileAppDefn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/&gt;
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
    "reportAbsPath",
    "newMobileAppDefn",
    "bipSessionToken"
})
@XmlRootElement(name = "updateMobileAppDefinitionInSession")
public class UpdateMobileAppDefinitionInSession {

    @XmlElement(required = true)
    protected String reportAbsPath;
    @XmlElement(required = true)
    protected MobileAppDefinition newMobileAppDefn;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Obtiene el valor de la propiedad reportAbsPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAbsPath() {
        return reportAbsPath;
    }

    /**
     * Define el valor de la propiedad reportAbsPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAbsPath(String value) {
        this.reportAbsPath = value;
    }

    /**
     * Obtiene el valor de la propiedad newMobileAppDefn.
     * 
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *     
     */
    public MobileAppDefinition getNewMobileAppDefn() {
        return newMobileAppDefn;
    }

    /**
     * Define el valor de la propiedad newMobileAppDefn.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *     
     */
    public void setNewMobileAppDefn(MobileAppDefinition value) {
        this.newMobileAppDefn = value;
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
