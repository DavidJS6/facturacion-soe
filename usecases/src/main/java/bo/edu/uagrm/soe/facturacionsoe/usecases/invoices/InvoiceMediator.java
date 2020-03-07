package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete.DeleteProductByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.update.UpdateProductCommand;

import java.util.List;

public interface InvoiceMediator extends Mediator {

    List<Invoice> send(GetAllInvoicesQuery query);

    Invoice send(GetInvoiceByIdQuery query);

    //Invoice send(CreateInvoiceCommand command);

    //void send(DeleteInvoiceByIdCommand command);

    //void send(CancelInvoiceByIdCommand command);

}
