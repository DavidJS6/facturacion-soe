package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete;

import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class DeleteProductPriceByIdCommand implements Request {

    private Long id;

    public DeleteProductPriceByIdCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
