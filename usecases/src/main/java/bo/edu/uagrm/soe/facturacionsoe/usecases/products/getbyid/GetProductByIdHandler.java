package bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;

public class GetProductByIdHandler implements Handler<GetProductByIdQuery, Product> {
    private ProductRepository<Product> repository;

    public GetProductByIdHandler(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product handleRequest(GetProductByIdQuery getProductByIdQuery) {
        Long id = getProductByIdQuery.getId();
        return repository.findById(id);
    }


}
