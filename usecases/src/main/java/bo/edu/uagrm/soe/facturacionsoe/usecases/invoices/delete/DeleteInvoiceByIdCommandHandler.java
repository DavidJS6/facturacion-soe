package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;

public class DeleteInvoiceByIdCommandHandler implements Handler<DeleteInvoiceByIdCommand, Invoice> {

    private InvoiceRepository<Invoice> repository;

    public DeleteInvoiceByIdCommandHandler(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice handleRequest(DeleteInvoiceByIdCommand deleteInvoiceByIdCommand) {
        Long id = deleteInvoiceByIdCommand.getId();
        repository.deleteById(id);
        return null;
    }

}
