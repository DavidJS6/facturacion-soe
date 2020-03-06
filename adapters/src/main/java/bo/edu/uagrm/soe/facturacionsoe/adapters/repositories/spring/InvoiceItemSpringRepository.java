package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.InvoiceItemModel;
import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemSpringRepository extends JpaRepository<InvoiceItemModel, Long>, JpaSpecificationExecutor<InvoiceItemModel> {
}
