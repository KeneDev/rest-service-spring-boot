package mx.com.metalsa.spx.rest.api.service;

import mx.com.metalsa.spx.rest.api.exception.IntegrationException;
import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import mx.com.metalsa.spx.rest.api.model.WSResponse;
import mx.com.metalsa.spx.soap.service.reports.wsdl.RunReportResponse;

import java.util.List;
import java.util.Map;

/**
 * Interfaz que mantiene los servicios y contratos para la recuperación y ejecución de los objetos de Integracion
 * @author Kenenias B. Perez Betanzos
 * @since 12/09/2022
 * @version 1.0
 */
public interface IntegrationService {

    /**
     * Recupera todos los datos de la tabla TBL_CONTROL
     * @return Una lista con los registros de la tabla TBL_CONTROL
     */
    List<TblControl> getTblControl();

    /**
     * Crea un registro nuevo para la tabla de TBL_CONTROL
     * @param tblControl
     * @return
     */
    TblControl createTblControl(TblControl tblControl);

    /**
     * Recupera un registro de la tabla TBL_CONTROL
     * @param id el id del registro buscado
     * @return un objeto TblControl con los datos del registro.
     */
    TblControl getTblControlById(TblControlId id);

    /**
     * Actualiza un registro de la tabla TBL_CONTROL
     * @param tableName nombre de la tabla
     * @param tblControl objeto con los valores del registro
     * @return objeto TblControl actualizada con los valores
     */
    TblControl updateTblControltById(String tableName, TblControl tblControl);
    void deleteTblControlById(TblControl tblControl);

    /**
     * Metodo que ejecuta el servicio RunReport de OTBI para recuperar la información actualizada del datamodel
     * @param absolutePath el path o ruta del reporte en OTBI
     * @param minutes tiempo en el cual se va a realizar la actualización del reporte
     * @return RunReportResponse objeto que contiene la respuesta del servicio
     * @throws IntegrationException Si sucede un error al tratar de ejecutar el servicio RunReport
     */
    RunReportResponse queryRunReport(String absolutePath, int minutes)throws IntegrationException;

    /**
     * Metodo que llama al procedure que realiza la actualizacion de los datos recuperados del datamodel de servicio
     * RunReport de OTBI
     * @param tblControl objeto con los datos que se requiere actualizar
     * @param runReportResponse objeto de respuesta del servicio de RunReport de OTBI
     * @return Map<String, Object> objeto que contiene los valores del codigo y mensaje de respuesta del procedure
     * @throws IntegrationException si sucede algun error al tratar de ejecutar el procedimiento.
     */
    Map<String, Object> callProcedure(TblControl tblControl, RunReportResponse runReportResponse)throws IntegrationException;

    public WSResponse callIntegration(String tableName)throws IntegrationException;

}
