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
    private String clientName;
    private Long nit;
    private Double totalAmount;
    private Timestamp timestamp;
    private String status;

    private Collection<InvoiceItem> invoiceItems;
    private Payment payment;

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
    @Column(name = "client_name")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "nit")
    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
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
                Objects.equals(clientName, invoice.clientName) &&
                Objects.equals(nit, invoice.nit) &&
                Objects.equals(totalAmount, invoice.totalAmount) &&
                Objects.equals(timestamp, invoice.timestamp) &&
                Objects.equals(status, invoice.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceNumber, totalAmount, timestamp, status);
    }

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.PERSIST)
    public Collection<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(Collection<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.PERSIST)
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
