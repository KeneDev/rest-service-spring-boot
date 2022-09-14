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
 *         &lt;element name="getReportDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDefinition"/&gt;
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
    "getReportDefinitionInSessionReturn"
})
@XmlRootElement(name = "getReportDefinitionInSessionResponse")
public class GetReportDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected ReportDefinition getReportDefinitionInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getReportDefinitionInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getGetReportDefinitionInSessionReturn() {
        return getReportDefinitionInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getReportDefinitionInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setGetReportDefinitionInSessionReturn(ReportDefinition value) {
        this.getReportDefinitionInSessionReturn = value;
    }

}
