package mx.com.metalsa.spx.rest.api.model;

import lombok.*;

import java.io.Serializable;

/**
 * Clase que mantiene el modelo de la llave primaria de la tabla TBL_CORE_INTEGRATOR_CONTROL
 * @author Kenenias B. Perez Betanzos
 * @since 14/09/2022
 * @version 1.0
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class TblCoreIntegratorControlId implements Serializable {

    private String module;
    private String tableName;

}
