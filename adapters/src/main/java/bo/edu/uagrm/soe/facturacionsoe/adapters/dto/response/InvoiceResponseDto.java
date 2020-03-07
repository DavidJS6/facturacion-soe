package bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response;

import java.sql.Timestamp;
import java.util.List;

public class InvoiceResponseDto {
    private Long id;
    private Long invoiceNumber;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;
    private PaymentResponseDto payment;
    private List<InvoiceItemResponseDto> invoiceItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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

    public PaymentResponseDto getPayment() {
        return payment;
    }

    public void setPayment(PaymentResponseDto payment) {
        this.payment = payment;
    }

    public List<InvoiceItemResponseDto> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItemResponseDto> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
