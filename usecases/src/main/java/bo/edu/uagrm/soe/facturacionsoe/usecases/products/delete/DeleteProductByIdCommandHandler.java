package bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;

public class DeleteProductByIdCommandHandler implements Handler<DeleteProductByIdCommand, Product> {

    private ProductRepository<Product> repository;

    public DeleteProductByIdCommandHandler(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product handleRequest(DeleteProductByIdCommand deleteProductByIdCommand) {
        Long id = deleteProductByIdCommand.getId();
        repository.deleteById(id);
        return null;
    }

}
