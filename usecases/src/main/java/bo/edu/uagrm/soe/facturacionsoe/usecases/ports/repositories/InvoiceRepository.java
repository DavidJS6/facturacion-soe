package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;

public interface InvoiceRepository<TInvoice extends Invoice> extends CrudRepository<TInvoice> {
}
