package bo.edu.uagrm.soe.facturacionsoe.dto.request;

import java.sql.Timestamp;
import java.util.List;

public class InvoiceRequestDto {
    private Long invoiceNumber;
    private String clientName;
    private Long nit;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;
    private PaymentRequestDto payment;
    private List<InvoiceItemRequestDto> invoiceItems;

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentRequestDto getPayment() {
        return payment;
    }

    public void setPayment(PaymentRequestDto payment) {
        this.payment = payment;
    }

    public List<InvoiceItemRequestDto> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItemRequestDto> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
