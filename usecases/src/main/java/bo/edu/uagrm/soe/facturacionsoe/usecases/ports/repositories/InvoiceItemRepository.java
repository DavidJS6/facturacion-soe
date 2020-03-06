package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;

public interface InvoiceItemRepository<TInvoiceItem extends InvoiceItem> extends CrudRepository<TInvoiceItem> {
}
