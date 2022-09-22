//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.21 a las 07:08:02 PM CDT 
//


package mx.com.metalsa.spx.soap.service.reports.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetaData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaDataName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metaDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaData", propOrder = {
    "metaDataName",
    "metaDataValue"
})
public class MetaData {

    @XmlElement(required = true, nillable = true)
    protected String metaDataName;
    @XmlElement(required = true, nillable = true)
    protected String metaDataValue;

    /**
     * Obtiene el valor de la propiedad metaDataName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataName() {
        return metaDataName;
    }

    /**
     * Define el valor de la propiedad metaDataName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataName(String value) {
        this.metaDataName = value;
    }

    /**
     * Obtiene el valor de la propiedad metaDataValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataValue() {
        return metaDataValue;
    }

    /**
     * Define el valor de la propiedad metaDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataValue(String value) {
        this.metaDataValue = value;
    }

}
