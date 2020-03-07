package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

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

    public CreateInvoiceCommand() {
    }

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

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPayment(CreatePaymentCommand payment) {
        this.payment = payment;
    }

    public void setInvoiceItems(List<CreateInvoiceItemCommand> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
