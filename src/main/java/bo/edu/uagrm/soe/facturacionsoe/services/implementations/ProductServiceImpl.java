package bo.edu.uagrm.soe.facturacionsoe.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.ProductResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductValueObject;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductParser productParser;

    public ProductServiceImpl(ProductRepository productRepository, ProductParser productParser) {
        this.productRepository = productRepository;
        this.productParser = productParser;
    }

    @Override
    public List<ProductResponseDto> findAll() {
        List<Product> productList = productRepository.findAll();
        return productParser.parseEntitiesToResponseDtos(productList);
    }

    @Override
    public ProductResponseDto findById(Long id) throws Exception {
        Product product = getProductById(id);
        return productParser.parseEntityToResponseDto(product);
    }

    @Override
    public ProductResponseDto update(Long id, ProductRequestDto productRequestDto) {
        ProductValueObject validatedProduct = new ProductValueObject(productRequestDto);
        Product product = productParser.parseRequestDtoToEntity(validatedProduct.getValue());
        product.setId(id);
        product = productRepository.save(product);
        return productParser.parseEntityToResponseDto(product);
    }

    @Override
    public ProductResponseDto store(ProductRequestDto productRequestDto) {
        ProductValueObject validatedProduct = new ProductValueObject(productRequestDto);
        Product product = productParser.parseRequestDtoToEntity(validatedProduct.getValue());
        product = productRepository.save(product);
        return productParser.parseEntityToResponseDto(product);
    }

    @Override
    public void delete(Long id) throws Exception {
        Product product = getProductById(id);
        productRepository.delete(product);
    }

    private Product getProductById(Long id) throws Exception {
        return productRepository.findById(id)
                .orElseThrow(() -> new Exception("It does not exist a product with the specified id"));
    }

}
