package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.ProductPriceModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.ProductPriceSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ports.ProductPriceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductPriceRepositoryImpl implements ProductPriceRepository<ProductPriceModel> {

    private final ProductPriceSpringRepository repository;

    public ProductPriceRepositoryImpl(ProductPriceSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductPriceModel> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductPriceModel findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ProductPriceModel save(ProductPriceModel productPrice) {
        return repository.save(productPrice);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProductPriceModel> getAllActivePrices() {
        return repository.getAllActivePrices();
    }

    @Override
    public List<ProductPriceModel> getAllActivePricesByProductId(Long productId) {
        return repository.getAllActivePricesByProductId(productId);
    }
}
