package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductPriceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.ProductPriceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductPriceService")
public class ProductPriceServiceImpl implements ProductPriceService {
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
        return null;
    }

    @Override
    public ProductPriceResponseDto findById(Long id) throws Exception {
        return null;
    }

    @Override
    public ProductPriceResponseDto update(Long id, ProductPriceRequestDto productPriceRequestDto) throws Exception {
        return null;
    }

    @Override
    public ProductPriceResponseDto store(ProductPriceRequestDto productPriceRequestDto) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

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
