package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;

public class GetInvoiceByIdHandler implements Handler<GetInvoiceByIdQuery, Invoice> {

    private InvoiceRepository<Invoice> repository;

    public GetInvoiceByIdHandler(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice handleRequest(GetInvoiceByIdQuery getInvoiceByIdQuery) {
        Long id = getInvoiceByIdQuery.getId();
        return repository.findById(id);
    }

}
