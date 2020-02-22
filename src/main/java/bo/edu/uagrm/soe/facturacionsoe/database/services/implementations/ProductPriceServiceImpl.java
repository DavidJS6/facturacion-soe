package bo.edu.uagrm.soe.facturacionsoe.database.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.database.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductPriceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("ProductPriceService")
public class ProductPriceServiceImpl implements ProductPriceService {

    @Autowired
    private ProductPriceRepository productPriceRepository;

    @Override
    public void save(ProductPriceDto productPriceDto) {

    }

    @Override
    public void update(Long productPriceId, ProductPriceDto productPriceDto) {

    }

    @Override
    public void delete(Long productPriceId) {

    }

    @Override
    public Collection<ProductPrice> getAllPrices() {
        return null;
    }

    @Override
    public Collection<ProductPrice> getAllActivePrices() {
        return null;
    }

    @Override
    public Collection<ProductPrice> getAllActivePricesByProductId(Long ProductId) {
        return null;
    }

}
