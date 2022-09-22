package mx.com.metalsa.spx.rest.api.repository.impl;

import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interfaz que contiene los metodos CRUD para el objeto de TblControl
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
@Repository
public interface TblControlRepository extends CrudRepository<TblControl, TblControlId> {

    /**
     * Metodo que busca un registro dentro de la tabl TBL_CONTROL por su nombre
     * @param tableName nombre de la tabla que se busca la informacion
     * @return Optional<TblControl> objeto con la informacion recuperada o en su caso null si no se encontro la informacion
     */
    public Optional<TblControl> findOneByTableName(String tableName);

}