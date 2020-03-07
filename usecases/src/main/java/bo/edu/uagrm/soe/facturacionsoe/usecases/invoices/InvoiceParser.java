package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing.CommandToEntityParserImpl;
import org.modelmapper.ModelMapper;

public class InvoiceParser extends CommandToEntityParserImpl<CreateInvoiceCommand, Invoice> {

    @Override
    public Invoice parseCommandToEntity(CreateInvoiceCommand createInvoiceCommand) {
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(new InvoiceItemPropertyMap());
        Invoice resultInvoice = mapper.map(createInvoiceCommand, Invoice.class);
        resultInvoice.getPayment().setInvoice(resultInvoice);
        setInvoiceInInvoiceItems(resultInvoice);
        return resultInvoice;
    }

    private void setInvoiceInInvoiceItems(Invoice resultInvoice) {
        for (InvoiceItem invoiceItem : resultInvoice.getInvoiceItems()) {
            invoiceItem.setInvoice(resultInvoice);
        }
    }

}
