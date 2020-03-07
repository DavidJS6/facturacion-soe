package bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete;

import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class DeleteProductByIdCommand implements Request {

    private Long id;

    public DeleteProductByIdCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
