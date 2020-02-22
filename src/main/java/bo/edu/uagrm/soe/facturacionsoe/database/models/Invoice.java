package bo.edu.uagrm.soe.facturacionsoe.database.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "invoices", schema = "public", catalog = "facturacion-soe")
public class Invoice {
    private Long id;
    private Long invoiceNumber;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;
    private Collection<InvoiceItem> invoiceItemList;
    private Collection<Payment> paymenList;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "invoice_number")
    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "total_amount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(id, invoice.id) &&
                Objects.equals(invoiceNumber, invoice.invoiceNumber) &&
                Objects.equals(totalAmount, invoice.totalAmount) &&
                Objects.equals(timestamp, invoice.timestamp) &&
                Objects.equals(status, invoice.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceNumber, totalAmount, timestamp, status);
    }

    @OneToMany(mappedBy = "invoice")
    public Collection<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(Collection<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    @OneToMany(mappedBy = "invoice")
    public Collection<Payment> getPaymenList() {
        return paymenList;
    }

    public void setPaymenList(Collection<Payment> paymenList) {
        this.paymenList = paymenList;
    }
}
