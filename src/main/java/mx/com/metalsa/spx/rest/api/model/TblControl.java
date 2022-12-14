package mx.com.metalsa.spx.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Clase que mantiene el modelo con la tabla TBL_CONTROL
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@IdClass(TblControlId.class)
public class TblControl {

    @Id
    private String module;
    @Id
    private String tableName;
    @Column
    private String reportAbsolutePath;
    @Column
    private Integer tiempo;

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

    public String getReportAbsolutePath() {
        return reportAbsolutePath;
    }

    public void setReportAbsolutePath(String reportAbsolutePath) {
        this.reportAbsolutePath = reportAbsolutePath;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
}
