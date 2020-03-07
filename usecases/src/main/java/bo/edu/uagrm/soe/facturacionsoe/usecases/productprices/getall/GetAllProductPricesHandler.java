package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;

import java.util.List;

public class GetAllProductPricesHandler implements Handler<GetAllProductPricesQuery, List<ProductPrice>> {

    private ProductPriceRepository repository;

    public GetAllProductPricesHandler(ProductPriceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductPrice> handleRequest(GetAllProductPricesQuery getAllProductPricesQuery) {
        return repository.findAll();
    }

}
