package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;

public class GetProductPriceByIdHandler implements Handler<GetProductPriceByIdQuery, ProductPrice> {

    private ProductPriceRepository<ProductPrice> repository;

    public GetProductPriceByIdHandler(ProductPriceRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductPrice handleRequest(GetProductPriceByIdQuery getProductPriceByIdQuery) {
        Long id = getProductPriceByIdQuery.getId();
        return repository.findById(id);
    }

}
