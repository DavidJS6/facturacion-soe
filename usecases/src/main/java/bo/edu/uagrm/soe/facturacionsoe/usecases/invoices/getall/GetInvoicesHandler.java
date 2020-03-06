package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;

import java.util.List;

public class GetInvoicesHandler implements Handler<GetInvoicesQuery, List<Invoice>> {
    @Override
    public List<Invoice> handleRequest(GetInvoicesQuery getInvoicesQuery) {
        return null;
    }
}
