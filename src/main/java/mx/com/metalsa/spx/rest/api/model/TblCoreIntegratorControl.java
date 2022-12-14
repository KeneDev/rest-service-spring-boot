package mx.com.metalsa.spx.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase que mantiene el modelo con la tabla TBL_CORE_INTEGRATOR_CONTROL
 * @author Kenenias B. Perez Betanzos
 * @since 14/09/2022
 * @version 1.0
 */
@Data
@Entity
//@Table(name = "TBL_CORE_INTEGRATOR_CONTROL")
@IdClass(TblCoreIntegratorControlId.class)
@NoArgsConstructor(force = true)
@AllArgsConstructor
@NamedStoredProcedureQuery(
        name = "mx.com.metalsa.jpa.repository.TblCoreIntegratorControlRepository.genericIntegrator",
        procedureName = "INTEGRATION_CORE_PKG.GENERIC_INTEGRATOR",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "I_MODULE", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "I_TABLE_NAME", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "I_DATA", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "O_RESPONSE_CODE", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "O_RESPONSE_MESSAGE", type = String.class)
        }
)
public class TblCoreIntegratorControl implements Serializable {

    @Id
    private String module;
    @Id
    private String tableName;
    @Column
    private String tableOwner;
    @Column
    private String mergeKeyColumns;
    @Column
    private String xmlDataPath;
    @Column
    private Integer deleteRequired;
    @Column
    private Integer active;

}
