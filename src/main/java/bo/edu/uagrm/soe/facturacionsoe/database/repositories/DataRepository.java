package bo.edu.uagrm.soe.facturacionsoe.database.repositories;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository("DataRepository")
public interface DataRepository extends JpaRepository<Data, Long>, JpaSpecificationExecutor<Data> {

    Collection<Data> getAllBy();

}
