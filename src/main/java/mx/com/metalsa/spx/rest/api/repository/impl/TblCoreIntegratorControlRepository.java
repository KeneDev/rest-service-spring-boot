package mx.com.metalsa.spx.rest.api.repository.impl;

import mx.com.metalsa.spx.rest.api.model.TblCoreIntegratorControl;
import mx.com.metalsa.spx.rest.api.model.TblCoreIntegratorControlId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * Interfaz que mantiene los servicios y contratos para el objeto de TblCoreIntegrator
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
@Repository
public interface TblCoreIntegratorControlRepository extends JpaRepository<TblCoreIntegratorControl, TblCoreIntegratorControlId> {

    /**
     * Metodo que permite ejecutar el procedure INTEGRATION_CORE_PKG.GENERIC_INTEGRATOR de la base de datos
     * @param module de la tabla control
     * @param tableName nombre de la tabla control
     * @param data informacion recuperada del servicio de OTBI para actualizar el objeto
     * @return Map<String, Object> objeto que contiene el codigo y el mensaje de respuesta del procedure
     */
    @Transactional
    @Procedure(name = "mx.com.metalsa.jpa.repository.TblCoreIntegratorControlRepository.genericIntegrator")
    Map<String, Object> genericIntegrator(@Param("I_MODULE") String module,
                                          @Param("I_TABLE_NAME") String tableName,
                                          @Param("I_DATA") String data);
}
