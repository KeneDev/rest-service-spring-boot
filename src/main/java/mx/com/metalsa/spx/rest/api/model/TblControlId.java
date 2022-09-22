package mx.com.metalsa.spx.rest.api.model;

import lombok.*;

import java.io.Serializable;

/**
 * Clase que mantiene el modelo de la llave primaria de la tabla TBL_CONTROL
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class TblControlId implements Serializable {

    private String module;
    private String tableName;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
