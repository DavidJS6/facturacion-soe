package bo.edu.uagrm.soe.facturacionsoe.database.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.dto.ProductDto;

import java.util.Collection;

public interface ProductService {

    void save(ProductDto productDto);

    void update(Long productId, ProductDto productDto);

    void delete(Long productId);

    Collection<Product> getAllProducts();

}
