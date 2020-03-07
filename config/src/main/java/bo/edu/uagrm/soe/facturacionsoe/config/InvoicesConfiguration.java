package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel.CancelInvoiceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete.DeleteInvoiceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvoicesConfiguration {

    @Bean("InvoiceMediator")
    public InvoiceMediator getGetAllInvoicesHandler(InvoiceRepository invoiceRepository) {
        return new InvoiceMediatorImpl(
                new GetAllInvoicesHandler(invoiceRepository),
                new GetInvoiceByIdHandler(invoiceRepository),
                new CreateInvoiceCommandHandler(invoiceRepository),
                new DeleteInvoiceByIdCommandHandler(invoiceRepository),
                new CancelInvoiceByIdCommandHandler(invoiceRepository)
        );
    }

}
