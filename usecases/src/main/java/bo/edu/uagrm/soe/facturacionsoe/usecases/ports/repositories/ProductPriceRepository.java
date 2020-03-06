package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.CrudRepository;

import java.util.List;

public interface ProductPriceRepository<TProductPrice extends ProductPrice> extends CrudRepository<TProductPrice> {
    List<TProductPrice> getAllActivePrices();

    List<TProductPrice> getAllActivePricesByProductId(Long productId);
}
