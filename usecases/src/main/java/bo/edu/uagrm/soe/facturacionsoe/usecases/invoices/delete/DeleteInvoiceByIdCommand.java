package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class DeleteInvoiceByIdCommand implements Request<Invoice> {

    private Long id;

    public DeleteInvoiceByIdCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
