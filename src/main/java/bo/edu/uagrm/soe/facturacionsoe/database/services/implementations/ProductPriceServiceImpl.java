package bo.edu.uagrm.soe.facturacionsoe.database.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.ValidatedProductPriceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("ProductPriceService")
public class ProductPriceServiceImpl implements ProductPriceService {

    @Autowired
    private ProductPriceRepository productPriceRepository;

    /*
    public ProductPriceServiceImpl(ProductPriceRepository productPriceRepository) {
        this.productPriceRepository = productPriceRepository;
    }
    */

    @Override
    public void save(ValidatedProductPriceDto productPriceDto) {
        ProductPrice productPrice = new ProductPrice();
        saveEntity(productPrice, productPriceDto);
    }

    @Override
    public void update(Long productPriceId, ValidatedProductPriceDto productPriceDto) throws Exception {
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

    private void saveEntity(ProductPrice productPrice, ValidatedProductPriceDto productPriceDto) {
        productPrice.setAmount(productPriceDto.getAmountObject().getValue());
        productPrice.setStartTimestamp(productPriceDto.getStartTimestamp().getValue());
        productPrice.setEndTimestamp(productPriceDto.getEndTimestamp().getValue());
        productPrice.setActive(productPriceDto.getIsActive().getValue());
        productPriceRepository.save(productPrice);
    }

}
