package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.InvoiceValueObject;

public class CreateInvoiceCommandHandler implements Handler<CreateInvoiceCommand, Invoice> {

    private InvoiceRepository<Invoice> repository;
    private InvoiceParser parser;

    public CreateInvoiceCommandHandler(InvoiceRepository<Invoice> repository, InvoiceParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public Invoice handleRequest(CreateInvoiceCommand createInvoiceCommand) {
        InvoiceValueObject validatedInvoice = new InvoiceValueObject(createInvoiceCommand);

        return null;
    }

}
