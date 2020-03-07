package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.adapters.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers.ProductPriceParser;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductPriceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete.DeleteProductPriceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall.GetAllProductPricesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid.GetProductPriceByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update.UpdateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductPriceService")
public class ProductPriceServiceImpl implements ProductPriceService {

    private ProductPriceMediator mediator;
    private ProductPriceParser parser;

    public ProductPriceServiceImpl(@Qualifier("ProductPriceMediator") ProductPriceMediator mediator,
                                   ProductPriceParser parser) {
        this.mediator = mediator;
        this.parser = parser;
    }

    @Override
    public List<ProductPriceResponseDto> getAllActivePrices() {
        return null;
    }

    @Override
    public List<ProductPriceResponseDto> getAllActivePricesByProductId(Long productId) {
        return null;
    }

    @Override
    public List<ProductPriceResponseDto> findAll() {
        List<ProductPrice> result = mediator.send(new GetAllProductPricesQuery());
        return parser.parseEntitiesToResponseDtos(result);
    }

    @Override
    public ProductPriceResponseDto findById(Long id) throws Exception {
        ProductPrice result = mediator.send(new GetProductPriceByIdQuery(id));
        return parser.parseEntityToResponseDto(result);
    }

    @Override
    public ProductPriceResponseDto update(Long id, ProductPriceRequestDto productPriceRequestDto) throws Exception {
        ProductPrice result = mediator.send(new UpdateProductPriceCommand(
                id, productPriceRequestDto.getAmount(), productPriceRequestDto.getStartTimestamp(),
                productPriceRequestDto.getEndTimestamp(), productPriceRequestDto.getActive(),
                productPriceRequestDto.getProductId()
        ));
        return parser.parseEntityToResponseDto(result);
    }

    @Override
    public ProductPriceResponseDto store(ProductPriceRequestDto productPriceRequestDto) throws Exception {
        ProductPrice result = mediator.send(new CreateProductPriceCommand(
                productPriceRequestDto.getAmount(), productPriceRequestDto.getStartTimestamp(),
                productPriceRequestDto.getEndTimestamp(), productPriceRequestDto.getActive(),
                productPriceRequestDto.getProductId()
        ));
        return parser.parseEntityToResponseDto(result);
    }

    @Override
    public void delete(Long id) throws Exception {
        mediator.send(new DeleteProductPriceByIdCommand(id));
    }
/*

    private ProductPriceRepository productPriceRepository;
    private ProductService productService;
    private ProductPriceParser productPriceParser;

    public ProductPriceServiceImpl(ProductPriceRepository productPriceRepository, ProductService productService, ProductPriceParser productPriceParser) {
        this.productPriceRepository = productPriceRepository;
        this.productService = productService;
        this.productPriceParser = productPriceParser;
    }

    @Override
    public List<ProductPriceResponseDto> getAllActivePrices() {
        List<ProductPrice> productPriceList = productPriceRepository.getAllActivePrices();
        return productPriceParser.parseEntitiesToResponseDtos(productPriceList);
    }

    @Override
    public List<ProductPriceResponseDto> getAllActivePricesByProductId(Long productId) {
        List<ProductPrice> productPriceList = productPriceRepository.getAllActivePricesByProductId(productId);
        return productPriceParser.parseEntitiesToResponseDtos(productPriceList);
    }

    @Override
    public List<ProductPriceResponseDto> findAll() {
        List<ProductPrice> productPriceList = productPriceRepository.findAll();
        return productPriceParser.parseEntitiesToResponseDtos(productPriceList);
    }

    @Override
    public ProductPriceResponseDto findById(Long id) throws Exception {
        ProductPrice productPrice = getProductPriceById(id);
        return productPriceParser.parseEntityToResponseDto(productPrice);
    }

    @Override
    public ProductPriceResponseDto update(Long id, ProductPriceRequestDto productPriceRequestDto) {
        ProductPriceValueObject validatedProductPrice = new ProductPriceValueObject(productPriceRequestDto);
        ProductPrice productPrice = productPriceParser.parseRequestDtoToEntity(validatedProductPrice.getValue());
        productPrice.setId(id);
        productPrice.getProduct().setId(validatedProductPrice.getValue().getProductId());
        productPrice = productPriceRepository.save(productPrice);
        return productPriceParser.parseEntityToResponseDto(productPrice);
    }

    @Override
    public ProductPriceResponseDto store(ProductPriceRequestDto productPriceRequestDto) {
        ProductPriceValueObject validatedProductPrice = new ProductPriceValueObject(productPriceRequestDto);
        ProductPrice productPrice = productPriceParser.parseRequestDtoToEntity(validatedProductPrice.getValue());
        productPrice.setId(null);
        productPrice = productPriceRepository.save(productPrice);
        return productPriceParser.parseEntityToResponseDto(productPrice);
    }

    @Override
    public void delete(Long id) throws Exception {
        ProductPrice productPrice = getProductPriceById(id);
        productPriceRepository.delete(productPrice);
    }

    private ProductPrice getProductPriceById(Long id) throws Exception {
        return productPriceRepository.findById(id)
                .orElseThrow(() -> new Exception("It does not exist a product price with the specified id"));
    }
*/

}
