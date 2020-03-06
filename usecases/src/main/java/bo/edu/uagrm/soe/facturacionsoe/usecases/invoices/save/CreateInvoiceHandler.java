package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.save;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;

public class CreateInvoiceHandler implements Handler<CreateInvoiceReq, Invoice> {
    @Override
    public Invoice handleRequest(CreateInvoiceReq createInvoiceReq) {
        return null;
    }
}
