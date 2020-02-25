package bo.edu.uagrm.soe.facturacionsoe.dto.raw;

import java.sql.Timestamp;
import java.util.List;

public class InvoiceDto {
    private Long invoiceNumber;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;
    private PaymentDto payment;
    private List<InvoiceItemDto> invoiceItemList;

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

    public PaymentDto getPayment() {
        return payment;
    }

    public void setPayment(PaymentDto payment) {
        this.payment = payment;
    }

    public List<InvoiceItemDto> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItemDto> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }
}
