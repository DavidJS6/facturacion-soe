package bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;

import java.util.List;

public class GetAllProductsHandler implements Handler<GetAllProductsQuery, List<Product>> {
    private ProductRepository repository;

    public GetAllProductsHandler(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> handleRequest(GetAllProductsQuery query) {
        return repository.findAll();
    }
}
