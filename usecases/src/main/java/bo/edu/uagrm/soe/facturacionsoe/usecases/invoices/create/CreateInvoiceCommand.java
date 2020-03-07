package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.InvoiceItemRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.PaymentRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateInvoiceItemCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreatePaymentCommand;

import java.sql.Timestamp;
import java.util.List;

public class CreateInvoiceCommand implements Request<Invoice> {

    private Long invoiceNumber;
    private String clientName;
    private Long nit;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;
    private CreatePaymentCommand payment;
    private List<CreateInvoiceItemCommand> invoiceItems;

    public CreateInvoiceCommand(Long invoiceNumber, String clientName, Long nit, Double totalAmount,
                                Timestamp timestamp, String status, CreatePaymentCommand payment,
                                List<CreateInvoiceItemCommand> invoiceItems) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
        this.nit = nit;
        this.totalAmount = totalAmount;
        this.timestamp = timestamp;
        this.status = status;
        this.payment = payment;
        this.invoiceItems = invoiceItems;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public Long getNit() {
        return nit;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }

    public CreatePaymentCommand getPayment() {
        return payment;
    }

    public List<CreateInvoiceItemCommand> getInvoiceItems() {
        return invoiceItems;
    }
}
