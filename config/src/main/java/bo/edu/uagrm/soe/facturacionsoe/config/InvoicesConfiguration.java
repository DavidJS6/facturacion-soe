package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.save.InvoiceMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvoicesConfiguration {

    @Bean("InvoiceMediator")
    public InvoiceMediator getGetAllInvoicesHandler(InvoiceRepository invoiceRepository) {
        return new InvoiceMediatorImpl(
                new GetAllInvoicesHandler(invoiceRepository),
                new GetInvoiceByIdHandler(invoiceRepository)
        );
    }

}
