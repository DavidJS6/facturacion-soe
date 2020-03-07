package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentSpringRepository extends JpaRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {
}
