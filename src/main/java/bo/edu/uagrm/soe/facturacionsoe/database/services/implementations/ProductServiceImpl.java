package bo.edu.uagrm.soe.facturacionsoe.database.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.ValidatedProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductPriceService productPriceService;

    @Override
    public void save(ValidatedProductDto productDto) {
        Product product = new Product();
        product.setCode(productDto.getCodeObject().getValue());
        product.setName(productDto.getNameObject().getValue());
        product.setDescription(productDto.getDescriptionObject().getValue());

        productRepository.save(product);
    }

    @Override
    public void update(Long productId, ProductDto productDto) {

    }

    @Override
    public void delete(Long productId) {

    }

    @Override
    public Product getProductById(Long productId) throws Exception {
        return productRepository.findById(productId)
                .orElseThrow(() -> new Exception("It does not exist a product with the specified id"));
    }

    @Override
    public Collection<Product> getAllProducts() {
        return null;
    }

}
