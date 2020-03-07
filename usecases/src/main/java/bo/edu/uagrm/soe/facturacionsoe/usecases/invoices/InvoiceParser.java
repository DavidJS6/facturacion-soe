package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing.CommandToEntityParserImpl;

public class InvoiceParser extends CommandToEntityParserImpl<CreateInvoiceCommand, Invoice> {

    @Override
    public Invoice parseCommandToEntity(CreateInvoiceCommand createInvoiceCommand) {
        return null;
    }

}
