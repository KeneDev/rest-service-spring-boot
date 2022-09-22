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
 *         &lt;element name="getMobileAppDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/&gt;
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
    "getMobileAppDefinitionInSessionReturn"
})
@XmlRootElement(name = "getMobileAppDefinitionInSessionResponse")
public class GetMobileAppDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected MobileAppDefinition getMobileAppDefinitionInSessionReturn;

    /**
     * Obtiene el valor de la propiedad getMobileAppDefinitionInSessionReturn.
     * 
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *     
     */
    public MobileAppDefinition getGetMobileAppDefinitionInSessionReturn() {
        return getMobileAppDefinitionInSessionReturn;
    }

    /**
     * Define el valor de la propiedad getMobileAppDefinitionInSessionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *     
     */
    public void setGetMobileAppDefinitionInSessionReturn(MobileAppDefinition value) {
        this.getMobileAppDefinitionInSessionReturn = value;
    }

}
