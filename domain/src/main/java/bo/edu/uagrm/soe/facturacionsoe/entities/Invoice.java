package bo.edu.uagrm.soe.facturacionsoe.entities;

import java.sql.Timestamp;
import java.util.Collection;

public class Invoice<TPayment extends Payment, TInvoiceItem extends InvoiceItem> {
    private Long id;
    private Long invoiceNumber;
    private String clientName;
    private Long nit;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;

    private Collection<TInvoiceItem> invoiceItems;
    private TPayment payment;

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

    public Collection<TInvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(Collection<TInvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public TPayment getPayment() {
        return payment;
    }

    public void setPayment(TPayment payment) {
        this.payment = payment;
    }
}
