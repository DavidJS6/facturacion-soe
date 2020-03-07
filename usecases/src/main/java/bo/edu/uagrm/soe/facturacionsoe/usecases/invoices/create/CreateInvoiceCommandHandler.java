package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.InvoiceValueObject;

public class CreateInvoiceCommandHandler implements Handler<CreateInvoiceCommand, Invoice> {

    private InvoiceRepository<Invoice> repository;
    private InvoiceParser parser;

    public CreateInvoiceCommandHandler(InvoiceRepository<Invoice> repository) {
        this.repository = repository;
        this.parser = new InvoiceParser();
    }

    @Override
    public Invoice handleRequest(CreateInvoiceCommand createInvoiceCommand) {
        InvoiceValueObject validatedInvoice = new InvoiceValueObject(createInvoiceCommand);
        CreateInvoiceCommand commandValue = validatedInvoice.getValue();
        Invoice invoiceToSave = parser.parseCommandToEntity(commandValue);
        return repository.save(invoiceToSave);
    }

}
