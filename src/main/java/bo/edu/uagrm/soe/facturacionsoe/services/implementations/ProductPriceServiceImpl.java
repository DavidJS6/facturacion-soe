package bo.edu.uagrm.soe.facturacionsoe.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductPriceValueObject;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("ProductPriceService")
public class ProductPriceServiceImpl implements ProductPriceService {
    private ProductPriceRepository productPriceRepository;
    private ProductService productService;

    public ProductPriceServiceImpl(ProductPriceRepository productPriceRepository, ProductService productService) {
        this.productPriceRepository = productPriceRepository;
        this.productService = productService;
    }

    @Override
    public void save(ProductPriceValueObject productPriceDto) throws Exception {
        ProductPrice productPrice = new ProductPrice();
        saveEntity(productPrice, productPriceDto);
    }

    @Override
    public void update(Long productPriceId, ProductPriceValueObject productPriceDto) throws Exception {
        ProductPrice productPrice = getProductPriceById(productPriceId);
        saveEntity(productPrice, productPriceDto);
    }

    @Override
    public void delete(Long productPriceId) throws Exception {
        ProductPrice productPrice = getProductPriceById(productPriceId);
        productPriceRepository.delete(productPrice);
    }

    @Override
    public ProductPrice getProductPriceById(Long productPriceId) throws Exception {
        return productPriceRepository.findById(productPriceId)
                .orElseThrow(() -> new Exception("It does not exist a product price with the specified id"));
    }

    @Override
    public Collection<ProductPrice> getAllPrices() {
        return productPriceRepository.findAll();
    }

    @Override
    public Collection<ProductPrice> getAllActivePrices() {
        return null;
    }

    @Override
    public Collection<ProductPrice> getAllActivePricesByProductId(Long ProductId) {
        return null;
    }

    private void saveEntity(ProductPrice productPrice, ProductPriceValueObject productPriceDto) throws Exception {
        productPrice.setAmount(productPriceDto.getAmountObject().getValue());
        productPrice.setStartTimestamp(productPriceDto.getStartTimestampObject().getValue());
        productPrice.setEndTimestamp(productPriceDto.getEndTimestampObject().getValue());
        productPrice.setActive(productPriceDto.getIsActiveObject().getValue());
        productPrice.setProduct(productService.getProductById(productPriceDto.getProductIdObject().getValue()));
        productPriceRepository.save(productPrice);
    }
}
