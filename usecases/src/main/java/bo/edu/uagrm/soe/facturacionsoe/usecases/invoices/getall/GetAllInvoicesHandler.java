package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;

import java.util.List;

public class GetAllInvoicesHandler implements Handler<GetAllInvoicesQuery, List<Invoice>> {

    private InvoiceRepository repository;

    public GetAllInvoicesHandler(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> handleRequest(GetAllInvoicesQuery getAllInvoicesQuery) {
        return repository.findAll();
    }
}
