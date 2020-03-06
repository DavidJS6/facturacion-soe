package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.ProductModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.ProductSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository<ProductModel> {
    private final ProductSpringRepository repository;

    public ProductRepositoryImpl(ProductSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductModel> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductModel findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ProductModel save(ProductModel product) {
        return repository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
