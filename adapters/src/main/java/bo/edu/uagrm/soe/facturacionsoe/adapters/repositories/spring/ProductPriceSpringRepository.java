package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.ProductPriceModel;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPriceSpringRepository extends JpaRepository<ProductPrice, Long>, JpaSpecificationExecutor<ProductPrice> {

    @Query(value = "SELECT * FROM product_prices WHERE is_active = true", nativeQuery = true)
    List<ProductPrice> getAllActivePrices();

    @Query(value = "SELECT * FROM product_prices WHERE is_active = true AND product_id = :productId", nativeQuery = true)
    List<ProductPrice> getAllActivePricesByProductId(@Param("productId") Long productId);

}
