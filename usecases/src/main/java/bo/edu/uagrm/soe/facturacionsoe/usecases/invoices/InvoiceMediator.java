package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel.CancelInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete.DeleteInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdQuery;

import java.util.List;

public interface InvoiceMediator extends Mediator {

    List<Invoice> send(GetAllInvoicesQuery query);

    Invoice send(GetInvoiceByIdQuery query);

    Invoice send(CreateInvoiceCommand command);

    void send(DeleteInvoiceByIdCommand command);

    Invoice send(CancelInvoiceByIdCommand command);

}
