package mx.com.metalsa.spx.rest.api.repository.impl;

import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TblControlRepository extends CrudRepository<TblControl, TblControlId> {

    public Optional<TblControl> findOneByTableName(String tableName);

}