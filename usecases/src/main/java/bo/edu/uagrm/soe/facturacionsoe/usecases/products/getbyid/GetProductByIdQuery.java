package bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class GetProductByIdQuery implements Request<Product> {
    private Long id;

    public GetProductByIdQuery(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
