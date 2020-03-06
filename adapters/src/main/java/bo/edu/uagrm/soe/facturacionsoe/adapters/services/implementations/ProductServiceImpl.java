package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.adapters.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    private ProductMediator mediator;
    private ProductParser parser;

    public ProductServiceImpl(@Qualifier("ProductMediator") ProductMediator mediator, ProductParser parser) {
        this.mediator = mediator;
        this.parser = parser;
    }

    @Override
    public List<ProductResponseDto> findAll() {
        List<Product> result = mediator.send(new GetAllProductsQuery());
        return parser.parseEntitiesToResponseDtos(result);
    }

    @Override
    public ProductResponseDto findById(Long id) throws Exception {
        Product result = mediator.send(new GetProductByIdQuery(id));
        return parser.parseEntityToResponseDto(result);
    }

    @Override
    public ProductResponseDto update(Long id, ProductRequestDto productRequestDto) throws Exception {
        return null;
    }

    @Override
    public ProductResponseDto store(ProductRequestDto productRequestDto) throws Exception {
        Product result = mediator.send(new CreateProductCommand(
                productRequestDto.getCode(), productRequestDto.getName(), productRequestDto.getDescription()
        ));
        return parser.parseEntityToResponseDto(result);
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

*/
}
