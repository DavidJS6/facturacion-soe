package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.InvoiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceSpringRepository extends JpaRepository<InvoiceModel, Long>, JpaSpecificationExecutor<InvoiceModel> {
}