package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.save;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.cqrs.RequestHandler;

public class CreateInvoiceHandler implements RequestHandler<CreateInvoiceReq, Invoice> {
    @Override
    public Invoice handleRequest(CreateInvoiceReq createInvoiceReq) {
        return null;
    }
}
