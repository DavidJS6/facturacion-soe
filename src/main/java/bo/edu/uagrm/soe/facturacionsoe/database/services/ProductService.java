package bo.edu.uagrm.soe.facturacionsoe.database.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.ValidatedProductDto;

import java.util.Collection;

public interface ProductService {

    void save(ValidatedProductDto productDto);

    void update(Long productId, ProductDto productDto);

    void delete(Long productId);

    Product getProductById(Long ProductId) throws Exception;

    Collection<Product> getAllProducts();

}
