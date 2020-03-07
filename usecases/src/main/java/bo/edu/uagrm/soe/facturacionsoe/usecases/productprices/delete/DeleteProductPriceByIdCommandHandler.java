package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;

public class DeleteProductPriceByIdCommandHandler implements Handler<DeleteProductPriceByIdCommand, ProductPrice> {

    private ProductPriceRepository<ProductPrice> repository;

    public DeleteProductPriceByIdCommandHandler(ProductPriceRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductPrice handleRequest(DeleteProductPriceByIdCommand deleteProductPriceByIdCommand) {
        Long id = deleteProductPriceByIdCommand.getId();
        repository.deleteById(id);
        return null;
    }

}
