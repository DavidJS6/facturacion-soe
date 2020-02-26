package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductValueObject;

import java.util.Collection;

public interface ProductService {
    void save(ProductValueObject productDto) throws Exception;

    void update(Long productId, ProductValueObject productDto) throws Exception;

    void delete(Long productId) throws Exception;

    Product getProductById(Long ProductId) throws Exception;

    Collection<Product> getAllProducts();
}
