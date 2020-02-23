package bo.edu.uagrm.soe.facturacionsoe.database.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductPriceDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.ValidatedProductPriceDto;

import java.util.Collection;

public interface ProductPriceService {

    void save(ValidatedProductPriceDto productPriceDto);

    void update(Long productPriceId, ValidatedProductPriceDto productPriceDto);

    void delete(Long productPriceId);

    ProductPrice getProductPriceById(Long productPriceId) throws Exception;

    Collection<ProductPrice> getAllPrices();

    Collection<ProductPrice> getAllActivePrices();

    Collection<ProductPrice> getAllActivePricesByProductId(Long ProductId);

}
