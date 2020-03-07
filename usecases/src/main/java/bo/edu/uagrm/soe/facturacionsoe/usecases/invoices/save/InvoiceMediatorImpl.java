package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.save;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel.CancelInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel.CancelInvoiceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete.DeleteInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete.DeleteInvoiceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdQuery;

import java.util.List;

public class InvoiceMediatorImpl implements InvoiceMediator {

    private GetAllInvoicesHandler getAllInvoicesHandler;
    private GetInvoiceByIdHandler getInvoiceByIdHandler;
    private DeleteInvoiceByIdCommandHandler deleteInvoiceByIdCommandHandler;
    private CancelInvoiceByIdCommandHandler cancelInvoiceByIdCommandHandler;

    public InvoiceMediatorImpl(GetAllInvoicesHandler getAllInvoicesHandler,
                               GetInvoiceByIdHandler getInvoiceByIdHandler,
                               DeleteInvoiceByIdCommandHandler deleteInvoiceByIdCommandHandler,
                               CancelInvoiceByIdCommandHandler cancelInvoiceByIdCommandHandler) {
        this.getAllInvoicesHandler = getAllInvoicesHandler;
        this.getInvoiceByIdHandler = getInvoiceByIdHandler;
        this.deleteInvoiceByIdCommandHandler = deleteInvoiceByIdCommandHandler;
        this.cancelInvoiceByIdCommandHandler = cancelInvoiceByIdCommandHandler;
    }

    @Override
    public List<Invoice> send(GetAllInvoicesQuery query) {
        return getAllInvoicesHandler.handleRequest(query);
    }

    @Override
    public Invoice send(GetInvoiceByIdQuery query) {
        return getInvoiceByIdHandler.handleRequest(query);
    }

    @Override
    public void send(DeleteInvoiceByIdCommand command) {
        deleteInvoiceByIdCommandHandler.handleRequest(command);
    }

    @Override
    public Invoice send(CancelInvoiceByIdCommand command) {
        return cancelInvoiceByIdCommandHandler.handleRequest(command);
    }

}
