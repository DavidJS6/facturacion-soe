package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductPriceValueObject;

import java.util.Collection;

public interface ProductPriceService {
    void save(ProductPriceValueObject productPriceDto) throws Exception;

    void update(Long productPriceId, ProductPriceValueObject productPriceDto) throws Exception;

    void delete(Long productPriceId) throws Exception;

    ProductPrice getProductPriceById(Long productPriceId) throws Exception;

    Collection<ProductPrice> getAllPrices();

    Collection<ProductPrice> getAllActivePrices();

    Collection<ProductPrice> getAllActivePricesByProductId(Long ProductId);
}
