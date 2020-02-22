package bo.edu.uagrm.soe.facturacionsoe.database.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.dto.ProductPriceDto;

import java.util.Collection;

public interface ProductPriceService {

    void save(ProductPriceDto productPriceDto);

    void update(Long productPriceId, ProductPriceDto productPriceDto);

    void delete(Long productPriceId);

    Collection<ProductPrice> getAllPrices();

    Collection<ProductPrice> getAllActivePrices();

    Collection<ProductPrice> getAllActivePricesByProductId(Long ProductId);

}
