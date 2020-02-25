package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.InvoiceDto;

import java.util.Collection;

public interface InvoiceService {
    void save(InvoiceDto invoiceDto);

    void update(Long invoiceId, InvoiceDto invoiceDto);

    void delete(Long invoiceId);

    Collection<Invoice> getAllInvoices();
}
