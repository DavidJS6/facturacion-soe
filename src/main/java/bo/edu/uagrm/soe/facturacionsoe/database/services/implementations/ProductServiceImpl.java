package bo.edu.uagrm.soe.facturacionsoe.database.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.ValidatedProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductPriceService productPriceService;

    @Override
    public void save(ValidatedProductDto productDto) throws Exception {
        Product product = new Product();
        /*
        product.setCode(productDto.getCodeObject().getValue());
        product.setName(productDto.getNameObject().getValue());
        product.setDescription(productDto.getDescriptionObject().getValue());

        List<ProductPrice> list = new ArrayList<>();
        list.add(productPriceService.getProductPriceById(productDto.getProductPriceIdObject().getValue()));
        product.setProductPriceList(list);

        productRepository.save(product);
        */
        saveEntity(product, productDto);
    }

    @Override
    public void update(Long productId, ValidatedProductDto productDto) throws Exception {
        Product product = getProductById(productId);
        /*
        product.setCode(productDto.getCodeObject().getValue());
        product.setName(productDto.getNameObject().getValue());
        product.setDescription(productDto.getDescriptionObject().getValue());

        List<ProductPrice> list = new ArrayList<>();
        list.add(productPriceService.getProductPriceById(productDto.getProductPriceIdObject().getValue()));
        product.setProductPriceList(list);

        productRepository.save(product);
        */
        saveEntity(product, productDto);
    }

    @Override
    public void delete(Long productId) throws Exception {
        Product product = getProductById(productId);
        productRepository.delete(product);
    }

    @Override
    public Product getProductById(Long productId) throws Exception {
        return productRepository.findById(productId)
                .orElseThrow(() -> new Exception("It does not exist a product with the specified id"));
    }

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.findAll();
    }

    private void saveEntity(Product product, ValidatedProductDto productDto) throws Exception {
        product.setCode(productDto.getCodeObject().getValue());
        product.setName(productDto.getNameObject().getValue());
        product.setDescription(productDto.getDescriptionObject().getValue());

        List<ProductPrice> list = new ArrayList<>();
        list.add(productPriceService.getProductPriceById(productDto.getProductPriceIdObject().getValue()));
        product.setProductPriceList(list);

        productRepository.save(product);
    }

}
