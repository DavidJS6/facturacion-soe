package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.ProductModel;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpringRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
