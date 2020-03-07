package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;

public class CancelInvoiceByIdCommandHandler implements Handler<CancelInvoiceByIdCommand, Invoice> {

    private InvoiceRepository<Invoice> repository;

    public CancelInvoiceByIdCommandHandler(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice handleRequest(CancelInvoiceByIdCommand cancelInvoiceByIdCommand) {
        Long id = cancelInvoiceByIdCommand.getId();
        Invoice invoice = repository.findById(id);
        if (invoice != null) {
            invoice.setStatus("CANCELED");
            return repository.save(invoice);
        } else {
            return null;
        }
    }

}
