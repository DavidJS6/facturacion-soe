package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.save;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdQuery;

import java.util.List;

public class InvoiceMediatorImpl implements InvoiceMediator {

    private GetAllInvoicesHandler getAllInvoicesHandler;
    private GetInvoiceByIdHandler getInvoiceByIdHandler;

    public InvoiceMediatorImpl(GetAllInvoicesHandler getAllInvoicesHandler,
                               GetInvoiceByIdHandler getInvoiceByIdHandler) {
        this.getAllInvoicesHandler = getAllInvoicesHandler;
        this.getInvoiceByIdHandler = getInvoiceByIdHandler;
    }

    @Override
    public List<Invoice> send(GetAllInvoicesQuery query) {
        return getAllInvoicesHandler.handleRequest(query);
    }

    @Override
    public Invoice send(GetInvoiceByIdQuery query) {
        return getInvoiceByIdHandler.handleRequest(query);
    }

}
