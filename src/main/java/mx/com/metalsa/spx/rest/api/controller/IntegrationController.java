package mx.com.metalsa.spx.rest.api.controller;

import mx.com.metalsa.spx.rest.api.exception.IntegrationException;
import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import mx.com.metalsa.spx.rest.api.service.InfoService;
import mx.com.metalsa.spx.rest.api.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Clase Control que contiene todos los endpoints que seran expuestos para el servicio de integración
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
@RestController
//@RequestMapping("integration/api/v1/")
@RequestMapping("api/v1/")
public class IntegrationController {

    @Autowired
    private InfoService info;

    @Autowired
    private IntegrationService integrationService;

    /**
     * Metodo que solo sirve de prueba para verificar que los servicios se encuentran activos
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return info.getInfo();
    }

    /**
     *Metodo que expone el servicio para recuperar los registros de la tabla TBL_CONTROL
     * @return List<TblControl> lista con los registros recuperados de la tabla TBL_CONTROL
     */
    @RequestMapping(value = "controls", method = RequestMethod.GET)
    public List<TblControl> list(){
        return integrationService.getTblControl();
    }

    /**
     * Metodo que expone el servicio para crea un nuevo registro en la tabla TBL_CONTROL
     * @param tblControl objeto que contiene la informacion para crear un nuevo registro en la TBL_CONTROL
     * @return objeto TblControl creado en la tabla TBL_CONTROL
     */
    @RequestMapping(value = "controls", method = RequestMethod.POST)
    public TblControl create(@RequestBody TblControl tblControl){
        return integrationService.createTblControl(tblControl);
    }

    /**
     * Metodo que expone un servicio o endpoint para recuperar un registro de la tabla TBL_CONTROL por su id
     * @param id es la clave primaria del objeto TblControl
     * @return Objeto TblControl que se recupera de la busqueda
     */
    @RequestMapping( value = "controls/id", method = RequestMethod.GET)
    public TblControl get(@RequestBody TblControlId id){
        return integrationService.getTblControlById(id);
    }

    /**
     * Metodo que expone un servicio o endpoint para actualizar un registro de una tabla TBL_CONTROL
     * @param tableName nombre de la tabla
     * @param tblControl objeto que contiene la informacion que se quiere actualizar
     * @return TblControl objeto con los datos actualizados
     */
    @RequestMapping(value = "controls/{id}", method = RequestMethod.PUT)
    public TblControl update(@RequestParam String tableName, @RequestBody TblControl tblControl){
        return integrationService.updateTblControltById(tableName, tblControl);
    }

    /**
     * Metodo que expone un endpoint para eliminar un registro de la tabla TBL_CONTROL
     */
    @RequestMapping(value = "controls/id", method = RequestMethod.DELETE)
    public void delete(@RequestBody TblControl tblControl){
        integrationService.deleteTblControlById(tblControl);
    }

    /**
     * Metodo que expone un endpoint para ejecutar el proceso de integracion de un objeto de TblControl
     * @param tableName nombre del objeto que se procesara para su integracion
     * @return ResponseEntity objeto que contiene la respuesta del endpoint
     */
    @RequestMapping(value = "process/{tableName}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity callIntegration(@PathVariable String tableName){
        try {
            return new ResponseEntity(integrationService.callIntegration(tableName), HttpStatus.OK);
        }catch(IntegrationException ex){
            return new ResponseEntity(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }


}
