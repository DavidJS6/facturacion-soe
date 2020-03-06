package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import java.util.List;

public interface CrudRepository<TEntity> {
    List<TEntity> findAll();

    TEntity findById(Long id);

    TEntity save(TEntity entity);

    void deleteById(Long id);
}
