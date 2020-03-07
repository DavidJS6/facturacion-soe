package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

public class CancelInvoiceByIdCommand implements Request<Invoice> {

    private Long id;

    public CancelInvoiceByIdCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
