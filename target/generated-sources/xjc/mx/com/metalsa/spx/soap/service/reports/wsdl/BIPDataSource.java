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
 * <p>Clase Java para BIPDataSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BIPDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JDBCDataSource" type="{http://xmlns.oracle.com/oxp/service/v2}JDBCDataSource"/&gt;
 *         &lt;element name="fileDataSource" type="{http://xmlns.oracle.com/oxp/service/v2}FileDataSource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIPDataSource", propOrder = {
    "jdbcDataSource",
    "fileDataSource"
})
public class BIPDataSource {

    @XmlElement(name = "JDBCDataSource", required = true, nillable = true)
    protected JDBCDataSource jdbcDataSource;
    @XmlElement(required = true, nillable = true)
    protected FileDataSource fileDataSource;

    /**
     * Obtiene el valor de la propiedad jdbcDataSource.
     * 
     * @return
     *     possible object is
     *     {@link JDBCDataSource }
     *     
     */
    public JDBCDataSource getJDBCDataSource() {
        return jdbcDataSource;
    }

    /**
     * Define el valor de la propiedad jdbcDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JDBCDataSource }
     *     
     */
    public void setJDBCDataSource(JDBCDataSource value) {
        this.jdbcDataSource = value;
    }

    /**
     * Obtiene el valor de la propiedad fileDataSource.
     * 
     * @return
     *     possible object is
     *     {@link FileDataSource }
     *     
     */
    public FileDataSource getFileDataSource() {
        return fileDataSource;
    }

    /**
     * Define el valor de la propiedad fileDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDataSource }
     *     
     */
    public void setFileDataSource(FileDataSource value) {
        this.fileDataSource = value;
    }

}
