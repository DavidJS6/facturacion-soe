package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    private ProductMediator mediator;

    public ProductServiceImpl(@Qualifier("ProductMediator") ProductMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public List<ProductResponseDto> findAll() {
        System.out.println(mediator.send(new GetAllProductsQuery()));
        return null;
    }

    @Override
    public ProductResponseDto findById(Long id) throws Exception {
        return null;
    }

    @Override
    public ProductResponseDto update(Long id, ProductRequestDto productRequestDto) throws Exception {
        return null;
    }

    @Override
    public ProductResponseDto store(ProductRequestDto productRequestDto) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    /*private ProductRepository productRepository;
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

*/}
