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
 * <p>Clase Java para FileDataSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dynamicDataSourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temporaryDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDataSource", propOrder = {
    "dynamicDataSourcePath",
    "temporaryDataSource"
})
public class FileDataSource {

    @XmlElement(required = true, nillable = true)
    protected String dynamicDataSourcePath;
    protected boolean temporaryDataSource;

    /**
     * Obtiene el valor de la propiedad dynamicDataSourcePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicDataSourcePath() {
        return dynamicDataSourcePath;
    }

    /**
     * Define el valor de la propiedad dynamicDataSourcePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicDataSourcePath(String value) {
        this.dynamicDataSourcePath = value;
    }

    /**
     * Obtiene el valor de la propiedad temporaryDataSource.
     * 
     */
    public boolean isTemporaryDataSource() {
        return temporaryDataSource;
    }

    /**
     * Define el valor de la propiedad temporaryDataSource.
     * 
     */
    public void setTemporaryDataSource(boolean value) {
        this.temporaryDataSource = value;
    }

}
