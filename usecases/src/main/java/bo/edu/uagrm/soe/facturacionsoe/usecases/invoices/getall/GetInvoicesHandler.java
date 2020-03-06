package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.cqrs.RequestHandler;

import java.util.List;

public class GetInvoicesHandler implements RequestHandler<GetInvoicesQuery, List<Invoice>> {
    @Override
    public List<Invoice> handleRequest(GetInvoicesQuery getInvoicesQuery) {
        return null;
    }
}
