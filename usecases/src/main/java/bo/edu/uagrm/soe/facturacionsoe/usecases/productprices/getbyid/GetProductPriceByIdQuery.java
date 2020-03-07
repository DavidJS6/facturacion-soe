package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class GetProductPriceByIdQuery implements Request<Product> {

    private Long id;

    public GetProductPriceByIdQuery(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
