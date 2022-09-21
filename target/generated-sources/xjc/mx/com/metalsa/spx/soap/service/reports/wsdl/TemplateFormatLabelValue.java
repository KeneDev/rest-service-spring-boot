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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TemplateFormatLabelValue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TemplateFormatLabelValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="templateFormatLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateFormatValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateFormatLabelValue", propOrder = {
    "templateFormatLabel",
    "templateFormatValue"
})
public class TemplateFormatLabelValue {

    @XmlElement(required = true, nillable = true)
    protected String templateFormatLabel;
    @XmlElement(required = true, nillable = true)
    protected String templateFormatValue;

    /**
     * Obtiene el valor de la propiedad templateFormatLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFormatLabel() {
        return templateFormatLabel;
    }

    /**
     * Define el valor de la propiedad templateFormatLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFormatLabel(String value) {
        this.templateFormatLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad templateFormatValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFormatValue() {
        return templateFormatValue;
    }

    /**
     * Define el valor de la propiedad templateFormatValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFormatValue(String value) {
        this.templateFormatValue = value;
    }

}
