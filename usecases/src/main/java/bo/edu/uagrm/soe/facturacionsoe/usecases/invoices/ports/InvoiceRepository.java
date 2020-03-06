package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.ports;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.CrudRepository;

public interface InvoiceRepository<TInvoice extends Invoice> extends CrudRepository<TInvoice> {
}
