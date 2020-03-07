package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices;

import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceItemCommand;
import org.modelmapper.PropertyMap;

public class InvoiceItemPropertyMap extends PropertyMap<CreateInvoiceItemCommand, InvoiceItem> {
    @Override
    protected void configure() {
        skip(destination.getId());
    }
}
